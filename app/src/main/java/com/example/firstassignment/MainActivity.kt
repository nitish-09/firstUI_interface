package com.example.firstassignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstassignment.quizScreen.QuizTab
import com.example.firstassignment.quizScreen.Screen2
import com.example.firstassignment.tab.TabLayout
import com.example.firstassignment.ui.theme.FirstAssignmentTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAssignmentTheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //TopBar()
                    QuizTab()
                }

            }
        }
    }
}


@Preview
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Games", fontSize = 30.sp, fontWeight = FontWeight(700))
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Image(painter = painterResource(id = R.drawable.menu), contentDescription ="menu" )
                    }
                },
                modifier = Modifier.padding(24.dp, 8.dp, 24.dp, 13.dp),
                actions = {
                    IconButton(onClick = {
                    }) {
                        Image(painter = painterResource(id = R.drawable.notification), contentDescription ="notification" )
                    }
                },

                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Transparent),
            )

        },

        ) {
        Text(text = "")

    }
    First()



}

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun First(){
    Card(modifier = Modifier
        .padding(0.dp, 71.dp, 0.dp, 24.dp),

        shape= RectangleShape) {
        Surface(
            color=Color(0xffE5F0FF),

        ) {// painter = painterResource(id = R.drawable.bulb),
            //contentDescription = "bulb svg",
            Row(modifier=Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.icon),
                    contentDescription ="Gift",
                    modifier = Modifier
                        .padding(89.dp, 8.dp, 8.dp, 8.dp)
                        .width(24.dp)
                        .size(24.dp)
                       )
                Text(text = "How to Win FlipItCoins ?", modifier = Modifier.padding(0.dp,8.dp,89.dp,8.dp), fontWeight = FontWeight(600), fontSize = 14.sp, lineHeight = 24.sp, color = Color(0xff004FC4))

            }

        }

    }

    Column(modifier=Modifier.padding(24.dp,130.dp,11.dp,10.dp)) {

        TabLayout()

    }

   // SecondItem()
}




//@Preview(showBackground = true)
@Composable
fun FirstItem(){



    //SecondItem()
}

/*
@Composable
fun Clickable() {
    ClickableText(text = AnnotatedString("How to earn >"), modifier = Modifier.padding(12.dp,0.dp,148.dp,0.dp),
        onClick ={ clicked ->
            Log.d("TAG","Clicked: $clicked")} )
}*/




@Preview(showBackground = true)
@Composable
fun SecondItem(){
    Spacer(modifier = Modifier.height(24.dp))
    Column(modifier= Modifier
        .padding(24.dp)
        .verticalScroll(rememberScrollState())) {

        Card(modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize(),
            shape = RoundedCornerShape(corner = CornerSize(16.dp))
        ) {

            Surface(
                color=Color(0xffFFFEE5)){
                Row(verticalAlignment = Alignment.CenterVertically){
                    Image(painter = painterResource(id = R.drawable.dollar_1),
                        contentDescription = "coin",modifier = Modifier
                            .padding(24.dp, 25.dp, 0.dp, 16.dp)
                            .width(40.dp)
                            .height(40.dp)
                        //.background(Color.White)
                    )
                    Column() {
                        Row(horizontalArrangement = Arrangement.Center) {
                            Text(text = "You need 1000 FlipItCoins to start!", modifier = Modifier.padding(12.dp,12.dp,24.dp,0.dp), fontSize = 16.sp, fontWeight = FontWeight(700), lineHeight = 24.sp)
                        }

                        //Text(text = "How to earn >", fontSize = 10.sp,fontWeight = FontWeight(700),lineHeight = 12.1.sp)
                        Clickable()
                    }

                }

            }


        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Contest 1", fontSize = 16.sp, fontWeight = FontWeight(500), lineHeight = 24.sp)

        Spacer(modifier = Modifier.height(8.dp))
        Card(shape= RoundedCornerShape(corner = CornerSize(15.dp)) ) {
            Surface(
                color= Color(0xff5477FF)

            ){
                Column(modifier = Modifier) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Predict end of the week NIFTY 50", modifier = Modifier
                            .padding(24.dp, 24.dp, 16.dp, 16.dp)
                            .weight(1f),fontSize = 18.sp, fontWeight = FontWeight(700), lineHeight = 22.sp, color = Color(0xffFFFFFF) )
                       // Icon(Icons.Filled.Share, "",modifier = Modifier.padding(0.dp,34.dp,24.dp,26.dp))
                         Image(painter = painterResource(id = R.drawable.share), contentDescription ="share", modifier = Modifier
                             .padding(16.dp, 34.dp, 24.dp, 26.dp)
                             .height(24.dp) )

                    }
                    Text(text = "closes for answer on 21 May,2021 at 12 Pm",modifier = Modifier.padding(24.dp,16.dp,24.dp,24.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp, color = Color(0xffFFFFFF))
                    OnClick()
                }

            }


        }

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Contest 2", fontSize = 16.sp, fontWeight = FontWeight(500), lineHeight = 24.sp)

        Spacer(modifier = Modifier.height(8.dp))
        Card(
            shape= RoundedCornerShape(corner = CornerSize(8.dp)) ) {
            Surface(
                color= Color(0xffFFA174),
                //shape = RectangleShape
            ){
                Column(modifier = Modifier) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Predict end of the week NIFTY 50", modifier = Modifier
                            .padding(24.dp, 24.dp, 16.dp, 16.dp)
                            .weight(1f),fontSize = 18.sp, fontWeight = FontWeight(700), lineHeight = 22.sp, color = Color(0xffFFFFFF) )
                        // Icon(Icons.Filled.Share, "",modifier = Modifier.padding(0.dp,34.dp,24.dp,26.dp))
                        Image(painter = painterResource(id = R.drawable.share), contentDescription ="share", modifier = Modifier
                            .padding(16.dp, 34.dp, 24.dp, 26.dp)
                            .height(24.dp) )

                    }
                    Text(text = "closes for answer on 21 May,2021 at 12 Pm",modifier = Modifier.padding(24.dp,16.dp,24.dp,24.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp, color = Color(0xffFFFFFF))
                    OnClick()
                }

            }


        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Contest 3", fontSize = 16.sp, fontWeight = FontWeight(500), lineHeight = 24.sp)

        Spacer(modifier = Modifier.height(8.dp))
        Card(
            shape= RoundedCornerShape(corner = CornerSize(8.dp)) ) {
            Surface(
                color= Color(0xffFFB2C0),
                //shape = RectangleShape
            ){
                Column(modifier = Modifier) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Predict end of the week NIFTY 50", modifier = Modifier
                            .padding(24.dp, 24.dp, 16.dp, 16.dp)
                            .weight(1f),fontSize = 18.sp, fontWeight = FontWeight(700), lineHeight = 22.sp, color = Color(0xffFFFFFF) )
                        // Icon(Icons.Filled.Share, "",modifier = Modifier.padding(0.dp,34.dp,24.dp,26.dp))
                        Image(painter = painterResource(id = R.drawable.share), contentDescription ="share", modifier = Modifier
                            .padding(16.dp, 34.dp, 24.dp, 26.dp)
                            .height(24.dp) )

                    }
                    Text(text = "closes for answer on 21 May,2021 at 12 Pm",modifier = Modifier.padding(24.dp,16.dp,24.dp,24.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp, color = Color(0xffFFFFFF))
                    OnClick()
                }

            }


        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Contest 4", fontSize = 16.sp, fontWeight = FontWeight(500), lineHeight = 24.sp)

        Spacer(modifier = Modifier.height(8.dp))
        Card(
            shape= RoundedCornerShape(corner = CornerSize(8.dp)) ) {
            Surface(
                color= Color(0xff186CCF),
                //shape = RectangleShape
            ){
                Column(modifier = Modifier) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Predict end of the week NIFTY 50", modifier = Modifier
                            .padding(24.dp, 24.dp, 16.dp, 16.dp)
                            .weight(1f),fontSize = 18.sp, fontWeight = FontWeight(700), lineHeight = 22.sp, color = Color(0xffFFFFFF) )
                        // Icon(Icons.Filled.Share, "",modifier = Modifier.padding(0.dp,34.dp,24.dp,26.dp))
                        Image(painter = painterResource(id = R.drawable.share), contentDescription ="share", modifier = Modifier
                            .padding(16.dp, 34.dp, 24.dp, 26.dp)
                            .height(24.dp) )

                    }
                    Text(text = "closes for answer on 21 May,2021 at 12 Pm",modifier = Modifier.padding(24.dp,16.dp,24.dp,24.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp, color = Color(0xffFFFFFF))
                    OnClick()
                }

            }


        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Contest 4", fontSize = 16.sp, fontWeight = FontWeight(500), lineHeight = 24.sp)

        Spacer(modifier = Modifier.height(8.dp))
        Card(
            shape= RoundedCornerShape(corner = CornerSize(8.dp)) ) {
            Surface(
                color= Color(0xffFF5F6D),
                //shape = RectangleShape
            ){
                Column(modifier = Modifier) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Predict end of the week NIFTY 50", modifier = Modifier
                            .padding(24.dp, 24.dp, 16.dp, 16.dp)
                            .weight(1f),fontSize = 18.sp, fontWeight = FontWeight(700), lineHeight = 22.sp, color = Color(0xffFFFFFF) )
                        // Icon(Icons.Filled.Share, "",modifier = Modifier.padding(0.dp,34.dp,24.dp,26.dp))
                        Image(painter = painterResource(id = R.drawable.share), contentDescription ="share", modifier = Modifier
                            .padding(16.dp, 34.dp, 24.dp, 26.dp)
                            .height(24.dp) )

                    }
                    Text(text = "closes for answer on 21 May,2021 at 12 Pm",modifier = Modifier.padding(24.dp,16.dp,24.dp,24.dp) ,fontSize = 12.sp, fontWeight = FontWeight(400), lineHeight = 20.sp, color = Color(0xffFFFFFF))
                    OnClick()
                }

            }


        }

    }
}


@Composable
fun Clickable() {
    Text(
        modifier = Modifier
            .padding(12.dp, 0.dp, 148.dp, 8.dp)
            .clickable { println("Clicked") },
        text ="How to earn >",

        fontWeight = FontWeight(700),
        fontSize = 10.sp,
        lineHeight = 12.1.sp,
        color = Color(0xff004FC4)
    )
}

@Composable
fun OnClick(){
    Column( modifier = Modifier.padding(54.dp,10.dp,44.dp,19.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(

            shape = RoundedCornerShape(corner = CornerSize(20.dp)),
            modifier = Modifier.clickable {
            }
        ) {
            Surface(
                color=Color(0xffFAFAFD)) {

                Text(
                    text = "Earn Coins to Play",
                    modifier = Modifier.padding(37.dp, 8.dp, 37.dp, 8.dp),
                    color = Color(0xff004FC4),
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    lineHeight = 24.sp
                )
            }
        }
    }

}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstAssignmentTheme {
        TopBar()

    }
}