package com.example.navigationcompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.navigationcompose.components.BottomBar
import com.example.navigationcompose.navigation.AppNavigation
import com.example.navigationcompose.utils.BottomNavData

@Composable
fun MainScreen(
    navHostController: NavHostController
) {
    Scaffold(
        bottomBar = {
            BottomBar(
                items = BottomNavData.items,
                modifier = Modifier,
                navController = navHostController,
                onItemClick = { navHostController.navigate(it.route) }
            )
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues.calculateBottomPadding())) {
            AppNavigation(navHostController)
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen(navHostController = NavHostController(LocalContext.current))
}