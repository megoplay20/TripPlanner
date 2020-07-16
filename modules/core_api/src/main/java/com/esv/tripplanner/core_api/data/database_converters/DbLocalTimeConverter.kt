package com.esv.tripplanner.core_api.data.database_converters

import androidx.room.TypeConverter
import com.esv.tripplanner.core_api.helpers.TimeHolder

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