package com.esv.tripplanner.application

import android.app.Application
import com.esv.tripplanner.di.AppComponent

open class TripPlannerApplication : Application() {

    lateinit var appComponent: AppComponent

    companion object{
        lateinit var tripPlannerAppInstance: TripPlannerApplication
    }

    override fun onCreate() {
        super.onCreate()
        tripPlannerAppInstance = this
        this.createAppComponent()
    }

    private fun createAppComponent(){
            this.appComponent  = AppComponent.createComponent(this,applicationContext);
    }

}