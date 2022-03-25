package com.todo.todocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import com.todo.todocompose.ui.database.AppViewModel
import com.todo.todocompose.ui.database.TodoData
import com.todo.todocompose.ui.theme.TodoComposeTheme
import android.app.AlertDialog as AlertDialog1

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
    Title(text = "Todo", size = 30)
    Spacer(modifier = Modifier.height(20.dp))
    AddTodoDialog()
    HomeScreen()
}

@Composable
fun AddTodoDialog() {
    AlertDialog(onDismissRequest = { /*TODO*/ },
    title = {Title(text = "Add Todo", size = 20)},
    buttons = { Button(onClick = { /*TODO*/ }){} }
    )
}

@Composable
fun Title(text: String, size: Int){
    Text(text = text,
    modifier = Modifier
        .fillMaxWidth()
        .padding(6.dp),
        style = TextStyle(
            fontSize = size.sp,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun HomeScreen() {
    val viewModel = viewModel(AppViewModel::class.java)
    val state by viewModel.state.collectAsState()
    Scaffold(floatingActionButton = {
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
        }
    }) {
        LazyColumn {
           item
        }
    }
}



/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TodoComposeTheme {
        Column(modifier =  Modifier.fillMaxSize()) {
            MainUi()
        }
    }
}
*/