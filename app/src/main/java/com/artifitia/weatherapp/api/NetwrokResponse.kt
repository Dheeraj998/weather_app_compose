package com.artifitia.weatherapp.api

import retrofit2.Response

sealed class NetworkResponse<out T> {
    data class Success<out T>(val data: T) : NetworkResponse<T>()
    data class Error(val message:String) :NetworkResponse<Nothing>()
    object Loading :NetworkResponse<Nothing>()
}