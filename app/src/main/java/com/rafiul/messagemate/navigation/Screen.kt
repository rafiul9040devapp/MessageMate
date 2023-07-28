package com.rafiul.messagemate.navigation

sealed class Screen(val route: String) {
    object Permission : Screen(route = "permission_screen")
    object Main : Screen(route = "main_screen")
}
