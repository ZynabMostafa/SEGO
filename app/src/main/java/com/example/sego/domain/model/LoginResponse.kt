package com.example.sego.domain.model

import com.example.sego.data.dto.User

data class LoginResponse
    (
    val user: User,
    val status: String,

    )

