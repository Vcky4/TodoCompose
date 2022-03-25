package com.todo.todocompose.ui.database

import android.app.Application
import androidx.lifecycle.LiveData

class TodoRepository {
    private val db: AppDatabase = AppDatabase.getDataBase(Application())
    private val todoDao: TodoDao = db.todoDao()

    //Fetch All the todos
    val getAllTodos: LiveData<List<TodoData>> = todoDao.getAllTodo()

    // Insert new todos
    suspend fun insertTodo(todo: TodoData) {
        todoDao.insertTodo(todo)
    }

    // update todos
    suspend fun updateTodo(todo: TodoData) {
        todoDao.updateTodo(todo)
    }

    // Delete todos
    suspend fun deleteTodo(todo: TodoData) {
        todoDao.deleteTodo(todo)
    }
}