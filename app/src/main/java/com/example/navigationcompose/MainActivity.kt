package com.example.navigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.navigation.AppNavigation
import com.example.navigationcompose.screens.MainScreen
import com.example.navigationcompose.ui.theme.NavigationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationComposeTheme {
                val navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                MainScreen(navHostController = navController)
            }
        }
    }
}