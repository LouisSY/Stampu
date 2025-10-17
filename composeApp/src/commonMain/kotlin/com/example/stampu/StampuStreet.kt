package com.example.stampu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import stampu.composeapp.generated.resources.Res
import stampu.composeapp.generated.resources.stampu_street

@Composable
@Preview
fun StampuStreet(
    modifier: Modifier = Modifier,
    blur: Float = 0f,
    darken: Float = 0f
) {
    MaterialTheme {
        Image(
            painter = painterResource(Res.drawable.stampu_street),
            contentDescription = "Background Image",
            modifier = modifier
                .fillMaxSize()
                .then(
                    if (blur > 0f || darken > 0f) {
                        Modifier.blur(blur.dp)
                    } else {
                        Modifier
                    }
                ),
            contentScale = ContentScale.Crop,
            colorFilter = if (darken > 0f) {
                ColorFilter.tint(
                    color = MaterialTheme.colorScheme.onBackground.copy(alpha = darken),
                    blendMode = BlendMode.Darken
                )
            } else null
        )
    }
}