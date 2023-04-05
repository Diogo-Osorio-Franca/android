package com.example.myapplication

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BookDAO {
@Insert
suspend fun insertBook(book: Book)

@Query("SELECT @ FROM books_table")
fun getAllBooks(): List<Book>

@Update
suspend fun updateBook(book: Book)

suspend fun deleteBook(book: Book)
}