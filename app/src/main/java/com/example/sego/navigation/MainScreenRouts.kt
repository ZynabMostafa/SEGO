package com.example.sego.navigation

sealed class MainScreenRouts(val rout: String) {
    object Home : MainScreenRouts("home")
    object Chat : MainScreenRouts("chat")
    object Profile : MainScreenRouts("profile")
}
