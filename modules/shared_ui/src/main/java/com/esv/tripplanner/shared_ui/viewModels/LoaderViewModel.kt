package com.esv.tripplanner.shared_ui.viewModels;

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.util.TypedValue
import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.viewModelScope
import com.esv.tripplanner.core_api.helpers.ObservableViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.internal.wait

class LoaderViewModel : ObservableViewModel() {
    @get:Bindable
    var alphaChannel = 1.0f
        set(visible) {
            field = visible
            notifyChange()
        }

    fun setVisibility(state: Boolean){
        visible = if(state){
            View.VISIBLE
        }else{
            View.GONE
        }
    }

    fun toggleVisibility(){
        visible = if(visible == View.GONE){
            View.VISIBLE
        }else{
            View.GONE
        }
    }


    fun executeLongOperation( codeBlock: suspend ()-> Unit ){
        viewModelScope.launch {
            setVisibility(true)
            codeBlock()
            setVisibility(false)
        }
    }


    @get:Bindable
    var visible = View.GONE
        set(visible) {
            field = visible
            notifyChange()
        }
}
