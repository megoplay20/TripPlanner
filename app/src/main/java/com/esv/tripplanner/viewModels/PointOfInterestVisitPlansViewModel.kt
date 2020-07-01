package com.esv.tripplanner.viewModels

import androidx.databinding.Bindable
import com.esv.tripplanner.BR
import com.esv.tripplanner.entities.PointOfInterestVisitPlan
import com.esv.tripplanner.helpers.ObservableViewModel
import com.esv.tripplanner.repositories.ITripRepository
import com.esv.tripplanner.utils.ITypeCaster

class PointOfInterestVisitPlansViewModel(): PointOfInterestViewModel(){

    @get:Bindable
    lateinit var poiVisitPlan: PointOfInterestVisitPlan;

    fun initVisitPlansViewModel(poiVisitPlan: PointOfInterestVisitPlan, typeCaster: ITypeCaster, repository: ITripRepository)  {
        this.poiVisitPlan = poiVisitPlan
        super.initPointOfInterestViewModel(repository.getPointOfInterestById(poiVisitPlan.pointOfInterestId), typeCaster)
    }


    fun addNewPoi(){

    }

    fun saveVisitPlan(){

    }

    fun cancel(){

    }

}