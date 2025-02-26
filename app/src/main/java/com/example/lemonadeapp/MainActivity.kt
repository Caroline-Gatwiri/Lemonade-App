package com.example.lemonadeapp

import android.os.Bundle
import android.webkit.WebSettings.TextSize
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonadeapp.ui.theme.LemonadeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeApplicationPreview()
        }
    }
}

@Composable
fun LemonadeApplication(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
) {
    var result by remember { mutableStateOf(1) }
    when (result) {
        1 -> {
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Image(
                    painterResource(R.drawable.lemon_tree),
                    contentDescription = stringResource(R.string.lemon_tree),
                    modifier = Modifier
                        .clickable {
                            result++
                        }
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(R.string.tap_lemon_tree),
                    fontSize = 18.sp
                )
            }
        }

        2 -> {
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.lemon_squeeze),
                    contentDescription = stringResource(R.string.lemon_tree),
                    modifier = Modifier
                        .clickable {
                            result++
                        }
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = stringResource(R.string.keep_tapping),
                    fontSize = 18.sp)
            }
        }

        3 -> {
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.lemon_drink),
                    contentDescription = stringResource(R.string.lemon_tree),
                    modifier = Modifier
                        .clickable {
                            result++
                        })
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = stringResource(R.string.tap_lemonade),
                    fontSize = 18.sp)
            }
        }

        4 -> {
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.lemon_restart),
                    contentDescription = stringResource(R.string.lemon_tree),
                    modifier = Modifier
                        .clickable {
                            result = 1
                        }
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = stringResource(R.string.tap_empty_glass),
                    fontSize = 18.sp)
            }
        }

        else -> {
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.lemon_tree),
                    contentDescription = stringResource(R.string.lemon_tree)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = stringResource(R.string.tap_lemon_tree),
                    fontSize = 18.sp)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun LemonadeApplicationPreview() {
    LemonadeApplication()
}