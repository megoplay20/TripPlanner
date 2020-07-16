package com.esv.tripplanner.utils

import com.esv.tripplanner.core_api.di.RuDateFormat
import com.esv.tripplanner.core_api.helpers.IDateProcessor
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class DateProcessorImpl @Inject constructor(@RuDateFormat private val dateFormat: String):
    IDateProcessor {

    private val dateProcessor: SimpleDateFormat by lazy { SimpleDateFormat(dateFormat) }

    override fun formatDate(d: Date): String {
        return dateProcessor.format(d)
    }

    override fun parseDate(d: String): Date? {
        try {
            return   dateProcessor.parse(d)
        }catch (e:Exception){
            return null
        }
    }
}