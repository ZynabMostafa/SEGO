package com.example.sego.data.dto

data class LoginResponseDto(
    val authorisation: Authorisation,
    val status: String,
    val user: User
)