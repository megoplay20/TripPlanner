package com.esv.tripplanner.application

import android.app.Application
import com.esv.tripplanner.core_api.di.AppWithFacade
import com.esv.tripplanner.core_api.di.ProvidersFacade
import com.esv.tripplanner.di.FacadeComponent

open class TripPlannerApplication : Application(), AppWithFacade {

    lateinit var facadeComponent: FacadeComponent

    companion object{
        lateinit var tripPlannerAppInstance: TripPlannerApplication
    }

    override fun onCreate() {
        super.onCreate()
        tripPlannerAppInstance = this
        facadeComponent = FacadeComponent.createComponent(this)
    }


    override fun getProvidersFacade(): com.esv.tripplanner.core_api.di.ProvidersFacade {
        return facadeComponent
    }

}