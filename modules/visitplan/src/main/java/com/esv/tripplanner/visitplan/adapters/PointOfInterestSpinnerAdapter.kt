package com.esv.tripplanner.visitplan.adapters

import android.app.Application
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.core.data.repositories.ITripRepository
import com.esv.tripplanner.core.helpers.ITypeCaster
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.shared_ui.viewModels.PointOfInterestViewModel
import com.esv.tripplanner.visitplan.R
import com.esv.tripplanner.visitplan.databinding.PointOfInterestLayoutBinding


class PointOfInterestSpinnerAdapter(
    val app: Application, layoutId: Int,
    private var pointOfInterestList: MutableList<PointOfInterest>,
    private var typeCaster: ITypeCaster,
    val repository: ITripRepository,
    val navigator: INavigationProvider
) :

    ArrayAdapter<PointOfInterest>(app.applicationContext, layoutId, pointOfInterestList) {
    fun setPoints(pointOfInterestList:MutableList<PointOfInterest>){
        this.pointOfInterestList.clear();
        this.pointOfInterestList.addAll(pointOfInterestList)
        this.notifyDataSetChanged();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return getCustomView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return getCustomView(position, convertView, parent)
    }

    private fun getCustomView(position: Int, convertView: View?, parent: ViewGroup): View{
        val binding = DataBindingUtil.inflate<PointOfInterestLayoutBinding>(
            LayoutInflater.from(parent.context),
            R.layout.point_of_interest_layout,
            parent,
            false
        )
        binding.viewModel = PointOfInterestViewModel(
            app,
            repository,
            navigator
        )
            .apply { initPointOfInterestViewModel(pointOfInterestList[position], typeCaster) }
        return binding.root
    }

}