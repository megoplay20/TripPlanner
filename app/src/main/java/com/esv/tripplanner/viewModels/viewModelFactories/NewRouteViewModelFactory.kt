package com.esv.tripplanner.viewModels.viewModelFactories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.viewModels.NewRouteViewModel

class NewRouteViewModelFactory(val app: Application, val tripId: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val newRouteViewModel =
            NewRouteViewModel(app, tripId)
        return  newRouteViewModel as T
    }
}