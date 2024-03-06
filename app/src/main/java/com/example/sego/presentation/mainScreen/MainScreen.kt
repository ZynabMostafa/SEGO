package com.example.sego.presentation.mainScreen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.sego.presentation.compoasble.TopBar
import com.example.sego.presentation.navigation.MainScreenNavigation
import com.example.sego.presentation.wellcomScreen.SplashViewModel
import javax.inject.Inject


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainSCreen(startDestination:String){


    val navController = rememberNavController()
    Scaffold (
        topBar = {
            TopBar(navController = navController)
        },
        // Bottom navigation
        bottomBar = {
            BottomNavigationBar(navController = navController)
        }
    ) {

        MainScreenNavigation(navController = navController, paddingValues =it ,
            startDestination = startDestination)
    }
}