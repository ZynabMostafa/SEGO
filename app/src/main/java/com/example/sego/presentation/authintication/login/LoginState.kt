package com.example.sego.presentation.authintication.login

import com.example.sego.domain.model.LoginResponse

data class LoginState(
    val error: String = "",
    val value: LoginResponse? = null
    , var isLoading: Boolean = false,
    var dilogeVisabitlity : Boolean = false,
    var showErrorMesage : Boolean = false
)
