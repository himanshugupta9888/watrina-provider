package com.gox.xuberservice.repositary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r`\u000eJ2\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000eJ\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004J2\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u000eJJ\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r`\u000e2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/gox/xuberservice/repositary/XUberRepository;", "Lcom/gox/base/repository/BaseRepository;", "()V", "serviceId", "", "getServiceId", "()Ljava/lang/String;", "confirmPayment", "Lio/reactivex/disposables/Disposable;", "listener", "Lcom/gox/base/repository/ApiListener;", "params", "Ljava/util/HashMap;", "Lokhttp3/RequestBody;", "Lkotlin/collections/HashMap;", "xUberCancelRequest", "xUberCheckRequest", "lat", "lon", "xUberGetReason", "type", "xUberRatingUser", "xUberUpdateRequest", "frontImage", "Lokhttp3/MultipartBody$Part;", "backImage", "Companion", "xuberservice_debug"})
public final class XUberRepository extends com.gox.base.repository.BaseRepository {
    @org.jetbrains.annotations.NotNull()
    public static final com.gox.xuberservice.repositary.XUberRepository.Companion Companion = null;
    private static com.gox.xuberservice.repositary.XUberRepository mRepository;
    
    public XUberRepository() {
        super();
    }
    
    private final java.lang.String getServiceId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable xUberCheckRequest(@org.jetbrains.annotations.NotNull()
    com.gox.base.repository.ApiListener listener, @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String lon) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable xUberUpdateRequest(@org.jetbrains.annotations.NotNull()
    com.gox.base.repository.ApiListener listener, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, okhttp3.RequestBody> params, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part frontImage, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part backImage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable confirmPayment(@org.jetbrains.annotations.NotNull()
    com.gox.base.repository.ApiListener listener, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, okhttp3.RequestBody> params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable xUberGetReason(@org.jetbrains.annotations.NotNull()
    com.gox.base.repository.ApiListener listener, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable xUberCancelRequest(@org.jetbrains.annotations.NotNull()
    com.gox.base.repository.ApiListener listener, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.Disposable xUberRatingUser(@org.jetbrains.annotations.NotNull()
    com.gox.base.repository.ApiListener listener, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/gox/xuberservice/repositary/XUberRepository$Companion;", "", "()V", "mRepository", "Lcom/gox/xuberservice/repositary/XUberRepository;", "instance", "xuberservice_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.gox.xuberservice.repositary.XUberRepository instance() {
            return null;
        }
    }
}