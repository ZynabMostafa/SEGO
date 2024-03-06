package com.example.sego.presentation.authintication.signup.company

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.Info
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.sego.presentation.compoasble.CustomButton
import com.example.sego.presentation.compoasble.CustomTextFieldWithIcon
import com.example.sego.presentation.compoasble.HeaderImage
import com.example.sego.presentation.compoasble.Pick
import com.example.sego.presentation.ui.theme.basicColor


@Composable
fun SignupCompany(navController: NavController,
                  context: Context) {
    var companyname by remember { mutableStateOf("") }
    var specialization by remember { mutableStateOf("") }
    var overview by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderImage()

        Text(text = "Sign up as Company", fontSize = 30.sp, fontWeight = FontWeight.W700)

        Spacer(modifier = Modifier.height(10.dp))
        CustomTextFieldWithIcon(
            value = companyname,
            onValueChanged = { companyname= it }, icon = Icons.TwoTone.Person,
            label = "Company name"
        )
        Spacer(modifier = Modifier.height(10.dp))

        CustomTextFieldWithIcon(
            value = specialization,
            onValueChanged = { email = it },
            icon = Icons.TwoTone.Add,
            label = "Specialization"
        )
        Spacer(modifier = Modifier.height(10.dp))
        Pick()
        CustomTextFieldWithIcon(value = overview, onValueChanged = {overview=it},
            icon =Icons.TwoTone.Info , label = "Over view")
        Spacer(modifier = Modifier.height(10.dp))
        CustomTextFieldWithIcon(
            value = email,
            onValueChanged = { email= it },
            icon = Icons.TwoTone.Email,
            label = "Email address"
        )
        CustomTextFieldWithIcon(
            value = password,
            onValueChanged = { password = it },
            icon = Icons.TwoTone.Lock,
            label = "Password"
        )


        CustomButton(text = "Sign up",modifier=Modifier.padding(top=10.dp)) {
             Toast.makeText(context, "you are signed up", Toast.LENGTH_LONG).show()
        }
        Row(horizontalArrangement = Arrangement.Start) {
            Text(text = "Already have an Account?")
            ClickableText(text = AnnotatedString("Login"),
                style = TextStyle(color= basicColor),
                onClick ={navController.navigate("login")} )
        }
        Divider(Modifier.width(200.dp))

    }

}