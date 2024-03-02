package com.example.sego.presentation.authintication.login

import com.example.sego.data.dto.User
import com.example.sego.domain.model.loginResponse

data class LoginState(
    val error: String = "",
    val value: User =  User(
            "", "", "", "", 0, "", "", "", ""
        )
    , val isLoading: Boolean = false
)
