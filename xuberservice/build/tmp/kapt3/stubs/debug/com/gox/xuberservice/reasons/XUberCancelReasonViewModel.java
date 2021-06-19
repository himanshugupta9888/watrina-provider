package com.gox.xuberservice.reasons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/gox/xuberservice/reasons/XUberCancelReasonViewModel;", "Lcom/gox/base/base/BaseViewModel;", "Lcom/gox/xuberservice/reasons/XUberCancelReasonNavigator;", "()V", "errorResponse", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorResponse", "()Landroidx/lifecycle/MutableLiveData;", "setErrorResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "mReasonResponseData", "Lcom/gox/xuberservice/model/ReasonModel;", "getMReasonResponseData", "mRepository", "Lcom/gox/xuberservice/repositary/XUberRepository;", "getReason", "", "xuberservice_debug"})
public final class XUberCancelReasonViewModel extends com.gox.base.base.BaseViewModel<com.gox.xuberservice.reasons.XUberCancelReasonNavigator> {
    private final com.gox.xuberservice.repositary.XUberRepository mRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.gox.xuberservice.model.ReasonModel> mReasonResponseData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Throwable> errorResponse;
    
    public XUberCancelReasonViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.gox.xuberservice.model.ReasonModel> getMReasonResponseData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getErrorResponse() {
        return null;
    }
    
    public final void setErrorResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Throwable> p0) {
    }
    
    public final void getReason() {
    }
}