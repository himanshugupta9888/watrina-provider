package com.gox.xuberservice.databinding;
import com.gox.xuberservice.R;
import com.gox.xuberservice.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityXuberMainBindingImpl extends ActivityXuberMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(1, 
            new String[] {"bottom_service_status_sheet"},
            new int[] {2},
            new int[] {com.gox.xuberservice.R.layout.bottom_service_status_sheet});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.status_card_view, 3);
        sViewsWithIds.put(R.id.status_flow_header, 4);
        sViewsWithIds.put(R.id.tvXuberLabellocation, 5);
        sViewsWithIds.put(R.id.tvXuberPickupLocation, 6);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityXuberMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityXuberMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.gox.xuberservice.databinding.BottomServiceStatusSheetBinding) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            );
        setContainedBinding(this.llBottomService);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        llBottomService.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (llBottomService.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.xuberViewModel == variableId) {
            setXuberViewModel((com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setXuberViewModel(@Nullable com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel XuberViewModel) {
        this.mXuberViewModel = XuberViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.xuberViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        llBottomService.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLlBottomService((com.gox.xuberservice.databinding.BottomServiceStatusSheetBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLlBottomService(com.gox.xuberservice.databinding.BottomServiceStatusSheetBinding LlBottomService, int fieldId) {
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
        com.gox.xuberservice.xuberMainActivity.XUberDashboardViewModel xuberViewModel = mXuberViewModel;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.llBottomService.setBottomServiceModel(xuberViewModel);
        }
        executeBindingsOn(llBottomService);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): llBottomService
        flag 1 (0x2L): xuberViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}