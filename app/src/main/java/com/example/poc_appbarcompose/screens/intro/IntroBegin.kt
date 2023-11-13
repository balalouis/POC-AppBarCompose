package com.example.poc_appbarcompose.screens.intro

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.poc_appbarcompose.R

@Composable
fun IntroBegin(navController: NavController) = IntroCompose(
    navController = navController,
    text = stringResource(id = R.string.intro_begin),
    showBackButton = false
) {
    navController.navigate(IntroNavOption.IntroDetailScreen.name)
}