package com.example.sego.data.dto

import com.google.gson.annotations.SerializedName

data class Authorisation(
    @SerializedName("token")
    val token: String,
    @SerializedName("type")
    val type: String
)