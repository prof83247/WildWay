package com.example.wildway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.TextGreen
import com.example.wildway.ui.theme.TextGrey

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SplashScreen()
        }
    }
}

@Composable
fun SplashScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 120.dp, start = 30.dp, end = 30.dp ),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(R.drawable.splashlogo),
            contentDescription = null,
            modifier = Modifier.size(314.dp, 323.dp)
        )
        Row(modifier = Modifier.fillMaxWidth()
            .padding(top = 15.dp),
            horizontalArrangement = Arrangement.Center) {
            Text(
                "Wild",
                fontSize = 32.sp,
                color = TextGreen,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily()
            )
            Text(
                "Way",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Text("Каждый может тренироваться",
            color = TextGrey,
            fontSize = 18.sp)
    }
}