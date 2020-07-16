package com.esv.tripplanner.startscreen.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.core.di.AppWithFacade
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.ui.InjectableFragment
import com.esv.tripplanner.core.viewModelFactories.CustomViewModelProviderFactory
import com.esv.tripplanner.startscreen.R
import com.esv.tripplanner.startscreen.databinding.StartFragmentBinding
import com.esv.tripplanner.startscreen.di.StartComponent
import com.esv.tripplanner.startscreen.viewModels.StartFragmentViewModel
import javax.inject.Inject

class StartFragment : InjectableFragment() {

    @Inject
    lateinit var repository: ITripRepository

    @Inject
    lateinit var navigationProvider: INavigationProvider

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
            CustomViewModelProviderFactory(){StartFragmentViewModel(this.requireActivity().application, repository, navigationProvider)}
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