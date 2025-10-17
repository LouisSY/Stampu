package com.example.stampu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun GlassEffect(
    modifier: Modifier = Modifier,
    blurRadius: Dp = 16.dp,
    overlayColor: Color = Color.White.copy(alpha = 0.2f),
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .blur(blurRadius)
            .background(overlayColor)
    ) {
        content()
    }
}