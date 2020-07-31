package com.esv.tripplanner.newroute.di

import com.esv.tripplanner.core_api.di.INetworkProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [com.esv.tripplanner.core_api.di.ProvidersFacade::class, INetworkProvider::class]
)
interface NewRouteComponent {
    companion object {
        fun createComponent(providersFacade: com.esv.tripplanner.core_api.di.ProvidersFacade, network: INetworkProvider): NewRouteComponent {
            return DaggerNewRouteComponent.builder().providersFacade(providersFacade)
                .iNetworkProvider(network)
                .build();
        }
    }

    fun inject(fragment: com.esv.tripplanner.newroute.fragments.NewRouteFragment)
}