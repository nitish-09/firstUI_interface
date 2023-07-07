package com.example.firstassignment.quizScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.TabRowDefaults.contentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstassignment.R

@Preview(showBackground = true)
@Composable
fun Question1(){
    Column(modifier = Modifier.padding(24.dp)) {

        Card(modifier = Modifier.padding(),
            shape= RectangleShape
        ){
            Surface{
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Question 1",fontSize = 14.sp, fontWeight = FontWeight(300), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                        Row(horizontalArrangement = Arrangement.End) {
                            Text(text = "Earned:", fontSize = 12.sp,fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                            Text(text = "0 flipitCoins", fontSize = 12.sp, fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff00BC5B))


                        }


                    }

                    //
                    Text(text ="Apple ipad's retina display is manufactured by:",fontSize = 20.sp, fontWeight = FontWeight(600), lineHeight = 32.sp, color = Color(0xff333333))
                    Below1()


                }

            }

        }
        Spacer(modifier = Modifier.weight(1f))
        Button1()
    }
}


@Composable
fun Button1(){

    Card(){

        Surface() {
            Column(modifier = Modifier.padding(24.dp)) {
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp, Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xff00BC5B),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Eicher Motors", modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
                Spacer(modifier = Modifier.height(24.dp))



                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "Tesla",modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)

                }

                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFF0000),
                        contentColor=Color.White
                    )
                ) {
                    Text(text = "Faceboook",modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)

                }
                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    //modifier=Modifier.padding(0.dp,24.dp,0.dp,0.dp),
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "ITC",modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)

                }
            }
            
        }

    }
}






@Composable
fun Below1(){

    Spacer(modifier = Modifier.height(24.dp))
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        Box(modifier = Modifier
            .padding(0.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xff00BC5B))){
            Text(text = "My Feed",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp,color=Color.White)
            Image(painter = painterResource(id = R.drawable.lock), contentDescription = "lock", modifier = Modifier.padding(65.dp,2.dp,11.dp,3.dp))
        }

        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Stocks",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Hot",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Crypto",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Question2(){
    Column() {

        Card(modifier = Modifier.padding(24.dp,15.dp,24.dp,112.dp),
            shape= RectangleShape
        ){
            Surface{
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Question 2",fontSize = 14.sp, fontWeight = FontWeight(300), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                        Row(horizontalArrangement = Arrangement.End) {
                            Text(text = "Earned:", fontSize = 12.sp,fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                            Text(text = "0 flipitCoins", fontSize = 12.sp, fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff00BC5B))


                        }


                    }

                    //
                    Text(text ="Capital of India is:",fontSize = 20.sp, fontWeight = FontWeight(600), lineHeight = 32.sp, color = Color(0xff333333))
                    Below2()


                }

            }

        }
        Spacer(modifier = Modifier.weight(1f))
        Button2()
    }
}


@Composable
fun Button2(){

    Card(){

        Surface() {
            Column(modifier = Modifier.padding(24.dp)) {
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp, Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xff00BC5B),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Chhattisgarh", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center
                    )

                }
                Spacer(modifier = Modifier.height(24.dp))



                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "Kerla",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }

                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFF0000),
                        contentColor=Color.White
                    )
                ) {
                    Text(text = "New Delhi",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    //modifier=Modifier.padding(0.dp,24.dp,0.dp,0.dp),
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "Punjab",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
            }

        }

    }
}






@Composable
fun Below2(){

    Spacer(modifier = Modifier.height(24.dp))
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        Box(modifier = Modifier
            .padding(0.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xff00BC5B))){
            Text(text = "My Feed",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp,color=Color.White)
            Image(painter = painterResource(id = R.drawable.lock), contentDescription = "lock", modifier = Modifier.padding(59.dp,2.dp,3.3.dp,3.dp))
        }

        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Stocks",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Hot",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Crypto",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
    }

}





@Preview(showBackground = true)
@Composable
fun Question3(){
    Column() {

        Card(modifier = Modifier.padding(24.dp,15.dp,24.dp,112.dp),
            shape= RectangleShape
        ){
            Surface{
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Question 3",fontSize = 14.sp, fontWeight = FontWeight(300), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                        Row(horizontalArrangement = Arrangement.End) {
                            Text(text = "Earned:", fontSize = 12.sp,fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                            Text(text = "0 flipitCoins", fontSize = 12.sp, fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff00BC5B))


                        }


                    }

                    //
                    Text(text ="Java was introduced in which year",fontSize = 20.sp, fontWeight = FontWeight(600), lineHeight = 32.sp, color = Color(0xff333333))
                    Below3()


                }

            }

        }
        Spacer(modifier = Modifier.weight(1f))
        Button3()
    }
}


@Composable
fun Button3(){

    Card(){

        Surface() {
            Column(modifier = Modifier.padding(24.dp)) {
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp, Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xff00BC5B),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "1991", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center
                    )

                }
                Spacer(modifier = Modifier.height(24.dp))



                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "1999",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }

                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFF0000),
                        contentColor=Color.White
                    )
                ) {
                    Text(text = "1995",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    //modifier=Modifier.padding(0.dp,24.dp,0.dp,0.dp),
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "1998",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
            }

        }

    }
}






@Composable
fun Below3(){

    Spacer(modifier = Modifier.height(24.dp))
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        Box(modifier = Modifier
            .padding(0.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xff00BC5B))){
            Text(text = "My Feed",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp,color=Color.White)
            Image(painter = painterResource(id = R.drawable.lock), contentDescription = "lock", modifier = Modifier.padding(59.dp,2.dp,3.3.dp,3.dp))
        }

        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Stocks",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Hot",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Crypto",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
    }

}



@Preview(showBackground = true)
@Composable
fun Question4(){
    Column() {

        Card(modifier = Modifier.padding(24.dp,15.dp,24.dp,80.dp),
            shape= RectangleShape
        ){
            Surface{
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Question 4",fontSize = 14.sp, fontWeight = FontWeight(300), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                        Row(horizontalArrangement = Arrangement.End) {
                            Text(text = "Earned:", fontSize = 12.sp,fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                            Text(text = "0 flipitCoins", fontSize = 12.sp, fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff00BC5B))


                        }


                    }

                    //
                    Text(text ="How many companies are a part of Sensex (Stock Exchange Sensitive Index)?",fontSize = 20.sp, fontWeight = FontWeight(600), lineHeight = 32.sp, color = Color(0xff333333))
                    Below4()


                }

            }

        }
        Spacer(modifier = Modifier.weight(1f))
        Button4()
    }
}


@Composable
fun Button4(){

    Card(){

        Surface() {
            Column(modifier = Modifier.padding(24.dp)) {
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp, Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xff00BC5B),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "20", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center
                    )

                }
                Spacer(modifier = Modifier.height(24.dp))



                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "50",modifier = Modifier
                        .width(295.dp)
                        .height(24.dp),textAlign = TextAlign.Center)

                }

                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFF0000),
                        contentColor=Color.White
                    )
                ) {
                    Text(text = "30",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    //modifier=Modifier.padding(0.dp,24.dp,0.dp,0.dp),
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "100",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
            }

        }

    }
}






@Composable
fun Below4(){

    Spacer(modifier = Modifier.height(24.dp))
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        Box(modifier = Modifier
            .padding(0.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xff00BC5B))){
            Text(text = "My Feed",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp,color=Color.White)
            Image(painter = painterResource(id = R.drawable.lock), contentDescription = "lock", modifier = Modifier.padding(59.dp,2.dp,3.3.dp,3.dp))
        }

        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Stocks",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Hot",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Crypto",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Question5(){
    Column() {

        Card(shape= RectangleShape){
            Surface{
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Question 5",fontSize = 14.sp, fontWeight = FontWeight(300), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                        Row(horizontalArrangement = Arrangement.End) {
                            Text(text = "Earned:", fontSize = 12.sp,fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                            Text(text = "0 flipitCoins", fontSize = 12.sp, fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff00BC5B))


                        }


                    }

                    //
                    Text(text ="Present Prime Minister of india is",fontSize = 20.sp, fontWeight = FontWeight(600), lineHeight = 32.sp, color = Color(0xff333333))
                    Below5()


                }

            }

        }
        Spacer(modifier = Modifier.weight(1f))
        Button5()
    }
}


@Composable
fun Button5(){

    Card(){

        Surface() {
            Column(modifier = Modifier.padding(24.dp)) {
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp, Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xff00BC5B),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Rahul Gandhi", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center
                    )

                }
                Spacer(modifier = Modifier.height(24.dp))



                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "Arvind Kejriwal",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }

                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFF0000),
                        contentColor=Color.White
                    )
                ) {
                    Text(text = "Narendra Modi",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    //modifier=Modifier.padding(0.dp,24.dp,0.dp,0.dp),
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "mamata Banerjee ",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
            }

        }

    }
}






@Composable
fun Below5(){

    Spacer(modifier = Modifier.height(24.dp))
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        Box(modifier = Modifier
            .padding(0.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xff00BC5B))){
            Text(text = "My Feed",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp,color=Color.White)
            Image(painter = painterResource(id = R.drawable.lock), contentDescription = "lock", modifier = Modifier.padding(59.dp,2.dp,3.3.dp,3.dp))
        }

        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Stocks",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Hot",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Crypto",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
    }

}


@Preview(showBackground = true)
@Composable
fun Question6(){
    Column() {

        Card(shape= RectangleShape){
            Surface{
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(text = "Question 6",fontSize = 14.sp, fontWeight = FontWeight(300), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                        Row(horizontalArrangement = Arrangement.End) {
                            Text(text = "Earned:", fontSize = 12.sp,fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff1A1A1A))

                            Text(text = "0 flipitCoins", fontSize = 12.sp, fontWeight = FontWeight(500), lineHeight = 20.sp, color = Color(0xff00BC5B))


                        }


                    }

                    //
                    Text(text ="Founder & CEO of FlipItMoney:",fontSize = 20.sp, fontWeight = FontWeight(600), lineHeight = 32.sp, color = Color(0xff333333))
                    Below6()


                }

            }

        }
        Spacer(modifier = Modifier.weight(1f))
        Button6()
    }
}


@Composable
fun Button6(){

    Card(){

        Surface() {
            Column(modifier = Modifier.padding(24.dp)) {
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp, Color.Transparent),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xff00BC5B),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Dipankar Biswas", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center
                    )

                }
                Spacer(modifier = Modifier.height(24.dp))



                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "Jeff Bezos",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }

                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "Mark Zuckerberg",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
                Spacer(modifier = Modifier.height(24.dp))

                OutlinedButton(onClick = { /*TODO*/ },
                    //modifier=Modifier.padding(0.dp,24.dp,0.dp,0.dp),
                    border = BorderStroke(1.dp,Color(0xffBDBDBD)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor=Color.Black
                    )
                ) {
                    Text(text = "Ratan Tata",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)

                }
            }

        }

    }
}






@Composable
fun Below6(){

    Spacer(modifier = Modifier.height(24.dp))
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    )  {
        Box(modifier = Modifier
            .padding(0.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xff00BC5B))){
            Text(text = "My Feed",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp,color=Color.White)
            Image(painter = painterResource(id = R.drawable.lock), contentDescription = "lock", modifier = Modifier.padding(59.dp,2.dp,3.3.dp,3.dp))
        }

        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Stocks",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Hot",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
        Box(modifier = Modifier
            .padding(6.dp, 0.dp, 6.dp, 0.dp)
            .clip(RoundedCornerShape(size = 12.dp))
            .background(Color(0xffD2F4E3))){
            Text(text = "Crypto",modifier = Modifier.padding(11.dp,0.dp,11.dp,0.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp)
        }
    }

}










