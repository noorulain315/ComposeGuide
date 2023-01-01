package com.example.composeguide

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.example.composeguide.jettip.JetTipActivity
import com.example.composeguide.ui.theme.ComposeGuideTheme
import com.example.composeguide.ui.theme.Grey200
import com.example.composeguide.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeGuideTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Menu()
                }

            }
        }
    }

    private fun moveToBizzCardActivity() {
        startActivity(Intent(this, BizzCardActivity::class.java))
    }

    private fun moveToJetTip() {
        startActivity(Intent(this, JetTipActivity::class.java))
    }


    @Composable
    fun Menu() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(Dp(10F))
                .background(Grey200),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Compose Guide", style = TextStyle(
                    color = Teal200,
                    fontSize = 32.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.W800,
                    textDecoration = TextDecoration.Underline
                )
            )
            Button(
                onClick = {
                    moveToBizzCardActivity()
                },
                modifier = Modifier.padding(all = Dp(10F)),
                enabled = true,
                shape = MaterialTheme.shapes.medium,
            )
            {
                Text(text = "BizCard App", color = Color.White)
            }
            Button(
                onClick = {
                          moveToJetTip()
                },
                modifier = Modifier.padding(all = Dp(10F)),
                enabled = true,
                shape = MaterialTheme.shapes.medium,
            )
            {
                Text(text = "JetTip App", color = Color.White)
            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposeGuideTheme {
            Menu()
        }
    }
}