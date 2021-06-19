package com.gox.partner.views.manage_payment

interface ManagePaymentNavigator {
    fun showErrorMsg(error: String)
    fun validate(): Boolean
    fun addCard()

}