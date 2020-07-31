package com.esv.tripplanner.followroute.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.core_api.di.AppWithFacade
import com.esv.tripplanner.core_api.di.IPlanRouteActions
import com.esv.tripplanner.core_api.helpers.IDateProcessor
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.followroute.R
import com.esv.tripplanner.followroute.adapters.FollowPlacesAdapter
import com.esv.tripplanner.followroute.databinding.FollowFragmentBinding
import com.esv.tripplanner.followroute.di.FollowRouteComponent
import com.esv.tripplanner.followroute.viewModels.FollowRouteViewModel
import javax.inject.Inject

class FollowRouteFragment : com.esv.tripplanner.core_api.ui.InjectableFragment() {

    private lateinit var binding: FollowFragmentBinding

    @Inject
    lateinit var repository: com.esv.tripplanner.core_api.repositories.ITripRepository

    @Inject
    lateinit var navComponent: com.esv.tripplanner.core_api.navigation.INavigatorComponentsProvider

    @Inject
    lateinit var typeCaster: ITypeCaster

    private lateinit var viewModel: FollowRouteViewModel

    private var tripId = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tripId = navComponent.provideArguments().getTripIdForFollowRoute(arguments)

        viewModel = ViewModelProvider(
            requireActivity(),
            com.esv.tripplanner.core_api.viewModelFactories.CustomViewModelProviderFactory(
            ) {
                FollowRouteViewModel(
                    requireActivity().application,
                    repository
                )
            }
        ).get(FollowRouteViewModel::class.java)

        viewModel.init(tripId)

        binding = DataBindingUtil.inflate<FollowFragmentBinding>(
            inflater,
            R.layout.follow_fragment,
            container,
            false
        );

        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.placesList.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val adapter =
            FollowPlacesAdapter(
                tripId,
                requireActivity().application,
                arrayListOf(),
                typeCaster,
                repository,
                navComponent.provideNavigator()
            )
        binding.placesList.adapter = adapter
        viewModel.tripRouteRelation.observe(viewLifecycleOwner, Observer {
            it?.let {
                if (it.isNotEmpty())
                    adapter.setPlaces(it.first().route)
            }
        })

    }

    override fun performInjection() {
        val app = (requireActivity().application as AppWithFacade)
        FollowRouteComponent.createComponent(app.getProvidersFacade())
            .inject(this)
    }
}