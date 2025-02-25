package com.example.wildway

import android.content.Intent
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.*
import androidx.navigation.compose.*
import com.example.wildway.ui.theme.TextGreen
import com.example.wildway.ui.theme.TextGrey
import com.example.wildway.ui.theme.montserratFamily

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
    val context = LocalContext.current
    Button(onClick = { context.startActivity(Intent(context, Authentication::class.java)) },
        modifier = Modifier.fillMaxSize(),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)) { }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 120.dp, start = 30.dp, end = 30.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
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
                fontFamily = montserratFamily,
                fontStyle = FontStyle.Normal
            )
            Text(
                "Way",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = montserratFamily,
                fontStyle = FontStyle.Normal
            )
        }
        Text("Каждый может тренироваться",
            color = TextGrey,
            fontSize = 18.sp,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        )
    }

}

//Не моё это, забыл как переходы между активностями делать и всё