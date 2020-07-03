package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.esv.tripplanner.R
import com.esv.tripplanner.adapters.PoiVisitPlaceAdapter
import com.esv.tripplanner.databinding.NewRouteFragmentBinding
import com.esv.tripplanner.utils.TypeCasterImpl
import com.esv.tripplanner.viewModels.NewRouteViewModel

class NewRouteFragment : Fragment() {

    private lateinit var viewModel: NewRouteViewModel
    private lateinit var binding: NewRouteFragmentBinding

    private var tripId = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        arguments?.let {
            val args = NewRouteFragmentArgs.fromBundle(it)
            tripId = args.tripId
        }

        viewModel = ViewModelProvider(
            requireActivity()
        ).get(NewRouteViewModel::class.java)

        viewModel.provideTripId(tripId)

        binding = DataBindingUtil.inflate<NewRouteFragmentBinding>(
            inflater,
            R.layout.new_route_fragment,
            container,
            false
        );

        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.placesList.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)


        val adapter =
            PoiVisitPlaceAdapter(
                tripId,
                requireActivity().application,
                arrayListOf(),
                TypeCasterImpl()
            )
        binding.placesList.adapter = adapter
        viewModel.tripVisitPlacesRelations.observe(viewLifecycleOwner, Observer {
            it?.let {
                if (it.isNotEmpty())
                    adapter.setPlaces(it.first().pointOfInterestVisitPlanList)
            }

        })


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

}