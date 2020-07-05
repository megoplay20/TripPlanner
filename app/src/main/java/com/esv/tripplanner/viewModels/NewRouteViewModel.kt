package com.esv.tripplanner.viewModels

import android.app.Application
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavDirections
import com.esv.tripplanner.BR
import com.esv.tripplanner.database.TripDatabase
import com.esv.tripplanner.entities.relation_classes.TripVisitPlansRelation
import com.esv.tripplanner.fragments.NewRouteFragmentDirections
import com.esv.tripplanner.helpers.AndroidObservableViewModel
import com.esv.tripplanner.helpers.Event
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.utils.IDateProcessor
import kotlinx.coroutines.launch
import java.util.*
import kotlin.properties.Delegates

class NewRouteViewModel(app:Application,
                        private val repository: ITripRepository,
private val dateProcessor: IDateProcessor):AndroidObservableViewModel(app) {



    lateinit var tripVisitPlacesRelations: LiveData<List<TripVisitPlansRelation>>
    var tripId by Delegates.notNull<Int>()


    @get:Bindable
    var tripName: String="";
    var date: Date = Date()

    fun init(tripId: Int){
        this.tripId= tripId
        tripVisitPlacesRelations = repository.getVisitPlansForTrip(tripId);
        viewModelScope.launch {
            tripName = repository.getTripById(tripId).name
            notifyPropertyChanged(BR.tripName)
        }
    }

    @Bindable
    fun getDateAsText(): String{
        return dateProcessor formatDate date;
    }
    @Bindable
    fun setDateAsText(value: String){
        val newDate = dateProcessor parseDate value ?: Date()
       if( date != newDate){
           date = newDate;
           notifyPropertyChanged(BR.dateAsText)
       }
    }

    private val _navigateAction: MutableLiveData<Event<NavDirections>> = MutableLiveData();
    val navigateAction: LiveData<Event<NavDirections>> get() = _navigateAction

    fun addVisitPlace(){
            _navigateAction.postValue(Event(NewRouteFragmentDirections.addVisitPlanAction(tripId)))

    }


}