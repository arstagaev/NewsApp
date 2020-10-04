package com.revolve44.newsapp1.db

import androidx.room.TypeConverter
import com.revolve44.newsapp1.models.Source


class Converters {
    @TypeConverter
    fun fromSource(source: Source): String{
       return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}