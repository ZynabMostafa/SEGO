package com.example.sego.data.remote

import com.example.sego.data.dto.UserRequest
import com.example.sego.data.dto.LoginResponseDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
@POST("login")
suspend fun login(@Body userRequest: UserRequest):Response<LoginResponseDto>


}