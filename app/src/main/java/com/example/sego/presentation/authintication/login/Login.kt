package com.example.sego.presentation.authintication.login

import android.content.Context
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.Lock
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.sego.data.dto.UserRequest
import com.example.sego.presentation.compoasble.CustomButton
import com.example.sego.presentation.compoasble.CustomTextFieldWithIcon
import com.example.sego.presentation.compoasble.HeaderImage

@Composable
fun Login(
    context: Context,
    navController: NavController,
    loginViewModel: LoginViewModel = hiltViewModel()
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        HeaderImage()
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Login", fontSize = 30.sp, fontWeight = FontWeight.W700)
        CustomTextFieldWithIcon(
            value = loginViewModel._email.value,
            onValueChanged = { newEmail ->
                loginViewModel.setEmail(newEmail)
            },
            icon = Icons.TwoTone.Email,
            label = "Email",
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomTextFieldWithIcon(
            value = loginViewModel._password.value,
            onValueChanged = { newPassword -> loginViewModel.setPassword(newPassword) },
            icon = Icons.TwoTone.Lock,
            label = "Password",
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        AnimatedVisibility(visible = loginViewModel.loginState.value.showErrorMesage) {
            Text(text = loginViewModel.loginState.value.error)

        }
        Spacer(modifier = Modifier.height(30.dp))
        CustomButton(text = "Login") {
            loginViewModel.login_(
                UserRequest(
                    loginViewModel._email.value,
                    loginViewModel._password.value
                )
            )
            if (loginViewModel.loginState.value.value?.status == "success") {
                Toast.makeText(context, "you are logged in", Toast.LENGTH_SHORT).show()
                return@CustomButton
            }
            loginViewModel.loginState.value.showErrorMesage = true
        }

        Text(text = "Forgot Password?")
        HorizontalDivider(
            Modifier
                .height(2.dp)
                .width(115.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            HorizontalDivider(
                Modifier
                    .padding(top = 10.dp)
                    .height(2.dp)
                    .width(130.dp)
            )
            Text(text = "OR", modifier = Modifier.padding(start = 20.dp, end = 20.dp))
            HorizontalDivider(
                Modifier
                    .padding(top = 10.dp)
                    .height(2.dp)
                    .width(130.dp)
            )
        }

        OutlinedButton(
            onClick = { loginViewModel.loginState.value.dilogeVisabitlity = true },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 50.dp, bottom = 50.dp)
                .clip(RoundedCornerShape(15.dp))
        ) {
            Text(text = "Signup")
        }

        CheckDialog(
            navController = navController,
            visible = loginViewModel.loginState.value.dilogeVisabitlity
        ) {
            loginViewModel.loginState.value.dilogeVisabitlity = false
        }
    }
}

