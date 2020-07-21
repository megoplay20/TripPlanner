package com.esv.tripplanner.newroute.databinding;
import com.esv.tripplanner.newroute.R;
import com.esv.tripplanner.newroute.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PointOfInterestVisitPlanLayoutBindingImpl extends PointOfInterestVisitPlanLayoutBinding implements com.esv.tripplanner.newroute.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 6);
        sViewsWithIds.put(R.id.linearLayout, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView4;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PointOfInterestVisitPlanLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private PointOfInterestVisitPlanLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.Switch) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.button.MaterialButton) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.button.MaterialButton) bindings[5];
        this.mboundView5.setTag(null);
        this.switch1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.esv.tripplanner.newroute.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.esv.tripplanner.newroute.generated.callback.OnClickListener(this, 2);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel ViewModel) {
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
                return onChangeViewModel((com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel ViewModel, int fieldId) {
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
        else if (fieldId == BR.poiVisitPlan) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewModelPoiVisitPlanVisitTimeHrsToString = null;
        com.esv.tripplanner.core_api.data.entities.PointOfInterest viewModelPoi = null;
        com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan viewModelPoiVisitPlan = null;
        java.lang.String javaLangStringViewModelPoiVisitPlanVisitTimeHrsToStringJavaLangString = null;
        java.lang.String javaLangStringViewModelPoiVisitPlanVisitTimeHrsToString = null;
        java.lang.String viewModelPoiName = null;
        com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel = mViewModel;
        java.lang.Double viewModelPoiVisitPlanVisitTimeHrs = null;
        boolean viewModelPoiVisitPlanStartPoint = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.poi
                        viewModelPoi = viewModel.getPoi();
                    }


                    if (viewModelPoi != null) {
                        // read viewModel.poi.name
                        viewModelPoiName = viewModelPoi.getName();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.poiVisitPlan
                        viewModelPoiVisitPlan = viewModel.getPoiVisitPlan();
                    }


                    if (viewModelPoiVisitPlan != null) {
                        // read viewModel.poiVisitPlan.visitTimeHrs
                        viewModelPoiVisitPlanVisitTimeHrs = viewModelPoiVisitPlan.getVisitTimeHrs();
                        // read viewModel.poiVisitPlan.startPoint
                        viewModelPoiVisitPlanStartPoint = viewModelPoiVisitPlan.isStartPoint();
                    }


                    if (viewModelPoiVisitPlanVisitTimeHrs != null) {
                        // read viewModel.poiVisitPlan.visitTimeHrs.toString()
                        viewModelPoiVisitPlanVisitTimeHrsToString = viewModelPoiVisitPlanVisitTimeHrs.toString();
                    }


                    // read ("Время на посещение: ") + (viewModel.poiVisitPlan.visitTimeHrs.toString())
                    javaLangStringViewModelPoiVisitPlanVisitTimeHrsToString = ("Время на посещение: ") + (viewModelPoiVisitPlanVisitTimeHrsToString);


                    // read (("Время на посещение: ") + (viewModel.poiVisitPlan.visitTimeHrs.toString())) + (", ч")
                    javaLangStringViewModelPoiVisitPlanVisitTimeHrsToStringJavaLangString = (javaLangStringViewModelPoiVisitPlanVisitTimeHrsToString) + (", ч");
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelPoiName);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, javaLangStringViewModelPoiVisitPlanVisitTimeHrsToStringJavaLangString);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.switch1, viewModelPoiVisitPlanStartPoint);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback1);
            this.mboundView5.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.editVisitPlan();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.deleteVisitPlanPoi();
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
        flag 2 (0x3L): viewModel.poiVisitPlan
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}