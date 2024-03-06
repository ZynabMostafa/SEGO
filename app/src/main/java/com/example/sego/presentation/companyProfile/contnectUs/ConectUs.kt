package com.example.sego.presentation.companyProfile.contnectUs


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sego.R
import com.example.sego.presentation.ui.theme.basicColor

@Preview(showSystemUi = true)
@Composable
fun ConnectUs() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
                .padding(10.dp)
                .border(
                    width = 2.dp, shape = RoundedCornerShape(16.dp), color = basicColor
                )
        ) {
            Icon(
                imageVector = Icons.Filled.Call,
                contentDescription = "",
                tint = basicColor,
                modifier = Modifier
                    .padding(6.dp)
                    .size(30.dp)
            )
            Text(
                text = "Call us",
                fontSize = 24.sp,
                color = basicColor,
                fontWeight = FontWeight.Medium
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth()
                .padding(10.dp)
                .border(
                    width = 2.dp, shape = RoundedCornerShape(16.dp), color = basicColor
                )

        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_chat_24),
                contentDescription = "chat",
                modifier = Modifier
                    .padding(6.dp)
                    .size(30.dp),
                tint = basicColor
            )
            Text(
                text = "Chat us",
                fontSize = 24.sp, color = basicColor,
                fontWeight = FontWeight.Medium
            )
        }
        Row(
             ) {
            Divider(
                Modifier
                    .padding(top = 10.dp)
                    .height(2.dp)
                    .width(130.dp)
            )
            Text(text = "OR", modifier = Modifier.padding(start = 20.dp, end = 20.dp))
            Divider(
                Modifier
                    .padding(top = 10.dp)
                    .height(2.dp)
                    .width(130.dp)
            )
        }
        Row(
             verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 20.dp , bottom = 14.dp , start = 10.dp , end = 10.dp).fillMaxWidth()
            ) {
            Image(
                painter = painterResource(id = R.drawable.facebook), contentDescription = ""
                ,modifier = Modifier.size(30.dp).weight(1f)
            )
            Image(
                painter = painterResource(id = R.drawable.whatsapp), contentDescription = ""
                ,modifier = Modifier.size(30.dp).weight(1f)
            )
            Image(
                    painter = painterResource(id = R.drawable.linkedin), contentDescription = ""
                ,modifier = Modifier.size(30.dp).weight(1f)
            )
            Image(
            painter = painterResource(id = R.drawable.location), contentDescription = ""
                ,modifier = Modifier.size(30.dp).weight(1f)
        )
        }
    }
}