package com.plcoding.weatherapp.domain.weather

import java.time.LocalDateTime

//will contain a specific data for a given hour
data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelcius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: WeatherType.Companion,
    val weatherType: WeatherType
)
