package com.example.sego.presentation.authintication.login

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sego.data.dto.UserRequest
import com.example.sego.domain.use_case.remot.LoginUseCase
import com.example.sego.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class LoginViewModel @Inject constructor
    (private val loginUseCase: LoginUseCase) : ViewModel() {

    private val _loginState = mutableStateOf(LoginState())
    val loginState: State<LoginState> = _loginState

    var _email = mutableStateOf("")
    var _password = mutableStateOf("")



    fun login_ (userRequest: UserRequest){
        viewModelScope.launch {
            loginUseCase(userRequest).let { result ->
                when(result){
                    is Resource.Error->{
                        _loginState.value= LoginState(isLoading = false)
                        _loginState.value = LoginState(error = result.message)
                    }
                    is Resource.Success ->{
                        _loginState.value = LoginState(isLoading = false)
                        _loginState.value = LoginState(value = result.data)

                    }

                    is Resource.Loading ->{
                        _loginState.value = LoginState(isLoading = true)
                    }
                }

            }
        }
    }
    fun setEmail(email:String){
        _email.value = email
    }
    fun setPassword(password:String){
        _password.value=password
    }
}