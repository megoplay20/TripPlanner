package com.esv.tripplanner.network.di

import com.esv.tripplanner.core_api.di.IDatabaseProvider
import com.esv.tripplanner.core_api.di.INetworkProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [IDatabaseProvider::class],
    modules = [NetworkModule::class]
)
interface NetworkComponent : INetworkProvider {
    companion object {
        fun createComponent(dbProvder: IDatabaseProvider): NetworkComponent {
                return DaggerNetworkComponent.builder().iDatabaseProvider(dbProvder).build()
        }
    }
}