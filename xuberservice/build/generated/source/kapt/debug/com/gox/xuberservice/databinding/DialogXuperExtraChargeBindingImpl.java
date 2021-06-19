package com.gox.xuberservice.databinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogXuperExtraChargeBindingImpl extends DialogXuperExtraChargeBinding implements com.gox.xuberservice.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvXuperAdditionCharge, 4);
        sViewsWithIds.put(R.id.tvXuperLabelDescription, 5);
        sViewsWithIds.put(R.id.tvXuperLabelAmount, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener XuperDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of extraChargeModel.extraAmountNotes.getValue()
            //         is extraChargeModel.extraAmountNotes.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(XuperDescription);
            // localize variables for thread safety
            // extraChargeModel.extraAmountNotes != null
            boolean extraChargeModelExtraAmountNotesJavaLangObjectNull = false;
            // extraChargeModel.extraAmountNotes.getValue()
            java.lang.String extraChargeModelExtraAmountNotesGetValue = null;
            // extraChargeModel.extraAmountNotes
            androidx.lifecycle.MutableLiveData<java.lang.String> extraChargeModelExtraAmountNotes = null;
            // extraChargeModel
            com.gox.xuberservice.extracharge.XUberExtraChargeViwModel extraChargeModel = mExtraChargeModel;
            // extraChargeModel != null
            boolean extraChargeModelJavaLangObjectNull = false;



            extraChargeModelJavaLangObjectNull = (extraChargeModel) != (null);
            if (extraChargeModelJavaLangObjectNull) {


                extraChargeModelExtraAmountNotes = extraChargeModel.getExtraAmountNotes();

                extraChargeModelExtraAmountNotesJavaLangObjectNull = (extraChargeModelExtraAmountNotes) != (null);
                if (extraChargeModelExtraAmountNotesJavaLangObjectNull) {




                    extraChargeModelExtraAmountNotes.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtExtraAmountandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of extraChargeModel.extraAmount.getValue()
            //         is extraChargeModel.extraAmount.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtExtraAmount);
            // localize variables for thread safety
            // extraChargeModel.extraAmount
            androidx.lifecycle.MutableLiveData<java.lang.String> extraChargeModelExtraAmount = null;
            // extraChargeModel.extraAmount != null
            boolean extraChargeModelExtraAmountJavaLangObjectNull = false;
            // extraChargeModel
            com.gox.xuberservice.extracharge.XUberExtraChargeViwModel extraChargeModel = mExtraChargeModel;
            // extraChargeModel.extraAmount.getValue()
            java.lang.String extraChargeModelExtraAmountGetValue = null;
            // extraChargeModel != null
            boolean extraChargeModelJavaLangObjectNull = false;



            extraChargeModelJavaLangObjectNull = (extraChargeModel) != (null);
            if (extraChargeModelJavaLangObjectNull) {


                extraChargeModelExtraAmount = extraChargeModel.getExtraAmount();

                extraChargeModelExtraAmountJavaLangObjectNull = (extraChargeModelExtraAmount) != (null);
                if (extraChargeModelExtraAmountJavaLangObjectNull) {




                    extraChargeModelExtraAmount.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DialogXuperExtraChargeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DialogXuperExtraChargeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.EditText) bindings[1]
            , (com.gox.base.utils.PrefixCustomEditText) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.XuperDescription.setTag(null);
        this.edtExtraAmount.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvXuperSubmit.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.gox.xuberservice.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.extraChargeModel == variableId) {
            setExtraChargeModel((com.gox.xuberservice.extracharge.XUberExtraChargeViwModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setExtraChargeModel(@Nullable com.gox.xuberservice.extracharge.XUberExtraChargeViwModel ExtraChargeModel) {
        this.mExtraChargeModel = ExtraChargeModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.extraChargeModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeExtraChargeModelExtraAmountNotes((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeExtraChargeModelExtraAmount((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeExtraChargeModelExtraAmountNotes(androidx.lifecycle.MutableLiveData<java.lang.String> ExtraChargeModelExtraAmountNotes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeExtraChargeModelExtraAmount(androidx.lifecycle.MutableLiveData<java.lang.String> ExtraChargeModelExtraAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String extraChargeModelExtraAmountNotesGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> extraChargeModelExtraAmountNotes = null;
        java.lang.String extraChargeModelExtraAmountGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> extraChargeModelExtraAmount = null;
        com.gox.xuberservice.extracharge.XUberExtraChargeViwModel extraChargeModel = mExtraChargeModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (extraChargeModel != null) {
                        // read extraChargeModel.extraAmountNotes
                        extraChargeModelExtraAmountNotes = extraChargeModel.getExtraAmountNotes();
                    }
                    updateLiveDataRegistration(0, extraChargeModelExtraAmountNotes);


                    if (extraChargeModelExtraAmountNotes != null) {
                        // read extraChargeModel.extraAmountNotes.getValue()
                        extraChargeModelExtraAmountNotesGetValue = extraChargeModelExtraAmountNotes.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (extraChargeModel != null) {
                        // read extraChargeModel.extraAmount
                        extraChargeModelExtraAmount = extraChargeModel.getExtraAmount();
                    }
                    updateLiveDataRegistration(1, extraChargeModelExtraAmount);


                    if (extraChargeModelExtraAmount != null) {
                        // read extraChargeModel.extraAmount.getValue()
                        extraChargeModelExtraAmountGetValue = extraChargeModelExtraAmount.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.XuperDescription, extraChargeModelExtraAmountNotesGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.XuperDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, XuperDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtExtraAmount, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtExtraAmountandroidTextAttrChanged);
            this.tvXuperSubmit.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtExtraAmount, extraChargeModelExtraAmountGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // extraChargeModel
        com.gox.xuberservice.extracharge.XUberExtraChargeViwModel extraChargeModel = mExtraChargeModel;
        // extraChargeModel != null
        boolean extraChargeModelJavaLangObjectNull = false;



        extraChargeModelJavaLangObjectNull = (extraChargeModel) != (null);
        if (extraChargeModelJavaLangObjectNull) {


            extraChargeModel.submitExtraCharge();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): extraChargeModel.extraAmountNotes
        flag 1 (0x2L): extraChargeModel.extraAmount
        flag 2 (0x3L): extraChargeModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}