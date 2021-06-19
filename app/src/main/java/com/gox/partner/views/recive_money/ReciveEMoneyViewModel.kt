package com.gox.basemodule.common.payment.recive_money
import androidx.lifecycle.MutableLiveData
import com.gox.base.base.BaseApplication
import com.gox.base.base.BaseViewModel
import com.gox.base.repository.ApiListener
import com.gox.base.repository.BaseModuleRepository
import com.gox.partner.models.ProfileResponse
import com.gox.partner.repository.AppRepository
import com.gox.partner.views.recive_money.ReciveEMoneyNavigator


class  ReciveEMoneyViewModel: BaseViewModel<ReciveEMoneyNavigator>(){
    val appRepository = AppRepository.instance()
    var showLoading = MutableLiveData<Boolean>()
    var mProfileResponse = MutableLiveData<ProfileResponse>()
    var errorResponse = MutableLiveData<String>()


    fun getUserProfile(){
        getCompositeDisposable().add(appRepository.getProfile(object : ApiListener {

            override fun success(successData: Any) {
                mProfileResponse.value = successData as ProfileResponse
                showLoading.postValue(false)            }

            override fun fail(failData: Throwable) {
                errorResponse.value = getErrorMessage(failData)
                showLoading.postValue(false)            }
        }))
    }

}