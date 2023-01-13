package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationcompose.navigation.graphs.authNavigation
import com.example.navigationcompose.navigation.graphs.mainNavigation
import com.example.navigationcompose.navigation.graphs.startNavigation
import com.example.navigationcompose.screens.start.WelcomeScreen

// For whole app navigation
@Composable
fun AppNavigation(navHostController: NavHostController) {
    NavHost(
        route = Graph.ROOT,
        navController = navHostController,
        startDestination = Graph.START
    ) {
        startNavigation(navHostController)
        authNavigation(navHostController)
        mainNavigation(navHostController)
    }
}

object Graph {
    const val ROOT = "root"
    const val START = "start"
    const val AUTH = "auth"
    const val MAIN = "main"
}