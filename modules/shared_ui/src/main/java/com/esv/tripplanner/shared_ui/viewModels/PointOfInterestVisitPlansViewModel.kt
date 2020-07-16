package com.esv.tripplanner.shared_ui.viewModels

import android.app.Application
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.core_api.data.entities.PointOfInterest
import com.esv.tripplanner.core_api.data.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import kotlinx.coroutines.launch

class PointOfInterestVisitPlansViewModel(
    app: Application,
    repository: com.esv.tripplanner.core_api.repositories.ITripRepository,
    navigator: com.esv.tripplanner.core_api.navigation.INavigationProvider
): PointOfInterestViewModel(
    app,
    repository,
    navigator
){

    @get:Bindable
    lateinit var poiVisitPlan: PointOfInterestVisitPlan;

    lateinit var pointOfInterestList: LiveData<List<PointOfInterest>>

    var tripId: Int = -1

    fun initVisitPlansViewModel(
        tripId: Int,
        poiVisitPlan: PointOfInterestVisitPlan,
        typeCaster: ITypeCaster
    )  {
        this.tripId = tripId
        this.poiVisitPlan = poiVisitPlan
        viewModelScope.launch {
            repository.getPointOfInterestById(poiVisitPlan.pointOfInterestId)?.let {
                super.initPointOfInterestViewModel(it, typeCaster)
            }
        }
        pointOfInterestList = repository.getPointOfInterest()
    }

    fun addNewPoi(){
        navigator.startAddPoiActionFromVisitPlan()
    }

    fun saveVisitPlan(){

        selectedPoi?.let {
            if (it.id >= 0) {
                poiVisitPlan.pointOfInterestId = it.id
                viewModelScope.launch {
                    val newVisitPlacesId = repository.addVisitPlanToTrip(tripId, poiVisitPlan)
                    navigator.goBack()
                }
            }
        }
    }

    fun editVisitPlan(){
        //TODO()
    }

    fun deleteVisitPlanPoi(){
        //TODO()
    }

    fun cancel(){
        navigator.goBack()
    }

}