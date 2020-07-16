package com.esv.tripplanner.visitplan.di

import com.esv.tripplanner.core_api.di.ProvidersFacade
import com.esv.tripplanner.visitplan.fragments.AddVisitPlanFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [com.esv.tripplanner.core_api.di.ProvidersFacade::class]
)
interface AddVisitPlanComponent {
    companion object {
        fun createComponent(providersFacade: com.esv.tripplanner.core_api.di.ProvidersFacade): AddVisitPlanComponent {
            return DaggerAddVisitPlanComponent.builder().providersFacade(providersFacade).build();
        }
    }

    fun inject(fragment: AddVisitPlanFragment)
}