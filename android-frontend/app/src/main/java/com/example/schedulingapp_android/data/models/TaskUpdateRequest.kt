package com.example.schedulingapp_android.data.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.sql.Timestamp

data class TaskUpdateRequest(
    val userId: Int,
    val taskId: Int,
    val title: String,
    val description: String,
    @SerializedName("due_date") val dueDate: Timestamp?,
    @SerializedName("task_status") val taskStatus: String
) : Serializable
