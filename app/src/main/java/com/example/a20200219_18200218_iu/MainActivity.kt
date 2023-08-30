package com.example.a20200219_18200218_iu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a19200211_20200077_iu.R
import com.example.a20200219_18200218_iu.ui.theme._20200219_18200218_iuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _20200219_18200218_iuTheme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(top = 16.dp)
        )
        Text(
            text = "Rodrigo e Ivan",
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 24.sp
        )
        Text(
            text = "Estudiantes de FISI",
            fontSize = 16.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.weight(1f)) // Espacio flexible para empujar el número hacia abajo
        Text(
            text = "Telf: 990052925",
            modifier = Modifier.padding(bottom = 24.dp),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 16.sp
        )
        Text(
            text = "adrian.urbano@unmsm.edu.pe",
            modifier = Modifier.padding(bottom = 24.dp),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 16.sp
        )
        Text(
            text = "Estudiante de DSM",
            modifier = Modifier.padding(bottom = 24.dp),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 16.sp
        )
    }
}





@Preview (showBackground = true)
@Composable
fun TarjetaPresentacionPrevio(){
    _20200219_18200218_iuTheme{
        TarjetaPresentacion()
    }
}