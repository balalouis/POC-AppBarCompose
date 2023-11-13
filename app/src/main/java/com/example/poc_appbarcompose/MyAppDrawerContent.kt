package com.example.poc_appbarcompose

import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.example.poc_appbarcompose.screens.main.AppDrawerItemInfo


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun <T : Enum<T>> AppDrawerContent(
    drawerState: DrawerState,
    menuItems: List<AppDrawerItemInfo<T>>,
    defaultPick: T,
    onClick: (T) -> Unit
) {

}