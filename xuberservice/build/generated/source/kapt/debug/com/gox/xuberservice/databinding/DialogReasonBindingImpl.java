package com.gox.xuberservice.databinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogReasonBindingImpl extends DialogReasonBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.reason_label_tv, 2);
        sViewsWithIds.put(R.id.ivClear, 3);
        sViewsWithIds.put(R.id.ll_progress, 4);
        sViewsWithIds.put(R.id.progressBarLoadingRecite, 5);
        sViewsWithIds.put(R.id.et_coments, 6);
        sViewsWithIds.put(R.id.reason_submit_button, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogReasonBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private DialogReasonBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ProgressBar) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.cvreasontype.setTag(null);
        this.reasonTypes.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.reasonadapter == variableId) {
            setReasonadapter((com.gox.xuberservice.adapters.XUberReasonAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReasonadapter(@Nullable com.gox.xuberservice.adapters.XUberReasonAdapter Reasonadapter) {
        this.mReasonadapter = Reasonadapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.reasonadapter);
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
        com.gox.xuberservice.adapters.XUberReasonAdapter reasonadapter = mReasonadapter;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.reasonTypes.setAdapter(reasonadapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reasonadapter
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}