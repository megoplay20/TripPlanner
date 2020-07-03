package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.SharedElementCallback
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.esv.tripplanner.R
import com.esv.tripplanner.databinding.AddOrEditPointOfInterestBinding
import com.esv.tripplanner.databinding.AddOrEditPointOfInterestVisitPlansBinding
import com.esv.tripplanner.entities.Location
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.helpers.TimeSpan
import com.esv.tripplanner.utils.TypeCasterImpl
import com.esv.tripplanner.viewModels.PointOfInterestViewModel
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel

class PointOfInterestFragment: Fragment(), IBackPressAwareFragment {

    private val viewModel: PointOfInterestViewModel by activityViewModels()

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

        viewModel.initPointOfInterestViewModel(PointOfInterest("", "", Location(0.0,0.0),
            TimeSpan()
        ), TypeCasterImpl())
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


}