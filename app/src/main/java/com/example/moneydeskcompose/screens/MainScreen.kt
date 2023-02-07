package com.example.moneydeskcompose

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen(navHostController: NavHostController) {
    Text(text = "Main")
}


@Composable
@Preview(showBackground = true)
fun MainScreenPreview(){
    MainScreen(navHostController = rememberNavController())
}