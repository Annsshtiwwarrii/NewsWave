package com.example.newswave.ui.db

import androidx.room.TypeConverter
import com.example.newswave.ui.models.Source

class Convertors {
    @TypeConverter
    fun fromSource(source: Source) : String{
        return source.name
    }
    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name,name)
    }
}