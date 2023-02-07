package com.example.moneydeskcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moneydeskcompose.AddScreen
import com.example.moneydeskcompose.MainScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Main.route){
        composable(route = Screen.Main.route) { MainScreen(navHostController = navController) }
        composable(route = Screen.Add.route) { AddScreen(navHostController = navController) }
    }
}