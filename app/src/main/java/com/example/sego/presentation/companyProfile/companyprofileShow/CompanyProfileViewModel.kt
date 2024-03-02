package com.example.sego.presentation.companyProfile.companyprofileShow

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class CompanyProfileViewModel @Inject constructor():ViewModel() {
      var isProjectsClickedStat = mutableStateOf(true)
      var isCennecUsClickedStat = mutableStateOf(false)

    fun update(bool:Boolean , bool2: Boolean){
       isCennecUsClickedStat.value=bool2
        isProjectsClickedStat.value = bool
    }
}