package com.example.proyectoapp.componentes

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

@Composable
fun Texto(modifier: Modifier, text:String, fontWeight: FontWeight, fontStyle: FontStyle, fontSize: Int, color: Color, textDecoration: TextDecoration){

    Text(
        modifier = modifier,
        text = text,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        fontSize = fontSize.sp,
        textDecoration = textDecoration,
        color = color
    )

}