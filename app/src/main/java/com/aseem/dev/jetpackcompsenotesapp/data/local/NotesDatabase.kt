package com.aseem.dev.jetpackcompsenotesapp.data.local

import androidx.room.Database
import androidx.room.TypeConverters
import com.aseem.dev.jetpackcompsenotesapp.data.local.entites.Note

@Database(
    entities = [Note::class],
    version = 1,
)
@TypeConverters(Converters::class)
abstract class NotesDatabase {
    abstract fun noteDao(): NoteDao
}