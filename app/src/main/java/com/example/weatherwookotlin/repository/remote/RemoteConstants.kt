package com.example.weatherwookotlin.repository.remote

object RemoteConstants {
    const val BASE_URL = "https://api.darksky.net"
    const val WEATHER_PATH = "/forecast/{apiKey}/{longitude},{latitude}?exclude=[minutely,alerts,flags]"
    const val API_KEY = "88089289b38af1fccc17e0fd5818ae00"
}