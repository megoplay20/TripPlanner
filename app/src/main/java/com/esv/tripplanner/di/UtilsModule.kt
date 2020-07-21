package com.esv.tripplanner.di

import android.app.Application
import android.content.Context
import com.esv.tripplanner.entities.Location
import com.esv.tripplanner.entities.PointOfInterest
import com.esv.tripplanner.helpers.TimeSpan
import com.esv.tripplanner.utils.DateProcessorImpl
import com.esv.tripplanner.utils.IDateProcessor
import com.esv.tripplanner.utils.ITypeCaster
import com.esv.tripplanner.utils.TypeCasterImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class EmptyPoi

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class RuDateFormat

@Module(includes = [UtilsModule.UtilsBinds::class])
class UtilsModule {

    @Provides
    @EmptyPoi
    fun getEmptyPoi():PointOfInterest{
        return PointOfInterest("", "", Location(0.0,0.0),
            TimeSpan()
        )
    }

    @Provides
    @RuDateFormat
    fun getDateFormat(): String{
        return "dd.MM.yyyy"
    }

    @Module
    abstract class UtilsBinds{
        @Singleton
        @Binds
        abstract fun getTypeCaster(caster: TypeCasterImpl):ITypeCaster

        @Singleton
        @Binds
        abstract fun getDateProcessor(dateProcessor: DateProcessorImpl):IDateProcessor
    }

}