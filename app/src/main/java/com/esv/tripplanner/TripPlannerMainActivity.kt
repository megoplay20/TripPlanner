package com.esv.tripplanner

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.esv.tripplanner.core.di.AppWithFacade
import com.esv.tripplanner.core.navigation.INavigationProvider
import com.esv.tripplanner.databinding.ActivityMainBinding
import com.esv.tripplanner.di.MainActivityComponent
import com.esv.tripplanner.core.ui.IBackPressAwareFragment
import com.esv.tripplanner.viewModels.NavigationViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class TripPlannerMainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigator: INavigationProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentView =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val viewModel: NavigationViewModel by viewModels()
        contentView.viewModel = viewModel
        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setDisplayShowTitleEnabled(false)
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeButtonEnabled(true)
        }
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
        viewModel.setBottomNavigation(false);
        performInjection()
    }


    override fun onSupportNavigateUp(): Boolean {
        sendFragmentsUserActionEvents {
            if (it is IBackPressAwareFragment) {
                (it as IBackPressAwareFragment).onSupportNavigateUpTriggered()
            }
        }
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        return (NavigationUI.navigateUp(navController, null)
                || super.onSupportNavigateUp())
    }

    override fun onBackPressed() {
        sendFragmentsUserActionEvents {
            if (it is IBackPressAwareFragment) {
                (it as IBackPressAwareFragment).onBackPressedTriggered()
            }
        }
        super.onBackPressed()
    }


    override fun onPause() {
        super.onPause()
        navigator.unbind()
    }

    override fun onResume() {
        super.onResume()
        navigator.bind(Navigation.findNavController(this, R.id.nav_host_fragment))
    }

    private fun sendFragmentsUserActionEvents(callFragmentFnc: (Fragment) -> Unit) {
        supportFragmentManager.fragments.forEach { fragment ->
            if (fragment is NavHostFragment) {
                fragment.getChildFragmentManager().fragments.forEach { childFragment ->
                    callFragmentFnc(childFragment)
                }
            }
        }
    }



    private fun performInjection() {
        MainActivityComponent.createComponent((application as AppWithFacade)
            .getProvidersFacade())
            .inject(this);
    }

}
