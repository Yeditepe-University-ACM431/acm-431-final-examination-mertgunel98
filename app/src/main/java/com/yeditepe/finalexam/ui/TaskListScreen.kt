package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.viewmodel.TaskViewModel

@Composable
fun TaskListScreen(viewModel: TaskViewModel = viewModel()) {

    onTaskClick: (Int) -> Unit
    ) {
        val tasks by viewModel.tasks.collectAsState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(00xFFFFFBFE))
        ) {

            Text(
                text = "Task List",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF222222),
                modifier = Modifier.padding(16.dp)
            )

            LazyColumn {
                items(tasks { task->
                   TaskItem(task = task, onClick = { onTaskClick(task.id) })
                }
            }
        }
    }
@Composable
fun TaskRow(task: Task, navController: NavController) {

}
    Text(
        text = task.title,
        modifier = Modifier.clickable {
            fun TaskItem(task: Task, onClick: () -> Unit) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { onClick() },
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFBFE))
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {

                        Text(
                            text = task.title,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFD0BCFF)
                        )
                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = task.description,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(0xFFD0BCFF)),
                            maxLines = 2
                        )
                    }
                }
        }
    )
}
