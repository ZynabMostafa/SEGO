package com.example.sego.domain.reposatory.remot

import com.example.sego.data.dto.UserRequest
import com.example.sego.data.dto.LoginResponseDto
import com.example.sego.utils.Resource


interface RemoteRepository {

suspend fun login(
    userRequest: UserRequest
):Resource<LoginResponseDto,String>
}