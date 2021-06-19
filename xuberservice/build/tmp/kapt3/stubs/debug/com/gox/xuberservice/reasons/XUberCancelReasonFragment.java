package com.gox.xuberservice.reasons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/gox/xuberservice/reasons/XUberCancelReasonFragment;", "Lcom/gox/base/base/BaseDialogFragment;", "Lcom/gox/xuberservice/databinding/DialogReasonBinding;", "Lcom/gox/xuberservice/interfaces/CustomClickListener;", "Lcom/gox/xuberservice/reasons/XUberCancelReasonNavigator;", "()V", "getReasons", "Lcom/gox/xuberservice/interfaces/GetReasonsInterface;", "mReasonFragmentBinding", "mViewModel", "Lcom/gox/xuberservice/reasons/XUberCancelReasonViewModel;", "closePopup", "", "getApiResponse", "getErrorMessage", "error", "", "getLayout", "", "initView", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "view", "Landroid/view/View;", "onAttach", "context", "Landroid/content/Context;", "onListClickListener", "position", "xuberservice_debug"})
public final class XUberCancelReasonFragment extends com.gox.base.base.BaseDialogFragment<com.gox.xuberservice.databinding.DialogReasonBinding> implements com.gox.xuberservice.interfaces.CustomClickListener, com.gox.xuberservice.reasons.XUberCancelReasonNavigator {
    private com.gox.xuberservice.databinding.DialogReasonBinding mReasonFragmentBinding;
    private com.gox.xuberservice.reasons.XUberCancelReasonViewModel mViewModel;
    private com.gox.xuberservice.interfaces.GetReasonsInterface getReasons;
    private java.util.HashMap _$_findViewCache;
    
    public XUberCancelReasonFragment() {
        super();
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding viewDataBinding, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void getApiResponse() {
    }
    
    @java.lang.Override()
    public void onListClickListener(int position) {
    }
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void closePopup() {
    }
    
    @java.lang.Override()
    public void getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
}