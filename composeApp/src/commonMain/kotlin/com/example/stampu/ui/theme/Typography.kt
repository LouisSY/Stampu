package com.example.stampu.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontStyle
import org.jetbrains.compose.resources.Font
import stampu.composeapp.generated.resources.Res
import stampu.composeapp.generated.resources.otaku_rant
import stampu.composeapp.generated.resources.otaku_rant_bold
import stampu.composeapp.generated.resources.otaku_rant_italbold

@Composable
fun rememberOtakuRantFontFamily(): FontFamily {
    return FontFamily(
        Font(
            resource = Res.font.otaku_rant,
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.otaku_rant_bold,
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.otaku_rant_italbold,
            weight = FontWeight.Bold,
            style = FontStyle.Italic
        )
    )
}