package com.gox.xuberservice.databinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogInvoiceBindingImpl extends DialogInvoiceBinding implements com.gox.xuberservice.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivUserImg, 4);
        sViewsWithIds.put(R.id.llXuperInvoiceService, 5);
        sViewsWithIds.put(R.id.ivXuperRate, 6);
        sViewsWithIds.put(R.id.tvXuperServicelabel, 7);
        sViewsWithIds.put(R.id.tvXuperService, 8);
        sViewsWithIds.put(R.id.llTime, 9);
        sViewsWithIds.put(R.id.tvXuperTimeTaken, 10);
        sViewsWithIds.put(R.id.tvXuperTime, 11);
        sViewsWithIds.put(R.id.tvAdditionalCharge, 12);
        sViewsWithIds.put(R.id.llAmountToBePaid, 13);
        sViewsWithIds.put(R.id.tvAmountToBePaidLabel, 14);
        sViewsWithIds.put(R.id.tvAmountToBePaid, 15);
        sViewsWithIds.put(R.id.tvWaitingForPayment, 16);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvXuperRatingandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of invoicemodel.rating.getValue()
            //         is invoicemodel.rating.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvXuperRating);
            // localize variables for thread safety
            // invoicemodel != null
            boolean invoicemodelJavaLangObjectNull = false;
            // invoicemodel.rating
            androidx.lifecycle.MutableLiveData<java.lang.String> invoicemodelRating = null;
            // invoicemodel.rating != null
            boolean invoicemodelRatingJavaLangObjectNull = false;
            // invoicemodel
            com.gox.xuberservice.invoice.XUberInvoiceViewModel invoicemodel = mInvoicemodel;
            // invoicemodel.rating.getValue()
            java.lang.String invoicemodelRatingGetValue = null;



            invoicemodelJavaLangObjectNull = (invoicemodel) != (null);
            if (invoicemodelJavaLangObjectNull) {


                invoicemodelRating = invoicemodel.getRating();

                invoicemodelRatingJavaLangObjectNull = (invoicemodelRating) != (null);
                if (invoicemodelRatingJavaLangObjectNull) {




                    invoicemodelRating.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DialogInvoiceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private DialogInvoiceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvUserName.setTag(null);
        this.tvXuperConfirmPayment.setTag(null);
        this.tvXuperRating.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.gox.xuberservice.generated.callback.OnClickListener(this, 1);
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
        if (BR.invoicemodel == variableId) {
            setInvoicemodel((com.gox.xuberservice.invoice.XUberInvoiceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInvoicemodel(@Nullable com.gox.xuberservice.invoice.XUberInvoiceViewModel Invoicemodel) {
        this.mInvoicemodel = Invoicemodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.invoicemodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInvoicemodelUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeInvoicemodelRating((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInvoicemodelUserName(androidx.lifecycle.MutableLiveData<java.lang.String> InvoicemodelUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeInvoicemodelRating(androidx.lifecycle.MutableLiveData<java.lang.String> InvoicemodelRating, int fieldId) {
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
        com.gox.xuberservice.invoice.XUberInvoiceViewModel invoicemodel = mInvoicemodel;
        java.lang.String invoicemodelRatingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> invoicemodelUserName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> invoicemodelRating = null;
        java.lang.String invoicemodelUserNameGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (invoicemodel != null) {
                        // read invoicemodel.userName
                        invoicemodelUserName = invoicemodel.getUserName();
                    }
                    updateLiveDataRegistration(0, invoicemodelUserName);


                    if (invoicemodelUserName != null) {
                        // read invoicemodel.userName.getValue()
                        invoicemodelUserNameGetValue = invoicemodelUserName.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (invoicemodel != null) {
                        // read invoicemodel.rating
                        invoicemodelRating = invoicemodel.getRating();
                    }
                    updateLiveDataRegistration(1, invoicemodelRating);


                    if (invoicemodelRating != null) {
                        // read invoicemodel.rating.getValue()
                        invoicemodelRatingGetValue = invoicemodelRating.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, invoicemodelUserNameGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.tvXuperConfirmPayment.setOnClickListener(mCallback5);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvXuperRating, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvXuperRatingandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvXuperRating, invoicemodelRatingGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // invoicemodel != null
        boolean invoicemodelJavaLangObjectNull = false;
        // invoicemodel
        com.gox.xuberservice.invoice.XUberInvoiceViewModel invoicemodel = mInvoicemodel;



        invoicemodelJavaLangObjectNull = (invoicemodel) != (null);
        if (invoicemodelJavaLangObjectNull) {


            invoicemodel.confirmPayment();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): invoicemodel.userName
        flag 1 (0x2L): invoicemodel.rating
        flag 2 (0x3L): invoicemodel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}