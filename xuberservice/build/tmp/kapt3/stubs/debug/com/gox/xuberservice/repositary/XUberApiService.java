package com.gox.xuberservice.repositary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bH\'J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b`\bH\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0007H\'J4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\bH\'JL\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b`\b2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\'\u00a8\u0006\u0019"}, d2 = {"Lcom/gox/xuberservice/repositary/XUberApiService;", "", "cancelRequest", "Lio/reactivex/Observable;", "Lcom/gox/xuberservice/model/CancelRequestModel;", "params", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "confirmPayment", "Lcom/gox/xuberservice/model/UpdateRequest;", "Lokhttp3/RequestBody;", "getReasons", "Lcom/gox/xuberservice/model/ReasonModel;", "type", "xUberCheckRequest", "Lcom/gox/xuberservice/model/XuperCheckRequest;", "latitude", "longitude", "xUberRating", "Lcom/gox/xuberservice/model/XuperRatingModel;", "xUberUpdateServices", "frontImage", "Lokhttp3/MultipartBody$Part;", "backImage", "xuberservice_debug"})
public abstract interface XUberApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "provider/check/serve/request")
    public abstract io.reactivex.Observable<com.gox.xuberservice.model.XuperCheckRequest> xUberCheckRequest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "latitude")
    java.lang.String latitude, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "longitude")
    java.lang.String longitude);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "provider/update/serve/request")
    @retrofit2.http.Multipart()
    public abstract io.reactivex.Observable<com.gox.xuberservice.model.UpdateRequest> xUberUpdateServices(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.HashMap<java.lang.String, okhttp3.RequestBody> params, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part frontImage, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part backImage);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "provider/rate/serve")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<com.gox.xuberservice.model.XuperRatingModel> xUberRating(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.FieldMap()
    java.util.HashMap<java.lang.String, java.lang.String> params);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "provider/reasons")
    public abstract io.reactivex.Observable<com.gox.xuberservice.model.ReasonModel> getReasons(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "provider/cancel/serve/request")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<com.gox.xuberservice.model.CancelRequestModel> cancelRequest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.FieldMap()
    java.util.HashMap<java.lang.String, java.lang.String> params);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "provider/update/serve/request")
    @retrofit2.http.Multipart()
    public abstract io.reactivex.Observable<com.gox.xuberservice.model.UpdateRequest> confirmPayment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.HashMap<java.lang.String, okhttp3.RequestBody> params);
}