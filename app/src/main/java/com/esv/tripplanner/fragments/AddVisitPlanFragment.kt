package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.esv.tripplanner.R
import com.esv.tripplanner.databinding.AddOrEditPointOfInterestVisitPlansBinding
import com.esv.tripplanner.databinding.StartFragmentBinding
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.repositories.MockTripRepository
import com.esv.tripplanner.utils.TypeCasterImpl
import com.esv.tripplanner.viewModels.NewRouteViewModel
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel
import com.esv.tripplanner.viewModels.StartFragmentViewModel

class AddVisitPlanFragment: Fragment() {

    private val viewModel: PointOfInterestVisitPlansViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<AddOrEditPointOfInterestVisitPlansBinding>(
            inflater,
            R.layout.add_or_edit_point_of_interest_visit_plans,
            container,
            false
        );

        viewModel.initVisitPlansViewModel(
            PointOfInterestVisitPlan(-5, 5.0, true),
            TypeCasterImpl(),
            MockTripRepository())

        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root
    }


}