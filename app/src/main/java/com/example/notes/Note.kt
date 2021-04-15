package com.example.notes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
// creation on table
@Entity(tableName = "notes_table")
class Note(@ColumnInfo(name = "text")val text : String,
           ) {
    @PrimaryKey(autoGenerate = true) var id = 0
    // now  we create dao
    // dao is data access object
    // sql quries perform in dao

}