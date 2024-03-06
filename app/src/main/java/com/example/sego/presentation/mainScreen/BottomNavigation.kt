package com.example.sego.presentation.mainScreen


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.sego.presentation.clases.Contents
import com.example.sego.presentation.ui.theme.basicColor

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    // observe current route to change the icon
    // color,label color when navigated
    val currentRoute = navBackStackEntry?.destination
    val bottomDestination= Contents.BottomNavItems.any{it.route == currentRoute?.route}
    // Bottom nav items we declared
    if (bottomDestination){
    BottomNavigation(

        // set background color
        backgroundColor = basicColor,
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp, bottom = 30.dp)
            .clip(RoundedCornerShape(15.dp))
    ) {

        // observe the backstack

            Contents.BottomNavItems.forEach { navItem ->

                // Place the bottom nav items
                BottomNavigationItem(

                    // it currentRoute is equal then its selected route
                    selected = (currentRoute?.route == navItem.route),

                    // navigate on click
                    onClick = {
                        navController.navigate(navItem.route)
                    },

                    // Icon of navItem
                    icon = {
                        Icon(imageVector = navItem.icon, contentDescription = navItem.label)
                    },

                    // label
                    label = {
                        Text(text = navItem.label)
                    },
                    alwaysShowLabel = false
                )
            }

        }
    }
}