package com.esv.tripplanner.pointofinterest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.di.AppWithFacade
import com.esv.tripplanner.core.di.EmptyPoi
import com.esv.tripplanner.core.helpers.ITypeCaster
import com.esv.tripplanner.core.navigation.INavigatorComponentsProvider
import com.esv.tripplanner.core.ui.IBackPressAwareFragment
import com.esv.tripplanner.core.ui.InjectableFragment
import com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel
import com.esv.tripplanner.core.viewModelFactories.CustomViewModelProviderFactory
import com.esv.tripplanner.pointofinterest.R
import com.esv.tripplanner.pointofinterest.R.*
import com.esv.tripplanner.pointofinterest.databinding.AddOrEditPointOfInterestBinding
import javax.inject.Inject

class PointOfInterestFragment: InjectableFragment(),
    IBackPressAwareFragment {

    @Inject
    lateinit var typeCaster: ITypeCaster

    @Inject
    @field:EmptyPoi
    lateinit var emptyPoi: PointOfInterest

    @Inject
    lateinit var repository: ITripRepository

    @Inject
    lateinit var navComponent: INavigatorComponentsProvider

    private lateinit var viewModel: PointOfInterestViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<AddOrEditPointOfInterestBinding>(
            inflater,
            layout.add_or_edit_point_of_interest,
            container,
            false
        );

        viewModel = ViewModelProvider(
            requireActivity(),
            CustomViewModelProviderFactory(){
                PointOfInterestViewModel(
                    this.requireActivity().application,
                    repository,
                    navComponent.provideNavigator()
                )
            }
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
        com.esv.tripplanner.pointofinterest.di.PointOfInterestComponent.createComponent((requireActivity().application as AppWithFacade)
            .getProvidersFacade())
            .inject(this);
    }


}