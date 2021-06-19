package com.gox.partner.views.manage_payment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.gson.JsonObject
import com.gox.base.base.BaseViewModel
import com.gox.base.repository.ApiListener
import com.gox.partner.models.WalletTransferModel
import com.gox.partner.repository.AppRepository

class ManagePaymentViewModel : BaseViewModel<ManagePaymentNavigator>() {
    val activityFlag = MutableLiveData<String>()
    var strCurrencyType= MutableLiveData<String>()
    var strSendAmount= MutableLiveData<String>()
    var strSendMobile= MutableLiveData<String>()
    var errorResponse = MutableLiveData<String>()
    var showLoading = MutableLiveData<Boolean>()
    var QrLink= MutableLiveData<String>()
    val appRepository = AppRepository.instance()
    var walletTransferTransfer= MutableLiveData<WalletTransferModel>()
    var isPaymentTransFered= MutableLiveData<Boolean>()
    var walletTransferOtherUser= MutableLiveData<JsonObject>()



    fun setFlag(flag: String) {
        activityFlag.value = flag
    }

    fun getFlag(): LiveData<String> {
        return activityFlag
    }

    fun sendWalletAmount(params:HashMap<String,String>){
        showLoading.value = true
        getCompositeDisposable().add(appRepository.walletTransfer(object : ApiListener {
            override fun success(successData: Any) {
                walletTransferTransfer.postValue( successData as WalletTransferModel)
                showLoading.postValue(false)
            }

            override fun fail(failData: Throwable) {
                errorResponse.value = getErrorMessage(failData)
                showLoading.postValue(false)
            }

        },params))
    }

/*
    fun getWalletOtherUser(token:String,mobile:String){
        showLoading.value = true
        getCompositeDisposable().add(appRepository.getwalletOtherUser(object : ApiListener {

            override fun success(successData: Any) {
                walletTransferOtherUser.postValue( successData as JsonObject)
                showLoading.postValue(false)            }

            override fun fail(failData: Throwable) {

                errorResponse.value = getErrorMessage(failData)
                showLoading.postValue(false)
            }
        },token,mobile))
    }
*/

}