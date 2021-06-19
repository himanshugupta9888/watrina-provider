package com.gox.xuberservice.uploadImage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0014J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\"\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u0014H\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/gox/xuberservice/uploadImage/UploadPictureDialog;", "Lcom/gox/base/base/BaseDialogFragment;", "Lcom/gox/xuberservice/databinding/DialogUploadImageBinding;", "Lcom/gox/xuberservice/uploadImage/UploadPictureDialogNavigator;", "()V", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getFilePath", "Lcom/gox/xuberservice/interfaces/GetFilePathInterface;", "isFront", "", "localPath", "Landroid/net/Uri;", "mBinding", "mViewModel", "Lcom/gox/xuberservice/uploadImage/UploadPictureDialogViewModel;", "mediaFile", "Ljava/io/File;", "mediaUri", "captureImage", "", "requestCode", "", "getBundleValues", "getLayout", "initView", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "view", "Landroid/view/View;", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "submit", "takePicture", "xuberservice_debug"})
public final class UploadPictureDialog extends com.gox.base.base.BaseDialogFragment<com.gox.xuberservice.databinding.DialogUploadImageBinding> implements com.gox.xuberservice.uploadImage.UploadPictureDialogNavigator {
    private com.gox.xuberservice.databinding.DialogUploadImageBinding mBinding;
    private com.gox.xuberservice.uploadImage.UploadPictureDialogViewModel mViewModel;
    private android.net.Uri mediaUri;
    private java.io.File mediaFile;
    private androidx.appcompat.app.AppCompatActivity appCompatActivity;
    private com.gox.xuberservice.interfaces.GetFilePathInterface getFilePath;
    private android.net.Uri localPath;
    private boolean isFront = false;
    private java.util.HashMap _$_findViewCache;
    
    public UploadPictureDialog() {
        super();
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
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ViewDataBinding viewDataBinding, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void getBundleValues() {
    }
    
    @java.lang.Override()
    public void takePicture() {
    }
    
    @java.lang.Override()
    public void submit() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void captureImage(int requestCode) {
    }
}