package com.example.navigationcompose.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import com.example.navigationcompose.navigation.BottomNavItem
import com.example.navigationcompose.navigation.MainScreens

object BottomNavData {
    val items: List<BottomNavItem> = listOf(
        BottomNavItem(
            route = MainScreens.Dashboard.route,
            title = "Dashboard",
            icon = Icons.Default.Home
        ),
        BottomNavItem(
            route = MainScreens.Foods.route,
            title = "Foods",
            icon = Icons.Default.Face
        ),
        BottomNavItem(
            route = MainScreens.Orders.route,
            title = "Orders",
            icon = Icons.Default.Favorite
        ),
        BottomNavItem(
            route = MainScreens.Incomes.route,
            title = "Incomes",
            icon = Icons.Default.Info
        ),
    )
}