package com.example.appcompse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.appcompse.ui.theme.AppCompseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            AppCompseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(24.dp).background(Color.Blue)) {
        item {
        Image(
            painter = painterResource(id = R.drawable.deadpool),
            contentDescription = "logo Aristidevs"
        )
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Text(
            text = "Adios!!!",
            modifier = modifier
        )
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.deadpool),
                contentDescription = "logo Aristidevs"
            )
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
            Text(
                text = "Adios!!!",
                modifier = modifier
            )
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.deadpool),
                contentDescription = "logo Aristidevs"
            )
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
            Text(
                text = "Adios!!!",
                modifier = modifier
            )
        }

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppCompseTheme {
        Greeting("Android")
    }
}