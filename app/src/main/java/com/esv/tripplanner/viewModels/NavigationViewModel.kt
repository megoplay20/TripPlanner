package com.esv.tripplanner.viewModels

import android.app.Application
import android.view.View
import androidx.databinding.Bindable
import com.esv.tripplanner.BR
import com.esv.tripplanner.helpers.AndroidObservableViewModel
import kotlinx.android.synthetic.main.content_main.view.*

class NavigationViewModel(app: Application): AndroidObservableViewModel(app){

    @get:Bindable
    var showBottomNavigation: Int = View.GONE
        set(value) {
            field = value
            notifyPropertyChanged(BR.showBottomNavigation)
        }



    fun setBottomNavigation(show:Boolean){
        if(show){
                    showBottomNavigation = View.VISIBLE
            }else{
                showBottomNavigation  = View.GONE
            }
    }
}