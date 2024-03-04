package com.example.sego.presentation.mainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sego.R
import com.example.sego.navigation.AuthScreenRouts
import com.example.sego.ui.theme.basicColor

@Composable
fun ProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.fingerprint), contentDescription = "")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "You are not logged in", fontSize = 25.sp)
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate(AuthScreenRouts.Login.rout)
            },
            colors = ButtonDefaults.buttonColors(basicColor)
        ) {
            Text(text = "Log in", fontSize = 20.sp)
        }
    }

}