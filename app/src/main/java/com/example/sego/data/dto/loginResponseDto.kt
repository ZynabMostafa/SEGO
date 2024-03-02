package com.example.sego.data.dto

data class loginResponseDto(
    val authorisation: Authorisation,
    val status: String,
    val user: User
)