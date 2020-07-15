package com.esv.tripplanner.application

import android.app.Application
import com.esv.tripplanner.core.di.AppWithFacade
import com.esv.tripplanner.core.di.ProvidersFacade
import com.esv.tripplanner.di.AppComponent
import com.esv.tripplanner.di.FacadeComponent

open class TripPlannerApplication : Application(), AppWithFacade {

    lateinit var appComponent: AppComponent
    lateinit var facadeComponent: FacadeComponent

    companion object{
        lateinit var tripPlannerAppInstance: TripPlannerApplication
    }

    override fun onCreate() {
        super.onCreate()
        tripPlannerAppInstance = this
        this.createAppComponent()
        facadeComponent = FacadeComponent.createComponent(this)
    }

    private fun createAppComponent(){
            this.appComponent  = AppComponent.createComponent(this);
    }

    override fun getProvidersFacade(): ProvidersFacade {
        return facadeComponent
    }

}