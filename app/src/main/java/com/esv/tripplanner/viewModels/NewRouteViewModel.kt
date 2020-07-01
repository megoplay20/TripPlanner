package com.esv.tripplanner.viewModels

import android.app.Application
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavDirections
import com.esv.tripplanner.BR
import com.esv.tripplanner.database.TripDatabase
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.fragments.NewRouteFragmentDirections
import com.esv.tripplanner.helpers.AndroidObservableViewModel
import com.esv.tripplanner.helpers.Event
import com.esv.tripplanner.helpers.ObservableViewModel
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.repositories.TripDatabaseRepository
import com.esv.tripplanner.utils.DateProcessor
import java.util.*

class NewRouteViewModel(app:Application):AndroidObservableViewModel(app) {

    private var repository: ITripRepository

    var allVisitPlaces: LiveData<List<PointOfInterestVisitPlan>>

    init {
        val database = TripDatabase.getDatabase(app.applicationContext)
        repository = TripDatabaseRepository(database.pointOfInterestVisitPlans())
        allVisitPlaces = repository.getVisitPlacesData()
    }

    @get:Bindable
    var tripName: String="";
    var date: Date = Date()

    @Bindable
    fun getDateAsText(): String{
        return DateProcessor formatDate date;
    }
    @Bindable
    fun setDateAsText(value: String){
        val newDate = DateProcessor parseDate value ?: Date()
       if( date != newDate){
           date = newDate;
           notifyPropertyChanged(BR.dateAsText)
       }
    }

    private val _navigateAction: MutableLiveData<Event<NavDirections>> = MutableLiveData();
    val navigateAction: LiveData<Event<NavDirections>> get() = _navigateAction

    fun addVisitPlace(){
        this._navigateAction.value = Event(NewRouteFragmentDirections.addVisitPlanAction())
    }


}