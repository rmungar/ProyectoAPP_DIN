package com.example.proyectoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.asFlow
import com.example.proyectoapp.navigation.AppNavigation
import com.example.proyectoapp.screens.LoadingScreen
import com.example.proyectoapp.ui.theme.ProyectoAPPTheme
import com.example.proyectoapp.MVVM.ViewModel

class MainActivity : ComponentActivity() {
    val viewModel = ViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoAPPTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val isLoading = viewModel.isLoading.asFlow().collectAsState(true)

                    LaunchedEffect(Unit) {
                        kotlinx.coroutines.delay(2000)
                        viewModel.noLongerLoading()
                    }

                    if (isLoading.value) {
                        LoadingScreen(innerPadding)
                    } else {
                        AppNavigation(viewModel, innerPadding)
                    }
                }
            }
        }
    }
}

