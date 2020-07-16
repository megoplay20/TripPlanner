package com.esv.tripplanner.di

import android.app.Application
import android.content.Context
import com.esv.tripplanner.core_api.data.entities.Location
import com.esv.tripplanner.core_api.data.entities.PointOfInterest
import com.esv.tripplanner.core_api.di.EmptyPoi
import com.esv.tripplanner.core_api.di.RuDateFormat
import com.esv.tripplanner.core_api.helpers.IDateProcessor
import com.esv.tripplanner.core_api.helpers.ITypeCaster
import com.esv.tripplanner.core_api.helpers.TimeSpan
import com.esv.tripplanner.utils.DateProcessorImpl
import com.esv.tripplanner.utils.TypeCasterImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module(includes = [UtilsModule.UtilsBinds::class])
class UtilsModule {


    @Provides
    fun provideContext(app: Application): Context {
            return app.applicationContext
    }


    @Provides
    @EmptyPoi
    fun getEmptyPoi(): PointOfInterest {
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
        abstract fun getTypeCaster(caster: TypeCasterImpl): ITypeCaster

        @Singleton
        @Binds
        abstract fun getDateProcessor(dateProcessor: DateProcessorImpl): IDateProcessor
    }

}