package com.plcoding.weatherapp.domain.weather

data class WeatherInfo(
    val weatherDataperDay: Map<Int, List<WeatherData>>,
    val currentWeatherData : WeatherData?
)
