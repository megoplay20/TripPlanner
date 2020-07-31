package com.esv.tripplanner.application

import android.app.Application
import com.esv.tripplanner.core.ComponentFactory
import com.esv.tripplanner.core_api.di.AppWithFacade
import com.esv.tripplanner.core_api.di.INetworkProvider
import com.esv.tripplanner.di.AppComponent
import com.esv.tripplanner.di.FacadeComponent
import com.esv.tripplanner.network.di.NetworkComponent

open class TripPlannerApplication : Application(), AppWithFacade {

    lateinit var facadeComponent: FacadeComponent
    lateinit var networkComponent: NetworkComponent

    companion object{
        lateinit var tripPlannerAppInstance: TripPlannerApplication
    }

    override fun onCreate() {
        super.onCreate()
        tripPlannerAppInstance = this
        facadeComponent = FacadeComponent.createComponent(this)
        networkComponent = NetworkComponent.createComponent(
            ComponentFactory.getDatabaseProvider(
                AppComponent.createComponent(this)))

    }

    override fun getProvidersFacade(): com.esv.tripplanner.core_api.di.ProvidersFacade {
        return facadeComponent
    }

    override fun getNetwork(): INetworkProvider {
        return networkComponent
    }

}