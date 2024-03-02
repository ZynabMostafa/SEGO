package com.example.sego.presentation.compoasble

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.sego.ui.theme.basicColor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextFieldWithIcon(
    value: String,
    onValueChanged: (String) -> Unit,
    icon: ImageVector,
    label: String,


    ) {
    Row(horizontalArrangement = Arrangement.Center) {

        Icon(
            imageVector = icon, contentDescription = "lock",
            modifier = Modifier
                .padding(top = 9.dp)
                .clip(RoundedCornerShape(15.dp, 0.dp, 0.dp, 15.dp))
                .background(basicColor)
                .padding(17.dp)
        )
        OutlinedTextField(value = value, onValueChange = {
            onValueChanged(it)
        }, label = {
            Text(text = label)

        }, shape = RoundedCornerShape(0.dp, 15.dp, 15.dp, 0.dp),
            modifier = Modifier.padding(top = 2.dp)
        )
    }
}



