package com.example.sego.domain.reposatory

import com.example.sego.data.dto.UserRequest
import com.example.sego.domain.model.LoginResponse
import com.example.sego.utils.Resource


interface Repository {

suspend fun login(
    userRequest: UserRequest
):Resource<LoginResponse>

}