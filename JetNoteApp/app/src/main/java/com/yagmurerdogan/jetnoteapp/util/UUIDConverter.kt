package com.yagmurerdogan.jetnoteapp.util

import androidx.room.TypeConverter
import java.util.*

class UUIDConverter {

    @TypeConverter
    fun fromUUID(uuid: UUID): String? {
        return uuid.toString()
    }

    @TypeConverter
    fun uuisFromString(string: String): UUID? {
        return UUID.fromString(string)
    }
}