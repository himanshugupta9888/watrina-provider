package com.gox.xuberservice.extracharge;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/gox/xuberservice/extracharge/XUberExtraChargeDialog;", "Lcom/gox/base/base/BaseDialogFragment;", "Lcom/gox/xuberservice/databinding/DialogXuperExtraChargeBinding;", "Lcom/gox/xuberservice/extracharge/XUberExtraChargeNavigator;", "()V", "mBinding", "mViewModel", "Lcom/gox/xuberservice/extracharge/XUberExtraChargeViwModel;", "getLayout", "", "initView", "", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setPrefix", "editText", "Lcom/gox/base/utils/PrefixCustomEditText;", "s", "Landroid/text/Editable;", "strPref", "", "submit", "Companion", "EditListener", "xuberservice_debug"})
public final class XUberExtraChargeDialog extends com.gox.base.base.BaseDialogFragment<com.gox.xuberservice.databinding.DialogXuperExtraChargeBinding> implements com.gox.xuberservice.extracharge.XUberExtraChargeNavigator {
    private com.gox.xuberservice.databinding.DialogXuperExtraChargeBinding mBinding;
    private com.gox.xuberservice.extracharge.XUberExtraChargeViwModel mViewModel;
    @org.jetbrains.annotations.NotNull()
    public static final com.gox.xuberservice.extracharge.XUberExtraChargeDialog.Companion Companion = null;
    private static com.gox.xuberservice.interfaces.GetExtraChargeInterface extraAmountInterface;
    private java.util.HashMap _$_findViewCache;
    
    public XUberExtraChargeDialog() {
        super();
    }
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding viewDataBinding, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void submit() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setPrefix(@org.jetbrains.annotations.NotNull()
    com.gox.base.utils.PrefixCustomEditText editText, @org.jetbrains.annotations.Nullable()
    android.text.Editable s, @org.jetbrains.annotations.NotNull()
    java.lang.String strPref) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J*\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/gox/xuberservice/extracharge/XUberExtraChargeDialog$EditListener;", "Landroid/text/TextWatcher;", "(Lcom/gox/xuberservice/extracharge/XUberExtraChargeDialog;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "xuberservice_debug"})
    public final class EditListener implements android.text.TextWatcher {
        
        public EditListener() {
            super();
        }
        
        @java.lang.Override()
        public void afterTextChanged(@org.jetbrains.annotations.Nullable()
        android.text.Editable s) {
        }
        
        @java.lang.Override()
        public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence s, int start, int count, int after) {
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence s, int start, int before, int count) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/gox/xuberservice/extracharge/XUberExtraChargeDialog$Companion;", "", "()V", "extraAmountInterface", "Lcom/gox/xuberservice/interfaces/GetExtraChargeInterface;", "newInstance", "Lcom/gox/xuberservice/extracharge/XUberExtraChargeDialog;", "extraChargeInterface", "xuberservice_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.gox.xuberservice.extracharge.XUberExtraChargeDialog newInstance(@org.jetbrains.annotations.NotNull()
        com.gox.xuberservice.interfaces.GetExtraChargeInterface extraChargeInterface) {
            return null;
        }
    }
}