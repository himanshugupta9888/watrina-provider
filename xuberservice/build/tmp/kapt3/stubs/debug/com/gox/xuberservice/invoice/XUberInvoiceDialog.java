package com.gox.xuberservice.invoice;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010(\u001a\u00020)H\u0016J\u0006\u0010*\u001a\u00020)J\b\u0010+\u001a\u00020)H\u0002J\u0018\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0016J\b\u0010/\u001a\u00020\u0013H\u0014J\u0010\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\u000fH\u0016J\u0018\u00102\u001a\u00020)2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u0006\u00107\u001a\u00020\u000fJ\u0012\u00108\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020)H\u0016J\u001a\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010?\u001a\u00020\u00132\u0006\u0010C\u001a\u00020D2\b\u0010B\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010E\u001a\u00020)2\u0006\u0010F\u001a\u00020\u0019H\u0016J\b\u0010G\u001a\u00020)H\u0016J\b\u0010H\u001a\u00020)H\u0016J\b\u0010I\u001a\u00020)H\u0016J\b\u0010J\u001a\u00020)H\u0002R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/gox/xuberservice/invoice/XUberInvoiceDialog;", "Lcom/gox/base/base/BaseDialogFragment;", "Lcom/gox/xuberservice/databinding/DialogInvoiceBinding;", "Lcom/gox/xuberservice/invoice/XuperInvoiceNavigator;", "Lcom/gox/xuberservice/interfaces/GetExtraChargeInterface;", "Lcom/gox/xuberservice/interfaces/DialogCloseInterface;", "()V", "extraAmount", "", "Ljava/lang/Double;", "extraChargeDialogDialog", "Lcom/gox/xuberservice/extracharge/XUberExtraChargeDialog;", "invoiceDialog", "Landroid/app/Dialog;", "isFromCheckRequest", "", "Ljava/lang/Boolean;", "mBinding", "paid", "", "getPaid", "()I", "setPaid", "(I)V", "paymentType", "", "getPaymentType", "()Ljava/lang/String;", "setPaymentType", "(Ljava/lang/String;)V", "shown", "strUpdateRequest", "strXUberCheckRequestModel", "timeTaken", "updateRequestModel", "Lcom/gox/xuberservice/model/UpdateRequest;", "xUberCheckRequest", "Lcom/gox/xuberservice/model/XuperCheckRequest;", "xUberInvoiceModel", "Lcom/gox/xuberservice/invoice/XUberInvoiceViewModel;", "dismissAllowingStateLoss", "", "getApiResponse", "getBundleValues", "getExtraCharge", "extraCharge", "extraAmtNotes", "getLayout", "hideDialog", "isNeedToHide", "initView", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "view", "Landroid/view/View;", "isShown", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onStart", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "showErrorMessage", "error", "showExtraChargePage", "showRating", "submit", "updateViews", "xuberservice_debug"})
public final class XUberInvoiceDialog extends com.gox.base.base.BaseDialogFragment<com.gox.xuberservice.databinding.DialogInvoiceBinding> implements com.gox.xuberservice.invoice.XuperInvoiceNavigator, com.gox.xuberservice.interfaces.GetExtraChargeInterface, com.gox.xuberservice.interfaces.DialogCloseInterface {
    private com.gox.xuberservice.databinding.DialogInvoiceBinding mBinding;
    private com.gox.xuberservice.invoice.XUberInvoiceViewModel xUberInvoiceModel;
    private com.gox.xuberservice.model.UpdateRequest updateRequestModel;
    private java.lang.String strUpdateRequest;
    private java.lang.Boolean isFromCheckRequest = false;
    private java.lang.String strXUberCheckRequestModel;
    private com.gox.xuberservice.model.XuperCheckRequest xUberCheckRequest;
    private java.lang.Boolean shown = false;
    private com.gox.xuberservice.extracharge.XUberExtraChargeDialog extraChargeDialogDialog;
    private android.app.Dialog invoiceDialog;
    private java.lang.String timeTaken = "";
    private java.lang.Double extraAmount = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String paymentType = "";
    private int paid = 0;
    private java.util.HashMap _$_findViewCache;
    
    public XUberInvoiceDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentType() {
        return null;
    }
    
    public final void setPaymentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPaid() {
        return 0;
    }
    
    public final void setPaid(int p0) {
    }
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding viewDataBinding, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void getApiResponse() {
    }
    
    @java.lang.Override()
    public void showRating() {
    }
    
    private final void getBundleValues() {
    }
    
    private final void updateViews() {
    }
    
    @java.lang.Override()
    public void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    public final boolean isShown() {
        return false;
    }
    
    @java.lang.Override()
    public void submit() {
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public int show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
        return 0;
    }
    
    @java.lang.Override()
    public void dismissAllowingStateLoss() {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public void getExtraCharge(@org.jetbrains.annotations.NotNull()
    java.lang.String extraCharge, @org.jetbrains.annotations.NotNull()
    java.lang.String extraAmtNotes) {
    }
    
    @java.lang.Override()
    public void showExtraChargePage() {
    }
    
    @java.lang.Override()
    public void hideDialog(boolean isNeedToHide) {
    }
}