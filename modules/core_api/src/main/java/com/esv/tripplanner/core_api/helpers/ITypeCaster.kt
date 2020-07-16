package com.esv.tripplanner.core_api.helpers

import java.util.*

interface ITypeCaster {

    fun GetString(o: Any?): String?
    fun GetBoolean(o: Any?): Boolean?
    fun GetInteger(o: Any?): Int?
    fun GetDouble(o: Any?): Double?
    fun GetLong(o: Any?): Long?
    fun GetDate(o: Any?): Date?

}