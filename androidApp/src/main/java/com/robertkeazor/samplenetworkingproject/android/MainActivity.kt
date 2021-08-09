package com.robertkeazor.samplenetworkingproject.android

import android.graphics.fonts.FontStyle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.robertkeazor.samplenetworkingproject.Greeting
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.robertkeazor.samplenetworkingproject.TileCard

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val tile by viewModel.tileState.collectAsState()
            cardList(tiles = tile)
        }
    }
}

@Composable
fun cardList(tiles: List<TileCard>) {
    LazyColumn() {
        items(tiles) { data ->
            showCard(tile = data)
        }
    }
}

@Composable
fun showCard(tile: TileCard) {
    Card(

        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier
            .padding(
                bottom = 8.dp,
                top = 8.dp
            )
            .fillMaxWidth(),
        elevation = 8.dp

    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Text(text = tile.title, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = tile.body)
            Spacer(modifier = Modifier.height(20.dp))
            Row() {
                Button(onClick = { }) {
                    Text(text = tile.positiveButtonTitle)
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { }) {
                    Text(text = tile.negativeButtonTitle)
                }
            }
        }
    }
}


