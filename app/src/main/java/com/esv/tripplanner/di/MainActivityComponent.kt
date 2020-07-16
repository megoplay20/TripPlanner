package com.esv.tripplanner.di

import com.esv.tripplanner.TripPlannerMainActivity
import com.esv.tripplanner.core_api.di.ProvidersFacade
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [com.esv.tripplanner.core_api.di.ProvidersFacade::class]
)
interface MainActivityComponent {

    companion object {
        fun createComponent(providersFacade: com.esv.tripplanner.core_api.di.ProvidersFacade): MainActivityComponent {
                return DaggerMainActivityComponent.builder().providersFacade(providersFacade).build();
        }
    }

    fun inject(act: TripPlannerMainActivity)

}