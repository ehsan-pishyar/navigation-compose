package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph

// For whole app navigation
@Composable
fun AppNavigation() {
    DestinationsNavHost(navGraph = NavGraphs.root)
}

@RootNavGraph(start = true)
@NavGraph
annotation class StartNavGraph(
    val start: Boolean = false
)

@RootNavGraph
@NavGraph
annotation class AuthNavGraph(
    val start: Boolean = false
)

@RootNavGraph
@NavGraph
annotation class MainNavGraph(
    val start: Boolean = false
)