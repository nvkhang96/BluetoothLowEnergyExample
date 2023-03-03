package com.example.bletutorial.data

data class TempHumidResult(
    val temperature: Float,
    val humidity: Float,
    val connectionState: ConnectionState
)
