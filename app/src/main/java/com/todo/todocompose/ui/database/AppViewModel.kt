package com.todo.todocompose.ui.database

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AppViewModel: ViewModel() {

    private val repository = TodoRepository()

    val allDodos = repository.getAllTodos

    fun addTodo(todo: TodoData){
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertTodo(todo)
        }
    }
}