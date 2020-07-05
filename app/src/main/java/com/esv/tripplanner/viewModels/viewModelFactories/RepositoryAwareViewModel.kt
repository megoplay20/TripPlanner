package com.esv.tripplanner.viewModels.viewModelFactories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.viewModels.PointOfInterestViewModel
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel
import com.esv.tripplanner.viewModels.StartFragmentViewModel
import java.lang.Exception
import kotlin.reflect.KClass

class RepositoryAwareViewModel(val app: Application, private val repository: ITripRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val viewModel:Any = when(modelClass){
            StartFragmentViewModel::class.java -> StartFragmentViewModel(app, repository)
            PointOfInterestViewModel::class.java-> PointOfInterestViewModel(app,repository)
            PointOfInterestVisitPlansViewModel::class.java->PointOfInterestVisitPlansViewModel(app,repository)
            else -> throw Exception("Provided view model class Not found")
        }
        return  viewModel as T
    }
}