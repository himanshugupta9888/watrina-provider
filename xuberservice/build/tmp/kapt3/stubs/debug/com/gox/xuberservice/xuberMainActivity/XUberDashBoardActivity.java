package com.gox.xuberservice.xuberMainActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tB\u0005\u00a2\u0006\u0002\u0010\nJ\u0018\u0010@\u001a\u00020A2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010B\u001a\u00020\u0014H\u0002J\b\u0010C\u001a\u00020DH\u0002J\u0018\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001aH\u0002J\u0006\u0010H\u001a\u00020DJ\u0018\u0010I\u001a\u00020D2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020KH\u0016J\u0010\u0010M\u001a\u00020D2\u0006\u0010N\u001a\u00020OH\u0016J\u0018\u0010P\u001a\u00020D2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020OH\u0002J\u0018\u0010R\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\f2\u0006\u0010T\u001a\u00020\u0010H\u0002J\b\u0010U\u001a\u00020\u0014H\u0014J\u0012\u0010V\u001a\u00020D2\b\u0010W\u001a\u0004\u0018\u00010XH\u0014J\b\u0010Y\u001a\u00020DH\u0002J\"\u0010Z\u001a\u00020D2\u0006\u0010[\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u00142\b\u0010]\u001a\u0004\u0018\u00010^H\u0014J\b\u0010_\u001a\u00020DH\u0016J\u0012\u0010`\u001a\u00020D2\b\u0010a\u001a\u0004\u0018\u00010bH\u0016J\u0012\u0010c\u001a\u00020D2\b\u0010d\u001a\u0004\u0018\u000106H\u0016J\b\u0010e\u001a\u00020DH\u0014J\u0012\u0010f\u001a\u00020D2\b\u0010*\u001a\u0004\u0018\u00010+H\u0017J\b\u0010g\u001a\u00020DH\u0014J\b\u0010h\u001a\u00020DH\u0014J\u001e\u0010i\u001a\u00020D2\u0006\u0010j\u001a\u00020\u001a2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a02H\u0002J\u0010\u0010k\u001a\u00020D2\u0006\u0010l\u001a\u00020\u0018H\u0016J\u0010\u0010m\u001a\u00020D2\u0006\u0010n\u001a\u00020\u0018H\u0002J\"\u0010o\u001a\u00020D2\u0006\u0010p\u001a\u00020\u00182\b\u0010S\u001a\u0004\u0018\u00010\u000e2\u0006\u0010T\u001a\u00020\u0010H\u0002J\u0010\u0010q\u001a\u00020D2\u0006\u0010r\u001a\u00020\u0018H\u0016J,\u0010s\u001a\u00020D2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010d\u001a\u0002062\b\u0010t\u001a\u0004\u0018\u00010\u00182\b\u0010u\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010s\u001a\u00020D2\u0006\u0010v\u001a\u000206H\u0016J\u0018\u0010w\u001a\u00020D2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u0010H\u0002J\u0010\u0010{\u001a\u00020D2\u0006\u0010|\u001a\u00020\u0018H\u0002J\b\u0010}\u001a\u00020DH\u0002J\b\u0010~\u001a\u00020DH\u0007J\b\u0010\u007f\u001a\u00020DH\u0003J\u0013\u0010\u0080\u0001\u001a\u00020D2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002J\u001b\u0010\u0083\u0001\u001a\u00020D2\u0007\u0010\u0081\u0001\u001a\u00020\u001a2\t\b\u0002\u0010\u0084\u0001\u001a\u00020\u0010J\u0011\u0010\u0085\u0001\u001a\u00020D2\u0006\u0010v\u001a\u000206H\u0016J\t\u0010\u0086\u0001\u001a\u00020DH\u0002J\t\u0010\u0087\u0001\u001a\u00020DH\u0002J\u0013\u0010\u0088\u0001\u001a\u00020D2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0016J\u0012\u0010\u008b\u0001\u001a\u00020D2\u0007\u0010\u008c\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010\u008d\u0001\u001a\u00020D2\u0007\u0010\u008e\u0001\u001a\u00020\u0018H\u0016J\t\u0010\u008f\u0001\u001a\u00020DH\u0002J\t\u0010\u0090\u0001\u001a\u00020DH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010&R\u000e\u0010\'\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a02X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0091\u0001"}, d2 = {"Lcom/gox/xuberservice/xuberMainActivity/XUberDashBoardActivity;", "Lcom/gox/base/base/BaseActivity;", "Lcom/gox/xuberservice/databinding/ActivityXuberMainBinding;", "Lcom/gox/xuberservice/xuberMainActivity/XUberDashBoardNavigator;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Landroid/widget/Chronometer$OnChronometerTickListener;", "Lcom/gox/xuberservice/interfaces/GetFilePathInterface;", "Lcom/gox/xuberservice/interfaces/GetReasonsInterface;", "Lcom/gox/base/utils/polyline/PolyLineListener;", "Landroid/view/View$OnClickListener;", "()V", "backImgFile", "Ljava/io/File;", "backImgMultiPart", "Lokhttp3/MultipartBody$Part;", "canDrawPolyLine", "", "checkRequestTimer", "Ljava/util/Timer;", "checkStatusApiCounter", "", "context", "Landroid/content/Context;", "currentStatus", "", "endLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "fragmentMap", "Lcom/google/android/gms/maps/SupportMapFragment;", "frontImgFile", "frontImgMultiPart", "invoicePage", "Lcom/gox/xuberservice/invoice/XUberInvoiceDialog;", "isFront", "isGPSEnabled", "isLocationDialogShown", "localServiceTime", "", "Ljava/lang/Long;", "mBinding", "mBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "mGoogleMap", "Lcom/google/android/gms/maps/GoogleMap;", "mPolyline", "Lcom/google/android/gms/maps/model/Polyline;", "mViewModel", "Lcom/gox/xuberservice/xuberMainActivity/XUberDashboardViewModel;", "paymentMode", "polyLine", "Ljava/util/ArrayList;", "polyUtil", "Lcom/gox/base/utils/PolyUtil;", "popupView", "Landroid/view/View;", "popupWindow", "Landroid/widget/PopupWindow;", "ratingPage", "Lcom/gox/xuberservice/rating/DialogXuberRating;", "reqID", "roomConnected", "srcMarker", "Lcom/google/android/gms/maps/model/Marker;", "startLatLng", "bitmapFromVector", "Landroid/graphics/Bitmap;", "drawableId", "checkBeforeImageValidAndUpdateRequest", "", "drawRoute", "src", "dest", "getApiResponse", "getDistanceTime", "meters", "", "seconds", "getFilePath", "filePath", "Landroid/net/Uri;", "getImageFile", "fileUri", "getImageMultiPart", "file", "isFrontImage", "getLayoutId", "initView", "mViewDataBinding", "Landroidx/databinding/ViewDataBinding;", "initialiseMap", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onChronometerTick", "chronometer", "Landroid/widget/Chronometer;", "onClick", "v", "onDestroy", "onMapReady", "onPause", "onResume", "polyLineRerouting", "point", "reasonForCancel", "reason", "setUserImage", "strUrl", "showAdditionalChargeConfirm", "status", "showErrorMessage", "error", "showInfoWindow", "allowDescription", "allowImage", "view", "showInvoice", "bundle", "Landroid/os/Bundle;", "update", "showLog", "msg", "showRating", "startTheTimer", "updateCurrentLocation", "updateMap", "location", "Landroid/location/Location;", "updateMapLocation", "isAnimateMap", "updateService", "whenAccepted", "whenArrived", "whenDone", "output", "Lcom/google/android/gms/maps/model/PolylineOptions;", "whenDropped", "isCheckRequest", "whenFail", "statusCode", "whenPayment", "whenStarted", "xuberservice_debug"})
public final class XUberDashBoardActivity extends com.gox.base.base.BaseActivity<com.gox.xuberservice.databinding.ActivityXuberMainBinding> implements com.gox.xuberservice.xuberMainActivity.XUberDashBoardNavigator, com.google.android.gms.maps.OnMapReadyCallback, android.widget.Chronometer.OnChronometerTickListener, com.gox.xuberservice.interfaces.GetFilePathInterface, com.gox.xuberservice.interfaces.GetReasonsInterface, com.gox.base.utils.polyline.PolyLineListener, android.view.View.OnClickListener {
    private com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel mViewModel;
    private com.google.android.gms.maps.SupportMapFragment fragmentMap;
    private com.gox.xuberservice.databinding.ActivityXuberMainBinding mBinding;
    private android.content.Context context;
    private final com.gox.xuberservice.invoice.XUberInvoiceDialog invoicePage = null;
    private final com.gox.xuberservice.rating.DialogXuberRating ratingPage = null;
    private java.lang.Long localServiceTime;
    private com.google.android.gms.maps.GoogleMap mGoogleMap;
    private okhttp3.MultipartBody.Part frontImgMultiPart;
    private okhttp3.MultipartBody.Part backImgMultiPart;
    private java.io.File frontImgFile;
    private java.io.File backImgFile;
    private boolean canDrawPolyLine = true;
    private boolean isFront = true;
    private com.google.android.gms.maps.model.LatLng startLatLng;
    private com.google.android.gms.maps.model.LatLng endLatLng;
    private com.google.android.gms.maps.model.Marker srcMarker;
    private com.gox.base.utils.PolyUtil polyUtil;
    private com.google.android.gms.maps.model.Polyline mPolyline;
    private java.util.ArrayList<com.google.android.gms.maps.model.LatLng> polyLine;
    private int checkStatusApiCounter = 0;
    private android.widget.PopupWindow popupWindow;
    private android.view.View popupView;
    private boolean isGPSEnabled = false;
    private boolean isLocationDialogShown = false;
    private boolean roomConnected = false;
    private int reqID = 0;
    private java.lang.String currentStatus = "";
    private java.lang.String paymentMode = "";
    private java.util.Timer checkRequestTimer;
    private final android.content.BroadcastReceiver mBroadcastReceiver = null;
    private java.util.HashMap _$_findViewCache;
    
    public XUberDashBoardActivity() {
        super();
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void initView(@org.jetbrains.annotations.Nullable()
    androidx.databinding.ViewDataBinding mViewDataBinding) {
    }
    
    public final void getApiResponse() {
    }
    
    private final void initialiseMap() {
    }
    
    public final void updateMapLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng location, boolean isAnimateMap) {
    }
    
    private final void whenDropped(boolean isCheckRequest) {
    }
    
    private final void whenPayment() {
    }
    
    private final void showInvoice(android.os.Bundle bundle, boolean update) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap mGoogleMap) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void updateCurrentLocation() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void updateMap(android.location.Location location) {
    }
    
    private final void polyLineRerouting(com.google.android.gms.maps.model.LatLng point, java.util.ArrayList<com.google.android.gms.maps.model.LatLng> polyLine) {
    }
    
    private final void drawRoute(com.google.android.gms.maps.model.LatLng src, com.google.android.gms.maps.model.LatLng dest) {
    }
    
    @java.lang.Override()
    public void whenDone(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.PolylineOptions output) {
    }
    
    @java.lang.Override()
    public void getDistanceTime(double meters, double seconds) {
    }
    
    @java.lang.Override()
    public void whenFail(@org.jetbrains.annotations.NotNull()
    java.lang.String statusCode) {
    }
    
    private final void showLog(java.lang.String msg) {
    }
    
    private final android.graphics.Bitmap bitmapFromVector(android.content.Context context, int drawableId) {
        return null;
    }
    
    @java.lang.Override()
    public void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    private final void whenAccepted() {
    }
    
    private final void whenArrived() {
    }
    
    private final void whenStarted() {
    }
    
    private final void showRating() {
    }
    
    private final void setUserImage(java.lang.String strUrl) {
    }
    
    @java.lang.Override()
    public void updateService(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void checkBeforeImageValidAndUpdateRequest() {
    }
    
    private final void showAdditionalChargeConfirm(java.lang.String status, okhttp3.MultipartBody.Part file, boolean isFrontImage) {
    }
    
    @java.lang.Override()
    public void onChronometerTick(@org.jetbrains.annotations.Nullable()
    android.widget.Chronometer chronometer) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void startTheTimer() {
    }
    
    @java.lang.Override()
    public void getFilePath(@org.jetbrains.annotations.NotNull()
    android.net.Uri filePath) {
    }
    
    private final okhttp3.MultipartBody.Part getImageMultiPart(java.io.File file, boolean isFrontImage) {
        return null;
    }
    
    private final void getImageFile(boolean isFront, android.net.Uri fileUri) {
    }
    
    @java.lang.Override()
    public void reasonForCancel(@org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    private final void showInfoWindow(android.content.Context context, android.view.View v, java.lang.String allowDescription, java.lang.String allowImage) {
    }
    
    @java.lang.Override()
    public void showInfoWindow(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
}