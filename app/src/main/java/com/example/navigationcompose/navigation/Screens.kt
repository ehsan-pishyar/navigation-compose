package com.example.navigationcompose.navigation

sealed class StartScreens(val route: String) {
    object Welcome: StartScreens(route = "welcome")
}

sealed class AuthScreens(val route: String) {
    object Login: AuthScreens(route = "login")
    object Register: AuthScreens(route = "register")
    object ForgotPassword: AuthScreens(route = "forgot_password")
}

sealed class MainScreens(val route: String) {
    object Dashboard: MainScreens(route = "dashboard")
    object Foods: MainScreens(route = "foods")
    object Orders: MainScreens(route = "orders")
    object Incomes: MainScreens(route = "incomes")
}

sealed class DetailsScreens(val route: String) {
    object Detail: DetailsScreens(route = "foods/{id}") {
        fun createRoute(root: MainScreens, id: String) =
            "${root.route}/$id"
    }
}
