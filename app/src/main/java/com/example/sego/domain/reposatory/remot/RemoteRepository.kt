package com.example.sego.domain.reposatory.remot

import com.example.sego.data.dto.UserRequest
import com.example.sego.data.dto.loginResponseDto
import com.example.sego.domain.model.loginResponse
import com.example.sego.utils.Resource
import dagger.Provides
import retrofit2.Response


interface RemoteRepository {

suspend fun login(
    userRequest: UserRequest
):Resource<loginResponseDto,String>
}