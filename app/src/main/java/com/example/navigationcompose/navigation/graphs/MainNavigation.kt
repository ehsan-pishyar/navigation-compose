package com.example.navigationcompose.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationcompose.navigation.Graph
import com.example.navigationcompose.navigation.MainScreens
import com.example.navigationcompose.screens.main.DashboardScreen
import com.example.navigationcompose.screens.main.FoodsScreen
import com.example.navigationcompose.screens.main.IncomesScreen
import com.example.navigationcompose.screens.main.OrdersScreen

fun NavGraphBuilder.mainNavigation(navHostController: NavHostController) {
    navigation(
        route = Graph.MAIN,
        startDestination = MainScreens.Dashboard.route
    ) {
        composable(route = MainScreens.Dashboard.route) {
            DashboardScreen(
                toDetailsScreen = {  }
            )
        }
        composable(route = MainScreens.Foods.route) {
            FoodsScreen()
        }
        composable(route = MainScreens.Orders.route) {
            OrdersScreen(
                toDetailsScreen = {  }
            )
        }
        composable(route = MainScreens.Incomes.route) {
            IncomesScreen(
                toDetailsScreen = {  }
            )
        }
    }
}