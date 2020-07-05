package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.esv.tripplanner.R
import com.esv.tripplanner.application.TripPlannerApplication
import com.esv.tripplanner.databinding.StartFragmentBinding
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.viewModels.StartFragmentViewModel
import com.esv.tripplanner.viewModels.viewModelFactories.RepositoryAwareViewModel
import javax.inject.Inject

class StartFragment : InjectableFragment() {

    @Inject
    lateinit var repository: ITripRepository

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
            RepositoryAwareViewModel(
                this.requireActivity().application, repository
            )
        ).get(StartFragmentViewModel::class.java)

        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel.navigateAction.observe(this.viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let { navDirection ->
                try {
                    Navigation.findNavController(view).navigate(navDirection)
                } catch (e: IllegalArgumentException) {
                    e.printStackTrace();
                }
            }

        });


    }

    override fun performInjection() {
        TripPlannerApplication.tripPlannerAppInstance.appComponent.inject(this)
    }

}