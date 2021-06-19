// Generated by data binding compiler. Do not edit!
package com.gox.xuberservice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.reasons.XUberCancelReasonFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemXuberReasonBinding extends ViewDataBinding {
  @NonNull
  public final TextView tvReaon;

  @Bindable
  protected XUberCancelReasonFragment mViewmodel;

  protected ItemXuberReasonBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView tvReaon) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvReaon = tvReaon;
  }

  public abstract void setViewmodel(@Nullable XUberCancelReasonFragment viewmodel);

  @Nullable
  public XUberCancelReasonFragment getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ItemXuberReasonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_xuber_reason, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemXuberReasonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemXuberReasonBinding>inflateInternal(inflater, R.layout.item_xuber_reason, root, attachToRoot, component);
  }

  @NonNull
  public static ItemXuberReasonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_xuber_reason, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemXuberReasonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemXuberReasonBinding>inflateInternal(inflater, R.layout.item_xuber_reason, null, false, component);
  }

  public static ItemXuberReasonBinding bind(@NonNull View view) {
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
  public static ItemXuberReasonBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemXuberReasonBinding)bind(component, view, R.layout.item_xuber_reason);
  }
}
