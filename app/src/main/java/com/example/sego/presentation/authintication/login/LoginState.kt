package com.example.sego.presentation.authintication.login

import com.example.sego.data.dto.User
import com.example.sego.domain.model.LoginResponse

data class LoginState(
    val error: String = "",
    val value: LoginResponse = LoginResponse(
        user = User(
            country = "",
            createdAt = "",
            email = "",
            emailVerifiedAt = "",
            id = 0,
            image = "",
            name = "",
            phone = "",
            updatedAt = ""
        )
    ), var isLoading: Boolean = false,
    var dilogeVisabitlity : Boolean = false
)
