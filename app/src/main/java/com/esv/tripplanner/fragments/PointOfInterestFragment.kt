package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.R
import com.esv.tripplanner.application.TripPlannerApplication
import com.esv.tripplanner.databinding.AddOrEditPointOfInterestBinding

import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.di.AppWithFacade
import com.esv.tripplanner.core.di.EmptyPoi
import com.esv.tripplanner.core.helpers.ITypeCaster
import com.esv.tripplanner.di.PointOfInterestComponent
import com.esv.tripplanner.di.StartComponent
import com.esv.tripplanner.viewModels.PointOfInterestViewModel
import com.esv.tripplanner.viewModels.viewModelFactories.RepositoryAwareViewModel
import javax.inject.Inject

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
        PointOfInterestComponent.createComponent((requireActivity().application as AppWithFacade)
            .getProvidersFacade())
            .inject(this);
    }


}