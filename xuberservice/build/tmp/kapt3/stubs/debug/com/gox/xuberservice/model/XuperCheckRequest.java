package com.gox.xuberservice.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fBI\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JM\u0010\u0018\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest;", "", "error", "", "message", "", "responseData", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData;", "statusCode", "title", "(Ljava/util/List;Ljava/lang/String;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getResponseData", "()Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData;", "getStatusCode", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ResponseData", "xuberservice_debug"})
public final class XuperCheckRequest {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Object> error = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final com.gox.xuberservice.model.XuperCheckRequest.ResponseData responseData = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String statusCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.gox.xuberservice.model.XuperCheckRequest copy(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> error, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    com.gox.xuberservice.model.XuperCheckRequest.ResponseData responseData, @org.jetbrains.annotations.Nullable()
    java.lang.String statusCode, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public XuperCheckRequest() {
        super();
    }
    
    public XuperCheckRequest(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> error, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    com.gox.xuberservice.model.XuperCheckRequest.ResponseData responseData, @org.jetbrains.annotations.Nullable()
    java.lang.String statusCode, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData getResponseData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatusCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0005789:;B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u008e\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0011H\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015\u00a8\u0006<"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData;", "", "account_status", "", "provider_details", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails;", "reasons", "", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Reason;", "referral_amount", "referral_count", "referral_total_amount", "", "referral_total_count", "requests", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests;", "serve_otp", "", "service_status", "(Ljava/lang/String;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests;Ljava/lang/Integer;Ljava/lang/String;)V", "getAccount_status", "()Ljava/lang/String;", "getProvider_details", "()Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails;", "getReasons", "()Ljava/util/List;", "getReferral_amount", "getReferral_count", "getReferral_total_amount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getReferral_total_count", "getRequests", "()Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests;", "getServe_otp", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getService_status", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests;Ljava/lang/Integer;Ljava/lang/String;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData;", "equals", "", "other", "hashCode", "toString", "Category", "ProviderDetails", "Reason", "Requests", "Subcategory", "xuberservice_debug"})
    public static final class ResponseData {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String account_status = null;
        @org.jetbrains.annotations.Nullable()
        private final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails provider_details = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Reason> reasons = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String referral_amount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String referral_count = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Double referral_total_amount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String referral_total_count = null;
        @org.jetbrains.annotations.Nullable()
        private final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests requests = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer serve_otp = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String service_status = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData copy(@org.jetbrains.annotations.Nullable()
        java.lang.String account_status, @org.jetbrains.annotations.Nullable()
        com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails provider_details, @org.jetbrains.annotations.Nullable()
        java.util.List<com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Reason> reasons, @org.jetbrains.annotations.Nullable()
        java.lang.String referral_amount, @org.jetbrains.annotations.Nullable()
        java.lang.String referral_count, @org.jetbrains.annotations.Nullable()
        java.lang.Double referral_total_amount, @org.jetbrains.annotations.Nullable()
        java.lang.String referral_total_count, @org.jetbrains.annotations.Nullable()
        com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests requests, @org.jetbrains.annotations.Nullable()
        java.lang.Integer serve_otp, @org.jetbrains.annotations.Nullable()
        java.lang.String service_status) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ResponseData() {
            super();
        }
        
        public ResponseData(@org.jetbrains.annotations.Nullable()
        java.lang.String account_status, @org.jetbrains.annotations.Nullable()
        com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails provider_details, @org.jetbrains.annotations.Nullable()
        java.util.List<com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Reason> reasons, @org.jetbrains.annotations.Nullable()
        java.lang.String referral_amount, @org.jetbrains.annotations.Nullable()
        java.lang.String referral_count, @org.jetbrains.annotations.Nullable()
        java.lang.Double referral_total_amount, @org.jetbrains.annotations.Nullable()
        java.lang.String referral_total_count, @org.jetbrains.annotations.Nullable()
        com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests requests, @org.jetbrains.annotations.Nullable()
        java.lang.Integer serve_otp, @org.jetbrains.annotations.Nullable()
        java.lang.String service_status) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAccount_status() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails getProvider_details() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Reason> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Reason> getReasons() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReferral_amount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReferral_count() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getReferral_total_amount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReferral_total_count() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests getRequests() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getServe_otp() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getService_status() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\\\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0088\u0001B\u00e5\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010.J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010d\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u000b\u0010h\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u000b\u0010j\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010p\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0010\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010s\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\'H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010w\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010y\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u000b\u0010z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010}\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u00f0\u0003\u0010\u0081\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0082\u0001J\u0016\u0010\u0083\u0001\u001a\u00030\u0084\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0087\u0001\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b4\u00100R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b7\u00100R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b@\u00100R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b\u0012\u00100R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b\u0013\u00100R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b\u0014\u00100R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b\u0015\u00100R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b\u0016\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00106R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\n\n\u0002\u0010E\u001a\u0004\bG\u0010DR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0013\u0010 \u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0013\u0010!\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00106R\u0015\u0010#\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\n\n\u0002\u0010E\u001a\u0004\bN\u0010DR\u0015\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bO\u00100R\u0013\u0010%\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00106R\u0013\u0010&\u001a\u0004\u0018\u00010\'\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010(\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0015\u0010)\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bT\u00100R\u0013\u0010*\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00106R\u0013\u0010+\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00103R\u0015\u0010,\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\n\n\u0002\u0010E\u001a\u0004\bW\u0010DR\u0013\u0010-\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00103\u00a8\u0006\u0089\u0001"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails;", "", "activation_status", "", "admin_id", "city_id", "country_code", "", "country_id", "currency", "currency_symbol", "device_id", "device_token", "device_type", "email", "first_name", "gender", "id", "is_assigned", "is_bankdetail", "is_document", "is_online", "is_service", "language", "last_name", "latitude", "", "login_by", "longitude", "mobile", "otp", "payment_gateway_id", "payment_mode", "picture", "qrcode_url", "rating", "referal_count", "referral_unique_id", "service", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails$Service;", "social_unique_id", "state_id", "status", "stripe_cust_id", "wallet_balance", "zone_id", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails$Service;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Double;Ljava/lang/Object;)V", "getActivation_status", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAdmin_id", "()Ljava/lang/Object;", "getCity_id", "getCountry_code", "()Ljava/lang/String;", "getCountry_id", "getCurrency", "getCurrency_symbol", "getDevice_id", "getDevice_token", "getDevice_type", "getEmail", "getFirst_name", "getGender", "getId", "getLanguage", "getLast_name", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLogin_by", "getLongitude", "getMobile", "getOtp", "getPayment_gateway_id", "getPayment_mode", "getPicture", "getQrcode_url", "getRating", "getReferal_count", "getReferral_unique_id", "getService", "()Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails$Service;", "getSocial_unique_id", "getState_id", "getStatus", "getStripe_cust_id", "getWallet_balance", "getZone_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails$Service;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Double;Ljava/lang/Object;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails;", "equals", "", "other", "hashCode", "toString", "Service", "xuberservice_debug"})
        public static final class ProviderDetails {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer activation_status = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object admin_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer city_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String country_code = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer country_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object currency = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String currency_symbol = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object device_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object device_token = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object device_type = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String email = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String first_name = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String gender = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer is_assigned = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer is_bankdetail = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer is_document = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer is_online = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer is_service = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String language = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String last_name = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double latitude = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String login_by = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double longitude = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String mobile = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object otp = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object payment_gateway_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String payment_mode = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object picture = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String qrcode_url = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double rating = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer referal_count = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String referral_unique_id = null;
            @org.jetbrains.annotations.Nullable()
            private final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails.Service service = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object social_unique_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer state_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String status = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object stripe_cust_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double wallet_balance = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object zone_id = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails copy(@org.jetbrains.annotations.Nullable()
            java.lang.Integer activation_status, @org.jetbrains.annotations.Nullable()
            java.lang.Object admin_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer city_id, @org.jetbrains.annotations.Nullable()
            java.lang.String country_code, @org.jetbrains.annotations.Nullable()
            java.lang.Integer country_id, @org.jetbrains.annotations.Nullable()
            java.lang.Object currency, @org.jetbrains.annotations.Nullable()
            java.lang.String currency_symbol, @org.jetbrains.annotations.Nullable()
            java.lang.Object device_id, @org.jetbrains.annotations.Nullable()
            java.lang.Object device_token, @org.jetbrains.annotations.Nullable()
            java.lang.Object device_type, @org.jetbrains.annotations.Nullable()
            java.lang.String email, @org.jetbrains.annotations.Nullable()
            java.lang.String first_name, @org.jetbrains.annotations.Nullable()
            java.lang.String gender, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_assigned, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_bankdetail, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_document, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_online, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_service, @org.jetbrains.annotations.Nullable()
            java.lang.String language, @org.jetbrains.annotations.Nullable()
            java.lang.String last_name, @org.jetbrains.annotations.Nullable()
            java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
            java.lang.String login_by, @org.jetbrains.annotations.Nullable()
            java.lang.Double longitude, @org.jetbrains.annotations.Nullable()
            java.lang.String mobile, @org.jetbrains.annotations.Nullable()
            java.lang.Object otp, @org.jetbrains.annotations.Nullable()
            java.lang.Object payment_gateway_id, @org.jetbrains.annotations.Nullable()
            java.lang.String payment_mode, @org.jetbrains.annotations.Nullable()
            java.lang.Object picture, @org.jetbrains.annotations.Nullable()
            java.lang.String qrcode_url, @org.jetbrains.annotations.Nullable()
            java.lang.Double rating, @org.jetbrains.annotations.Nullable()
            java.lang.Integer referal_count, @org.jetbrains.annotations.Nullable()
            java.lang.String referral_unique_id, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails.Service service, @org.jetbrains.annotations.Nullable()
            java.lang.Object social_unique_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer state_id, @org.jetbrains.annotations.Nullable()
            java.lang.String status, @org.jetbrains.annotations.Nullable()
            java.lang.Object stripe_cust_id, @org.jetbrains.annotations.Nullable()
            java.lang.Double wallet_balance, @org.jetbrains.annotations.Nullable()
            java.lang.Object zone_id) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ProviderDetails() {
                super();
            }
            
            public ProviderDetails(@org.jetbrains.annotations.Nullable()
            java.lang.Integer activation_status, @org.jetbrains.annotations.Nullable()
            java.lang.Object admin_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer city_id, @org.jetbrains.annotations.Nullable()
            java.lang.String country_code, @org.jetbrains.annotations.Nullable()
            java.lang.Integer country_id, @org.jetbrains.annotations.Nullable()
            java.lang.Object currency, @org.jetbrains.annotations.Nullable()
            java.lang.String currency_symbol, @org.jetbrains.annotations.Nullable()
            java.lang.Object device_id, @org.jetbrains.annotations.Nullable()
            java.lang.Object device_token, @org.jetbrains.annotations.Nullable()
            java.lang.Object device_type, @org.jetbrains.annotations.Nullable()
            java.lang.String email, @org.jetbrains.annotations.Nullable()
            java.lang.String first_name, @org.jetbrains.annotations.Nullable()
            java.lang.String gender, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_assigned, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_bankdetail, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_document, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_online, @org.jetbrains.annotations.Nullable()
            java.lang.Integer is_service, @org.jetbrains.annotations.Nullable()
            java.lang.String language, @org.jetbrains.annotations.Nullable()
            java.lang.String last_name, @org.jetbrains.annotations.Nullable()
            java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
            java.lang.String login_by, @org.jetbrains.annotations.Nullable()
            java.lang.Double longitude, @org.jetbrains.annotations.Nullable()
            java.lang.String mobile, @org.jetbrains.annotations.Nullable()
            java.lang.Object otp, @org.jetbrains.annotations.Nullable()
            java.lang.Object payment_gateway_id, @org.jetbrains.annotations.Nullable()
            java.lang.String payment_mode, @org.jetbrains.annotations.Nullable()
            java.lang.Object picture, @org.jetbrains.annotations.Nullable()
            java.lang.String qrcode_url, @org.jetbrains.annotations.Nullable()
            java.lang.Double rating, @org.jetbrains.annotations.Nullable()
            java.lang.Integer referal_count, @org.jetbrains.annotations.Nullable()
            java.lang.String referral_unique_id, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails.Service service, @org.jetbrains.annotations.Nullable()
            java.lang.Object social_unique_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer state_id, @org.jetbrains.annotations.Nullable()
            java.lang.String status, @org.jetbrains.annotations.Nullable()
            java.lang.Object stripe_cust_id, @org.jetbrains.annotations.Nullable()
            java.lang.Double wallet_balance, @org.jetbrains.annotations.Nullable()
            java.lang.Object zone_id) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getActivation_status() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAdmin_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCity_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCountry_code() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCountry_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCurrency() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCurrency_symbol() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component8() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getDevice_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component9() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getDevice_token() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component10() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getDevice_type() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component11() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getEmail() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component12() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFirst_name() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component13() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getGender() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component14() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component15() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer is_assigned() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component16() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer is_bankdetail() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component17() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer is_document() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component18() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer is_online() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component19() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer is_service() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component20() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLanguage() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component21() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLast_name() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component22() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getLatitude() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component23() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLogin_by() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component24() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getLongitude() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component25() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getMobile() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component26() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getOtp() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component27() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getPayment_gateway_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component28() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPayment_mode() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component29() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getPicture() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component30() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getQrcode_url() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component31() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getRating() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component32() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getReferal_count() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component33() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getReferral_unique_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails.Service component34() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails.Service getService() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component35() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSocial_unique_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component36() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getState_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component37() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStatus() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component38() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getStripe_cust_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component39() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getWallet_balance() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component40() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getZone_id() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u00102\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u00aa\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020\u0010H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\"\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b%\u0010\u0014\u00a8\u0006:"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails$Service;", "", "admin_service_id", "", "base_fare", "", "category_id", "company_id", "id", "per_miles", "per_mins", "provider_id", "provider_vehicle_id", "ride_delivery_id", "service_id", "status", "", "sub_category_id", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getAdmin_service_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBase_fare", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCategory_id", "getCompany_id", "getId", "getPer_miles", "getPer_mins", "getProvider_id", "getProvider_vehicle_id", "()Ljava/lang/Object;", "getRide_delivery_id", "getService_id", "getStatus", "()Ljava/lang/String;", "getSub_category_id", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$ProviderDetails$Service;", "equals", "", "other", "hashCode", "toString", "xuberservice_debug"})
            public static final class Service {
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer admin_service_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double base_fare = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer category_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer company_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double per_miles = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double per_mins = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer provider_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Object provider_vehicle_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Object ride_delivery_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer service_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String status = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer sub_category_id = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.ProviderDetails.Service copy(@org.jetbrains.annotations.Nullable()
                java.lang.Integer admin_service_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double base_fare, @org.jetbrains.annotations.Nullable()
                java.lang.Integer category_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                java.lang.Double per_miles, @org.jetbrains.annotations.Nullable()
                java.lang.Double per_mins, @org.jetbrains.annotations.Nullable()
                java.lang.Integer provider_id, @org.jetbrains.annotations.Nullable()
                java.lang.Object provider_vehicle_id, @org.jetbrains.annotations.Nullable()
                java.lang.Object ride_delivery_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_id, @org.jetbrains.annotations.Nullable()
                java.lang.String status, @org.jetbrains.annotations.Nullable()
                java.lang.Integer sub_category_id) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public Service() {
                    super();
                }
                
                public Service(@org.jetbrains.annotations.Nullable()
                java.lang.Integer admin_service_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double base_fare, @org.jetbrains.annotations.Nullable()
                java.lang.Integer category_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                java.lang.Double per_miles, @org.jetbrains.annotations.Nullable()
                java.lang.Double per_mins, @org.jetbrains.annotations.Nullable()
                java.lang.Integer provider_id, @org.jetbrains.annotations.Nullable()
                java.lang.Object provider_vehicle_id, @org.jetbrains.annotations.Nullable()
                java.lang.Object ride_delivery_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_id, @org.jetbrains.annotations.Nullable()
                java.lang.String status, @org.jetbrains.annotations.Nullable()
                java.lang.Integer sub_category_id) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getAdmin_service_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getBase_fare() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getCategory_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getCompany_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component5() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getId() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component6() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getPer_miles() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component7() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getPer_mins() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component8() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getProvider_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object component9() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getProvider_vehicle_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object component10() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getRide_delivery_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component11() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getService_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component12() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getStatus() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component13() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getSub_category_id() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bw\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\u00b9\u0001\u00ba\u0001\u00bb\u0001B\u00ef\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u00a2\u0006\u0002\u0010>J\u000b\u0010~\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u000fH\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\bH\u00c6\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\f\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\u0011\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\f\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\f\u0010\u00a8\u0001\u001a\u0004\u0018\u000107H\u00c6\u0003J\u0011\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\f\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00ab\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010UJ\f\u0010\u00ac\u0001\u001a\u0004\u0018\u00010;H\u00c6\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010=H\u00c6\u0003J\f\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\bH\u00c6\u0003J\u00fa\u0004\u0010\u00b2\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00b3\u0001J\u0016\u0010\u00b4\u0001\u001a\u00030\u00b5\u00012\t\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u000fH\u00d6\u0001J\n\u0010\u00b8\u0001\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010@R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010@R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010@R\u0013\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010FR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010@R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010@R\u0013\u0010:\u001a\u0004\u0018\u00010;\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010O\u001a\u0004\bM\u0010NR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010O\u001a\u0004\bP\u0010NR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010@R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010FR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010FR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\bT\u0010UR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010FR\u0011\u0010\u0016\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010FR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010FR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010O\u001a\u0004\b[\u0010NR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010\u001c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010FR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\b_\u0010UR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\b`\u0010UR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010O\u001a\u0004\ba\u0010NR\u0015\u0010 \u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\bb\u0010UR\u0013\u0010!\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010@R\u0013\u0010\"\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010FR\u0013\u0010#\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010FR\u0013\u0010$\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010FR\u0015\u0010%\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\bg\u0010UR\u0015\u0010&\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\bh\u0010UR\u0013\u0010\'\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010@R\u0013\u0010(\u001a\u0004\u0018\u00010)\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0015\u0010*\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010O\u001a\u0004\bl\u0010NR\u0013\u0010+\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010FR\u0013\u0010,\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010FR\u0013\u0010<\u001a\u0004\u0018\u00010=\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0015\u0010-\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\bq\u0010UR\u0015\u0010.\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010O\u001a\u0004\br\u0010NR\u0013\u0010/\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010FR\u0015\u00100\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\bt\u0010UR\u0015\u00101\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\bu\u0010UR\u0015\u00102\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\bv\u0010UR\u0013\u00103\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010FR\u0013\u00104\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010FR\u0015\u00105\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010O\u001a\u0004\by\u0010NR\u0013\u00106\u001a\u0004\u0018\u000107\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0015\u00108\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010O\u001a\u0004\b|\u0010NR\u0015\u00109\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010V\u001a\u0004\b}\u0010U\u00a8\u0006\u00bc\u0001"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests;", "", "admin_id", "after_comment", "after_image", "allow_description", "allow_image", "assigned_at", "", "before_image", "booking_id", "created_type", "cancel_reason", "cancelled_by", "city_id", "", "company_id", "country_id", "currency", "distance", "", "finished_at", "id", "is_scheduled", "otp", "paid", "payment", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Payment;", "payment_mode", "price", "promocode_id", "provider_id", "provider_rated", "quantity", "request_type", "route_key", "s_address", "s_latitude", "s_longitude", "schedule_at", "service", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Service;", "service_id", "started_at", "status", "surge", "time_left_to_respond", "timezone", "track_distance", "track_latitude", "track_longitude", "travel_time", "unit", "use_wallet", "user", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$User;", "user_id", "user_rated", "category", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Category;", "subcategory", "Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Subcategory;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Payment;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Object;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Service;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$User;Ljava/lang/Integer;Ljava/lang/Double;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Category;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Subcategory;)V", "getAdmin_id", "()Ljava/lang/Object;", "getAfter_comment", "getAfter_image", "getAllow_description", "getAllow_image", "getAssigned_at", "()Ljava/lang/String;", "getBefore_image", "getBooking_id", "getCancel_reason", "getCancelled_by", "getCategory", "()Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Category;", "getCity_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompany_id", "getCountry_id", "getCreated_type", "getCurrency", "getDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFinished_at", "getId", "()I", "getOtp", "getPaid", "getPayment", "()Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Payment;", "getPayment_mode", "getPrice", "getPromocode_id", "getProvider_id", "getProvider_rated", "getQuantity", "getRequest_type", "getRoute_key", "getS_address", "getS_latitude", "getS_longitude", "getSchedule_at", "getService", "()Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Service;", "getService_id", "getStarted_at", "getStatus", "getSubcategory", "()Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Subcategory;", "getSurge", "getTime_left_to_respond", "getTimezone", "getTrack_distance", "getTrack_latitude", "getTrack_longitude", "getTravel_time", "getUnit", "getUse_wallet", "getUser", "()Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$User;", "getUser_id", "getUser_rated", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Payment;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Object;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Service;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$User;Ljava/lang/Integer;Ljava/lang/Double;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Category;Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Subcategory;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests;", "equals", "", "other", "hashCode", "toString", "Payment", "Service", "User", "xuberservice_debug"})
        public static final class Requests {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object admin_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object after_comment = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object after_image = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object allow_description = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object allow_image = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String assigned_at = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object before_image = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String booking_id = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String created_type = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object cancel_reason = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object cancelled_by = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer city_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer company_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object country_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String currency = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double distance = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String finished_at = null;
            private final int id = 0;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String is_scheduled = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String otp = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer paid = null;
            @org.jetbrains.annotations.Nullable()
            private final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Payment payment = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String payment_mode = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double price = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double promocode_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer provider_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double provider_rated = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object quantity = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String request_type = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String route_key = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String s_address = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double s_latitude = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double s_longitude = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object schedule_at = null;
            @org.jetbrains.annotations.Nullable()
            private final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Service service = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer service_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String started_at = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String status = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double surge = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer time_left_to_respond = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String timezone = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double track_distance = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double track_latitude = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double track_longitude = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String travel_time = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String unit = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer use_wallet = null;
            @org.jetbrains.annotations.Nullable()
            private final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.User user = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer user_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Double user_rated = null;
            @org.jetbrains.annotations.Nullable()
            private final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Category category = null;
            @org.jetbrains.annotations.Nullable()
            private final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Subcategory subcategory = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests copy(@org.jetbrains.annotations.Nullable()
            java.lang.Object admin_id, @org.jetbrains.annotations.Nullable()
            java.lang.Object after_comment, @org.jetbrains.annotations.Nullable()
            java.lang.Object after_image, @org.jetbrains.annotations.Nullable()
            java.lang.Object allow_description, @org.jetbrains.annotations.Nullable()
            java.lang.Object allow_image, @org.jetbrains.annotations.Nullable()
            java.lang.String assigned_at, @org.jetbrains.annotations.Nullable()
            java.lang.Object before_image, @org.jetbrains.annotations.Nullable()
            java.lang.String booking_id, @org.jetbrains.annotations.NotNull()
            java.lang.String created_type, @org.jetbrains.annotations.Nullable()
            java.lang.Object cancel_reason, @org.jetbrains.annotations.Nullable()
            java.lang.Object cancelled_by, @org.jetbrains.annotations.Nullable()
            java.lang.Integer city_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
            java.lang.Object country_id, @org.jetbrains.annotations.Nullable()
            java.lang.String currency, @org.jetbrains.annotations.Nullable()
            java.lang.Double distance, @org.jetbrains.annotations.Nullable()
            java.lang.String finished_at, int id, @org.jetbrains.annotations.Nullable()
            java.lang.String is_scheduled, @org.jetbrains.annotations.Nullable()
            java.lang.String otp, @org.jetbrains.annotations.Nullable()
            java.lang.Integer paid, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Payment payment, @org.jetbrains.annotations.NotNull()
            java.lang.String payment_mode, @org.jetbrains.annotations.Nullable()
            java.lang.Double price, @org.jetbrains.annotations.Nullable()
            java.lang.Double promocode_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer provider_id, @org.jetbrains.annotations.Nullable()
            java.lang.Double provider_rated, @org.jetbrains.annotations.Nullable()
            java.lang.Object quantity, @org.jetbrains.annotations.Nullable()
            java.lang.String request_type, @org.jetbrains.annotations.Nullable()
            java.lang.String route_key, @org.jetbrains.annotations.Nullable()
            java.lang.String s_address, @org.jetbrains.annotations.Nullable()
            java.lang.Double s_latitude, @org.jetbrains.annotations.Nullable()
            java.lang.Double s_longitude, @org.jetbrains.annotations.Nullable()
            java.lang.Object schedule_at, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Service service, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_id, @org.jetbrains.annotations.Nullable()
            java.lang.String started_at, @org.jetbrains.annotations.Nullable()
            java.lang.String status, @org.jetbrains.annotations.Nullable()
            java.lang.Double surge, @org.jetbrains.annotations.Nullable()
            java.lang.Integer time_left_to_respond, @org.jetbrains.annotations.Nullable()
            java.lang.String timezone, @org.jetbrains.annotations.Nullable()
            java.lang.Double track_distance, @org.jetbrains.annotations.Nullable()
            java.lang.Double track_latitude, @org.jetbrains.annotations.Nullable()
            java.lang.Double track_longitude, @org.jetbrains.annotations.Nullable()
            java.lang.String travel_time, @org.jetbrains.annotations.Nullable()
            java.lang.String unit, @org.jetbrains.annotations.Nullable()
            java.lang.Integer use_wallet, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.User user, @org.jetbrains.annotations.Nullable()
            java.lang.Integer user_id, @org.jetbrains.annotations.Nullable()
            java.lang.Double user_rated, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Category category, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Subcategory subcategory) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Requests() {
                super();
            }
            
            public Requests(@org.jetbrains.annotations.Nullable()
            java.lang.Object admin_id, @org.jetbrains.annotations.Nullable()
            java.lang.Object after_comment, @org.jetbrains.annotations.Nullable()
            java.lang.Object after_image, @org.jetbrains.annotations.Nullable()
            java.lang.Object allow_description, @org.jetbrains.annotations.Nullable()
            java.lang.Object allow_image, @org.jetbrains.annotations.Nullable()
            java.lang.String assigned_at, @org.jetbrains.annotations.Nullable()
            java.lang.Object before_image, @org.jetbrains.annotations.Nullable()
            java.lang.String booking_id, @org.jetbrains.annotations.NotNull()
            java.lang.String created_type, @org.jetbrains.annotations.Nullable()
            java.lang.Object cancel_reason, @org.jetbrains.annotations.Nullable()
            java.lang.Object cancelled_by, @org.jetbrains.annotations.Nullable()
            java.lang.Integer city_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
            java.lang.Object country_id, @org.jetbrains.annotations.Nullable()
            java.lang.String currency, @org.jetbrains.annotations.Nullable()
            java.lang.Double distance, @org.jetbrains.annotations.Nullable()
            java.lang.String finished_at, int id, @org.jetbrains.annotations.Nullable()
            java.lang.String is_scheduled, @org.jetbrains.annotations.Nullable()
            java.lang.String otp, @org.jetbrains.annotations.Nullable()
            java.lang.Integer paid, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Payment payment, @org.jetbrains.annotations.NotNull()
            java.lang.String payment_mode, @org.jetbrains.annotations.Nullable()
            java.lang.Double price, @org.jetbrains.annotations.Nullable()
            java.lang.Double promocode_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer provider_id, @org.jetbrains.annotations.Nullable()
            java.lang.Double provider_rated, @org.jetbrains.annotations.Nullable()
            java.lang.Object quantity, @org.jetbrains.annotations.Nullable()
            java.lang.String request_type, @org.jetbrains.annotations.Nullable()
            java.lang.String route_key, @org.jetbrains.annotations.Nullable()
            java.lang.String s_address, @org.jetbrains.annotations.Nullable()
            java.lang.Double s_latitude, @org.jetbrains.annotations.Nullable()
            java.lang.Double s_longitude, @org.jetbrains.annotations.Nullable()
            java.lang.Object schedule_at, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Service service, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_id, @org.jetbrains.annotations.Nullable()
            java.lang.String started_at, @org.jetbrains.annotations.Nullable()
            java.lang.String status, @org.jetbrains.annotations.Nullable()
            java.lang.Double surge, @org.jetbrains.annotations.Nullable()
            java.lang.Integer time_left_to_respond, @org.jetbrains.annotations.Nullable()
            java.lang.String timezone, @org.jetbrains.annotations.Nullable()
            java.lang.Double track_distance, @org.jetbrains.annotations.Nullable()
            java.lang.Double track_latitude, @org.jetbrains.annotations.Nullable()
            java.lang.Double track_longitude, @org.jetbrains.annotations.Nullable()
            java.lang.String travel_time, @org.jetbrains.annotations.Nullable()
            java.lang.String unit, @org.jetbrains.annotations.Nullable()
            java.lang.Integer use_wallet, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.User user, @org.jetbrains.annotations.Nullable()
            java.lang.Integer user_id, @org.jetbrains.annotations.Nullable()
            java.lang.Double user_rated, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Category category, @org.jetbrains.annotations.Nullable()
            com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Subcategory subcategory) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAdmin_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAfter_comment() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAfter_image() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAllow_description() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getAllow_image() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAssigned_at() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getBefore_image() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component8() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getBooking_id() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component9() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCreated_type() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component10() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCancel_reason() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component11() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCancelled_by() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component12() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCity_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component13() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCompany_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component14() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getCountry_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component15() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCurrency() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component16() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getDistance() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component17() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFinished_at() {
                return null;
            }
            
            public final int component18() {
                return 0;
            }
            
            public final int getId() {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component19() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String is_scheduled() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component20() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOtp() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component21() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getPaid() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Payment component22() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Payment getPayment() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component23() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPayment_mode() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component24() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getPrice() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component25() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getPromocode_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component26() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getProvider_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component27() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getProvider_rated() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component28() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getQuantity() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component29() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getRequest_type() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component30() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getRoute_key() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component31() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getS_address() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component32() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getS_latitude() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component33() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getS_longitude() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component34() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSchedule_at() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Service component35() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Service getService() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component36() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getService_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component37() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStarted_at() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component38() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStatus() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component39() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getSurge() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component40() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getTime_left_to_respond() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component41() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTimezone() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component42() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getTrack_distance() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component43() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getTrack_latitude() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component44() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getTrack_longitude() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component45() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTravel_time() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component46() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getUnit() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component47() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getUse_wallet() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.User component48() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.User getUser() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component49() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getUser_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double component50() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Double getUser_rated() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Category component51() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Category getCategory() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Subcategory component52() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Subcategory getSubcategory() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0092\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\t\u0010.\u001a\u00020\nH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\b\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u0011R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011\u00a8\u0006/"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Service;", "", "allow_after_image", "", "allow_before_image", "allow_desc", "company_id", "id", "is_professional", "picture", "", "service_category_id", "service_name", "service_status", "service_subcategory_id", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAllow_after_image", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAllow_before_image", "getAllow_desc", "getCompany_id", "getId", "getPicture", "()Ljava/lang/String;", "getService_category_id", "getService_name", "getService_status", "getService_subcategory_id", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Service;", "equals", "", "other", "hashCode", "toString", "xuberservice_debug"})
            public static final class Service {
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer allow_after_image = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer allow_before_image = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer allow_desc = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer company_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer is_professional = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String picture = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer service_category_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String service_name = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer service_status = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer service_subcategory_id = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Service copy(@org.jetbrains.annotations.Nullable()
                java.lang.Integer allow_after_image, @org.jetbrains.annotations.Nullable()
                java.lang.Integer allow_before_image, @org.jetbrains.annotations.Nullable()
                java.lang.Integer allow_desc, @org.jetbrains.annotations.Nullable()
                java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer is_professional, @org.jetbrains.annotations.Nullable()
                java.lang.String picture, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_category_id, @org.jetbrains.annotations.Nullable()
                java.lang.String service_name, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_status, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_subcategory_id) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public Service() {
                    super();
                }
                
                public Service(@org.jetbrains.annotations.Nullable()
                java.lang.Integer allow_after_image, @org.jetbrains.annotations.Nullable()
                java.lang.Integer allow_before_image, @org.jetbrains.annotations.Nullable()
                java.lang.Integer allow_desc, @org.jetbrains.annotations.Nullable()
                java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer is_professional, @org.jetbrains.annotations.Nullable()
                java.lang.String picture, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_category_id, @org.jetbrains.annotations.Nullable()
                java.lang.String service_name, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_status, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_subcategory_id) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getAllow_after_image() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getAllow_before_image() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getAllow_desc() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getCompany_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component5() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getId() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component6() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer is_professional() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component7() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getPicture() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component8() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getService_category_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component9() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getService_name() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component10() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getService_status() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component11() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getService_subcategory_id() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b`\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010%J\u0010\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010M\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010P\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010S\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u000b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010X\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010[\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010]\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010d\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010g\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010i\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u0010\u0010j\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\u008c\u0003\u0010l\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010mJ\u0013\u0010n\u001a\u00020o2\b\u0010p\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010q\u001a\u00020\bH\u00d6\u0001J\t\u0010r\u001a\u00020\u000eH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010\'R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010\'R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b*\u0010\'R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b+\u0010\'R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b/\u0010\'R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b0\u0010\'R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b1\u0010\'R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b6\u0010\'R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b7\u0010\'R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b8\u0010-R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b9\u0010\'R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b:\u0010\'R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b;\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010<R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b=\u0010\'R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b>\u0010\'R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\bA\u0010\'R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\bB\u0010-R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\bC\u0010\'R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\bD\u0010-R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\bE\u0010\'R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\bF\u0010\'R\u0015\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\bG\u0010\'R\u0015\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\bH\u0010\'R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\bI\u0010\'R\u0015\u0010#\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\bJ\u0010-R\u0015\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\bK\u0010\'\u00a8\u0006s"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Payment;", "", "card", "", "cash", "commision", "commision_percent", "company_id", "", "discount", "discount_percent", "distance", "extra_charges", "extra_charges_notes", "", "fixed", "fleet", "fleet_id", "fleet_percent", "hour", "id", "is_partial", "minute", "payable", "payment_id", "payment_mode", "promocode_id", "provider_id", "provider_pay", "service_request_id", "surge", "tax", "tax_percent", "tips", "total", "user_id", "wallet", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;DLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)V", "getCard", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCash", "getCommision", "getCommision_percent", "getCompany_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDiscount", "getDiscount_percent", "getDistance", "getExtra_charges", "()D", "getExtra_charges_notes", "()Ljava/lang/String;", "getFixed", "getFleet", "getFleet_id", "getFleet_percent", "getHour", "getId", "()Ljava/lang/Object;", "getMinute", "getPayable", "getPayment_id", "getPayment_mode", "getPromocode_id", "getProvider_id", "getProvider_pay", "getService_request_id", "getSurge", "getTax", "getTax_percent", "getTips", "getTotal", "getUser_id", "getWallet", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;DLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$Payment;", "equals", "", "other", "hashCode", "toString", "xuberservice_debug"})
            public static final class Payment {
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double card = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double cash = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double commision = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double commision_percent = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer company_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double discount = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double discount_percent = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double distance = null;
                private final double extra_charges = 0.0;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String extra_charges_notes = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double fixed = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double fleet = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer fleet_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double fleet_percent = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double hour = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Object is_partial = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double minute = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double payable = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Object payment_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String payment_mode = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double promocode_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer provider_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double provider_pay = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer service_request_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double surge = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double tax = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double tax_percent = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double tips = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double total = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer user_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double wallet = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.Payment copy(@org.jetbrains.annotations.Nullable()
                java.lang.Double card, @org.jetbrains.annotations.Nullable()
                java.lang.Double cash, @org.jetbrains.annotations.Nullable()
                java.lang.Double commision, @org.jetbrains.annotations.Nullable()
                java.lang.Double commision_percent, @org.jetbrains.annotations.Nullable()
                java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double discount, @org.jetbrains.annotations.Nullable()
                java.lang.Double discount_percent, @org.jetbrains.annotations.Nullable()
                java.lang.Double distance, double extra_charges, @org.jetbrains.annotations.Nullable()
                java.lang.String extra_charges_notes, @org.jetbrains.annotations.Nullable()
                java.lang.Double fixed, @org.jetbrains.annotations.Nullable()
                java.lang.Double fleet, @org.jetbrains.annotations.Nullable()
                java.lang.Integer fleet_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double fleet_percent, @org.jetbrains.annotations.Nullable()
                java.lang.Double hour, @org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                java.lang.Object is_partial, @org.jetbrains.annotations.Nullable()
                java.lang.Double minute, @org.jetbrains.annotations.Nullable()
                java.lang.Double payable, @org.jetbrains.annotations.Nullable()
                java.lang.Object payment_id, @org.jetbrains.annotations.Nullable()
                java.lang.String payment_mode, @org.jetbrains.annotations.Nullable()
                java.lang.Double promocode_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer provider_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double provider_pay, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_request_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double surge, @org.jetbrains.annotations.Nullable()
                java.lang.Double tax, @org.jetbrains.annotations.Nullable()
                java.lang.Double tax_percent, @org.jetbrains.annotations.Nullable()
                java.lang.Double tips, @org.jetbrains.annotations.Nullable()
                java.lang.Double total, @org.jetbrains.annotations.Nullable()
                java.lang.Integer user_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double wallet) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public Payment() {
                    super();
                }
                
                public Payment(@org.jetbrains.annotations.Nullable()
                java.lang.Double card, @org.jetbrains.annotations.Nullable()
                java.lang.Double cash, @org.jetbrains.annotations.Nullable()
                java.lang.Double commision, @org.jetbrains.annotations.Nullable()
                java.lang.Double commision_percent, @org.jetbrains.annotations.Nullable()
                java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double discount, @org.jetbrains.annotations.Nullable()
                java.lang.Double discount_percent, @org.jetbrains.annotations.Nullable()
                java.lang.Double distance, double extra_charges, @org.jetbrains.annotations.Nullable()
                java.lang.String extra_charges_notes, @org.jetbrains.annotations.Nullable()
                java.lang.Double fixed, @org.jetbrains.annotations.Nullable()
                java.lang.Double fleet, @org.jetbrains.annotations.Nullable()
                java.lang.Integer fleet_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double fleet_percent, @org.jetbrains.annotations.Nullable()
                java.lang.Double hour, @org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                java.lang.Object is_partial, @org.jetbrains.annotations.Nullable()
                java.lang.Double minute, @org.jetbrains.annotations.Nullable()
                java.lang.Double payable, @org.jetbrains.annotations.Nullable()
                java.lang.Object payment_id, @org.jetbrains.annotations.Nullable()
                java.lang.String payment_mode, @org.jetbrains.annotations.Nullable()
                java.lang.Double promocode_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer provider_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double provider_pay, @org.jetbrains.annotations.Nullable()
                java.lang.Integer service_request_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double surge, @org.jetbrains.annotations.Nullable()
                java.lang.Double tax, @org.jetbrains.annotations.Nullable()
                java.lang.Double tax_percent, @org.jetbrains.annotations.Nullable()
                java.lang.Double tips, @org.jetbrains.annotations.Nullable()
                java.lang.Double total, @org.jetbrains.annotations.Nullable()
                java.lang.Integer user_id, @org.jetbrains.annotations.Nullable()
                java.lang.Double wallet) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getCard() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getCash() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getCommision() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getCommision_percent() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component5() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getCompany_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component6() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getDiscount() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component7() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getDiscount_percent() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component8() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getDistance() {
                    return null;
                }
                
                public final double component9() {
                    return 0.0;
                }
                
                public final double getExtra_charges() {
                    return 0.0;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component10() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getExtra_charges_notes() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component11() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getFixed() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component12() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getFleet() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component13() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getFleet_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component14() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getFleet_percent() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component15() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getHour() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component16() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getId() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object component17() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object is_partial() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component18() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getMinute() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component19() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getPayable() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object component20() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getPayment_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component21() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getPayment_mode() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component22() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getPromocode_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component23() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getProvider_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component24() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getProvider_pay() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component25() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getService_request_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component26() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getSurge() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component27() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getTax() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component28() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getTax_percent() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component29() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getTips() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component30() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getTotal() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component31() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getUser_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component32() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getWallet() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0094\u0002\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00c6\u0001\u00a2\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010S\u001a\u00020\u0003H\u00d6\u0001J\t\u0010T\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\'\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b2\u0010\u001dR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b3\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106\u00a8\u0006U"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$User;", "", "city_id", "", "country_code", "", "country_id", "created_at", "currency_symbol", "email", "first_name", "gender", "id", "language", "last_name", "latitude", "login_by", "longitude", "mobile", "payment_mode", "picture", "rating", "state_id", "status", "user_type", "wallet_balance", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V", "getCity_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCountry_code", "()Ljava/lang/String;", "getCountry_id", "getCreated_at", "getCurrency_symbol", "getEmail", "getFirst_name", "getGender", "getId", "getLanguage", "getLast_name", "getLatitude", "()Ljava/lang/Object;", "getLogin_by", "getLongitude", "getMobile", "getPayment_mode", "getPicture", "getRating", "getState_id", "getStatus", "getUser_type", "getWallet_balance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Requests$User;", "equals", "", "other", "hashCode", "toString", "xuberservice_debug"})
            public static final class User {
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer city_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String country_code = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer country_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String created_at = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String currency_symbol = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String email = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String first_name = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String gender = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String language = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String last_name = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Object latitude = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String login_by = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Object longitude = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String mobile = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String payment_mode = null;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String picture = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String rating = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer state_id = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Integer status = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.String user_type = null;
                @org.jetbrains.annotations.Nullable()
                private final java.lang.Double wallet_balance = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Requests.User copy(@org.jetbrains.annotations.Nullable()
                java.lang.Integer city_id, @org.jetbrains.annotations.Nullable()
                java.lang.String country_code, @org.jetbrains.annotations.Nullable()
                java.lang.Integer country_id, @org.jetbrains.annotations.Nullable()
                java.lang.String created_at, @org.jetbrains.annotations.Nullable()
                java.lang.String currency_symbol, @org.jetbrains.annotations.Nullable()
                java.lang.String email, @org.jetbrains.annotations.Nullable()
                java.lang.String first_name, @org.jetbrains.annotations.Nullable()
                java.lang.String gender, @org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                java.lang.String language, @org.jetbrains.annotations.Nullable()
                java.lang.String last_name, @org.jetbrains.annotations.Nullable()
                java.lang.Object latitude, @org.jetbrains.annotations.Nullable()
                java.lang.String login_by, @org.jetbrains.annotations.Nullable()
                java.lang.Object longitude, @org.jetbrains.annotations.Nullable()
                java.lang.String mobile, @org.jetbrains.annotations.Nullable()
                java.lang.String payment_mode, @org.jetbrains.annotations.NotNull()
                java.lang.String picture, @org.jetbrains.annotations.Nullable()
                java.lang.String rating, @org.jetbrains.annotations.Nullable()
                java.lang.Integer state_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer status, @org.jetbrains.annotations.Nullable()
                java.lang.String user_type, @org.jetbrains.annotations.Nullable()
                java.lang.Double wallet_balance) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public User() {
                    super();
                }
                
                public User(@org.jetbrains.annotations.Nullable()
                java.lang.Integer city_id, @org.jetbrains.annotations.Nullable()
                java.lang.String country_code, @org.jetbrains.annotations.Nullable()
                java.lang.Integer country_id, @org.jetbrains.annotations.Nullable()
                java.lang.String created_at, @org.jetbrains.annotations.Nullable()
                java.lang.String currency_symbol, @org.jetbrains.annotations.Nullable()
                java.lang.String email, @org.jetbrains.annotations.Nullable()
                java.lang.String first_name, @org.jetbrains.annotations.Nullable()
                java.lang.String gender, @org.jetbrains.annotations.Nullable()
                java.lang.Integer id, @org.jetbrains.annotations.Nullable()
                java.lang.String language, @org.jetbrains.annotations.Nullable()
                java.lang.String last_name, @org.jetbrains.annotations.Nullable()
                java.lang.Object latitude, @org.jetbrains.annotations.Nullable()
                java.lang.String login_by, @org.jetbrains.annotations.Nullable()
                java.lang.Object longitude, @org.jetbrains.annotations.Nullable()
                java.lang.String mobile, @org.jetbrains.annotations.Nullable()
                java.lang.String payment_mode, @org.jetbrains.annotations.NotNull()
                java.lang.String picture, @org.jetbrains.annotations.Nullable()
                java.lang.String rating, @org.jetbrains.annotations.Nullable()
                java.lang.Integer state_id, @org.jetbrains.annotations.Nullable()
                java.lang.Integer status, @org.jetbrains.annotations.Nullable()
                java.lang.String user_type, @org.jetbrains.annotations.Nullable()
                java.lang.Double wallet_balance) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getCity_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getCountry_code() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getCountry_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getCreated_at() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component5() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getCurrency_symbol() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component6() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getEmail() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component7() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getFirst_name() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component8() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getGender() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component9() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getId() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component10() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getLanguage() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component11() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getLast_name() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object component12() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getLatitude() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component13() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getLogin_by() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object component14() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Object getLongitude() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component15() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getMobile() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component16() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getPayment_mode() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component17() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getPicture() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component18() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getRating() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component19() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getState_id() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer component20() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Integer getStatus() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String component21() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getUser_type() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double component22() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.Double getWallet_balance() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0092\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014\u00a8\u00061"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Reason;", "", "created_by", "", "created_type", "", "deleted_by", "deleted_type", "id", "modified_by", "modified_type", "reason", "service", "status", "type", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreated_by", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreated_type", "()Ljava/lang/String;", "getDeleted_by", "()Ljava/lang/Object;", "getDeleted_type", "getId", "getModified_by", "getModified_type", "getReason", "getService", "getStatus", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Reason;", "equals", "", "other", "hashCode", "toString", "xuberservice_debug"})
        public static final class Reason {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer created_by = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String created_type = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object deleted_by = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object deleted_type = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer modified_by = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String modified_type = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String reason = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String service = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String status = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String type = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Reason copy(@org.jetbrains.annotations.Nullable()
            java.lang.Integer created_by, @org.jetbrains.annotations.Nullable()
            java.lang.String created_type, @org.jetbrains.annotations.Nullable()
            java.lang.Object deleted_by, @org.jetbrains.annotations.Nullable()
            java.lang.Object deleted_type, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer modified_by, @org.jetbrains.annotations.Nullable()
            java.lang.String modified_type, @org.jetbrains.annotations.Nullable()
            java.lang.String reason, @org.jetbrains.annotations.Nullable()
            java.lang.String service, @org.jetbrains.annotations.Nullable()
            java.lang.String status, @org.jetbrains.annotations.Nullable()
            java.lang.String type) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Reason() {
                super();
            }
            
            public Reason(@org.jetbrains.annotations.Nullable()
            java.lang.Integer created_by, @org.jetbrains.annotations.Nullable()
            java.lang.String created_type, @org.jetbrains.annotations.Nullable()
            java.lang.Object deleted_by, @org.jetbrains.annotations.Nullable()
            java.lang.Object deleted_type, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer modified_by, @org.jetbrains.annotations.Nullable()
            java.lang.String modified_type, @org.jetbrains.annotations.Nullable()
            java.lang.String reason, @org.jetbrains.annotations.Nullable()
            java.lang.String service, @org.jetbrains.annotations.Nullable()
            java.lang.String status, @org.jetbrains.annotations.Nullable()
            java.lang.String type) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCreated_by() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getCreated_type() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getDeleted_by() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getDeleted_type() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getModified_by() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getModified_type() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component8() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getReason() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component9() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getService() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component10() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStatus() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component11() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getType() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJb\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Category;", "", "company_id", "", "id", "picture", "", "price_choose", "service_category_name", "service_category_order", "service_category_status", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCompany_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getPicture", "()Ljava/lang/String;", "getPrice_choose", "getService_category_name", "getService_category_order", "getService_category_status", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Category;", "equals", "", "other", "hashCode", "toString", "xuberservice_debug"})
        public static final class Category {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer company_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String picture = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String price_choose = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String service_category_name = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer service_category_order = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer service_category_status = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Category copy(@org.jetbrains.annotations.Nullable()
            java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.String picture, @org.jetbrains.annotations.Nullable()
            java.lang.String price_choose, @org.jetbrains.annotations.Nullable()
            java.lang.String service_category_name, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_category_order, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_category_status) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Category() {
                super();
            }
            
            public Category(@org.jetbrains.annotations.Nullable()
            java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.String picture, @org.jetbrains.annotations.Nullable()
            java.lang.String price_choose, @org.jetbrains.annotations.Nullable()
            java.lang.String service_category_name, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_category_order, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_category_status) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCompany_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPicture() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPrice_choose() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getService_category_name() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getService_category_order() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getService_category_status() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJb\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Subcategory;", "", "company_id", "", "id", "picture", "", "service_category_id", "service_subcategory_name", "service_subcategory_order", "service_subcategory_status", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCompany_id", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getPicture", "()Ljava/lang/String;", "getService_category_id", "getService_subcategory_name", "getService_subcategory_order", "getService_subcategory_status", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/gox/xuberservice/model/XuperCheckRequest$ResponseData$Subcategory;", "equals", "", "other", "hashCode", "toString", "xuberservice_debug"})
        public static final class Subcategory {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer company_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String picture = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer service_category_id = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String service_subcategory_name = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer service_subcategory_order = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer service_subcategory_status = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.gox.xuberservice.model.XuperCheckRequest.ResponseData.Subcategory copy(@org.jetbrains.annotations.Nullable()
            java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.String picture, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_category_id, @org.jetbrains.annotations.Nullable()
            java.lang.String service_subcategory_name, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_subcategory_order, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_subcategory_status) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Subcategory() {
                super();
            }
            
            public Subcategory(@org.jetbrains.annotations.Nullable()
            java.lang.Integer company_id, @org.jetbrains.annotations.Nullable()
            java.lang.Integer id, @org.jetbrains.annotations.Nullable()
            java.lang.String picture, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_category_id, @org.jetbrains.annotations.Nullable()
            java.lang.String service_subcategory_name, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_subcategory_order, @org.jetbrains.annotations.Nullable()
            java.lang.Integer service_subcategory_status) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getCompany_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPicture() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getService_category_id() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getService_subcategory_name() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getService_subcategory_order() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getService_subcategory_status() {
                return null;
            }
        }
    }
}