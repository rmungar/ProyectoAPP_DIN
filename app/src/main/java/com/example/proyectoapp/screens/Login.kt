package com.example.proyectoapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.asFlow
import androidx.navigation.NavController
import com.example.proyectoapp.componentes.LoginButton
import com.example.proyectoapp.navigation.AppScreens
import com.example.proyectoapp.MVVM.ViewModel
import com.example.proyectoapp.componentes.CampoDeTexto
import com.example.proyectoapp.componentes.ErrorDeCampo
import com.example.proyectoapp.componentes.Texto


/**
 * Función Composable que genera una pantalla de inicio de sesión con diversos componentes de interfaz de usuario
 * y gestión de estados a través de un ViewModel.
 *
 * @param viewModel Instancia del ViewModel que maneja el estado del formulario de inicio de sesión.
 * @param paddingValues Valores de padding aplicados al contenedor principal de la pantalla de inicio de sesión.
 */
@Composable
fun Login(viewModel: ViewModel, paddingValues: PaddingValues, navController: NavController) {
    val usernameOrEmail = viewModel.usernameOrEmail.asFlow().collectAsState("")
    val password = viewModel.password.asFlow().collectAsState("")
    val visible = viewModel.visible.asFlow().collectAsState(false)
    val errors = viewModel.errors.asFlow().collectAsState(false)
    val errorList = viewModel.errorList.asFlow().collectAsState(emptyList())
    val validLogin = viewModel.validLogin.asFlow().collectAsState(false)

    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(state = rememberScrollState(0)),
        verticalArrangement = Arrangement.Center
    ) {
        Texto(
            modifier = Modifier.padding(start = 165.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            fontSize = 25,
            text = "Login",
            textDecoration = TextDecoration.None
        )

        if (errors.value) {
            ErrorDeCampo(errorList.value, viewModel)
        }

        Texto(
            modifier = Modifier.padding(top = 40.dp, start = 5.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            fontSize = 21,
            text = "Username or email",
            textDecoration = TextDecoration.None
        )
        CampoDeTexto(
            usernameOrEmail.value,
            VisualTransformation.None,
            false,
            visible.value,
            "UsernameOrEmailTextField",
            { viewModel.onUsernameOrEmailChange(it) }
        ) {}

        Texto(
            modifier = Modifier.padding(top = 30.dp, start = 5.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            fontSize = 21,
            text = "Password",
            textDecoration = TextDecoration.None
        )
        CampoDeTexto(
            password.value,
            PasswordVisualTransformation(),
            true,
            visible.value,
            "PasswordTextField",
            { viewModel.onPasswordChange(it) }
        ) {
            viewModel.onVisibleChange(it)
        }


        LoginButton {
            if(validLogin.value){
                navController.navigate(AppScreens.MainScreen.route + "/${viewModel.getRealUsername()}")
            }
            else {
                viewModel.onButtonPressed()
            }
        }
    }
}
