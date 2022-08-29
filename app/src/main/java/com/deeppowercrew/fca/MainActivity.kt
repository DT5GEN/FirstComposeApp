package com.deeppowercrew.fca

import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                listItem(name = "Добромирчик", prof = " Умняшка ")
                listItem(name = "Добромирчик", prof = " Умняшка ")
                listItem(name = "Добромирчик", prof = " Умняшка ")
                listItem(name = "Добромирчик", prof = " Умняшка ")
                listItem(name = "Добромирчик", prof = " Умняшка ")

            }


        }
    }


}

@Composable
private fun listItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .pointerInput(Unit) {
                detectDragGesturesAfterLongPress { change, dragAmount ->
                    Log.d(TAG, "YYY listItem() called with: change = $change, dragAmount = $dragAmount")
                }
            }
            .padding(10.dp)
            .offset(20.dp)
            .clickable {
                Log.d(TAG, "XXX listItem() clicked")
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 7.dp

    ) {
        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.photo),
                    contentDescription = "Example",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(8.dp)
                        .size(114.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier.padding(start = 12.dp)
                ) {

                    Text(text = name)
                    Text(text = prof)

                }
            }
        }

    }
}


