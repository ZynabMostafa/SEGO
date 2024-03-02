package com.example.sego.presentation.companyProfile.companyprofileShow


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.sego.R
import com.example.sego.presentation.companyProfile.contnectUs.ConnectUs
import com.example.sego.presentation.companyProfile.projects.Projects
import com.example.sego.ui.theme.basicColor

@Preview(showSystemUi = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun companyProfile(companyProfileViewModel: CompanyProfileViewModel = hiltViewModel()) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Company Profile",
                        color = basicColor,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                Modifier.padding(10.dp),
                actions = {
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = "",
                        tint = basicColor,
                        /* modifier = Modifier
                             .width(12.dp)
                             .height(5.dp)*/
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.White
                )
            )
        }
    ) {
        Column(

            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.company),
                contentDescription = "",
                modifier = Modifier
                    .padding(4.dp)
                    .size(200.dp)
                    .clip(CircleShape)
            )
            Text(
                text = "Company Profile",
                color = basicColor,
                fontSize = 24.sp,
                fontWeight = FontWeight.W700
            )
            Text(text = "Description")

            Row(
                horizontalArrangement = Arrangement.spacedBy(
                    20.dp,
                    Alignment.CenterHorizontally
                ),
                modifier = Modifier
                    .fillMaxWidth()

            ) {


                Button(
                    onClick = {
                        companyProfileViewModel.update(bool = true, bool2 = false)

                    }, colors = ButtonDefaults
                        .buttonColors(
                            containerColor = basicColor,
                            disabledContainerColor = Color.LightGray
                        ),
                    enabled = !companyProfileViewModel.isProjectsClickedStat.value,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Projects",
                        style = TextStyle(
                            fontSize = 14.sp,
                            //  fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(400),
                            color = Color.Black,
                        )
                    )
                }
                Button(
                    onClick = {
                        companyProfileViewModel.update(bool = false, bool2 = true)

                    }, colors = ButtonDefaults.buttonColors(
                        containerColor = basicColor, disabledContainerColor = Color.LightGray
                    ), enabled = !companyProfileViewModel.isCennecUsClickedStat.value,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Connect us",
                        style = TextStyle(
                            fontSize = 14.sp,
                            //  fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(400),
                            color = Color.Black,
                        )
                    )
                }
            }

            AnimatedVisibility(visible = companyProfileViewModel.isProjectsClickedStat.value) {
                Projects()
            }
            AnimatedVisibility(visible = companyProfileViewModel.isCennecUsClickedStat.value) {
                    ConnectUs()
            }

        }

    }
}

