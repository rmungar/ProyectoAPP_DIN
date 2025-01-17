package com.example.proyectoapp

import androidx.compose.material3.Scaffold
import androidx.compose.ui.test.assertHasNoClickAction
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.longClick
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeDown
import androidx.compose.ui.test.swipeLeft
import com.example.proyectoapp.MVVM.ViewModel
import com.example.proyectoapp.navigation.AppNavigation
import com.example.proyectoapp.screens.MainScreen
import com.example.proyectoapp.ui.theme.ProyectoAPPTheme
import org.junit.Rule
import org.junit.Test

class Tests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun loginScreenTests(){
        composeTestRule.setContent {
            ProyectoAPPTheme {
                val viewModel = ViewModel()
                Scaffold { innerPaddingValues ->
                    AppNavigation(viewModel, innerPaddingValues)
                }
            }
        }

        composeTestRule.onNodeWithTag("Error").assertDoesNotExist()
        composeTestRule.onNodeWithTag("loginButton").performClick()
        composeTestRule.onNodeWithTag("Error").assertExists()
        composeTestRule.onNodeWithText("Login").assertExists()
        composeTestRule.onNodeWithText("Login").assertHasNoClickAction()
        composeTestRule.onNodeWithTag("UsernameOrEmailTextField").performClick().performTextInput("Hola Buenas")
        composeTestRule.onNodeWithTag("PasswordTextField").performClick().performTextInput("Que Tal")
        composeTestRule.onNodeWithTag("loginButton").performTouchInput {
            longClick()
            swipeDown()
            swipeLeft()
        }
        composeTestRule.onNodeWithTag("loginButton").performClick()
        composeTestRule.onNodeWithTag("Hola").assertDoesNotExist()
    }
}