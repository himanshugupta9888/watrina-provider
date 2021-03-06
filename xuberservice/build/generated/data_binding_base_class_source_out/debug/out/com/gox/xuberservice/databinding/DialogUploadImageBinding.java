// Generated by data binding compiler. Do not edit!
package com.gox.xuberservice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.uploadImage.UploadPictureDialogViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogUploadImageBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivServiceImg;

  @NonNull
  public final LinearLayout llCaptureImage;

  @NonNull
  public final TextView tvServiceState;

  @NonNull
  public final TextView tvXuperSubmit;

  @Bindable
  protected UploadPictureDialogViewModel mUploadImageModel;

  protected DialogUploadImageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivServiceImg, LinearLayout llCaptureImage, TextView tvServiceState,
      TextView tvXuperSubmit) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivServiceImg = ivServiceImg;
    this.llCaptureImage = llCaptureImage;
    this.tvServiceState = tvServiceState;
    this.tvXuperSubmit = tvXuperSubmit;
  }

  public abstract void setUploadImageModel(@Nullable UploadPictureDialogViewModel uploadImageModel);

  @Nullable
  public UploadPictureDialogViewModel getUploadImageModel() {
    return mUploadImageModel;
  }

  @NonNull
  public static DialogUploadImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_upload_image, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogUploadImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogUploadImageBinding>inflateInternal(inflater, R.layout.dialog_upload_image, root, attachToRoot, component);
  }

  @NonNull
  public static DialogUploadImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_upload_image, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogUploadImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogUploadImageBinding>inflateInternal(inflater, R.layout.dialog_upload_image, null, false, component);
  }

  public static DialogUploadImageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DialogUploadImageBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogUploadImageBinding)bind(component, view, R.layout.dialog_upload_image);
  }
}
