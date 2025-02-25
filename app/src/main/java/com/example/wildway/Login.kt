package com.example.wildway

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wildway.ui.theme.CianGreen
import com.example.wildway.ui.theme.JustOneTime
import com.example.wildway.ui.theme.montserratFamily

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginScreen()
        }
    }
}

@Composable
fun LoginScreen() {

    val context = LocalContext.current
    var email by remember { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 45.dp, horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Привет,",
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = montserratFamily,
            fontStyle = FontStyle.Normal
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            "Добро Пожаловать",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = montserratFamily,
            fontStyle = FontStyle.Normal
        )
        Spacer(modifier = Modifier.padding(30.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            shape = CircleShape,
            modifier = Modifier.size(315.dp, 48.dp)
        )
        Spacer(modifier = Modifier.padding(15.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = CircleShape,
            modifier = Modifier.size(315.dp, 48.dp)
        )
        TextButton(onClick = {}) {
            Text("Забыл пароль?",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                fontFamily = montserratFamily,
                fontSize = 12.sp,
                color = JustOneTime)
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { },
            Modifier.size(315.dp, 60.dp)
        ) {
            Text(
                "Войти",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontFamily = montserratFamily,
                fontSize = 16.sp
            )
        }
        Spacer(Modifier.padding(20.dp))
        Text(
            "Или",
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Normal,
            fontFamily = montserratFamily,
            fontSize = 12.sp
        )
        Spacer(Modifier.padding(20.dp))
        Icon(painter = painterResource(R.drawable.googleicon), contentDescription = null)
        Spacer(Modifier.padding(20.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Text(
                "Нет аккаунта?",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.SemiBold,
                fontFamily = montserratFamily,
                fontSize = 14.sp
            )
            TextButton(onClick = { context.startActivity(Intent(context, Authentication::class.java)) }){
                Text(
                    "Зарегистрироваться",
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = montserratFamily,
                    fontSize = 14.sp,
                    color = CianGreen
                )
            }
        }
    }
}

