package com.esv.tripplanner.core.di

import com.esv.tripplanner.core.helpers.IDateProcessor
import com.esv.tripplanner.core.helpers.ITypeCaster
import com.esv.tripplanner.entities.PointOfInterest

interface IUtilsProvider {
    @EmptyPoi
    fun provideEmptyPoi(): PointOfInterest
    fun getDateProcessor(): IDateProcessor
    fun getTypeCaster(): ITypeCaster
}