package com.esv.tripplanner.viewModels

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavDirections
import com.esv.tripplanner.BR
import com.esv.tripplanner.fragments.NewRouteFragmentDirections
import com.esv.tripplanner.fragments.StartFragmentDirections
import com.esv.tripplanner.helpers.Event
import com.esv.tripplanner.helpers.ObservableViewModel
import com.esv.tripplanner.utils.DateProcessor
import java.util.*

class NewRouteViewModel:ObservableViewModel() {

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