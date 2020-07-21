package com.esv.tripplanner.pointofinterest;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.esv.tripplanner.pointofinterest.databinding.AddOrEditPointOfInterestBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADDOREDITPOINTOFINTEREST = 1;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(1);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.esv.tripplanner.pointofinterest.R.layout.add_or_edit_point_of_interest, LAYOUT_ADDOREDITPOINTOFINTEREST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADDOREDITPOINTOFINTEREST: {
          if ("layout/add_or_edit_point_of_interest_0".equals(tag)) {
            return new AddOrEditPointOfInterestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_or_edit_point_of_interest is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(3);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.esv.tripplanner.core_api.DataBinderMapperImpl());
    result.add(new com.esv.tripplanner.shared_ui.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(11);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "closeHoursAsText");
      sKeys.put(2, "coordinatesAsText");
      sKeys.put(3, "latitudeAsText");
      sKeys.put(4, "longitudeAsText");
      sKeys.put(5, "openHoursAsText");
      sKeys.put(6, "poi");
      sKeys.put(7, "poiVisitPlan");
      sKeys.put(8, "selectedPoi");
      sKeys.put(9, "showEditBlock");
      sKeys.put(10, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(1);

    static {
      sKeys.put("layout/add_or_edit_point_of_interest_0", com.esv.tripplanner.pointofinterest.R.layout.add_or_edit_point_of_interest);
    }
  }
}
