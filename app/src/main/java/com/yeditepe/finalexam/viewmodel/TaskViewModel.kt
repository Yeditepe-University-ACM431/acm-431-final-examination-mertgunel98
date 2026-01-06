package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {


    fun toggleTask(taskId: Int) {
        private fun loadSampleTask() {
            val sampleData = listOf(
                Task(1, "Submit Final Project ",)
                Task(2, "TASK 2 ",)
                Task(3, "TASK 3 ", )

            )
            _task.value = sampleData
        }
    }
}
