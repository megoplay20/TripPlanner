package com.esv.tripplanner.loadroute.fragments

import com.esv.tripplanner.core_api.di.AppWithFacade
import com.esv.tripplanner.core_api.ui.InjectableFragment
import com.esv.tripplanner.loadroute.di.LoadRouteComponent

class LoadRouteFragment : InjectableFragment() {

    override fun performInjection() {
        LoadRouteComponent.createComponent((requireActivity().application as AppWithFacade)
            .getProvidersFacade())
            .inject(this)
    }
}