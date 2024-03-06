package com.example.sego.presentation.compoasble

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.sego.presentation.ui.theme.basicColor

@Composable
fun CustomButton(
    text:String,
    modifier:Modifier,
    onClick:()->(Unit)
){
    Button(
        onClick = {
            onClick()
        }, colors = ButtonDefaults.buttonColors(basicColor),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 50.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(basicColor)
    ) {
        Text(text = text)
    }
}