package com.example.sego.presentation.authintication.signup.user

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.Lock
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sego.presentation.compoasble.CustomButton
import com.example.sego.presentation.compoasble.CustomTextFieldWithIcon
import com.example.sego.presentation.compoasble.HeaderImage
import com.example.sego.presentation.ui.theme.basicColor


@Composable
fun SignupUser(
    navController: NavController,
    context: Context
) {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderImage()
        Text(text = "Sign up as User", fontSize = 30.sp, fontWeight = FontWeight.W700)
        Spacer(modifier = Modifier.height(20.dp))
        CustomTextFieldWithIcon(
            value = username,
            onValueChanged = { username = it }, icon = Icons.TwoTone.Person,
            label = "User name"
        )
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextFieldWithIcon(
            value = email,
            onValueChanged = { email = it },
            icon = Icons.TwoTone.Email,
            label = "Email address"
        )
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextFieldWithIcon(
            value = password,
            onValueChanged = { password = it },
            icon = Icons.TwoTone.Lock,
            label = "Password"
        )
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextFieldWithIcon(
            value = confirmPassword,
            onValueChanged = { confirmPassword = it },
            icon = Icons.TwoTone.Lock,
            label = "Confirm Password"
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomButton(text = "Sign up") {
            Toast.makeText(context, "you are signed up", Toast.LENGTH_LONG).show()
        }
        Row(horizontalArrangement = Arrangement.Start) {
            Text(text = "Already have an Account?")
            ClickableText(text = AnnotatedString("Login"),
                style = TextStyle(color = basicColor),
                onClick = {
                    navController.navigate("login")
                })
        }
        Divider(Modifier.width(200.dp))

    }

}