package com.gox.xuberservice.databinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogXuperRatingBindingImpl extends DialogXuperRatingBinding implements com.gox.xuberservice.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvRating, 3);
        sViewsWithIds.put(R.id.ivXuperRatingUser, 4);
        sViewsWithIds.put(R.id.tvRateWithUser, 5);
        sViewsWithIds.put(R.id.rbUser, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtCommandsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ratingmodel.comment.getValue()
            //         is ratingmodel.comment.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtCommands);
            // localize variables for thread safety
            // ratingmodel.comment.getValue()
            java.lang.String ratingmodelCommentGetValue = null;
            // ratingmodel.comment != null
            boolean ratingmodelCommentJavaLangObjectNull = false;
            // ratingmodel
            com.gox.xuberservice.rating.XUberRatingViewModel ratingmodel = mRatingmodel;
            // ratingmodel.comment
            androidx.lifecycle.MutableLiveData<java.lang.String> ratingmodelComment = null;
            // ratingmodel != null
            boolean ratingmodelJavaLangObjectNull = false;



            ratingmodelJavaLangObjectNull = (ratingmodel) != (null);
            if (ratingmodelJavaLangObjectNull) {


                ratingmodelComment = ratingmodel.getComment();

                ratingmodelCommentJavaLangObjectNull = (ratingmodelComment) != (null);
                if (ratingmodelCommentJavaLangObjectNull) {




                    ratingmodelComment.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DialogXuperRatingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DialogXuperRatingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.edtCommands.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvXuperSubmit.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.gox.xuberservice.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.ratingmodel == variableId) {
            setRatingmodel((com.gox.xuberservice.rating.XUberRatingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRatingmodel(@Nullable com.gox.xuberservice.rating.XUberRatingViewModel Ratingmodel) {
        this.mRatingmodel = Ratingmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ratingmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRatingmodelComment((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRatingmodelComment(androidx.lifecycle.MutableLiveData<java.lang.String> RatingmodelComment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String ratingmodelCommentGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> ratingmodelComment = null;
        com.gox.xuberservice.rating.XUberRatingViewModel ratingmodel = mRatingmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (ratingmodel != null) {
                    // read ratingmodel.comment
                    ratingmodelComment = ratingmodel.getComment();
                }
                updateLiveDataRegistration(0, ratingmodelComment);


                if (ratingmodelComment != null) {
                    // read ratingmodel.comment.getValue()
                    ratingmodelCommentGetValue = ratingmodelComment.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtCommands, ratingmodelCommentGetValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtCommands, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtCommandsandroidTextAttrChanged);
            this.tvXuperSubmit.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // ratingmodel
        com.gox.xuberservice.rating.XUberRatingViewModel ratingmodel = mRatingmodel;
        // ratingmodel != null
        boolean ratingmodelJavaLangObjectNull = false;



        ratingmodelJavaLangObjectNull = (ratingmodel) != (null);
        if (ratingmodelJavaLangObjectNull) {


            ratingmodel.callRateApi();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ratingmodel.comment
        flag 1 (0x2L): ratingmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}