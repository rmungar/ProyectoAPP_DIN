package com.example.proyectoapp.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.asFlow
import com.example.proyectoapp.MVVM.ViewModel
import com.example.proyectoapp.utils.Error


@Composable

fun ErrorDeCampo(errores: List<Error?>, viewModel: ViewModel) {

    val dialogVisble = viewModel.dialogVisible.asFlow().collectAsState(true)


    if (dialogVisble.value){
        Dialog(
            onDismissRequest = { viewModel.dialogVisibleChange(dialogVisble.value) },
        ) {

            Column(
                Modifier
                    .fillMaxWidth()
                    .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                    .height(70.dp)
                    .testTag("Error"),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                for (error in errores) {
                    if (error != null) {
                        Row(
                            Modifier.fillMaxWidth()
                                .padding(start = 30.dp)
                        ) {
                            Texto(
                                modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                                text = error.msg,
                                fontWeight = FontWeight.Normal,
                                fontStyle = FontStyle.Normal,
                                fontSize = 21,
                                color = Color.Red,
                                textDecoration = TextDecoration.None
                            )
                        }
                    }
                }
            }
        }
    }
}