package com.esv.tripplanner.followroute.adapters

import android.app.Application
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.followroute.databinding.PointOfInterestOrderedBinding
import com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel

class FollowPlacesViewHolder(
    itemView: View,
    private val binding: PointOfInterestOrderedBinding,
    private val typeCaster: ITypeCaster,
    private val app: Application,
    private val tripId: Int,
    private val repository: com.esv.tripplanner.core_api.repositories.ITripRepository,
private val nav: INavigationProvider
) : RecyclerView.ViewHolder(itemView) {

    fun bindItem(
        poiVisitPlan: PointOfInterestVisitPlan
    ) {
        val viewModel =
            PointOfInterestVisitPlansViewModel(app, repository, nav)
        viewModel.initVisitPlansViewModel(tripId, poiVisitPlan, typeCaster)
        this.binding.viewModel = viewModel
        this.binding.executePendingBindings()
    }

}