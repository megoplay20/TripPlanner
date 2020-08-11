package com.esv.tripplanner.application

import com.esv.tripplanner.core_api.repositories.ITripRepository
import com.esv.tripplanner.newroute.fragments.NewRouteFragment

// https://proandroiddev.com/testing-dagger-fragments-with-fragmentscenario-155b6ad18747
class StubNewRouteFragment: NewRouteFragment() {
    override fun performInjection() {
        super.performInjection()
        this.repository = stubRepo!!
    }

    companion object{
        var stubRepo: ITripRepository? = null
    }
}