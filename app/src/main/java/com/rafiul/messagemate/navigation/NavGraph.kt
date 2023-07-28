package com.rafiul.messagemate.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rafiul.messagemate.MainScreen
import com.rafiul.messagemate.PermissionScreen
import com.rafiul.messagemate.components.DisplayToast


@Composable
fun SetUpNaveGraph(
    navController: NavHostController,
    startDestination: String = Screen.Permission.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.Permission.route) {

            PermissionScreen(onPermissionGranted = {
                navController.popBackStack()
                navController.navigate(Screen.Main.route)
            })
        }
        composable(route = Screen.Main.route) {

            MainScreen()
            DisplayToast(message = "This is the content of the received SMS.")
        }

    }

}