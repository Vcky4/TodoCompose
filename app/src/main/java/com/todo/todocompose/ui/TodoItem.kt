package com.todo.todocompose.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.todo.todocompose.Title
import com.todo.todocompose.ui.database.AppViewModel
import com.todo.todocompose.ui.database.TodoData

@Composable
fun FullScreen(){
    Box(modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
        
    }
}

@Composable
fun todoItem(
    title:String) {

    Card(
        modifier = Modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Title(text = title, size = 16)
            val isChecked = remember { mutableStateOf(false) }

            Checkbox(
                checked = isChecked.value,
                onCheckedChange = {
                    isChecked.value = it
                }

                )
        }
    }
}


@Preview
@Composable
fun todo() {
    todoItem(title = "eat fried rice today ")
}