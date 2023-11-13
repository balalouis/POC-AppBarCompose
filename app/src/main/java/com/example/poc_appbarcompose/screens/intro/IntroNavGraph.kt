package com.example.poc_appbarcompose.screens.intro

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.poc_appbarcompose.NavRoutes

fun NavGraphBuilder.introNavGraph(navController: NavController) {
    navigation(
        startDestination = IntroNavOption.IntroBeginScreen.name,
        route = NavRoutes.IntroRoute.name
    ) {
        composable(IntroNavOption.IntroBeginScreen.name) {
            IntroBegin(navController = navController)
        }
        composable(IntroNavOption.IntroDetailScreen.name) {
            IntroDetail(navController = navController)
        }
        composable(IntroNavOption.IntroEndScreen.name) {
            IntroEnd(navController = navController)
        }
    }
}

enum class IntroNavOption {
    IntroBeginScreen,
    IntroDetailScreen,
    IntroEndScreen
}