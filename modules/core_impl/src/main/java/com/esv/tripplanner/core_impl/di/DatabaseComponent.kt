package com.esv.tripplanner.core_impl.di

import com.esv.tripplanner.core_api.di.IAppProvider
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    dependencies = [IAppProvider::class],
    modules = [DataModule::class]
)
interface DatabaseComponent : com.esv.tripplanner.core_api.di.IDatabaseProvider {

    companion object{
        fun createComponent(app: IAppProvider): DatabaseComponent {
            return DaggerDatabaseComponent.builder().iAppProvider(app).build()
        }
    }

}