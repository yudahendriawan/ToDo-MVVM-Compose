package com.example.todo_mvvm_compose.data

import androidx.room.Database
import com.example.todo_mvvm_compose.data.model.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase {

    abstract fun todoDao(): ToDoDao

}