package com.example.sego.presentation.companyProfile.projects

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sego.R
import com.example.sego.ui.theme.basicColor

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun Projects() {
    val projcts = listOf(
        Projects(R.drawable.company,"Villa" ,"Company has its org"),
        Projects(R.drawable.company,"Villa" ,"Company has its org"),
        Projects(R.drawable.company,"Villa" ,"Company has its org"),
        Projects(R.drawable.company,"Villa" ,"Company has its org"),
        Projects(R.drawable.company,"Villa" ,"Company has its org"),
        Projects(R.drawable.company,"Villa" ,"Company has its org"),
        Projects(R.drawable.company,"Villa" ,"Company has its org"),
        Projects(R.drawable.company,"Villa" ,"Company has its org"),
        )
    LazyVerticalGrid(columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()){
        items(projcts.size){ project->
    projectCard(imag = projcts[project].imag, titel =projcts[project].titel ,
        description = projcts[project].description) {
        
    }
            }
        }
    }


data class Projects(
    val imag:Int,
    val titel:String,
    val description:String
)

@Composable
fun projectCard(imag:Int ,
                titel: String ,
                description: String,
                onClick:()->Unit) {
       Column (modifier = Modifier.clickable { onClick() }){
           Card (colors =CardDefaults.cardColors(Color.LightGray),
               modifier = Modifier
                   .padding(10.dp)
                   .width(150.dp)
                   .height(200.dp),
               shape = RoundedCornerShape(22.dp)
           ){
 Column (horizontalAlignment = Alignment.CenterHorizontally,
     modifier = Modifier.fillMaxSize()){
               Image(painter = painterResource(id = imag) ,
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(80.dp)
                       .border(width = 1.dp , shape = RoundedCornerShape(22.dp) , color = Color.LightGray),
                   contentDescription ="" )
               Text(text = titel ,
                   color = Color.Black,
                   fontSize = 22.sp,
                   fontWeight = FontWeight.W600,
                   modifier = Modifier.padding(8.dp),
                  )
               Text(text = description)
               }
           }
       }
}
@Preview(showSystemUi =  true)
@Composable
fun dd() {
    projectCard(imag = R.drawable.company, titel = "Villa", description = "uiwheiuwehriehriehr") {
        
    }
}