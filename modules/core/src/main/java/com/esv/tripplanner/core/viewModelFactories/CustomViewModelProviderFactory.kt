package com.esv.tripplanner.core.viewModelFactories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.navigation.INavigationProvider
import java.lang.Exception

class CustomViewModelProviderFactory<T>(val createViewModelFnc: ()->T): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return  createViewModelFnc() as T
    }
}