package com.example.sego.presentation.navigation

import android.content.Context
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.sego.presentation.authintication.login.Login
import com.example.sego.presentation.authintication.signup.company.SignupCompany
import com.example.sego.presentation.authintication.signup.user.SignupUser
import com.example.sego.presentation.mainScreen.ChatScreen
import com.example.sego.presentation.mainScreen.HomeScreen
import com.example.sego.presentation.mainScreen.ProfileScreen
import com.example.sego.presentation.wellcomScreen.WelcomeScreen

@Composable
fun MainScreenNavigation(
    navController: NavHostController,
    startDestination: String,
    paddingValues: PaddingValues
) {
    val context = LocalContext.current

    NavHost(
        navController = navController, startDestination = startDestination
    )
    {
        home(navController, context)
        authentication(navController, context)
        welcome(navController)
    }
}

fun NavGraphBuilder.authentication(navController: NavHostController, context: Context) {
    navigation(
        startDestination = AuthScreenRouts.Login.rout,
        route = Graph.AUTHENTICATION
    ) {
        composable(AuthScreenRouts.Login.rout) {
            Login(context = context, navController = navController)
        }

        composable(AuthScreenRouts.SignUpUser.rout) {
            SignupUser(navController, context)
        }
        composable(AuthScreenRouts.SignUpCompany.rout) {
            SignupCompany(navController, context)
        }
    }
}

fun NavGraphBuilder.home(navController: NavHostController, context: Context) {
    navigation(
        startDestination = MainScreenRouts.Home.rout,
        route = Graph.HOME
    ) {
        composable(MainScreenRouts.Home.rout) {
            HomeScreen(context)
        }

        // route : search
        composable(MainScreenRouts.Chat.rout) {
            ChatScreen(navController)
        }

        // route : profile
        composable(MainScreenRouts.Profile.rout) {
            ProfileScreen(navController)
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.welcome(navController: NavHostController) {
    navigation(
        startDestination = "Wellcome",
        route = Graph.WELCOME
    ) {
        composable(route = "Wellcome") {
            WelcomeScreen(navController = navController)
        }
    }
}
