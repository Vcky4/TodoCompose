package com.todo.todocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import com.todo.todocompose.ui.database.AppViewModel
import com.todo.todocompose.ui.theme.TodoComposeTheme

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: AppViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[AppViewModel::class.java]
        setContent {
            TodoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) { MainUi() }
            }
        }
    }
}

@Composable
fun MainUi() {
    Text(text = "Hello")
}

@Composable
fun AddTodoDialog(){
    AlertDialog(onDismissRequest = { /*TODO*/ },
    title = {Title(text = "Add Todo", size = 20)},
    buttons = { Button(onClick = { /*TODO*/ }){} }
    )
}

@Composable
fun Title(text: String, size: Int){
    Text(text = text,
    modifier = Modifier.fillMaxWidth(),
        style = TextStyle(
            fontSize = size.sp,
            fontWeight = FontWeight.Bold
        )
    )
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TodoComposeTheme {
        MainUi()
    }
}*/
