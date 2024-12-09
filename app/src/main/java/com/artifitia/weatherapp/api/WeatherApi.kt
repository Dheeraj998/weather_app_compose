package com.artifitia.weatherapp.api

import com.artifitia.weatherapp.api.WeatherModel.WeatherModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("/v1/current.json")
    suspend fun getWeather(
        @Query("key") apiKey: String,
        @Query("q") city: String
    ):Response<WeatherModel>
}