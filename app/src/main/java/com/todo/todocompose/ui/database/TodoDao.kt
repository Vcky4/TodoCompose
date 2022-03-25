package com.todo.todocompose.ui.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TodoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: TodoData)

    @Query("Select * from todos")
    fun getAllTodo(): LiveData<List<TodoData>>

    @Update
    suspend fun updateTodo(todo: TodoData)

    @Delete
    suspend fun deleteTodo(todo: TodoData)
}