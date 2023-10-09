package com.example.composebusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebusinesscard.ui.theme.ComposeBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        ImagePart()
        InformationPart()
    }
}

@Composable
fun ImagePart(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {

    }
}

@Composable
fun InformationPart(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.padding(4.dp)) {
            Image(
                painter = painterResource(id = R.drawable.round_call_24),
                contentDescription = null,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
            Text("+82 10 0000 0000")
        }

        Row(modifier = Modifier.padding(4.dp)) {
            Image(
                painter = painterResource(id = R.drawable.round_share_24),
                contentDescription = null,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
            Text("https://www.linkedin.com/in/jaehwa-noh/")
        }

        Row(modifier = Modifier.padding(4.dp)) {
            Image(
                painter = painterResource(id = R.drawable.round_email_24),
                contentDescription = null,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
            Text("shwoghk14@gmail.com")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun InformationPartPreview() {
    ComposeBusinessCardTheme {
        InformationPart()
    }
}