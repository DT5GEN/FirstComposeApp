package com.deeppowercrew.fca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            listItem(name = "Добромир", prof = "умняжка")

        }
    }


}

@Composable
private fun listItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 7.dp

    ) {
        Box() {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.photo),
                    contentDescription = "Example",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(114.dp).clip(CircleShape)
                )
            }
        }

    }
}


