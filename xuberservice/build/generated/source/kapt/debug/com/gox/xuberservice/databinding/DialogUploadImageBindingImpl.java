package com.gox.xuberservice.databinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogUploadImageBindingImpl extends DialogUploadImageBinding implements com.gox.xuberservice.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_service_state, 3);
        sViewsWithIds.put(R.id.llCaptureImage, 4);
        sViewsWithIds.put(R.id.iv_service_img, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogUploadImageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private DialogUploadImageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tvXuperSubmit.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.gox.xuberservice.generated.callback.OnClickListener(this, 2);
        mCallback2 = new com.gox.xuberservice.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.uploadImageModel == variableId) {
            setUploadImageModel((com.gox.xuberservice.uploadImage.UploadPictureDialogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUploadImageModel(@Nullable com.gox.xuberservice.uploadImage.UploadPictureDialogViewModel UploadImageModel) {
        this.mUploadImageModel = UploadImageModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.uploadImageModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.gox.xuberservice.uploadImage.UploadPictureDialogViewModel uploadImageModel = mUploadImageModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback2);
            this.tvXuperSubmit.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // uploadImageModel != null
                boolean uploadImageModelJavaLangObjectNull = false;
                // uploadImageModel
                com.gox.xuberservice.uploadImage.UploadPictureDialogViewModel uploadImageModel = mUploadImageModel;



                uploadImageModelJavaLangObjectNull = (uploadImageModel) != (null);
                if (uploadImageModelJavaLangObjectNull) {


                    uploadImageModel.submitPicture();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // uploadImageModel != null
                boolean uploadImageModelJavaLangObjectNull = false;
                // uploadImageModel
                com.gox.xuberservice.uploadImage.UploadPictureDialogViewModel uploadImageModel = mUploadImageModel;



                uploadImageModelJavaLangObjectNull = (uploadImageModel) != (null);
                if (uploadImageModelJavaLangObjectNull) {


                    uploadImageModel.captureImage();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): uploadImageModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}