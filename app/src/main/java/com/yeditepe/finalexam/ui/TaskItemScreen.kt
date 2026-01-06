package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskItemScreen() {

    fun TaskItemScreen(
        taskId: Int,
        viewModel: TaskViewModel = viewModel()
        val task = viewModel.getTaskById(taskId)
        ) {
            if (task!= null) {
    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = "Submit Final Project",
            style = MaterialTheme.typography.titleLarge
        )
        else {
        Text("Task not found", modifier = Modifier.padding(16.dp))



        Button(
            onClick = {
                controller.navigate(Destination.TASK_DETAIL.route.replace("{tasklist}", task.taskID))
            }
            }
        ) {
            Text("Change Status")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskItemPreview() {
    TaskItem(
        task = task(1, "Test Task", "Description", 0),
        onClick = {}
    )
}
