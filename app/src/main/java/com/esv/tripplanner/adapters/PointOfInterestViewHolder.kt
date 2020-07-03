package com.esv.tripplanner.adapters

import android.app.Application
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.databinding.PointOfInterestLayoutBinding
import com.esv.tripplanner.databinding.PointOfInterestVisitPlanLayoutBinding
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.utils.ITypeCaster
import com.esv.tripplanner.viewModels.PointOfInterestViewModel
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel

class PointOfInterestViewHolder(
    itemView: View,
    val binding: PointOfInterestLayoutBinding,
    private val typeCaster: ITypeCaster,
    val app: Application
) : RecyclerView.ViewHolder(itemView) {

    fun bindItem(
        poi: PointOfInterest
    ) {
        val viewModel =
            PointOfInterestViewModel(app)
        viewModel.initPointOfInterestViewModel(poi, typeCaster)
        this.binding.viewModel = viewModel
        this.binding.executePendingBindings()
    }

}