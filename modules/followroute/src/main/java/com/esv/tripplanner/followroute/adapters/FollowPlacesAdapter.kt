package com.esv.tripplanner.followroute.adapters

import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.followroute.R
import com.esv.tripplanner.followroute.databinding.PointOfInterestOrderedBinding

class FollowPlacesAdapter(
    val tripId: Int,
    private val app: Application,
    private var poiVisitPlaces: MutableList<PointOfInterestVisitPlan>,
    val typeCaster: ITypeCaster,
    val repository: com.esv.tripplanner.core_api.repositories.ITripRepository,
    private val nav: INavigationProvider
) :
    RecyclerView.Adapter<FollowPlacesViewHolder>() {


    fun setPlaces(poiVisitPlaces:List<PointOfInterestVisitPlan>){
        this.poiVisitPlaces.clear()
        this.poiVisitPlaces.addAll(poiVisitPlaces);
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowPlacesViewHolder {

        val binding = DataBindingUtil.inflate<PointOfInterestOrderedBinding>(
            LayoutInflater.from(parent.context),
            R.layout.point_of_interest_ordered,
            parent,
            false
        )
        return FollowPlacesViewHolder(
            binding.root,
            binding,
            typeCaster,
            app,
            tripId,
            repository,
            nav
        )
    }

    override fun getItemCount(): Int {
        return poiVisitPlaces.count()
    }

    override fun onBindViewHolder(holder: FollowPlacesViewHolder, position: Int) {
        holder.bindItem(poiVisitPlaces.get(position))
    }




}