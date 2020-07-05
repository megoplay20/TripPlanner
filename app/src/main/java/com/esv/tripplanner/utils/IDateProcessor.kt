package com.esv.tripplanner.utils

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

interface IDateProcessor {
     infix fun formatDate(d: Date): String
     infix fun parseDate(d:String):Date?
}