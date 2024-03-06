package com.example.sego.presentation.compoasble

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sego.presentation.ui.theme.basicColor


@Composable
fun PropagandaCard(specialName: String) {
    Card(
        modifier = Modifier
            .padding(start = 10.dp)
            .border(2.dp, color = basicColor, shape = RoundedCornerShape(20.dp)),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(Color.White),

        ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = specialName, fontSize = 20.sp, modifier = Modifier.padding(6.dp))
        }
    }
}