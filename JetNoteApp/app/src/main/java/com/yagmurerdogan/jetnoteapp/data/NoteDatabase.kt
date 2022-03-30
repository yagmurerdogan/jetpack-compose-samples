package com.yagmurerdogan.jetnoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.yagmurerdogan.jetnoteapp.model.Note
import com.yagmurerdogan.jetnoteapp.util.DateConverter
import com.yagmurerdogan.jetnoteapp.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}