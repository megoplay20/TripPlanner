package com.esv.tripplanner.core_api.binding_converters


import android.view.View
import androidx.databinding.InverseMethod

object BindingConverters {


    @InverseMethod("stringToDouble")
    @JvmStatic
    fun doubleToString(value: Double?): String? {
        return (value ?: 0.0).toString()
    }

    @JvmStatic
    fun stringToDouble(value: String?): Double? {
        return try {
            value?.toDouble() ?: 0.0
        } catch (e: Exception) {
            0.0
        }
    }

    @JvmStatic
    @InverseMethod("visibilityToBool")
    fun boolToVisibility(value: Boolean): Int {
        return if(value){
            View.VISIBLE}else{View.GONE}
    }

    @JvmStatic
    fun visibilityToBool(value: Int): Boolean {
        return value == View.VISIBLE
    }


}