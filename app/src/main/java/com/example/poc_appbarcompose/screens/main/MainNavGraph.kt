package com.example.poc_appbarcompose.screens.main

import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.poc_appbarcompose.NavRoutes

@OptIn(ExperimentalMaterial3Api::class)
fun NavGraphBuilder.mainNavGraph(drawerState: DrawerState, navController: NavController) {
    navigation(
        startDestination = MainNavOption.HomeScreen.name,
        route = NavRoutes.MainRoute.name
    ) {
        composable(MainNavOption.HomeScreen.name) {
            AboutScreen(navController = navController)
        }
        composable(MainNavOption.SettingsScreen.name) {
            SettingsScreen(navController = navController)
        }
        composable(MainNavOption.AboutScreen.name) {
            HomeScreen(navController = navController)
        }
    }
}

enum class MainNavOption {
    AboutScreen,
    SettingsScreen,
    HomeScreen
}