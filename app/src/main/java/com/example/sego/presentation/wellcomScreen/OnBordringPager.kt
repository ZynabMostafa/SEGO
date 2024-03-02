package com.example.sego.presentation.wellcomScreen

import com.example.sego.R

sealed class OnBordringPager(
   val image: Int,
   val titel:String,
   val description:String
) {
    object FirstPager:OnBordringPager(
        image = R.drawable.first , titel = "We are the best " , description = ""
    )
    object SecondPager:OnBordringPager(
        image = R.drawable.second , titel = "We are the best" , description = ""
    )
    object ThirdPager:OnBordringPager(
        image = R.drawable.third , titel = "We are the best" , description = ""
    )
}