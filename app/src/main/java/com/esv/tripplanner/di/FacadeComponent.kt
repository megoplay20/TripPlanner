package com.esv.tripplanner.di

import android.app.Application
import com.esv.tripplanner.core.di.IAppProvider
import com.esv.tripplanner.core.di.IDatabaseProvider
import com.esv.tripplanner.core.di.IUtilsProvider
import com.esv.tripplanner.core.di.ProvidersFacade
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(dependencies = [IAppProvider::class, IDatabaseProvider::class, IUtilsProvider::class], modules = [NavigatorModule::class])
interface FacadeComponent: ProvidersFacade {

    companion object{
        fun createComponent(application: Application): FacadeComponent{
            return DaggerFacadeComponent.builder()
                .iAppProvider(AppComponent.createComponent(application))
                .iDatabaseProvider(DatabaseComponent.createComponent(AppComponent.createComponent(application)))
                .iUtilsProvider(AppComponent.createComponent(application))
                .build()
        }

    }

}