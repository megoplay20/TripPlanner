package com.esv.tripplanner.shared_ui.binding_adapters

import android.graphics.drawable.Drawable
import androidx.databinding.BindingAdapter
import com.esv.tripplanner.shared_ui.customUiControls.TripPlanPlacesIndicatorView

class BindingAdaptersShared {

    companion object {
        @BindingAdapter("app:itemCount")
        @JvmStatic
        fun bindItemCount(
            indicatorView: TripPlanPlacesIndicatorView,
            items: Int
        ) {
            indicatorView.setVisitPlacesCount(items)
        }
    }
}