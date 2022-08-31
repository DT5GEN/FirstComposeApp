package com.deeppowercrew.fca

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box() {
                Column() {
                    LazyColumn(

                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray),

                        ) {
                        itemsIndexed(
                            listOf(
                                ItemRowModel(
                                    R.drawable.photo,
                                    " Добромирчик ",
                                    " U.S. President Joe Biden's public approval rating fell modestly this week, a poor sign for his Democratic Party's hopes in the Nov. 8 midterm elections, according to a Reuters/Ipsos opinion poll completed on Tuesday."
                                ),
                                ItemRowModel(
                                    R.drawable.photo1,
                                    " Мамамирчик ",
                                    "The two-day national poll found that 38% of Americans approve of Biden's job performance.\n" +
                                            "\n" +
                                            "While Biden's approval rating hit 41% last week, it has been mostly below 40% since mid-June despite a string of Democratic legislative victories that Biden's allies hope will help them defend their narrow congressional majorities in November."
                                ),
                                ItemRowModel(
                                    R.drawable.photo2,
                                    " Багдамирчик ",
                                    "Democrats are expected to lose control of the U.S. House of Representatives in November and possibly the Senate as well.\n" +
                                            "\n" +
                                            "Even with control only of the House, Republicans would be able to bring Biden's legislative agenda to a halt and launch potentially politically damaging investigations."
                                ),
                                ItemRowModel(
                                    R.drawable.photo3,
                                    " Яромирчик ",
                                    "Biden's overall approval rating has been below 50% for over a year as Americans have grappled with high rates of inflation and an economy scarred by the COVID-19 health crisis. Biden's lowest ratings of 36% - in four weekly polls in May, June and July - rivaled the lows of his predecessor, Donald Trump, whose popularity bottomed out at 33% in December 2017."
                                ),
                                ItemRowModel(
                                    R.drawable.photo4,
                                    " Танямирчик ",
                                    "When poll respondents this week were asked to rank the nation's biggest problems, the economy topped concerns, with a third of Republicans and a quarter of Democrats pointing to it as the top issue.\n" +
                                            "\n" +
                                            "For Republicans, the next most pressing problems were immigration and crime, each of which topped concerns for about one in 10 Republicans."
                                )
                            )
                        ) { _, item ->
                            myItemRow(item = item)
                            //   listItem(name = "Добромирчик", prof = " Умняшка ")


                        }


                    }

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

    @Composable
    private fun listItem(name: String, prof: String) {
        var like = remember { mutableStateOf(0) }

        var color = remember { mutableStateOf(Color.LightGray) }

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

                        Text(
                            text = name,
                            style = TextStyle(fontSize = 20.sp, fontStyle = FontStyle.Italic)
                        )
                        Text(text = prof)
                        Text(text = "Like " + like.value.toString())

                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Box(
                            modifier = Modifier
                                .size(30.dp)
                                .background(color.value, shape = CircleShape),
                            contentAlignment = Alignment.BottomEnd
                        ) {


                        }
                    }

                }


            }

        }

    }
}


