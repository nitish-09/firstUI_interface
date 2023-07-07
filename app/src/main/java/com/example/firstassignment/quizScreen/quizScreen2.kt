package com.example.firstassignment.quizScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstassignment.R

@Preview(showBackground = true)
@Composable
fun Screen2(){

    Box(){
    Column(modifier = Modifier.padding(24.dp)) {
        Row() {
            Spacer(modifier = Modifier.width(300.dp))
            Image(
                painter = painterResource(id = R.drawable.close),

                contentDescription = "close"
            )

        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            shape = RectangleShape
        ) {
            Surface {

                Column {
                    Text(
                        text = "Trivia",
                        modifier = Modifier.padding(),
                        fontSize = 12.sp,
                        fontWeight = FontWeight(500),
                        lineHeight = 20.sp,
                        color = Color(0xffE57A00)
                    )

                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        text = "The Innovative Quiz",
                        fontSize = 24.sp,
                        fontWeight = FontWeight(600),
                        lineHeight = 40.sp,
                        color = Color(0xff333333)
                    )
                    Text(
                        text = "More then 2016 users participated as of now!",
                        modifier = Modifier.padding(0.dp, 24.dp, 24.dp, 40.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight(300),
                        lineHeight = 20.sp,
                        color = Color(0xff4F4F4F)
                    )
                    Row() {
                        Text(
                            text = "Powered by ",
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            lineHeight = 20.sp,
                            color = Color(0xff828282)
                        )
                        Text(
                            text = "flipitmoney",
                            fontSize = 12.sp,
                            fontWeight = FontWeight(500),
                            lineHeight = 20.sp,
                            color = Color(0xff00BC5B)
                        )
                    }
                }
            }
        }
        Box(modifier = Modifier.padding(0.dp,168.dp,0.dp,0.dp)){
        Image(painter = painterResource(id = R.drawable.cube),
            contentDescription ="circle", modifier = Modifier
                .padding(131.dp, 80.dp, 73.dp, 23.dp)
                .height(138.dp)
                .width(139.dp))
        Image(painter = painterResource(id = R.drawable.cylinder),
            contentDescription ="circle", modifier = Modifier
                .padding(293.dp, 0.dp, 0.dp, 37.dp)
                .height(153.dp)
                .width(103.dp))
        Image(painter = painterResource(id = R.drawable.supertoroid),
            contentDescription ="circle", modifier = Modifier
                .padding(255.dp, 193.dp, 0.dp, 0.dp)
                .height(115.dp)
                .width(130.dp))

            Click()
        }

    }

    }

}

@Composable
fun Click(){

   // Spacer(modifier = Modifier.height(10.dp))
        Card(

            shape = RoundedCornerShape(corner = CornerSize(100.dp)),
            modifier = Modifier
                .padding(38.dp,235.dp,10.dp,10.dp)
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

