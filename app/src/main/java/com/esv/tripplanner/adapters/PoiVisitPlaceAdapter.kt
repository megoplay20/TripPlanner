package com.esv.tripplanner.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.R
import com.esv.tripplanner.databinding.PointOfInterestVisitPlanLayoutBinding
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.utils.ITypeCaster
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel

class PoiVisitPlaceAdapter (private var poiVisitPlaces:List<PointOfInterestVisitPlan>, val typeCaster: ITypeCaster, val repo: ITripRepository) :
    RecyclerView.Adapter<PoiVisitPlaceAdapter.PoiVisitPlacesViewHolder>() {

    fun setPlaces(poiVisitPlaces:List<PointOfInterestVisitPlan>){
        this.poiVisitPlaces = poiVisitPlaces;
        this.notifyDataSetChanged();
    }

    class PoiVisitPlacesViewHolder(
        itemView: View,
        val binding: PointOfInterestVisitPlanLayoutBinding,
        val typeCaster: ITypeCaster,
        val repo: ITripRepository
    ) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(
            poiVisitPlan: PointOfInterestVisitPlan
        ) {
            val viewModel = PointOfInterestVisitPlansViewModel()
            viewModel.initVisitPlansViewModel(poiVisitPlan, typeCaster,repo)
            this.binding.viewModel = viewModel
            this.binding.executePendingBindings()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoiVisitPlacesViewHolder {

        val binding = DataBindingUtil.inflate<PointOfInterestVisitPlanLayoutBinding>(
            LayoutInflater.from(parent.context),
            R.layout.point_of_interest_visit_plan_layout,
            parent,
            false
        )
        return PoiVisitPlacesViewHolder(binding.root, binding,typeCaster,repo)
    }

    override fun getItemCount(): Int {
        return poiVisitPlaces.count()
    }

    override fun onBindViewHolder(holder: PoiVisitPlacesViewHolder, position: Int) {
        holder.bindItem(poiVisitPlaces.get(position))
    }


}