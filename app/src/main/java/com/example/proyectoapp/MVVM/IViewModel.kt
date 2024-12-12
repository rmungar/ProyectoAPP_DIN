package com.example.proyectoapp.MVVM

import androidx.lifecycle.LiveData
import com.example.proyectoapp.utils.Error

interface IViewModel {

    val usernameOrEmail: LiveData<String>?

    val password: LiveData<String>?

    val visible: LiveData<Boolean>?

    val errorList: LiveData<MutableList<Error?>>?

    val errors: LiveData<Boolean>?

    val validLogin : LiveData<Boolean>?

    val isLoading : LiveData<Boolean>?

    val dialogVisible : LiveData<Boolean>?

    fun onUsernameOrEmailChange( usernameOrEmail: String )

    fun onPasswordChange( password: String)

    fun onVisibleChange( visible: Boolean )

    fun onButtonPressed()

    fun setValidLogin()

    fun noLongerLoading()

    fun getRealUsername(): String

    fun dialogVisibleChange( dialogVisible: Boolean )

    fun reset()
}