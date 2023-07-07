package com.example.firstassignment.quizScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.firstassignment.R
import com.example.firstassignment.SecondItem
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch



@Preview(showBackground = true)
@OptIn(ExperimentalUnitApi::class)
@ExperimentalPagerApi
@Composable
fun QuizTab() {

 Column() {
     

     Row(modifier= Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
         //Spacer(modifier = Modifier.width(345.dp))
         Image(painter = painterResource(id = R.drawable.close), contentDescription = "", alignment = Alignment.Center)
     }
    val pagerState = rememberPagerState(6)

    Column(
        modifier = Modifier.background(Color.White)
    ) {
        Tabs(pagerState = pagerState)
        TabsContent(pagerState = pagerState)
    }
    }
}

@ExperimentalPagerApi
@Composable
fun Tabs(pagerState: PagerState) {
    val n = 6

    val list: List<String> = List(n) {""}


    val scope = rememberCoroutineScope()
    //Card(shape = RoundedCornerShape(corner = CornerSize(30.dp))) {

    TabRow(
        selectedTabIndex = pagerState.currentPage,
        modifier=Modifier.padding(24.dp,0.dp,24.dp,15.dp),
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
                    .height(6.dp)
                    .clip(RoundedCornerShape(size = 10.dp))
                    .background(
                        if (pagerState.currentPage == index) {
                            Color(0xffC7C9D9)
                        } else {
                            Color(0xff555770)
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

    HorizontalPager(count = 6,state = pagerState) {
            page ->
        when (page) {

            0 -> Question1()

            1 -> Question2()

            2 -> Question3()
            3 -> Question4()
            4-> Question5()

            5-> Question6()
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
