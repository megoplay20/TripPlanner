package com.esv.tripplanner.viewModels

import android.app.Application
import android.graphics.Point
import android.view.View
import androidx.databinding.Bindable
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.BR
import com.esv.tripplanner.database.TripDatabase
import com.esv.tripplanner.entities.Location
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.helpers.AndroidObservableViewModel
import com.esv.tripplanner.helpers.ObservableViewModel
import com.esv.tripplanner.helpers.TimeHolder
import com.esv.tripplanner.helpers.TimeSpan
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.repositories.TripRepositoryFactory
import com.esv.tripplanner.utils.ITypeCaster
import kotlinx.coroutines.launch

open class PointOfInterestViewModel(app: Application) : AndroidObservableViewModel(app) {
    private lateinit var typeCaster: ITypeCaster
    protected var repository: ITripRepository

    @get:Bindable
    var poi: PointOfInterest = PointOfInterest("","", Location(0.0,0.0), TimeSpan())

    @get:Bindable
    var selectedPoi: PointOfInterest? = null

    init {
        val database = TripDatabase.getDatabase(app.applicationContext)
        repository = TripRepositoryFactory.getDatabaseRepositoryInstance(database)
    }

    fun initPointOfInterestViewModel(poi: PointOfInterest, typeCaster: ITypeCaster) {
        this.poi = poi
        this.typeCaster = typeCaster
        notifyPropertyChanged(BR.poi)
    }

    @Bindable
    fun getOpenHoursAsText(): String {
        return poi.workingHours.openTime.toString();
    }

    @Bindable
    fun getCloseHoursAsText(): String {
        return poi.workingHours.closeTime.toString();
    }

    fun setCloseHoursAsText(closeHrsText: String) {
        val newValue = TimeHolder.fromString(closeHrsText) ?: TimeHolder.getDefaultTimeHolder()
        if (newValue != poi.workingHours.closeTime) {
            poi.workingHours.closeTime = newValue
            notifyPropertyChanged(BR.poi)
        }
    }

    fun setOpenHoursAsText(openHrsText: String) {
        val newValue = TimeHolder.fromString(openHrsText) ?: TimeHolder.getDefaultTimeHolder()
        if (newValue != poi.workingHours.openTime) {
            poi.workingHours.openTime = newValue
            notifyPropertyChanged(BR.poi)
        }
    }


    @Bindable
    fun getLatitudeAsText(): String {
        return poi.location.latitude.toString()
    }

    @Bindable
    fun getLongitudeAsText(): String {
        return poi.location.longitude.toString();
    }

    fun setLatitudeAsText(lat: String) {
        val newLatitude = typeCaster.GetDouble(lat) ?: 0.0
        if (newLatitude != poi.location.latitude) {
            poi.location.latitude = newLatitude
            notifyPropertyChanged(BR.poi)
        }
    }

    fun setLongitudeAsText(lon: String) {
        val newLongitude = typeCaster.GetDouble(lon) ?: 0.0
        if (newLongitude != poi.location.longitude) {
            poi.location.longitude = newLongitude
            notifyPropertyChanged(BR.poi)
        }
    }

    @Bindable
    fun getCoordinatesAsText(): String {
        return poi.location.toString();
    }

    fun savePoi() {
            if(poi.name.isNotBlank()) {
                    viewModelScope.launch {
                            repository.savePointOfInterest(poi)
                    }
            }
    }

    fun editPoi() {
        //TODO()
    }

    fun deletePoi() {
        //TODO()
    }

    @Bindable
    fun getShowEditBlock(): Int {
        return View.GONE;
    }

}