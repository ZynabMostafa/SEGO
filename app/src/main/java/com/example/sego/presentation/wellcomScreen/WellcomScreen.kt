package com.example.sego.presentation.wellcomScreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.sego.navigation.MainScreenRouts
import com.example.sego.ui.theme.basicColor
import com.google.accompanist.pager.*

@OptIn(ExperimentalPagerApi::class)
@ExperimentalAnimationApi
@Composable
fun WelcomeScreen(
    navController: NavHostController,
    welcomeViewModel: WelcomeViewModule = hiltViewModel()
) {
    val pages = listOf(
        OnBordringPager.FirstPager,
        OnBordringPager.SecondPager,
        OnBordringPager.ThirdPager,
    )
    val pagerState = rememberPagerState()

    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            modifier = Modifier.weight(10f),
            count = 3,
            state = pagerState,
            verticalAlignment = Alignment.Top
        ) { position ->
            pager(pager = pages[position])
        }
        HorizontalPagerIndicator(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .weight(1f),
            pagerState = pagerState,
            indicatorShape = CircleShape,
            inactiveColor = Color.Gray,
            activeColor = basicColor,
            indicatorWidth = 22.dp,
            indicatorHeight = 8.dp,
            spacing = 8.dp
        )
        FinishButton(
            modifier = Modifier.weight(1f),
            pagerState = pagerState
        ) {
            welcomeViewModel.saveOnBoardingState(completed = true)
            navController.popBackStack()
            navController.navigate(MainScreenRouts.Home.rout)
        }
    }
}

@Composable
fun pager(pager: OnBordringPager) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Image(
            painter = painterResource(id = pager.image), contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(24.dp)
                .size(300.dp)
                .clip(CircleShape)
        )
        Text(text = pager.titel, style = TextStyle(fontWeight = FontWeight.W800))
        Text(text = pager.description)
    }
}

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun FinishButton(
    modifier: Modifier,
    pagerState: PagerState,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .padding(horizontal = 40.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center
    ) {
        AnimatedVisibility(
            modifier = Modifier.fillMaxWidth(),
            visible = pagerState.currentPage == 2
        ) {
           Button(
               modifier= Modifier.background(shape = RoundedCornerShape(10.dp) , color = basicColor),
                onClick = onClick,
               colors = ButtonDefaults.buttonColors(containerColor = basicColor,
                   contentColor = Color.White)
            ) {
                Text(text = "Finish")
            }
        }
    }
}
