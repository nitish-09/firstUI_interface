package com.example.firstassignment.quizScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Screen3(){
    Card(modifier = Modifier.padding(24.dp,130.dp,24.dp,426.dp),
        shape= RectangleShape
    ){
        Surface{
            Column() {
                Row() {
                    Text(text = "Question 1",fontSize = 14.sp,modifier=Modifier.padding(0.dp,0.dp,24.dp,8.dp), fontWeight = FontWeight(300), lineHeight = 20.sp, color = Color(0xff1A1A1A))
                    Text(text = "Earned:",modifier=Modifier.padding(140.dp,0.dp,4.dp,0.dp), fontSize = 12.sp, fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff1A1A1A))
                    Text(text = "0 flipitCoins",modifier=Modifier.padding(2.dp,0.dp,0.dp,8.dp), fontSize = 12.sp, fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff00BC5B))
                }

                Text(text = "Apple ipad's retina display is manufactured by: ",fontSize = 20.sp, fontWeight = FontWeight(600), lineHeight = 32.sp, color = Color(0xff333333))
                
            }
            
        }

    }
}