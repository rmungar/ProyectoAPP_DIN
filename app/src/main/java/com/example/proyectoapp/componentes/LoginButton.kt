package com.example.proyectoapp.componentes

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp


@Composable
fun LoginButton(onButtonPress:()-> Unit){

    OutlinedButton (
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Blue,
            contentColor = Color.White,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.Gray,
        ),
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 20.dp)
            .fillMaxWidth()
            .testTag("loginButton")
        ,
        shape = RoundedCornerShape(3.dp),
        onClick = { onButtonPress() },
        contentPadding = PaddingValues(9.dp),
        enabled = true
    ) {
        Texto(
            modifier = Modifier.padding(0.dp),
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Normal,
            fontSize = 16,
            text = "Log in",
            textDecoration = TextDecoration.None
        )
    }

}