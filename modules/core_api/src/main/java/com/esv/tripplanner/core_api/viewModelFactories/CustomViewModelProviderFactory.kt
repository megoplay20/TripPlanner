package com.esv.tripplanner.core_api.viewModelFactories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CustomViewModelProviderFactory<T>(val createViewModelFnc: ()->T): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return  createViewModelFnc() as T
    }
}