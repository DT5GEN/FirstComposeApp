package com.deeppowercrew.fca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.deeppowercrew.fca.ui.theme.FirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Some text!")
                Text(text = "Some sdfdftext!")
                Text(text = "Some dsftext!")
            }
            Row(modifier = Modifier.background(Color.Magenta).fillMaxWidth().fillMaxHeight(0.7f),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically) {

                Column(modifier = Modifier.background(Color.Red).fillMaxWidth(0.5f),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Some text!")
                    Text(text = "Some sdfdftext!")
                    Text(text = "Some dsftext!")
                }
                Column(modifier = Modifier.background(Color.Green).fillMaxSize(0.5f),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Some text!")
                    Text(text = "Some sdfdftext!")
                    Text(text = "Some dsftext!")
                }


            }

        }
    }


}


