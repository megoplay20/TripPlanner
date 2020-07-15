package com.esv.tripplanner.di

import com.esv.tripplanner.core.di.ProvidersFacade
import com.esv.tripplanner.fragments.AddVisitPlanFragment
import com.esv.tripplanner.fragments.NewRouteFragment
import com.esv.tripplanner.fragments.PointOfInterestFragment
import com.esv.tripplanner.fragments.StartFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ProvidersFacade::class]
)
interface AddVisitPlanComponent {
    companion object {
        fun createComponent(providersFacade: ProvidersFacade): AddVisitPlanComponent {
            return DaggerAddVisitPlanComponent.builder().providersFacade(providersFacade).build();
        }
    }

    fun inject(fragment: AddVisitPlanFragment)
}