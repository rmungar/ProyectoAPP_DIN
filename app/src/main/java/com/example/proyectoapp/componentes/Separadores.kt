package com.example.proyectoapp.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Separadores(altura: Int){

    Spacer( Modifier
        .height(altura.dp)
        .fillMaxWidth()
        .background(Color.LightGray)
    )

}