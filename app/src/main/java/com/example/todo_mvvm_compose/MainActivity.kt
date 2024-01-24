package com.example.todo_mvvm_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.todo_mvvm_compose.navigation.SetupNavigation
import com.example.todo_mvvm_compose.ui.theme.ToDoMVVMComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    
    private lateinit var navController: NavHostController
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoMVVMComposeTheme {
                navController = rememberNavController()
                SetupNavigation(navController = navController)
            }
        }
    }
}