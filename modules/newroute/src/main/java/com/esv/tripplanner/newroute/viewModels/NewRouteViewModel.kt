package com.esv.tripplanner.newroute.viewModels

import com.esv.tripplanner.newroute.BR
import android.app.Application
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.core_api.data.entities.relation_classes.TripVisitPlansRelation
import com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel
import com.esv.tripplanner.core_api.helpers.IDateProcessor
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import kotlinx.coroutines.launch
import java.util.*
import kotlin.properties.Delegates

class NewRouteViewModel(
    app: Application,
    private val repository: com.esv.tripplanner.core_api.repositories.ITripRepository,
    private val dateProcessor: IDateProcessor,
    private val nav: com.esv.tripplanner.core_api.navigation.INavigationProvider
):
    AndroidObservableViewModel(app) {



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


    fun addVisitPlace(){
            nav.startAddVisitPlanAction(tripId);
    }


}