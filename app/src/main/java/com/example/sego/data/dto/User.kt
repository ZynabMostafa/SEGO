package com.example.sego.data.dto

data class User(
    val country: String,
    val created_at: String,
    val email: String,
    val email_verified_at: Any,
    val id: Int,
    val image: String,
    val name: String,
    val phone: String,
    val updated_at: String
)