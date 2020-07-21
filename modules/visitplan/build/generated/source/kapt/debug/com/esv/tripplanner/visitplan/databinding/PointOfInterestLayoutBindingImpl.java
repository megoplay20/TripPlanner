package com.esv.tripplanner.visitplan.databinding;
import com.esv.tripplanner.visitplan.R;
import com.esv.tripplanner.visitplan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PointOfInterestLayoutBindingImpl extends PointOfInterestLayoutBinding implements com.esv.tripplanner.visitplan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 7);
        sViewsWithIds.put(R.id.linearLayout, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView5;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PointOfInterestLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private PointOfInterestLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.button.MaterialButton) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.button.MaterialButton) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.esv.tripplanner.visitplan.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.esv.tripplanner.visitplan.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.poi) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.coordinatesAsText) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.showEditBlock) {
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
        java.lang.String viewModelCoordinatesAsText = null;
        java.lang.String viewModelPoiName = null;
        int viewModelShowEditBlock = 0;
        com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;
        java.lang.String viewModelPoiDescription = null;
        com.esv.tripplanner.core_api.data.entities.PointOfInterest viewModelPoi = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.coordinatesAsText
                        viewModelCoordinatesAsText = viewModel.getCoordinatesAsText();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showEditBlock
                        viewModelShowEditBlock = viewModel.getShowEditBlock();
                    }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.poi
                        viewModelPoi = viewModel.getPoi();
                    }


                    if (viewModelPoi != null) {
                        // read viewModel.poi.name
                        viewModelPoiName = viewModelPoi.getName();
                        // read viewModel.poi.description
                        viewModelPoiDescription = viewModelPoi.getDescription();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelPoiName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelPoiDescription);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelCoordinatesAsText);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelShowEditBlock);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(mCallback1);
            this.mboundView6.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.editPoi();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.deletePoi();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.poi
        flag 2 (0x3L): viewModel.coordinatesAsText
        flag 3 (0x4L): viewModel.showEditBlock
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}