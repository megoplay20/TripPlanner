package com.esv.tripplanner.loadroute.viewModels

import android.app.Application
import androidx.databinding.Bindable
import com.esv.tripplanner.core_api.helpers.AndroidObservableViewModel

class TripItemViewModel(app: Application) : AndroidObservableViewModel(app) {

    @get:Bindable
    var tripItemCount:Int = 0
}