package com.esv.tripplanner.navigation

import android.os.Bundle
import com.esv.tripplanner.core.navigation.IArgumentsProvider
import com.esv.tripplanner.fragments.NewRouteFragmentArgs
import javax.inject.Inject

class ArgumentProvider @Inject constructor(): IArgumentsProvider {
    override fun getTripIdFromArgs(arguments: Bundle?): Int {
        return arguments?.let {
            val args = NewRouteFragmentArgs.fromBundle(it)
            args.tripId
        } ?: -1
    }
}