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
fun NavGraphBuilder.mainNavGraph(drawerState: DrawerState) {
    navigation(
        startDestination = MainNavOption.HomeScreen.name,
        route = NavRoutes.MainRoute.name
    ) {
        composable(MainNavOption.HomeScreen.name) {
            AboutScreen(drawerState)
        }
        composable(MainNavOption.SettingsScreen.name) {
            SettingsScreen(drawerState)
        }
        composable(MainNavOption.AboutScreen.name) {
            HomeScreen(drawerState)
        }
    }
}

enum class MainNavOption {
    AboutScreen,
    SettingsScreen,
    HomeScreen
}