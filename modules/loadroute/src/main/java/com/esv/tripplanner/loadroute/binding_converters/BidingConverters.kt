package com.esv.tripplanner.loadroute.binding_converters

import androidx.databinding.InverseMethod
import com.esv.tripplanner.loadroute.R
import kotlinx.android.synthetic.main.trip_item.view.*

object BindingConverters {


    private const val hourSuffix: String = ", ч"

    @InverseMethod("stringTimeToDouble")
    @JvmStatic
    fun doubleTimeToString(value: Double?): String? {
        return (value ?: 0.0).toString() + hourSuffix
    }

    @JvmStatic
    fun stringTimeToDouble(value: String?): Double? {
        return try {
            value?.removeSuffix(hourSuffix)?.toDouble() ?: 0.0
        } catch (e: Exception) {
            0.0
        }
    }


    @InverseMethod("iconIntResourceToBool")
    @JvmStatic
    fun booleanToIconResource(value: Boolean): Int {
        return if (value) {
            R.drawable.ic_baseline_done_all_24
        } else {
            R.drawable.ic_baseline_report_problem_24
        }
    }

    @JvmStatic
    fun iconIntResourceToBool(value: Int): Boolean {
        return value == R.drawable.ic_baseline_report_problem_24
    }


}