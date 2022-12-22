package com.example.navigationcompose.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationcompose.navigation.AuthScreens
import com.example.navigationcompose.navigation.Graph
import com.example.navigationcompose.navigation.StartScreens
import com.example.navigationcompose.screens.start.WelcomeScreen

fun NavGraphBuilder.startNavigation(navHostController: NavHostController) {
    navigation(
        route = Graph.START,
        startDestination = StartScreens.Welcome.route
    ) {
        composable(route = StartScreens.Welcome.route) {
            WelcomeScreen(
                toLoginScreen = {
                    navHostController.navigate(AuthScreens.Login.route)
                }
            )
        }
    }
}