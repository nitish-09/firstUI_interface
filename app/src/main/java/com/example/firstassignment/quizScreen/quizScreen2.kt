package com.example.firstassignment.quizScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Screen2(){
    Card(modifier = Modifier.padding(24.dp,128.dp,24.dp,408.dp),
        shape= RectangleShape ){ //24.dp ,128.dp, 24.dp, 600.dp
       Surface{

            Column {
                Text(text = "Trivia",modifier = Modifier.padding(0.dp,0.dp,262.dp,28.dp),fontSize = 12.sp, fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xffE57A00))
                Text(text = "The Innovative Quiz",modifier = Modifier.padding() ,fontSize = 24.sp, fontWeight = FontWeight(600), lineHeight = 40.sp, color = Color(0xff333333))
                Text(text = "More then 2016 users participated as of now!",modifier = Modifier.padding(0.dp,24.dp,24.dp,40.dp) ,fontSize = 14.sp, fontWeight = FontWeight(300), lineHeight = 20.sp, color = Color(0xff4F4F4F))
                Text(text = "Powered by flipitmoney" ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp, color = Color(0xff828282))


            }
        }
    }
    Click()
}

@Composable
fun Click(){

        Card(

            shape = RoundedCornerShape(corner = CornerSize(100.dp)),
            modifier = Modifier
                .padding(68.dp, 724.dp, 68.dp, 48.dp)
                .clickable {
                }
        ) {
            Surface(color= Color(0xff00BC5B)) {

            Text(
                text = "Get Started",
                modifier = Modifier.padding(73.dp, 8.dp, 73.dp, 8.dp),
                color = Color(0xffFFFFFF),
                fontSize = 16.sp,
                fontWeight = FontWeight(600),
                lineHeight = 24.sp
            )
        }
    }
}

