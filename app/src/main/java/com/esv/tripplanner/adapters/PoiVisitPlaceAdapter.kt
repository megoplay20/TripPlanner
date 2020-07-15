package com.esv.tripplanner.adapters

import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.R
import com.esv.tripplanner.databinding.PointOfInterestVisitPlanLayoutBinding
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.helpers.ITypeCaster

class PoiVisitPlaceAdapter(
    val tripId: Int,
    private val app: Application,
    private var poiVisitPlaces: MutableList<PointOfInterestVisitPlan>,
    val typeCaster: ITypeCaster,
    val repository: ITripRepository
) :
    RecyclerView.Adapter<PoiVisitPlacesViewHolder>() {


    fun setPlaces(poiVisitPlaces:List<PointOfInterestVisitPlan>){
        this.poiVisitPlaces.clear()
        this.poiVisitPlaces.addAll(poiVisitPlaces);
        this.notifyDataSetChanged();
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoiVisitPlacesViewHolder {

        val binding = DataBindingUtil.inflate<PointOfInterestVisitPlanLayoutBinding>(
            LayoutInflater.from(parent.context),
            R.layout.point_of_interest_visit_plan_layout,
            parent,
            false
        )
        return PoiVisitPlacesViewHolder(
            binding.root,
            binding,
            typeCaster,
            app,
            tripId,
            repository
        )
    }

    override fun getItemCount(): Int {
        return poiVisitPlaces.count()
    }

    override fun onBindViewHolder(holder: PoiVisitPlacesViewHolder, position: Int) {
        holder.bindItem(poiVisitPlaces.get(position))
    }


}