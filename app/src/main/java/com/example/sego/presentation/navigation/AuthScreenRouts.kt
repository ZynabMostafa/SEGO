package com.example.sego.presentation.navigation

sealed class AuthScreenRouts(val rout:String){
    object Login : MainScreenRouts(  "Login")
    object SignUpUser : MainScreenRouts("Signup")
    object SignUpCompany : MainScreenRouts("SignUPCompany")

}
