package com.example.stampu

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.stampu.ui.theme.rememberOtakuRantFontFamily
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun WelcomeScreen() {
    val otakuRantFamily = rememberOtakuRantFontFamily()

    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            StampuStreet(blur = 8f, darken = 0.5f)

            Column(
                modifier = Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Stampu",
                    style = MaterialTheme.typography.displayLarge.copy(
                        fontFamily = otakuRantFamily,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )

                Text(
                    text = "Stamp your visit.",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontFamily = otakuRantFamily,
                        color = Color.White,
                    )
                )
                Text(
                    text = "Challenge for more.",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontFamily = otakuRantFamily,
                        color = Color.White
                    )
                )
            }

        }
    }
}