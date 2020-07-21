package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.SharedElementCallback
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.R
import com.esv.tripplanner.application.TripPlannerApplication
import com.esv.tripplanner.databinding.AddOrEditPointOfInterestBinding
import com.esv.tripplanner.databinding.AddOrEditPointOfInterestVisitPlansBinding
import com.esv.tripplanner.di.EmptyPoi

import com.esv.tripplanner.entities.Location
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.helpers.TimeSpan
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.utils.ITypeCaster
import com.esv.tripplanner.viewModels.PointOfInterestViewModel
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel
import com.esv.tripplanner.viewModels.StartFragmentViewModel
import com.esv.tripplanner.viewModels.viewModelFactories.RepositoryAwareViewModel
import javax.inject.Inject
import javax.inject.Qualifier

class PointOfInterestFragment: InjectableFragment(), IBackPressAwareFragment {

    @Inject
    lateinit var typeCaster: ITypeCaster

    @Inject
    @field:EmptyPoi
    lateinit var emptyPoi: PointOfInterest

    @Inject
    lateinit var repository: ITripRepository

    private lateinit var viewModel:PointOfInterestViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<AddOrEditPointOfInterestBinding>(
            inflater,
            R.layout.add_or_edit_point_of_interest,
            container,
            false
        );

        viewModel = ViewModelProvider(
            requireActivity(),
            RepositoryAwareViewModel(
                this.requireActivity().application, repository
            )
        ).get(PointOfInterestViewModel::class.java)

        viewModel.initPointOfInterestViewModel(emptyPoi, typeCaster)
        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onSupportNavigateUpTriggered() {
        viewModel.savePoi()
    }

    override fun onBackPressedTriggered() {
        viewModel.savePoi()
    }

    override fun performInjection() {
        TripPlannerApplication.tripPlannerAppInstance.appComponent.inject(this)
    }


}