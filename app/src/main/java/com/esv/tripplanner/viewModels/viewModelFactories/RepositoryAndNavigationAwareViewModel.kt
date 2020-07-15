package com.esv.tripplanner.viewModels.viewModelFactories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.viewModels.PointOfInterestViewModel
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel
import com.esv.tripplanner.viewModels.StartFragmentViewModel
import java.lang.Exception

class RepositoryAndNavigationAwareViewModel(val app: Application, private val repository: ITripRepository, private val navigator: INavigationProvider): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val viewModel:Any = when(modelClass){
            StartFragmentViewModel::class.java -> StartFragmentViewModel(app, repository, navigator)
            PointOfInterestViewModel::class.java-> PointOfInterestViewModel(app,repository)
            PointOfInterestVisitPlansViewModel::class.java->PointOfInterestVisitPlansViewModel(app,repository)
            else -> throw Exception("Provided view model class Not found")
        }
        return  viewModel as T
    }
}