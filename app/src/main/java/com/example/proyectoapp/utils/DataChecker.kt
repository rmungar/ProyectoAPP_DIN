package com.example.proyectoapp.utils

import com.example.proyectoapp.MVVM.ViewModel

/**
 * Objeto que valida los datos de inicio de sesión ingresados por el usuario.
 *
 * Propiedades:
 * - `USUARIO_PRUEBA`: Nombre de usuario válido para las pruebas.
 * - `PASSWORD_PRUEBA`: Contraseña válida para las pruebas.
 *
 * Métodos:
 * - `checkData`: Valida los datos de entrada (nombre de usuario o correo y contraseña).
 *   Devuelve un objeto `Error` con un mensaje específico si los datos no son válidos,
 *   o `null` si los datos son correctos.
 */
object DataChecker {



    private val viewModel = ViewModel()


    fun checkData(usernameOrEmail: String?, password: String?): Error? {

        var errorCode = 0

        if ((usernameOrEmail == "" || usernameOrEmail == null) || (password == "" || password == null)){
            if (usernameOrEmail == "" || usernameOrEmail == null){
                errorCode += 1
            }
            if (password == "" || password == null){
                errorCode += 2
            }
        }
        else {
            if (usernameOrEmail.length < 3){
                errorCode += 4
            }
            if (password.length < 5){
                errorCode += 5
            }
        }



        when (errorCode){
            1 -> { return  Error("Missing Username") }
            2 -> { return  Error("Missing Password") }
            3 -> { return Error("No Data") }
            4 -> { return  Error("Username is too short") }
            5 -> { return Error("Password is too short") }
            else -> {
                viewModel.setValidLogin()
                return null
            }
        }
    }

}