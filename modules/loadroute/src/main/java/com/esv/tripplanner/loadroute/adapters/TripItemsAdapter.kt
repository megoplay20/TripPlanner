package com.esv.tripplanner.loadroute.adapters

import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.loadroute.R
import com.esv.tripplanner.loadroute.databinding.TripItemBinding

class TripItemsAdapter(
    private val app: Application,
    private var trips: MutableList<TripVisitPlansRelation>,
    val navigator: com.esv.tripplanner.core_api.navigation.INavigationProvider
) :
    RecyclerView.Adapter<TripItemViewHolder>() {


    fun setTrips(trips:List<TripVisitPlansRelation>){
        this.trips.clear()
        this.trips.addAll(trips);
        this.notifyDataSetChanged();
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripItemViewHolder {

        val binding = DataBindingUtil.inflate<TripItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.trip_item,
            parent,
            false
        )
        return TripItemViewHolder(
            binding.root,
            binding,
            app,
            navigator
        )
    }

    override fun getItemCount(): Int {
        return trips.count()
    }

    override fun onBindViewHolder(holder: TripItemViewHolder, position: Int) {
        holder.bindItem(trips.get(position))
    }


}