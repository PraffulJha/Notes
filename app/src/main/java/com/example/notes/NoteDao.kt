package com.example.notes

import androidx.lifecycle.LiveData
import androidx.room.*
// creation on dao
@Dao
interface NoteDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note : Note) // call this function from background thread / other fun but not from main fun
    @Delete
    suspend fun delete(note: Note)
    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes(): LiveData<List<Note>>
}