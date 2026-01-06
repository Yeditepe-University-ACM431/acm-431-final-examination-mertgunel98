package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        suspend fun getTaskByIds(taskIds: List<String>): Result<List<Task>> {
            if (TaskIds.isEmpty()) {
                Log.d(TAG, "No task IDs provided or empty")
        return TODO("Provide the return value")
    }
}
