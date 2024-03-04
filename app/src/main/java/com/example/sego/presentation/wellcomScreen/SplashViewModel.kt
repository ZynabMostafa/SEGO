package com.example.sego.presentation.wellcomScreen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sego.data.Repository.DataStoreRepo
import com.example.sego.navigation.Graph
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val repo: DataStoreRepo
) : ViewModel() {

    private val _isLoading: MutableState<Boolean> = mutableStateOf(true)
    val isLoading: State<Boolean> = _isLoading

    private val _startDestination: MutableState<String> = mutableStateOf(Graph.WELCOME)
    val startDestination: State<String> = _startDestination

    init {
        viewModelScope.launch {
            repo.readOnBoardingState().collect { completed ->
                if (completed) {
                    _startDestination.value = Graph.HOME
                } else {
                    _startDestination.value = Graph.WELCOME
                }
            }
            _isLoading.value = false
        }
    }
}