package com.esv.tripplanner.core_api.di


import com.esv.tripplanner.core_api.data.entities.PointOfInterest
import com.esv.tripplanner.core_api.helpers.IDateProcessor
import com.esv.tripplanner.core_api.helpers.ITypeCaster

interface IUtilsProvider {
    @EmptyPoi
    fun provideEmptyPoi(): PointOfInterest
    fun getDateProcessor(): IDateProcessor
    fun getTypeCaster(): ITypeCaster
}