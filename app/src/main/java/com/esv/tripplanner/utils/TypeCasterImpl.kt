package com.esv.tripplanner.utils

import java.util.*
import javax.inject.Inject

class TypeCasterImpl @Inject constructor(): ITypeCaster{
    override fun GetString(o: Any?): String? {
        return o?.toString()
    }

    override fun GetBoolean(o: Any?): Boolean? {
        return if (o == null) null else try {
            if (o !is String) {
                (o as Boolean)
            } else java.lang.Boolean.parseBoolean(o.toString())
        } catch (e: Exception) {
            null
        }
    }

    override fun GetInteger(o: Any?): Int? {
        return if (o == null) null else try {
            (o as? String)?.toString()?.toInt() ?: (o as Number).toInt()
        } catch (e: Exception) {
            null
        }
    }

    override fun GetDouble(o: Any?): Double? {
        return if (o == null) null else try {
            (o as? String)?.toString()?.toDouble() ?: (o as Number).toDouble()
        } catch (e: Exception) {
            null
        }
    }

    override fun GetLong(o: Any?): Long? {
        return if (o == null) {
            null
        } else try {
            (o as? String)?.toString()?.toLong() ?: (o as Number).toLong()
        } catch (e: Exception) {
            null
        }
    }

    override fun GetDate(o: Any?): Date? {
        if (o == null) return Date()
        if (o is Date) return o
        val longDate = GetLong(o)
        return longDate?.let { Date(it) } ?: Date()
    }
}