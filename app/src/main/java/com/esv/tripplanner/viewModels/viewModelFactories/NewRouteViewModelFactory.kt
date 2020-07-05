package com.esv.tripplanner.viewModels.viewModelFactories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.utils.IDateProcessor
import com.esv.tripplanner.viewModels.NewRouteViewModel
import com.esv.tripplanner.viewModels.StartFragmentViewModel

class NewRouteViewModelFactory(val app: Application, private val repository: ITripRepository,val dateProcessor: IDateProcessor): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val viewModel =
            NewRouteViewModel(app, repository,dateProcessor)
        return  viewModel as T
    }
}