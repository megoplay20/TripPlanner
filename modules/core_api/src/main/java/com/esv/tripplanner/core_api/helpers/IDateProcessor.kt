package com.esv.tripplanner.core_api.helpers

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

interface IDateProcessor {
     infix fun formatDate(d: Date): String
     infix fun parseDate(d:String):Date?
}