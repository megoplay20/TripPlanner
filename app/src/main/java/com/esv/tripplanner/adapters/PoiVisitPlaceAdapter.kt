package com.esv.tripplanner.adapters

import android.app.Application
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.R
import com.esv.tripplanner.database.TripDatabase
import com.esv.tripplanner.databinding.PointOfInterestVisitPlanLayoutBinding
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.repositories.TripRepositoryFactory
import com.esv.tripplanner.utils.ITypeCaster

class PoiVisitPlaceAdapter(
    val tripId: Int,
    private val app: Application,
    private var poiVisitPlaces: MutableList<PointOfInterestVisitPlan>,
    val typeCaster: ITypeCaster
) :
    RecyclerView.Adapter<PoiVisitPlacesViewHolder>() {

    val repository: ITripRepository;
    init {
        val database = TripDatabase.getDatabase(app.applicationContext)
        repository = TripRepositoryFactory.getDatabaseRepositoryInstance(database)
    }

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
            tripId
        )
    }

    override fun getItemCount(): Int {
        return poiVisitPlaces.count()
    }

    override fun onBindViewHolder(holder: PoiVisitPlacesViewHolder, position: Int) {
        holder.bindItem(poiVisitPlaces.get(position))
    }


}