package com.example.sego.presentation.mainScreen

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sego.R
import com.example.sego.presentation.compoasble.Companies
import com.example.sego.presentation.compoasble.PropagandaCard
import com.example.sego.presentation.compoasble.ListItem
import com.example.sego.presentation.mainScreen.classes.Companies

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(context: Context) {

    Column(
        modifier = Modifier
            .padding(top = 80.dp, bottom = 80.dp)
    ) {
        val speciallist = listOf(
            "All", "Civil", "Architecture",
            "Programming", "Electrical"
        )
        val imagelist = listOf(
            R.drawable.base, R.drawable.base,
            R.drawable.base
        )
        val columnlist = listOf(
           Companies(
                R.drawable.company, "Benaa", R.drawable.baseline_favorite_border_24
            ),
            Companies(
                R.drawable.company, "Structure",
                R.drawable.baseline_favorite_border_24
            ),
            Companies(
                R.drawable.company, "Ebdaa",
                R.drawable.baseline_favorite_border_24
            ),
            Companies(
                R.drawable.company, "Vella",
                R.drawable.baseline_favorite_border_24
            ),
            Companies(
                R.drawable.company, "Benaa", R.drawable.baseline_favorite_border_24
            ),
            Companies(
                R.drawable.company, "Structure",
                R.drawable.baseline_favorite_border_24
            ),
            Companies(
                R.drawable.company, "Vella",
                R.drawable.baseline_favorite_border_24
            ),
            Companies(
                R.drawable.company, "Ebdaa",
                R.drawable.baseline_favorite_border_24
            ),
        )
        LazyRow() {
            items(imagelist) { item1 ->
                Companies(imageList = item1)
            }
        }
        LazyRow(modifier=Modifier.padding(end=10.dp)) {
            items(speciallist) { item ->
                PropagandaCard(specialName = item)
            }
        }
        LazyColumn {
            items(columnlist) { it ->
                ListItem(myIcons = it, context = context)
            }
        }
    }

}

