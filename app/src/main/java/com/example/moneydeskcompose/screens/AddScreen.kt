package com.example.moneydeskcompose.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun AddScreen(navHostController: NavHostController) {

}

@Composable
@Preview(showBackground = true)
fun AddScreenPreview(){
    AddScreen(navHostController = rememberNavController())
}