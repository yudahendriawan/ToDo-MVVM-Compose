package com.example.todo_mvvm_compose.navigation

import androidx.navigation.NavController
import com.example.todo_mvvm_compose.util.Action
import com.example.todo_mvvm_compose.util.Constants.LIST_SCREEN

class Screens(navController: NavController) {

    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) {
                inclusive = true
            }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }

}