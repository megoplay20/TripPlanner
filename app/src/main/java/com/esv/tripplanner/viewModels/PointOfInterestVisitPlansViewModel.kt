package com.esv.tripplanner.viewModels

import android.app.Application
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavDirections
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.fragments.AddVisitPlanFragmentDirections
import com.esv.tripplanner.helpers.Event
import com.esv.tripplanner.utils.ITypeCaster
import kotlinx.coroutines.launch

class PointOfInterestVisitPlansViewModel(app: Application): PointOfInterestViewModel(app){

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



    private val _navigateAction: MutableLiveData<Event<NavDirections>> = MutableLiveData();
    val navigateAction: LiveData<Event<NavDirections>> get() = _navigateAction

    private val _backAction: MutableLiveData<Event<Boolean>> = MutableLiveData();
    val backAction: LiveData<Event<Boolean>> get() = _backAction

    fun addNewPoi(){
        this._navigateAction.value = Event(AddVisitPlanFragmentDirections.addPoiActionFromVisitPlan())
    }

    fun saveVisitPlan(){

        selectedPoi?.let {
            if (it.id >= 0) {
                poiVisitPlan.pointOfInterestId = it.id
                viewModelScope.launch {
                    val newVisitPlacesId = repository.addVisitPlanToTrip(tripId, poiVisitPlan)
                    _backAction.value = Event(true)
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
        _backAction.value = Event(true)
    }

}