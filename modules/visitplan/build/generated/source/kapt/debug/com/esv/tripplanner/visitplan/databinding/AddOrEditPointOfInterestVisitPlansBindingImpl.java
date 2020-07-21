package com.esv.tripplanner.visitplan.databinding;
import com.esv.tripplanner.visitplan.R;
import com.esv.tripplanner.visitplan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddOrEditPointOfInterestVisitPlansBindingImpl extends AddOrEditPointOfInterestVisitPlansBinding implements com.esv.tripplanner.visitplan.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.placeLabel, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener placeSelectorselectedSpinnerItemAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.selectedPoi
            //         is viewModel.setSelectedPoi((com.esv.tripplanner.core_api.data.entities.PointOfInterest) callbackArg_0)
            java.lang.Object callbackArg_0 = com.esv.tripplanner.core_api.binding_adapters.BindingAdapters.getSelectedSpinnerItem(placeSelector);
            // localize variables for thread safety
            // viewModel.selectedPoi
            com.esv.tripplanner.core_api.data.entities.PointOfInterest viewModelSelectedPoi = null;
            // viewModel
            com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setSelectedPoi(((com.esv.tripplanner.core_api.data.entities.PointOfInterest) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener poiVisitTimeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of BindingConverters.doubleToString(viewModel.poiVisitPlan.visitTimeHrs)
            //         is viewModel.poiVisitPlan.setVisitTimeHrs((java.lang.Double) BindingConverters.stringToDouble(callbackArg_0))
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(poiVisitTime);
            // localize variables for thread safety
            // viewModel.poiVisitPlan
            com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan viewModelPoiVisitPlan = null;
            // viewModel
            com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel = mViewModel;
            // BindingConverters.doubleToString(viewModel.poiVisitPlan.visitTimeHrs)
            java.lang.String bindingConvertersDoubleToStringViewModelPoiVisitPlanVisitTimeHrs = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.poiVisitPlan != null
            boolean viewModelPoiVisitPlanJavaLangObjectNull = false;
            // viewModel.poiVisitPlan.visitTimeHrs
            java.lang.Double viewModelPoiVisitPlanVisitTimeHrs = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPoiVisitPlan = viewModel.getPoiVisitPlan();

                viewModelPoiVisitPlanJavaLangObjectNull = (viewModelPoiVisitPlan) != (null);
                if (viewModelPoiVisitPlanJavaLangObjectNull) {



                    com.esv.tripplanner.core_api.binding_converters.BindingConverters.stringToDouble(callbackArg_0);


                    viewModelPoiVisitPlan.setVisitTimeHrs(((java.lang.Double) (com.esv.tripplanner.core_api.binding_converters.BindingConverters.stringToDouble(callbackArg_0))));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener switch1androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.poiVisitPlan.startPoint
            //         is viewModel.poiVisitPlan.setStartPoint((boolean) callbackArg_0)
            boolean callbackArg_0 = switch1.isChecked();
            // localize variables for thread safety
            // viewModel.poiVisitPlan
            com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan viewModelPoiVisitPlan = null;
            // viewModel
            com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.poiVisitPlan != null
            boolean viewModelPoiVisitPlanJavaLangObjectNull = false;
            // viewModel.poiVisitPlan.startPoint
            boolean viewModelPoiVisitPlanStartPoint = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPoiVisitPlan = viewModel.getPoiVisitPlan();

                viewModelPoiVisitPlanJavaLangObjectNull = (viewModelPoiVisitPlan) != (null);
                if (viewModelPoiVisitPlanJavaLangObjectNull) {




                    viewModelPoiVisitPlan.setStartPoint(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public AddOrEditPointOfInterestVisitPlansBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private AddOrEditPointOfInterestVisitPlansBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Spinner) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.Button) bindings[5]
            , (android.widget.Switch) bindings[3]
            );
        this.addNewPlace.setTag(null);
        this.cancel.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.placeSelector.setTag(null);
        this.poiVisitTime.setTag(null);
        this.save.setTag(null);
        this.switch1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.esv.tripplanner.visitplan.generated.callback.OnClickListener(this, 3);
        mCallback3 = new com.esv.tripplanner.visitplan.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.esv.tripplanner.visitplan.generated.callback.OnClickListener(this, 2);
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
        else if (fieldId == BR.poiVisitPlan) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.selectedPoi) {
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
        com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan viewModelPoiVisitPlan = null;
        com.esv.tripplanner.core_api.data.entities.PointOfInterest viewModelSelectedPoi = null;
        com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel = mViewModel;
        java.lang.String bindingConvertersDoubleToStringViewModelPoiVisitPlanVisitTimeHrs = null;
        java.lang.Double viewModelPoiVisitPlanVisitTimeHrs = null;
        boolean viewModelPoiVisitPlanStartPoint = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

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


                    // read BindingConverters.doubleToString(viewModel.poiVisitPlan.visitTimeHrs)
                    bindingConvertersDoubleToStringViewModelPoiVisitPlanVisitTimeHrs = com.esv.tripplanner.core_api.binding_converters.BindingConverters.doubleToString(viewModelPoiVisitPlanVisitTimeHrs);
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedPoi
                        viewModelSelectedPoi = viewModel.getSelectedPoi();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.addNewPlace.setOnClickListener(mCallback3);
            this.cancel.setOnClickListener(mCallback5);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.poiVisitTime, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, poiVisitTimeandroidTextAttrChanged);
            this.save.setOnClickListener(mCallback4);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.switch1, (android.widget.CompoundButton.OnCheckedChangeListener)null, switch1androidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.esv.tripplanner.core_api.binding_adapters.BindingAdapters.setSelectedSpinnerItem(this.placeSelector, viewModelSelectedPoi, placeSelectorselectedSpinnerItemAttrChanged);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.poiVisitTime, bindingConvertersDoubleToStringViewModelPoiVisitPlanVisitTimeHrs);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.switch1, viewModelPoiVisitPlanStartPoint);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.cancel();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.addNewPoi();
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


                    viewModel.saveVisitPlan();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.poiVisitPlan
        flag 2 (0x3L): viewModel.selectedPoi
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}