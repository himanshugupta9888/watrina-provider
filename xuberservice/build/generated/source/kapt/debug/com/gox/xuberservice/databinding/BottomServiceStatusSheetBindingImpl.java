package com.gox.xuberservice.databinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomServiceStatusSheetBindingImpl extends BottomServiceStatusSheetBinding implements com.gox.xuberservice.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_camera, 8);
        sViewsWithIds.put(R.id.ll_service_time, 9);
        sViewsWithIds.put(R.id.cmXuberServiceTime, 10);
        sViewsWithIds.put(R.id.fb_camera, 11);
        sViewsWithIds.put(R.id.fab_xuber_menu, 12);
        sViewsWithIds.put(R.id.fab_xuber_menu_call, 13);
        sViewsWithIds.put(R.id.fab_xuber_menu_chat, 14);
        sViewsWithIds.put(R.id.fab_xuber_menu_video, 15);
        sViewsWithIds.put(R.id.cv_service, 16);
        sViewsWithIds.put(R.id.ivXuperUSer, 17);
        sViewsWithIds.put(R.id.ivXuperRate, 18);
        sViewsWithIds.put(R.id.ll_servie_type, 19);
        sViewsWithIds.put(R.id.tv_label_servcie, 20);
        sViewsWithIds.put(R.id.ll_instruction, 21);
        sViewsWithIds.put(R.id.tv_instruction, 22);
        sViewsWithIds.put(R.id.llConfirm, 23);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtXuperOtpandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of bottomServiceModel.otp.getValue()
            //         is bottomServiceModel.otp.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtXuperOtp);
            // localize variables for thread safety
            // bottomServiceModel != null
            boolean bottomServiceModelJavaLangObjectNull = false;
            // bottomServiceModel.otp != null
            boolean bottomServiceModelOtpJavaLangObjectNull = false;
            // bottomServiceModel
            com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel bottomServiceModel = mBottomServiceModel;
            // bottomServiceModel.otp.getValue()
            java.lang.String bottomServiceModelOtpGetValue = null;
            // bottomServiceModel.otp
            androidx.lifecycle.MutableLiveData<java.lang.String> bottomServiceModelOtp = null;



            bottomServiceModelJavaLangObjectNull = (bottomServiceModel) != (null);
            if (bottomServiceModelJavaLangObjectNull) {


                bottomServiceModelOtp = bottomServiceModel.getOtp();

                bottomServiceModelOtpJavaLangObjectNull = (bottomServiceModelOtp) != (null);
                if (bottomServiceModelOtpJavaLangObjectNull) {




                    bottomServiceModelOtp.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvServiceTypeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of bottomServiceModel.serviceType.getValue()
            //         is bottomServiceModel.serviceType.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvServiceType);
            // localize variables for thread safety
            // bottomServiceModel != null
            boolean bottomServiceModelJavaLangObjectNull = false;
            // bottomServiceModel.serviceType
            androidx.lifecycle.MutableLiveData<java.lang.String> bottomServiceModelServiceType = null;
            // bottomServiceModel
            com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel bottomServiceModel = mBottomServiceModel;
            // bottomServiceModel.serviceType != null
            boolean bottomServiceModelServiceTypeJavaLangObjectNull = false;
            // bottomServiceModel.serviceType.getValue()
            java.lang.String bottomServiceModelServiceTypeGetValue = null;



            bottomServiceModelJavaLangObjectNull = (bottomServiceModel) != (null);
            if (bottomServiceModelJavaLangObjectNull) {


                bottomServiceModelServiceType = bottomServiceModel.getServiceType();

                bottomServiceModelServiceTypeJavaLangObjectNull = (bottomServiceModelServiceType) != (null);
                if (bottomServiceModelServiceTypeJavaLangObjectNull) {




                    bottomServiceModelServiceType.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvXuperRatingandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of bottomServiceModel.userRating.getValue()
            //         is bottomServiceModel.userRating.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvXuperRating);
            // localize variables for thread safety
            // bottomServiceModel != null
            boolean bottomServiceModelJavaLangObjectNull = false;
            // bottomServiceModel.userRating.getValue()
            java.lang.String bottomServiceModelUserRatingGetValue = null;
            // bottomServiceModel.userRating != null
            boolean bottomServiceModelUserRatingJavaLangObjectNull = false;
            // bottomServiceModel
            com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel bottomServiceModel = mBottomServiceModel;
            // bottomServiceModel.userRating
            androidx.lifecycle.MutableLiveData<java.lang.String> bottomServiceModelUserRating = null;



            bottomServiceModelJavaLangObjectNull = (bottomServiceModel) != (null);
            if (bottomServiceModelJavaLangObjectNull) {


                bottomServiceModelUserRating = bottomServiceModel.getUserRating();

                bottomServiceModelUserRatingJavaLangObjectNull = (bottomServiceModelUserRating) != (null);
                if (bottomServiceModelUserRatingJavaLangObjectNull) {




                    bottomServiceModelUserRating.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvXuperUserNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of bottomServiceModel.userName.getValue()
            //         is bottomServiceModel.userName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvXuperUserName);
            // localize variables for thread safety
            // bottomServiceModel != null
            boolean bottomServiceModelJavaLangObjectNull = false;
            // bottomServiceModel.userName != null
            boolean bottomServiceModelUserNameJavaLangObjectNull = false;
            // bottomServiceModel
            com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel bottomServiceModel = mBottomServiceModel;
            // bottomServiceModel.userName
            androidx.lifecycle.MutableLiveData<java.lang.String> bottomServiceModelUserName = null;
            // bottomServiceModel.userName.getValue()
            java.lang.String bottomServiceModelUserNameGetValue = null;



            bottomServiceModelJavaLangObjectNull = (bottomServiceModel) != (null);
            if (bottomServiceModelJavaLangObjectNull) {


                bottomServiceModelUserName = bottomServiceModel.getUserName();

                bottomServiceModelUserNameJavaLangObjectNull = (bottomServiceModelUserName) != (null);
                if (bottomServiceModelUserNameJavaLangObjectNull) {




                    bottomServiceModelUserName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public BottomServiceStatusSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private BottomServiceStatusSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Chronometer) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (android.widget.EditText) bindings[5]
            , (com.github.clans.fab.FloatingActionMenu) bindings[12]
            , (com.github.clans.fab.FloatingActionButton) bindings[13]
            , (com.github.clans.fab.FloatingActionButton) bindings[14]
            , (com.github.clans.fab.FloatingActionButton) bindings[15]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[11]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.edtXuperOtp.setTag(null);
        this.ibInstruction.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAllow.setTag(null);
        this.tvCancel.setTag(null);
        this.tvServiceType.setTag(null);
        this.tvXuperRating.setTag(null);
        this.tvXuperUserName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.gox.xuberservice.generated.callback.OnClickListener(this, 3);
        mCallback6 = new com.gox.xuberservice.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.gox.xuberservice.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.bottomServiceModel == variableId) {
            setBottomServiceModel((com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBottomServiceModel(@Nullable com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel BottomServiceModel) {
        this.mBottomServiceModel = BottomServiceModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.bottomServiceModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBottomServiceModelOtp((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeBottomServiceModelServiceType((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeBottomServiceModelUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeBottomServiceModelUserRating((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBottomServiceModelOtp(androidx.lifecycle.MutableLiveData<java.lang.String> BottomServiceModelOtp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBottomServiceModelServiceType(androidx.lifecycle.MutableLiveData<java.lang.String> BottomServiceModelServiceType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBottomServiceModelUserName(androidx.lifecycle.MutableLiveData<java.lang.String> BottomServiceModelUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeBottomServiceModelUserRating(androidx.lifecycle.MutableLiveData<java.lang.String> BottomServiceModelUserRating, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String bottomServiceModelUserRatingGetValue = null;
        com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel bottomServiceModel = mBottomServiceModel;
        java.lang.String bottomServiceModelServiceTypeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> bottomServiceModelOtp = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> bottomServiceModelServiceType = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> bottomServiceModelUserName = null;
        java.lang.String bottomServiceModelOtpGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> bottomServiceModelUserRating = null;
        java.lang.String bottomServiceModelUserNameGetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (bottomServiceModel != null) {
                        // read bottomServiceModel.otp
                        bottomServiceModelOtp = bottomServiceModel.getOtp();
                    }
                    updateLiveDataRegistration(0, bottomServiceModelOtp);


                    if (bottomServiceModelOtp != null) {
                        // read bottomServiceModel.otp.getValue()
                        bottomServiceModelOtpGetValue = bottomServiceModelOtp.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (bottomServiceModel != null) {
                        // read bottomServiceModel.serviceType
                        bottomServiceModelServiceType = bottomServiceModel.getServiceType();
                    }
                    updateLiveDataRegistration(1, bottomServiceModelServiceType);


                    if (bottomServiceModelServiceType != null) {
                        // read bottomServiceModel.serviceType.getValue()
                        bottomServiceModelServiceTypeGetValue = bottomServiceModelServiceType.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (bottomServiceModel != null) {
                        // read bottomServiceModel.userName
                        bottomServiceModelUserName = bottomServiceModel.getUserName();
                    }
                    updateLiveDataRegistration(2, bottomServiceModelUserName);


                    if (bottomServiceModelUserName != null) {
                        // read bottomServiceModel.userName.getValue()
                        bottomServiceModelUserNameGetValue = bottomServiceModelUserName.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (bottomServiceModel != null) {
                        // read bottomServiceModel.userRating
                        bottomServiceModelUserRating = bottomServiceModel.getUserRating();
                    }
                    updateLiveDataRegistration(3, bottomServiceModelUserRating);


                    if (bottomServiceModelUserRating != null) {
                        // read bottomServiceModel.userRating.getValue()
                        bottomServiceModelUserRatingGetValue = bottomServiceModelUserRating.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtXuperOtp, bottomServiceModelOtpGetValue);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtXuperOtp, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtXuperOtpandroidTextAttrChanged);
            this.ibInstruction.setOnClickListener(mCallback6);
            this.tvAllow.setOnClickListener(mCallback7);
            this.tvCancel.setOnClickListener(mCallback8);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvServiceType, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvServiceTypeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvXuperRating, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvXuperRatingandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvXuperUserName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvXuperUserNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvServiceType, bottomServiceModelServiceTypeGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvXuperRating, bottomServiceModelUserRatingGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvXuperUserName, bottomServiceModelUserNameGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // bottomServiceModel != null
                boolean bottomServiceModelJavaLangObjectNull = false;
                // bottomServiceModel
                com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel bottomServiceModel = mBottomServiceModel;



                bottomServiceModelJavaLangObjectNull = (bottomServiceModel) != (null);
                if (bottomServiceModelJavaLangObjectNull) {



                    bottomServiceModel.onClickStatus(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // bottomServiceModel != null
                boolean bottomServiceModelJavaLangObjectNull = false;
                // bottomServiceModel
                com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel bottomServiceModel = mBottomServiceModel;



                bottomServiceModelJavaLangObjectNull = (bottomServiceModel) != (null);
                if (bottomServiceModelJavaLangObjectNull) {



                    bottomServiceModel.showInfoDialog(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // bottomServiceModel != null
                boolean bottomServiceModelJavaLangObjectNull = false;
                // bottomServiceModel
                com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel bottomServiceModel = mBottomServiceModel;



                bottomServiceModelJavaLangObjectNull = (bottomServiceModel) != (null);
                if (bottomServiceModelJavaLangObjectNull) {



                    bottomServiceModel.onClickStatus(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bottomServiceModel.otp
        flag 1 (0x2L): bottomServiceModel.serviceType
        flag 2 (0x3L): bottomServiceModel.userName
        flag 3 (0x4L): bottomServiceModel.userRating
        flag 4 (0x5L): bottomServiceModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}