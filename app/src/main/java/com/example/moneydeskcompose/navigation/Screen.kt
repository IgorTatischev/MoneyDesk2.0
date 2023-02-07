package com.example.moneydeskcompose.navigation

sealed class Screen(val route: String) {
    object Main: Screen("main_screen")
    object Add: Screen("add_screen")
    //TODO other Screens auth etc.
}