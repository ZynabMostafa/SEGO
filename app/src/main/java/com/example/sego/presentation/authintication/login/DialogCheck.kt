package com.example.sego.presentation.authintication.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sego.R
import com.example.sego.navigation.AuthScreenRouts

@Composable
fun CheckDialog(
    navController: NavController,
    visible: Boolean = false,
    onDismiss: () -> Unit
) {
    if (visible) {
        AlertDialog(onDismissRequest = { onDismiss() },
            confirmButton = {
                OutlinedButton(onClick = {
                    navController.navigate(AuthScreenRouts.SignUpUser.rout) {
                        popUpTo(AuthScreenRouts.Login.rout)
                        launchSingleTop
                    }
                }) {
                    Text(text = "  User ")
                }
            },
            dismissButton = {
                OutlinedButton(onClick = {
                    navController.navigate(AuthScreenRouts.SignUpCompany.rout) {
                        popUpTo(AuthScreenRouts.Login.rout)
                        launchSingleTop
                    }
                }) {
                    Text(text = "Company")
                }
            },
            icon = {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier
                        .height(80.dp)
                        .width(200.dp)
                )
            },
            text = { Text(text = "Sign up as") })
    }
}