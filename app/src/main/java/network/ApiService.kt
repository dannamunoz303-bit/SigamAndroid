package com.example.ssigam.network

import com.example.ssigam.network.models.LoginRequest
import com.example.ssigam.network.models.LoginResponse
import com.example.ssigam.network.models.RegisterRequest
import com.example.ssigam.network.models.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("login/")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @POST("api/register/registro/")
    suspend fun register(@Body request: RegisterRequest): Response<RegisterResponse>
}