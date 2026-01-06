package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TaskDetailScreen(title: String) {
    recipeId: Int,
    viewModel: TaskViewModel = viewModel()
    ) {

        val task = viewModel.getTaskById(taskId)

        if (task != null) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFFFFBFE))
                    .padding(16.dp)
            ) {

                Text(
                    text = "Task Detail",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFFD0BCFF),
                    modifier = Modifier.padding(bottom = 16.dp)
                )


                Text(
                    text = task.title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFCCC2DC)
                )

                Spacer(modifier = Modifier.height(8.dp))


                Text(
                    text = task.description,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFFCCC2DC)
                )
            }
        }
        else {
            Text("Task not found", modifier = Modifier.padding(16.dp))
        }
    }
