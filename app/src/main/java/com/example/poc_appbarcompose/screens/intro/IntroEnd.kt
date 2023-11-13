package com.example.poc_appbarcompose.screens.intro

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.poc_appbarcompose.NavRoutes
import com.example.poc_appbarcompose.R

@Composable
fun IntroEnd(navController: NavController, viewModel: IntroViewModel = hiltViewModel()) =
    IntroCompose(
        navController = navController, text = stringResource(
            id = R.string.intro_end
        )
    ) {
        viewModel.saveUserOnboarding()
        navController.navigate(NavRoutes.MainRoute.name) {
            popUpTo(NavRoutes.IntroRoute.name)
        }
    }