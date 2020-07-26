package com.esv.tripplanner.shared_ui.binding_adapters

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
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


        @BindingAdapter("app:srcCompat")
        @JvmStatic
        fun bindSrcCompat(
            imageView: AppCompatImageView,
            drawableResource: Int
        ) {

            imageView.setImageDrawable(imageView.context.resources.getDrawable(drawableResource))
        }


    }


}