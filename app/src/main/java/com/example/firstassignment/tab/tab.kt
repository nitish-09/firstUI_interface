package com.example.firstassignment.tab


import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.firstassignment.SecondItem
import com.example.firstassignment.ui.theme.FirstAssignmentTheme
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch





@Preview(showBackground = true)
@OptIn(ExperimentalUnitApi::class)
@ExperimentalPagerApi
@Composable
fun TabLayout() {

    val pagerState = rememberPagerState(3)

    Column(
        modifier = Modifier.background(Color.White)
    ) {
        Tabs(pagerState = pagerState)
        TabsContent(pagerState = pagerState)
    }
}

@ExperimentalPagerApi
@Composable
fun Tabs(pagerState: PagerState) {

    val list= listOf<String>(
        "Upcoming",
        "Live",
        "Completed"
    )


    val scope = rememberCoroutineScope()
    //Card(shape = RoundedCornerShape(corner = CornerSize(30.dp))) {

    TabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = Color.Transparent,
        contentColor = Color.Transparent,
        divider = {
                  Box(){

                  }
        },
        indicator = {
            Box(){

            }
        }
    ) {

        list.forEachIndexed { index,_ ->

            Tab(
                modifier = Modifier
                    .padding(8.dp)
                    .clip(RoundedCornerShape(size = 70.dp))
                    .background(
                        if (pagerState.currentPage == index) {
                            Color(0xff00BC5B)
                        } else {
                            Color(0xffF2F2F5)
                        }
                    ),

                text = {
                    Text(
                        list.get(index),
                        fontSize = 14.sp, fontWeight = FontWeight(400), lineHeight = 24.sp,
                        color = if (pagerState.currentPage == index){
                           Color.White
                       }else Color.Black
                    )
                },
                selected = pagerState.currentPage == index,

                onClick = {

                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }


                },
                selectedContentColor= Color.White
                //unselectedContentColor = Color.Black
            )
        }
    }
}




@ExperimentalPagerApi
@Composable
fun TabsContent(pagerState: PagerState) {
    HorizontalPager(count = 3,state = pagerState) {
        // on below line we are specifying
        // the different pages.
            page ->
        when (page) {

            0 -> TabContentScreen(data = "Welcome to Upcoming screen")

            1 -> SecondItem()

            2 -> TabContentScreen(data = "Welcome to Completed Screen")
        }
    }
}


@Composable
fun TabContentScreen(data: String) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(

            text = data,
            style = MaterialTheme.typography.h6,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}
