package com.esv.tripplanner.startscreen.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.core_api.di.AppWithFacade
import com.esv.tripplanner.core_api.navigation.INavigationProvider
import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.core_api.ui.InjectableFragment
import com.esv.tripplanner.core_api.viewModelFactories.CustomViewModelProviderFactory
import com.esv.tripplanner.startscreen.R
import com.esv.tripplanner.startscreen.databinding.StartFragmentBinding
import com.esv.tripplanner.startscreen.di.StartComponent
import com.esv.tripplanner.startscreen.viewModels.StartFragmentViewModel
import javax.inject.Inject

class StartFragment : com.esv.tripplanner.core_api.ui.InjectableFragment() {

    @Inject
    lateinit var repository: com.esv.tripplanner.core_api.repositories.ITripRepository

    @Inject
    lateinit var navigationProvider: com.esv.tripplanner.core_api.navigation.INavigationProvider

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
            com.esv.tripplanner.core_api.viewModelFactories.CustomViewModelProviderFactory() {
                StartFragmentViewModel(
                    this.requireActivity().application,
                    repository,
                    navigationProvider
                )
            }
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