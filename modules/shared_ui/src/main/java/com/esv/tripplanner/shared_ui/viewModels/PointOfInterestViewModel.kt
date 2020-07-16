package com.esv.tripplanner.shared_ui.viewModels

import com.esv.tripplanner.shared_ui.BR
import android.app.Application
import android.view.View
import androidx.databinding.Bindable
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.core_api.data.entities.Location
import com.esv.tripplanner.core_api.data.entities.PointOfInterest
import com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.helpers.TimeHolder
import com.esv.tripplanner.core_api.helpers.TimeSpan
import kotlinx.coroutines.launch

open class PointOfInterestViewModel(
    app: Application,
    protected var repository: com.esv.tripplanner.core_api.repositories.ITripRepository,
    val navigator: com.esv.tripplanner.core_api.navigation.INavigationProvider
) : AndroidObservableViewModel(app) {
    private lateinit var typeCaster: ITypeCaster

    @get:Bindable
    var poi: PointOfInterest = PointOfInterest("","", Location(0.0,0.0),
        TimeSpan()
    )

    @get:Bindable
    var selectedPoi: PointOfInterest? = null

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