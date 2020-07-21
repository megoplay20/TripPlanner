package com.esv.tripplanner.pointofinterest.databinding;
import com.esv.tripplanner.pointofinterest.R;
import com.esv.tripplanner.pointofinterest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddOrEditPointOfInterestBindingImpl extends AddOrEditPointOfInterestBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView3, 7);
        sViewsWithIds.put(R.id.textView4, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener closeTimeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.closeHoursAsText
            //         is viewModel.setCloseHoursAsText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(closeTime);
            // localize variables for thread safety
            // viewModel.closeHoursAsText
            java.lang.String viewModelCloseHoursAsText = null;
            // viewModel
            com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setCloseHoursAsText(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener latitudeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.latitudeAsText
            //         is viewModel.setLatitudeAsText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(latitude);
            // localize variables for thread safety
            // viewModel.latitudeAsText
            java.lang.String viewModelLatitudeAsText = null;
            // viewModel
            com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setLatitudeAsText(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener longitudeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.longitudeAsText
            //         is viewModel.setLongitudeAsText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(longitude);
            // localize variables for thread safety
            // viewModel.longitudeAsText
            java.lang.String viewModelLongitudeAsText = null;
            // viewModel
            com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setLongitudeAsText(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener poiDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.poi.description
            //         is viewModel.poi.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(poiDescription);
            // localize variables for thread safety
            // viewModel
            com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.poi.description
            java.lang.String viewModelPoiDescription = null;
            // viewModel.poi
            com.esv.tripplanner.core_api.data.entities.PointOfInterest viewModelPoi = null;
            // viewModel.poi != null
            boolean viewModelPoiJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPoi = viewModel.getPoi();

                viewModelPoiJavaLangObjectNull = (viewModelPoi) != (null);
                if (viewModelPoiJavaLangObjectNull) {




                    viewModelPoi.setDescription(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener poiNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.poi.name
            //         is viewModel.poi.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(poiName);
            // localize variables for thread safety
            // viewModel.poi.name
            java.lang.String viewModelPoiName = null;
            // viewModel
            com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.poi
            com.esv.tripplanner.core_api.data.entities.PointOfInterest viewModelPoi = null;
            // viewModel.poi != null
            boolean viewModelPoiJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPoi = viewModel.getPoi();

                viewModelPoiJavaLangObjectNull = (viewModelPoi) != (null);
                if (viewModelPoiJavaLangObjectNull) {




                    viewModelPoi.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener poiOpenTimeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.openHoursAsText
            //         is viewModel.setOpenHoursAsText((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(poiOpenTime);
            // localize variables for thread safety
            // viewModel.openHoursAsText
            java.lang.String viewModelOpenHoursAsText = null;
            // viewModel
            com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setOpenHoursAsText(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public AddOrEditPointOfInterestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private AddOrEditPointOfInterestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            );
        this.closeTime.setTag(null);
        this.latitude.setTag(null);
        this.longitude.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.poiDescription.setTag(null);
        this.poiName.setTag(null);
        this.poiOpenTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        else if (fieldId == BR.openHoursAsText) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.closeHoursAsText) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.latitudeAsText) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.longitudeAsText) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        java.lang.String viewModelPoiDescription = null;
        java.lang.String viewModelCloseHoursAsText = null;
        com.esv.tripplanner.core_api.data.entities.PointOfInterest viewModelPoi = null;
        java.lang.String viewModelOpenHoursAsText = null;
        java.lang.String viewModelLatitudeAsText = null;
        java.lang.String viewModelPoiName = null;
        java.lang.String viewModelLongitudeAsText = null;
        com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x49L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.closeHoursAsText
                        viewModelCloseHoursAsText = viewModel.getCloseHoursAsText();
                    }
            }
            if ((dirtyFlags & 0x43L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.poi
                        viewModelPoi = viewModel.getPoi();
                    }


                    if (viewModelPoi != null) {
                        // read viewModel.poi.description
                        viewModelPoiDescription = viewModelPoi.getDescription();
                        // read viewModel.poi.name
                        viewModelPoiName = viewModelPoi.getName();
                    }
            }
            if ((dirtyFlags & 0x45L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.openHoursAsText
                        viewModelOpenHoursAsText = viewModel.getOpenHoursAsText();
                    }
            }
            if ((dirtyFlags & 0x51L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.latitudeAsText
                        viewModelLatitudeAsText = viewModel.getLatitudeAsText();
                    }
            }
            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.longitudeAsText
                        viewModelLongitudeAsText = viewModel.getLongitudeAsText();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x49L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.closeTime, viewModelCloseHoursAsText);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.closeTime, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, closeTimeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.latitude, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, latitudeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.longitude, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, longitudeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.poiDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, poiDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.poiName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, poiNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.poiOpenTime, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, poiOpenTimeandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.latitude, viewModelLatitudeAsText);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.longitude, viewModelLongitudeAsText);
        }
        if ((dirtyFlags & 0x43L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.poiDescription, viewModelPoiDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.poiName, viewModelPoiName);
        }
        if ((dirtyFlags & 0x45L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.poiOpenTime, viewModelOpenHoursAsText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.poi
        flag 2 (0x3L): viewModel.openHoursAsText
        flag 3 (0x4L): viewModel.closeHoursAsText
        flag 4 (0x5L): viewModel.latitudeAsText
        flag 5 (0x6L): viewModel.longitudeAsText
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}