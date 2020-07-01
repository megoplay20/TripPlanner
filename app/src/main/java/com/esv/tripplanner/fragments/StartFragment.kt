package com.esv.tripplanner.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.esv.tripplanner.R
import com.esv.tripplanner.databinding.StartFragmentBinding
import com.esv.tripplanner.viewModels.StartFragmentViewModel

class StartFragment : Fragment() {


    private val viewModel: StartFragmentViewModel by activityViewModels()

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

}