package com.example.proyectoapp.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectoapp.MVVM.ViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topAppBar(username: String, navController: NavController, viewModel: ViewModel){

    TopAppBar(
        title = { Texto(
            text = "Welcome, $username",
            color = Color.White,
            fontSize = 20,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Normal,
            modifier = Modifier.padding(start = 10.dp).testTag("Welcome"),
            textDecoration = TextDecoration.None
        ) },
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .testTag("TopAppBar"),
        scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.White,

            ),
        navigationIcon = {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = null,
                Modifier
                    .clickable {
                        viewModel.reset()
                        navController.popBackStack()
                    }
                    .size(30.dp)
                ,
                tint = Color.White,
            )
        }
    )
}