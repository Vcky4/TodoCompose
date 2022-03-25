package com.todo.todocompose.ui.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todos")
data class TodoData(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val done: Boolean,
    val due: Long,
    val start: Long
)