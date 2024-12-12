package com.example.proyectoapp.componentes

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun LoginValido(){

    Texto(
        modifier = Modifier.padding(top = 40.dp, start = 5.dp),
        text = "Login Accepted",
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Normal,
        fontSize = 23,
        color = Color.Green,
        textDecoration = TextDecoration.None
    )

}