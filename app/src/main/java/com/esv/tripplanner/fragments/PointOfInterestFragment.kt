package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.esv.tripplanner.R
import com.esv.tripplanner.databinding.AddOrEditPointOfInterestBinding
import com.esv.tripplanner.databinding.AddOrEditPointOfInterestVisitPlansBinding
import com.esv.tripplanner.viewModels.PointOfInterestViewModel
import com.esv.tripplanner.viewModels.PointOfInterestVisitPlansViewModel

class PointOfInterestFragment: Fragment() {

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

        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root
    }

}