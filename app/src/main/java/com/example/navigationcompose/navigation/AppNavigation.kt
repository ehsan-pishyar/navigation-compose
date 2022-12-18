package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationcompose.navigation.Graph.AUTH
import com.example.navigationcompose.navigation.Graph.MAIN
import com.example.navigationcompose.navigation.Graph.ROOT
import com.example.navigationcompose.navigation.Graph.START
import com.example.navigationcompose.screens.auth.ForgotPasswordScreen
import com.example.navigationcompose.screens.auth.LoginScreen
import com.example.navigationcompose.screens.auth.RegisterScreen
import com.example.navigationcompose.screens.main.DashboardScreen
import com.example.navigationcompose.screens.main.FoodsScreen
import com.example.navigationcompose.screens.main.IncomesScreen
import com.example.navigationcompose.screens.main.OrdersScreen
import com.example.navigationcompose.screens.start.WelcomeScreen

// For whole app navigation
@Composable
fun AppNavigation(navHostController: NavHostController) {
    NavHost(
        route = ROOT,
        startDestination = START,
        navController = navHostController
    ) {
        startNavigation(navController = navHostController)
        authNavigation(navController = navHostController)
        mainNavigation(navController = navHostController)
    }
}

// For Dashboard bottom bar navigation
@Composable
fun MainNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = MAIN,
        startDestination = MainScreens.Dashboard.route
    ) {
        mainNavigation(navController = navController)
    }
}

fun NavGraphBuilder.startNavigation(navController: NavHostController) {
    navigation(
        route = START,
        startDestination = StartScreens.Welcome.route
    ) {
        composable(route = StartScreens.Welcome.route) {
            WelcomeScreen(
                toLoginScreen = { navController.navigate(AuthScreens.Login.route) }
            )
        }
    }
}

fun NavGraphBuilder.authNavigation(navController: NavHostController) {
    navigation(
        route = AUTH,
        startDestination = AuthScreens.Login.route
    ) {
        composable(route = AuthScreens.Login.route) {
            LoginScreen(
                toRegisterScreen = { navController.navigate(AuthScreens.Register.route) },
                toForgotPasswordScreen = { navController.navigate(AuthScreens.ForgotPassword.route) },
                toDashboardScreen = { navController.navigate(MainScreens.Dashboard.route) }
            )
        }
        composable(route = AuthScreens.Register.route) {
            RegisterScreen(
                toLoginScreen = { navController.navigate(AuthScreens.Login.route) },
                toDashboardScreen = { navController.navigate(MainScreens.Dashboard.route) }
            )
        }
        composable(route = AuthScreens.ForgotPassword.route) {
            ForgotPasswordScreen(
                toLoginScreen = { navController.navigate(AuthScreens.Login.route) }
            )
        }
    }
}

fun NavGraphBuilder.mainNavigation(navController: NavHostController) {
    navigation(
        route = MAIN,
        startDestination = MainScreens.Dashboard.route
    ) {
        composable(route = MainScreens.Dashboard.route) {
            DashboardScreen()
        }
        composable(route = MainScreens.Foods.route) {
            FoodsScreen()
        }
        composable(route = MainScreens.Orders.route) {
            OrdersScreen()
        }
        composable(route = MainScreens.Incomes.route) {
            IncomesScreen()
        }
    }
}

object Graph {
    const val ROOT = "root"
    const val START = "start"
    const val AUTH = "auth"
    const val MAIN = "main"
}