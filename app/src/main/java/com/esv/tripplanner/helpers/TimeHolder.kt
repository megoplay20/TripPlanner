package com.esv.tripplanner.helpers

data class TimeHolder(val hour: Int, val minute: Int) {
    companion object {
        fun fromString(value:String?): TimeHolder? {
            return value?.let {
                val splitTime = it.split(":")
                if(splitTime.size > 1) {
                    TimeHolder(
                        Integer.parseInt(splitTime.get(0)),
                        Integer.parseInt(splitTime.get(1))
                    )
                }
                null
            }
        }
        fun getDefaultTimeHolder(): TimeHolder {
            return TimeHolder(0, 0)
        }
    }



    override fun toString(): String {
        return "$hour:$minute"
    }
}