package com.gox.partner.views.recive_money

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.gox.base.base.BaseActivity
import com.gox.basemodule.common.payment.recive_money.ReciveEMoneyViewModel
import com.gox.partner.R
import com.gox.partner.databinding.ActivityReciveEMoneyBinding
import kotlinx.android.synthetic.main.activity_recive_e_money.view.*

class ReciveEMoneyActivity : BaseActivity<ActivityReciveEMoneyBinding>(), ReciveEMoneyNavigator {
    private lateinit var reciveEMoneyViewModel: ReciveEMoneyViewModel
    private var context: Context? = null
    private lateinit var mBinding: ActivityReciveEMoneyBinding
    private var qrImageUrl: String = ""

    override fun getLayoutId(): Int {
        return R.layout.activity_recive_e_money
    }

    override fun initView(mViewDataBinding: ViewDataBinding?) {
        mBinding = mViewDataBinding as ActivityReciveEMoneyBinding
        reciveEMoneyViewModel = ViewModelProviders.of(this).get(ReciveEMoneyViewModel::class.java)
        mBinding.reciveModel = reciveEMoneyViewModel
        mBinding.lifecycleOwner = this
        getIntentValues()
        if (qrImageUrl.isNullOrEmpty())
            reciveEMoneyViewModel.getUserProfile()
        else
            glideSetQrCode(mBinding.ivQr, qrImageUrl, R.drawable.image_placeholder)

        mBinding.tbReciveMoney.iv_tb_back.setOnClickListener {
            finish()
        }
        getApiResponseObserver()
    }

    fun getIntentValues() {
        qrImageUrl = if (intent != null && intent.hasExtra("qrUrl")) intent.getStringExtra("qrUrl").toString() else ""
    }

    fun getApiResponseObserver() {
        reciveEMoneyViewModel.mProfileResponse.observe(this, Observer {
            if (it.statusCode.equals("200")) {
                qrImageUrl = it.profileData!!.qrcode_url.toString()
                glideSetQrCode(mBinding.ivQr, qrImageUrl, R.drawable.image_placeholder)
            }
        })
    }

    fun glideSetQrCode(imageView: ImageView, image: String, placeholder: Int) {
        Glide.with(this)
                .applyDefaultRequestOptions(com.bumptech.glide.request.RequestOptions()
                        .placeholder(placeholder)
                        .error(placeholder))
                .load(image)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(imageView)
    }

}