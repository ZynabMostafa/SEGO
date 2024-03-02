package com.example.sego.presentation.wellcomScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sego.data.Repository.local.DataStoreRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModule @Inject constructor
    (private val repo: DataStoreRepo):ViewModel(){

   fun saveOnBoardingState(completed: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            repo.saveOnBoardingState(completed = completed)
        }
    }
}