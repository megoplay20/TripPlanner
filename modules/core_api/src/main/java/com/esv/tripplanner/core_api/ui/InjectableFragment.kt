package com.esv.tripplanner.core_api.ui

import android.os.Bundle
import androidx.fragment.app.Fragment

open class InjectableFragment: Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.performInjection();
    }


    open fun performInjection(){
    }
}