package com.esv.tripplanner.fragments

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.esv.tripplanner.R
import com.esv.tripplanner.application.TripPlannerApplication
import com.esv.tripplanner.core.di.AppWithFacade
import com.esv.tripplanner.core.navigation.IArgumentsProvider
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.databinding.StartFragmentBinding
import com.esv.tripplanner.di.StartComponent
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.navigation.Navigator
import com.esv.tripplanner.viewModels.StartFragmentViewModel
import com.esv.tripplanner.viewModels.viewModelFactories.RepositoryAndNavigationAwareViewModel
import com.esv.tripplanner.viewModels.viewModelFactories.RepositoryAwareViewModel
import javax.inject.Inject

class StartFragment : InjectableFragment() {

    @Inject
    lateinit var repository: ITripRepository

    @Inject
    lateinit var navigationProvider: INavigationProvider

    @Inject
    lateinit var nav: INavigationProvider


    private lateinit  var viewModel: StartFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<StartFragmentBinding>(
            inflater,
            R.layout.start_fragment,
            container,
            false
        );

        viewModel = ViewModelProvider(
            requireActivity(),
            RepositoryAndNavigationAwareViewModel(
                this.requireActivity().application, repository, navigationProvider
            )
        ).get(StartFragmentViewModel::class.java)

        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root
    }



    override fun performInjection() {
        StartComponent.createComponent((requireActivity().application as AppWithFacade)
            .getProvidersFacade())
            .inject(this);
    }

}