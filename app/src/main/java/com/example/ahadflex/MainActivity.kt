package com.example.ahadflex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ahadflex.ui.theme.AhadFlexTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AhadFlexTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Ahad",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    // * The qualities should be handled as a List:

    val qualities = listOf("720p", "1080p")

    var isAdded by remember{
        mutableStateOf(false)
    }

    Box(modifier = modifier
        .background(Color(0xFF141414))
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(all = 16.dp)){

        Column ( horizontalAlignment = Alignment.Start,
                 verticalArrangement = Arrangement.Top,
                 modifier = Modifier.fillMaxWidth()) {


            Image(
                painter = painterResource(R.drawable.m1),
                contentDescription = "This is an image of compose",

                )

            Text(

                text = "Forgotten",
                fontFamily = FontFamily.Default,
                style = MaterialTheme.typography.headlineLarge,
                color = Color.LightGray
            )


            // row for Date and Quality
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "2017",
                    fontFamily = FontFamily.Default,
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.LightGray
                )

                // row for resolution list (720,1080)
                Row( horizontalArrangement = Arrangement.spacedBy(8.dp) ) {
                    qualities.forEach { quality ->
                        Text(
                            text = quality,
                            fontFamily = FontFamily.Default,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color.LightGray,
                            modifier = Modifier
                                .background(Color.DarkGray, shape = RoundedCornerShape(8.dp))
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        )
                    }
                }
            }


            //play button
            Button (
                onClick = {},
                modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 2.dp),
                colors = ButtonDefaults.buttonColors (containerColor = Color.LightGray),
                shape = RectangleShape
            )
                {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Play",
                        tint = Color.Black
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(text = "Play", color = Color.Black)
            }

            //download button
            Button (
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 2.dp),
                colors = ButtonDefaults.buttonColors (containerColor = Color.LightGray),
                shape = RectangleShape
            )
            {

                //This icon isn't perfectly matching the action,
                // but "Icons" doesn't provide "Download"
                Icon(
                    imageVector = Icons.Default.ExitToApp,
                    contentDescription = "Download",
                    tint = Color.Black
                )

                Spacer(modifier = Modifier.width(2.dp))
                Text(text = "Download", color = Color.Black)
            }

            Text(
                text = "Seoul, South Korea," +
                        " 1997. When the young but extremely anxious student Jin-seok," +
                        " his parents and his successful older brother " +
                        "Yoo-seok move to a new home, mysterious and frightening " +
                        "events begin to happen around them, unexplained events that threaten" +
                        " to ruin their seemingly happy lives." +
                        " Unable to understand what is happening, Jin-seok wonders " +
                        "if he is losing his mind.",

                fontFamily = FontFamily.Default,
                style = MaterialTheme.typography.bodySmall,
                color = Color.LightGray,

            )


            //watchlist button with toggle
            Button (
                onClick = {isAdded = !isAdded },
                modifier = Modifier
                    .padding(vertical = 2.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors (containerColor = Color.Transparent),
                shape = RectangleShape,
                border = BorderStroke(2.dp,Color.LightGray)
            )
            {
                Icon(
                    imageVector = if (isAdded) Icons.Default.Check else Icons.Default.Add, // Change icon
                    contentDescription = if (isAdded) "Remove from Watchlist" else "Add to Watchlist",
                    tint = Color.LightGray
                    )
                    Spacer(modifier = Modifier.width(4.dp))

                    Text(if (isAdded) "Added to Watchlist" else "Add to Watchlist",
                        color = Color.LightGray)

            }


        }

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AhadFlexTheme {
        Greeting("Ahad")
    }
}