package com.esv.tripplanner.newroute.adapters

import android.app.Application
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.newroute.databinding.PointOfInterestVisitPlanLayoutBinding
import com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel

class PoiVisitPlacesViewHolder(
    itemView: View,
    val binding: PointOfInterestVisitPlanLayoutBinding,
    private val typeCaster: ITypeCaster,
    val app: Application,
    val tripId: Int,
    val repository: com.esv.tripplanner.core_api.repositories.ITripRepository,
    val navigator: com.esv.tripplanner.core_api.navigation.INavigationProvider
) : RecyclerView.ViewHolder(itemView) {

    fun bindItem(
        poiVisitPlan: PointOfInterestVisitPlan
    ) {
        val viewModel =
            PointOfInterestVisitPlansViewModel(app, repository, navigator)
        viewModel.initVisitPlansViewModel(tripId, poiVisitPlan, typeCaster)
        this.binding.viewModel = viewModel
        this.binding.executePendingBindings()
    }

}