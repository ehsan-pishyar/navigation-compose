package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigationcompose.navigation.graphs.authNavigation
import com.example.navigationcompose.navigation.graphs.mainNavigation
import com.example.navigationcompose.navigation.graphs.startNavigation

// For whole app navigation
@Composable
fun AppNavigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Graph.ROOT
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