package com.esv.tripplanner.di

import com.esv.tripplanner.TripPlannerMainActivity
import com.esv.tripplanner.core.di.ProvidersFacade
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ProvidersFacade::class]
)
interface MainActivityComponent {

    companion object {
        fun createComponent(providersFacade: ProvidersFacade): MainActivityComponent {
                return DaggerMainActivityComponent.builder().providersFacade(providersFacade).build();
        }
    }

    fun inject(act: TripPlannerMainActivity)

}