package com.example.sego

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.example.sego.navigation.MainScreenRouts
import com.example.sego.presentation.mainScreen.MainSCreen
import com.example.sego.presentation.wellcomScreen.SplashViewModel
import com.example.sego.ui.theme.SEGOTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().setKeepOnScreenCondition {
         !splashViewModel.isLoading.value

        }
        setContent {
            SEGOTheme {
                // A surface container using the 'background' color from the theme


                    val screen = splashViewModel.startDestination.value
                    MainSCreen(startDestination = screen)
                }
            }
        }
    }

