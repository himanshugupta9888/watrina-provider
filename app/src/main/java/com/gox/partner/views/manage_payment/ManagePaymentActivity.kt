package com.gox.partner.views.manage_payment

import android.content.Context
import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.gox.base.base.BaseActivity
import com.gox.base.data.Constants
import com.gox.base.data.PreferencesHelper
import com.gox.base.data.PreferencesKey
import com.gox.base.utils.PrefixCustomEditText
import com.gox.base.utils.ViewUtils
import com.gox.partner.R
import com.gox.partner.databinding.ActivityManagePaymentBinding
import com.gox.partner.views.adapters.PaymentAdapter
import com.gox.partner.views.recive_money.ReciveEMoneyActivity
import com.gox.partner.views.scanner.SimpleScannerActivity
import com.gox.partner.views.transaction.TransactionFragment
import com.gox.partner.views.wallet.WalletFragment
import com.maple.msdialog.ActionSheetDialog
import kotlinx.android.synthetic.main.activity_add_edit_document.view.*
import kotlinx.android.synthetic.main.header_layout.view.*
import org.json.JSONObject
import java.util.*

class ManagePaymentActivity : BaseActivity<ActivityManagePaymentBinding>(), ManagePaymentNavigator {

    private lateinit var mBinding: ActivityManagePaymentBinding
    private lateinit var mViewModel: ManagePaymentViewModel
    private lateinit var paymentAdapter: PaymentAdapter
    private lateinit var tbManagePayment: TabLayout

    private var userID: String = ""
    private var mAlertDialog: AlertDialog? = null
    private var qrLink: String? = ""
    private var sendAmount: String? = ""
    private var edtSendAmount: PrefixCustomEditText? = null
    private var walletamount: Int = 0
    private lateinit var appCompatActivity: AppCompatActivity
    private var context: Context? = null
    private var invoiceAlertDialog: AlertDialog.Builder? = null

    override fun getLayoutId() = R.layout.activity_manage_payment

    override fun initView(mViewDataBinding: ViewDataBinding?) {
        mBinding = mViewDataBinding as ActivityManagePaymentBinding
        mViewModel = ManagePaymentViewModel()
        mViewModel.navigator = this
        tbManagePayment = findViewById(R.id.tb_payment)
        mBinding.toolbarLayout.tvToolbarTitle.text = resources.getString(com.gox.partner.R.string.header_label_payment)
        mBinding.toolbarLayout.ivToolbarBack.setOnClickListener {
            finish()
        }
        context = this
        appCompatActivity = context as AppCompatActivity

        mBinding.toolbarLayout.ivRight.setVisibility(View.VISIBLE)
        mBinding.toolbarLayout.ivRight.setOnClickListener {
            showScannerPopup()
        }
//        getWalletUserApiResponse()

        val paymentFragmentList = Vector<Fragment>()

        val walletFragment = WalletFragment()
        val transactionFragment = TransactionFragment()

        paymentFragmentList.add(walletFragment)
        paymentFragmentList.add(transactionFragment)

        paymentAdapter = PaymentAdapter(supportFragmentManager, this@ManagePaymentActivity, paymentFragmentList)
        mBinding.vbPayment.adapter = paymentAdapter
        tbManagePayment.setupWithViewPager(mBinding.vbPayment)

    }

    fun showScannerPopup() {
        ActionSheetDialog(context)
                .setCancelable(false)
                .setCanceledOnTouchOutside(false)
                .setCancelText(resources.getString(R.string.cancel), R.color.red, 20, false)
                .addSheetItem(
                        resources.getString(R.string.send_amount), R.color.black
                ) { which -> showSendMoneyDialog() }
                .addSheetItem(
                        resources.getString(R.string.receive_amount), R.color.black
                ) { which ->
                    intent = Intent(context, ReciveEMoneyActivity::class.java)
                    intent.putExtra("qrUrl", qrLink)
                    startActivityForResult(intent, 144)
                }.show()
    }


    fun showSendMoneyDialog() {
        val invoiceDialogView = LayoutInflater.from(this).inflate(R.layout.dialog_send_amount, null)
        invoiceAlertDialog = AlertDialog.Builder(this).setView(invoiceDialogView)
        mAlertDialog = invoiceAlertDialog!!.create()
        mAlertDialog!!.show()
        edtSendAmount = mAlertDialog!!.findViewById<PrefixCustomEditText>(R.id.edtAmount)

        edtSendAmount!!.addTextChangedListener(EditListener())
        mAlertDialog!!.findViewById<Button>(R.id.bt_send)!!.setOnClickListener {
            mViewModel.strSendAmount.value = edtSendAmount!!.text.toString()
            if (validate()) {

                sendAmount = edtSendAmount!!.text.toString()

                var avlAmount: Double = Constants.walletAmount;
                var mAmount: Int = Integer.parseInt(sendAmount)
                if (mAmount > avlAmount) {
                    Toast.makeText(this@ManagePaymentActivity, "Enter Amount Below " + avlAmount, Toast.LENGTH_SHORT).show()
                } else {
                    if (getPermissionUtil().hasPermission(appCompatActivity, Constants.RequestPermission.PERMISSION_CAMERA)) {
                        val scannerIntent = Intent(this, SimpleScannerActivity::class.java)
                        startActivityForResult(scannerIntent, 225)
                    } else getPermissionUtil().requestPermissions(appCompatActivity, Constants.RequestPermission.PERMISSION_CAMERA, Constants.RequestCode.PERMISSION_CODE_CAMERA)
                }
            }

        }
    }


    override fun showErrorMsg(error: String) {
        ViewUtils.showToast(context!!, error, false)
    }

    override fun validate(): Boolean {
        if (mViewModel.strSendAmount.value.isNullOrEmpty()) {
            ViewUtils.showToast(context!!, resources.getString(R.string.empty_amount), false)
            return false
        } else {
            return true
        }
    }

    override fun addCard() {
        TODO("Not yet implemented")
    }

    inner class EditListener : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            //setPrefix(mBinding.edt, s, Constants.currency)
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        loadingObservable.value = false
        when (requestCode) {
            225 -> {
                var qrJsonString = data?.let { it.getStringExtra("QRjson") }
                if (!qrJsonString.isNullOrEmpty()) {
                    var qrJSON = JSONObject(qrJsonString)
                    if (qrJSON != null) {
                        if (qrJSON.has("id")) {
                            userID = qrJSON.getString("id")
                            mAlertDialog!!.dismiss()
                            //   val decoder = Base64.getDecoder()
                            val idBytes = Base64.decode(userID, Base64.DEFAULT);
                            val decodedStr = String(idBytes, Charsets.UTF_8)
                            val params = HashMap<String, String>()
                            params.put("id", decodedStr)
                            params.put("amount", sendAmount!!)
                            mViewModel.sendWalletAmount(params)
                        }
                    }
                }

            }

            144 -> {
                mViewModel.isPaymentTransFered.postValue(true)
            }

            Constants.RequestCode.PERMISSION_CODE_CAMERA -> {
                val scannerIntent = Intent(this, SimpleScannerActivity::class.java)
                startActivityForResult(scannerIntent, 225)
            }
        }
    }


}