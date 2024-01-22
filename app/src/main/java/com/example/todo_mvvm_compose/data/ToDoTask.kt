package com.example.todo_mvvm_compose.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey
import com.example.todo_mvvm_compose.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val desc: String,
    val priority: Priority
)
