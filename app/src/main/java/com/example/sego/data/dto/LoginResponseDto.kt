package com.example.sego.data.dto

import com.google.gson.annotations.SerializedName

data class LoginResponseDto(
    @SerializedName("authorisation")
    val authorisation: Authorisation,
    @SerializedName("status")
    val status: String,
    @SerializedName("user")
    val user: User
)