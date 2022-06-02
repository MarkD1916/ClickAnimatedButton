package com.example.animationbuttonwithnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.animationbuttonwithnavigation.ui.theme.AnimationButtonWithNavigationTheme
import com.example.vocabularytrainer.extantions.navigateEvent
import com.example.vocabularytrainer.navigation.Route
import com.example.vocabularytrainer.presentation.auth.AuthScreen
import com.example.vocabularytrainer.presentation.auth.RegisterScreen
import com.example.vocabularytrainer.presentation.welcome.WelcomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationButtonWithNavigationTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    modifier = Modifier.fillMaxWidth(),
                    scaffoldState = scaffoldState
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Route.WELCOME
                    ) {
                        composable(Route.WELCOME) {
                            WelcomeScreen(onNavigate = navController::navigateEvent)
                        }
                        composable(Route.LOGIN) {
//                            navController.popBackStack()
                            AuthScreen()
                        }
                        composable(Route.REGISTER) {
                            RegisterScreen()
//                            GenderScreen(onNavigate = navController::navigate)
                        }
                    }
                }
            }

        }
    }
}


