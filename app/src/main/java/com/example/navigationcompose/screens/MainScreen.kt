package com.example.navigationcompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.components.BottomBar
import com.example.navigationcompose.navigation.AppNavigation
import com.example.navigationcompose.utils.BottomNavData

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Surface{
        Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
            AppNavigation(navController)
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen()
}