package com.example.sego.clases

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import com.example.sego.navigation.MainScreenRouts
import com.example.sego.presentation.mainScreen.classes.BottomNavItem

object Contents {
    val BottomNavItems = listOf(
        BottomNavItem(
            label = "Home",
            icon = Icons.Filled.Home,
            route = MainScreenRouts.Home.rout
        ),
        BottomNavItem(
            label = "chat",
            icon = Icons.Filled.Email,
            route = MainScreenRouts.Chat.rout
        ),
        BottomNavItem(
            label = "Profile",
            icon = Icons.Filled.Person,
            route = MainScreenRouts.Profile.rout
        )
    )
}