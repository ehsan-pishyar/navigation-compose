package com.example.navigationcompose.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationcompose.navigation.AuthScreens
import com.example.navigationcompose.navigation.Graph
import com.example.navigationcompose.navigation.MainScreens
import com.example.navigationcompose.screens.auth.ForgotPasswordScreen
import com.example.navigationcompose.screens.auth.LoginScreen
import com.example.navigationcompose.screens.auth.RegisterScreen

fun NavGraphBuilder.authNavigation(navHostController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreens.Login.route
    ) {
        composable(
            route = AuthScreens.Login.route
        ) {
            LoginScreen(
                toRegisterScreen = { navHostController.navigate(AuthScreens.Register.route) },
                toForgotPasswordScreen = { navHostController.navigate(AuthScreens.ForgotPassword.route) },
                toDashboardScreen = { navHostController.navigate(MainScreens.Dashboard.route) }
            )
        }
        composable(route = AuthScreens.Register.route) {
            RegisterScreen(
                toLoginScreen = { navHostController.navigate(AuthScreens.Login.route) },
                toDashboardScreen = { navHostController.navigate(MainScreens.Dashboard.route) }
            )
        }
        composable(route = AuthScreens.ForgotPassword.route) {
            ForgotPasswordScreen(
                toLoginScreen = { navHostController.navigate(AuthScreens.Login.route) }
            )
        }
    }
}