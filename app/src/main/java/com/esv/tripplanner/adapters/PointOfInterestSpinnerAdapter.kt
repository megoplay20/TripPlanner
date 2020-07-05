package com.esv.tripplanner.adapters

import android.app.Application
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.esv.tripplanner.R
import com.esv.tripplanner.database.TripDatabase
import com.esv.tripplanner.databinding.PointOfInterestLayoutBinding
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.utils.ITypeCaster
import com.esv.tripplanner.viewModels.PointOfInterestViewModel


class PointOfInterestSpinnerAdapter (val app: Application, layoutId:Int,
                                     private var pointOfInterestList:MutableList<PointOfInterest>,
                                     private var typeCaster: ITypeCaster,
                                     val repository: ITripRepository) :

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
        binding.viewModel = PointOfInterestViewModel(app,repository).apply { initPointOfInterestViewModel(pointOfInterestList[position], typeCaster) }
        return binding.root
    }

}