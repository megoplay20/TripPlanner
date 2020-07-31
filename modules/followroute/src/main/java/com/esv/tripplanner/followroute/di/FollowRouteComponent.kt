package com.esv.tripplanner.followroute.di

import com.esv.tripplanner.core_api.di.INetworkProvider
import com.esv.tripplanner.followroute.fragments.FollowRouteFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [com.esv.tripplanner.core_api.di.ProvidersFacade::class]
)
interface FollowRouteComponent {
    companion object {
        fun createComponent(providersFacade: com.esv.tripplanner.core_api.di.ProvidersFacade): FollowRouteComponent {
            return DaggerFollowRouteComponent.builder().providersFacade(providersFacade)
                .build();
        }
    }

    fun inject(fragment: FollowRouteFragment)
}