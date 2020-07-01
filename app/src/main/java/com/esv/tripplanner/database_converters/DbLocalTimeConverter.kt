package com.esv.tripplanner.database_converters

import androidx.room.TypeConverter
import com.esv.tripplanner.helpers.TimeHolder
import java.time.LocalTime
import java.util.*

class DbLocalTimeConverter {

    @TypeConverter
    fun convertDateToString(date: TimeHolder?): String? {
            return date?.toString()
    }

    @TypeConverter
    fun convertLongToDate(timeString: String?): TimeHolder? {
            return TimeHolder.fromString(timeString)
    }

}