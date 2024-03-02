package com.example.sego.presentation.compoasble

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.sego.R

@Composable
fun HeaderImage(){
    Image(
        painter = painterResource(id = R.drawable.sego), contentDescription = "kk",
        modifier = Modifier
            .padding(10.dp)
            .height(150.dp)
            .fillMaxWidth()
    )
}