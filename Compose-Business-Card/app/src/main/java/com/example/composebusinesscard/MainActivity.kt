package com.example.composebusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
    ) {
        Spacer(modifier = Modifier.weight(0.4f))
        ImagePart(
            modifier = Modifier.weight(0.2f)
        )
        Spacer(modifier = Modifier.weight(0.2f))
        InformationPart(
            modifier = Modifier.weight(0.2f)
        )
    }
}

@Composable
fun ImagePart(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(horizontal = 8.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.round_thumb_up_24),
            contentDescription = null,
            tint = Color.Green,
            modifier = Modifier.size(45.dp)
        )
        Text(
            text = "노재화 (Jaehwa Noh)",
            textAlign = TextAlign.Center,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "세계 최고 모바일 앱 개발자\n(The World best Mobile Application developer)",
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun InformationPart(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.padding(4.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.round_call_24),
                contentDescription = null,
                tint = Color.Blue,
                modifier = Modifier.padding(end = 16.dp)
            )
            Text("+82 10 0000 0000")
        }

        Row(modifier = Modifier.padding(4.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.round_share_24),
                contentDescription = null,
                tint = Color.Blue,
                modifier = Modifier.padding(end = 16.dp)
            )
            Text("https://www.linkedin.com/in/jaehwa-noh/")
        }

        Row(modifier = Modifier.padding(4.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.round_email_24),
                contentDescription = null,
                tint = Color.Blue,
                modifier = Modifier.padding(end = 16.dp)
            )
            Text("shwoghk14@gmail.com")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    ComposeBusinessCardTheme {
        BusinessCard()
    }
}

@Preview(showBackground = true)
@Composable
fun ImagePartPreview() {
    ComposeBusinessCardTheme {
        ImagePart()
    }
}

@Preview(showBackground = true)
@Composable
fun InformationPartPreview() {
    ComposeBusinessCardTheme {
        InformationPart()
    }
}