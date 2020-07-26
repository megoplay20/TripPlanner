package com.esv.tripplanner.loadroute.adapters

import android.app.Application
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.loadroute.databinding.TripItemBinding
import com.esv.tripplanner.loadroute.viewModels.TripItemViewModel
import com.esv.tripplanner.shared_ui.viewModels.PointOfInterestVisitPlansViewModel

class TripItemViewHolder(
    itemView: View,
    val binding: TripItemBinding,
    val app: Application,
    val navigator: com.esv.tripplanner.core_api.navigation.INavigationProvider
) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    lateinit var viewModel: TripItemViewModel
    fun bindItem(
        tripRelation: TripVisitPlansRelation
    ) {
        val viewModel = TripItemViewModel(app, tripRelation)
        this.binding.viewModel = viewModel
        this.binding.executePendingBindings()
    }

    override fun onClick(v: View?) {
        navigator.startLoadRouteById(viewModel.trip.trip.id)
    }

}