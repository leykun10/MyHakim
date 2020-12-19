package com.example.myhakim.data.db

import androidx.room.TypeConverter
import com.example.myhakim.data.db.models.Medication
import com.google.gson.Gson
import java.util.*

class Converter {
    @TypeConverter
    fun listToJson(value: List<String>?): String = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<String>::class.java).toList()

    @TypeConverter
    fun medicationListToJson(value: List<Medication>?):String = Gson().toJson(value)

    @TypeConverter
    fun jsonToMedicationList(value: String) = Gson().fromJson(value, Array<Medication>::class.java).toList()

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }


}