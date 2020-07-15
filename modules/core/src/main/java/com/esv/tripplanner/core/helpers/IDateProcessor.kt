package com.esv.tripplanner.core.helpers

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

interface IDateProcessor {
     infix fun formatDate(d: Date): String
     infix fun parseDate(d:String):Date?
}