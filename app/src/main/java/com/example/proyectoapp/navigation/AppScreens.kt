package com.example.proyectoapp.navigation

sealed class AppScreens(val route: String) {

    object LoginScreen : AppScreens("LoginScreen")
    object RegisterScreen : AppScreens("RegisterScreen")
    object LoadingScreen : AppScreens("LoadingScreen")
    object MainScreen : AppScreens("MainScreen")


}