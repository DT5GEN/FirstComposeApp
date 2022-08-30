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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LazyColumn(

                modifier = Modifier.fillMaxSize()
                ) {
                items(count = 150){
                    listItem(name = "Добромирчик", prof = " Умняшeчка ")
                }



//                listItem(name = "Добромирчик", prof = " Умняшка ")
//                listItem(name = "Добромирчик", prof = " Умняшка ")
//                listItem(name = "Добромирчик", prof = " Умняшка ")
//                listItem(name = "Добромирчик", prof = " Умняшка ")
//                listItem(name = "Добромирчик", prof = " Умняшка ")
//                listItem(name = "Добромирчик", prof = " Умняшка ")
//                listItem(name = "Добромирчик", prof = " Умняшка ")
//                listItem(name = "Добромирчик", prof = " Умняшка ")


            }


        }
    }


}

@Composable
private fun listItem(name: String, prof: String) {
    var like = remember{ mutableStateOf(0) }

    var color = remember{ mutableStateOf(Color.LightGray) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {
                when (++like.value) {
                    10 -> color.value = Color.Magenta
                    20 -> color.value = Color.Red

                }
                Log.d(TAG, "XXX listItem() $name called ${like.value}")
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

                    Text(text = name, style = TextStyle(fontSize = 20.sp, fontStyle = FontStyle.Italic))
                    Text(text = prof)
                    Text(text = "Like " + like.value.toString())

                }

                Row (modifier = Modifier.fillMaxSize(),
                ){
                    Box(modifier = Modifier
                        .size(30.dp)
                        .background(color.value, shape = CircleShape),
                        contentAlignment = Alignment.BottomEnd
                    ){


                    }
                }

            }


        }

    }

}


