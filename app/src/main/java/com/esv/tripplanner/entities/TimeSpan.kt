package com.esv.tripplanner.entities

import com.esv.tripplanner.helpers.TimeHolder
import java.time.LocalTime
import java.util.*

class TimeSpan(var openTime: TimeHolder = TimeHolder(8,0), var closeTime:TimeHolder = TimeHolder(18,0)){}
