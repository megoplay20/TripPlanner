package com.esv.tripplanner.viewModels.viewModelFactories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.helpers.IDateProcessor
import com.esv.tripplanner.viewModels.NewRouteViewModel

class NewRouteViewModelFactory(val app: Application, private val repository: ITripRepository, val dateProcessor: IDateProcessor): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val viewModel =
            NewRouteViewModel(app, repository,dateProcessor)
        return  viewModel as T
    }
}