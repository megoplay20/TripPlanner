package com.esv.tripplanner.adapters

import android.app.Application
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.databinding.PointOfInterestVisitPlanLayoutBinding
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.utils.ITypeCaster
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel

class PoiVisitPlacesViewHolder(
    itemView: View,
    val binding: PointOfInterestVisitPlanLayoutBinding,
    private val typeCaster: ITypeCaster,
    val app: Application,
    val tripId: Int,
    val repository: ITripRepository
) : RecyclerView.ViewHolder(itemView) {

    fun bindItem(
        poiVisitPlan: PointOfInterestVisitPlan
    ) {
        val viewModel =
            PointOfInterestVisitPlansViewModel(app, repository)
        viewModel.initVisitPlansViewModel(tripId, poiVisitPlan, typeCaster)
        this.binding.viewModel = viewModel
        this.binding.executePendingBindings()
    }

}