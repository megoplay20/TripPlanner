package com.esv.tripplanner.core_api.data.database_converters

import androidx.room.TypeConverter
import java.util.*

class DbDateConverter {

    @TypeConverter
    fun convertDateToLong(date: Date?): Long? {
            return date?.time
    }

    @TypeConverter
    fun convertLongToDate(dateAsLong: Long?): Date? {
        return dateAsLong?.let {
            return Date(it)
        }
    }

}