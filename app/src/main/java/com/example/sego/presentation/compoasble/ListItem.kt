package com.example.sego.presentation.compoasble

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.sego.R
import com.example.sego.presentation.mainScreen.classes.Companies
import com.example.sego.ui.theme.basicColor


@Composable
fun ListItem(myIcons : Companies, context: Context) {
    Card(
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp)
            .border(1.dp, color = basicColor, shape = RoundedCornerShape(16.dp))
            .fillMaxWidth()


    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start, modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = myIcons.icon),
                modifier = Modifier
                    .padding(4.dp),
                contentDescription = ""
            )
            Text(
                text = myIcons.name,
                modifier = Modifier.width(200.dp)
                    .align(Alignment.CenterVertically)
                   , fontWeight = FontWeight . Bold
            )

            Image(
                painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                contentDescription = "",
                alignment = Alignment.CenterEnd,
                modifier = Modifier.padding(start = 22.dp)
                    .clickable {

                        Toast
                            .makeText(context, "You are not Logged in ", Toast.LENGTH_LONG)
                            .show()
                    }
            )
        }
    }
}