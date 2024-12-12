package com.example.proyectoapp.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.proyectoapp.MVVM.ViewModel
import com.example.proyectoapp.screens.Login
import com.example.proyectoapp.screens.MainScreen

@Composable
fun AppNavigation(viewModel: ViewModel, innerPaddingValues: PaddingValues) {

    val navControlador = rememberNavController()

    NavHost(navControlador, AppScreens.LoginScreen.route) {

        composable(AppScreens.LoginScreen.route){
            Login(viewModel,innerPaddingValues, navControlador)
        }

        composable(AppScreens.MainScreen.route + "/{nombre}",
            arguments = listOf(navArgument("nombre") {type = NavType.StringType})
        ){
            val param = it.arguments?.getString("nombre") ?: ""
            MainScreen(viewModel, innerPaddingValues, navControlador, param)
        }


    }
}