package com.example.wildway

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.AnotherJustOneTime
import com.example.wildway.ui.theme.montserratFamily

class CreatingProfile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Profile()
        }
    }
}

@Composable
fun Profile() {

    val context = LocalContext.current
    var gender by remember { mutableStateOf("") }
    var birthday by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 45.dp, horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Давайте создадим\nваш профиль",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = montserratFamily,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.padding(top = 5.dp))
        Text(
            "Это поможет нам узнать о вас больше!",
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = montserratFamily,
            fontStyle = FontStyle.Normal,
            color = AnotherJustOneTime
        )
        Spacer(modifier = Modifier.padding(bottom = 30.dp))

        OutlinedTextField(
            value = gender,
            onValueChange = { gender = it },
            shape = CircleShape,
            modifier = Modifier.size(315.dp, 48.dp)
        )
        Spacer(modifier = Modifier.padding(bottom = 15.dp))

        OutlinedTextField(
            value = birthday,
            onValueChange = { birthday = it },
            shape = CircleShape,
            modifier = Modifier.size(315.dp, 48.dp)
        )
        Spacer(modifier = Modifier.padding(bottom = 15.dp))

        OutlinedTextField(
            value = weight,
            onValueChange = { weight = it },
            shape = CircleShape,
            modifier = Modifier.size(315.dp, 48.dp)
        )
        Spacer(modifier = Modifier.padding(bottom = 15.dp))

        OutlinedTextField(
            value = height,
            onValueChange = { height = it },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = CircleShape,
            modifier = Modifier.size(315.dp, 48.dp)
        )
        Spacer(Modifier.padding(bottom = 30.dp))
        Button(
            onClick = { context.startActivity(Intent(context, ChooseGoal::class.java)) },
            Modifier.size(315.dp, 60.dp)
        ) {
            Text(
                "Далее >",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontFamily = montserratFamily,
                fontSize = 16.sp
            )
        }
    }
}