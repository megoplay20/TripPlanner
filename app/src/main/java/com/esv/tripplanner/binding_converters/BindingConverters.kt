package com.esv.tripplanner.binding_converters

import android.widget.EditText
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


}