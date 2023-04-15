package com.example.sleeptracking

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "TimeLog")
data class TimeLog(
    @PrimaryKey(autoGenerate = true)
val id: Int = 0,
    val startTime: Date,
    val stopTime: Date
)