package com.esv.tripplanner.helpers

import java.lang.NumberFormatException

data class TimeHolder(val hour: Int, val minute: Int) {
    companion object {
        fun fromString(value:String?): TimeHolder? {
            return value?.let {
                val splitTime = it.split(":")
                return (if(splitTime.size > 1) {
                    try {
                        TimeHolder(
                            Integer.parseInt(splitTime.get(0)),
                            Integer.parseInt(splitTime.get(1))
                        )
                    }catch (e:NumberFormatException){
                        null
                    }
                } else {
                    null
                })
            }
        }
        fun getDefaultTimeHolder(): TimeHolder {
            return TimeHolder(0, 0)
        }
    }



    override fun toString(): String {
        return "$hour:${if(minute.toString().length == 1){"0"+minute.toString()}else{minute.toString()}}"
    }
}