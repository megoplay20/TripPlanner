package com.esv.tripplanner.utils

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class DateProcessor {
    companion object {
        private val dateProcessor: SimpleDateFormat by lazy { SimpleDateFormat("dd.MM.yyyy") }
        infix fun formatDate(d: Date) = dateProcessor.format(d)
        infix fun parseDate(d:String):Date?  {
            try {
                return   dateProcessor.parse(d)
            }catch (e:Exception){
                return null
            }
        }
    }
}