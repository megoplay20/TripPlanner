package com.esv.tripplanner.di

import android.app.Application
import com.esv.tripplanner.core.ComponentFactory
import com.esv.tripplanner.core_api.di.IAppProvider
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(dependencies = [IAppProvider::class, com.esv.tripplanner.core_api.di.IDatabaseProvider::class, com.esv.tripplanner.core_api.di.IUtilsProvider::class],
    modules = [NavigatorModule::class])
interface FacadeComponent: com.esv.tripplanner.core_api.di.ProvidersFacade {

    companion object{
        fun createComponent(application: Application): FacadeComponent{
            return DaggerFacadeComponent.builder()
                .iAppProvider(AppComponent.createComponent(application))
                .iDatabaseProvider(ComponentFactory.getDatabaseProvider(AppComponent.createComponent(application)))
                .iUtilsProvider(AppComponent.createComponent(application))
                .build()
        }

    }

}