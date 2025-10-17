package com.example.stampu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import stampu.composeapp.generated.resources.Res
import stampu.composeapp.generated.resources.user_profile_placeholder

@Composable
@Preview
fun ProfileSimpleView() {
    Box(modifier = Modifier.fillMaxSize()) {
        ProfileSection()
    }
}


@Composable
fun ProfileSection() {
    MaterialTheme {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            UserAvatar()

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "Username", style = MaterialTheme.typography.titleMedium)
                Text(text = "Lvl 2")
            }
        }
    }
}

@Composable
fun UserAvatar(
    imagePath: DrawableResource = Res.drawable.user_profile_placeholder,
    sizeDp: Int = 80 // size in dp
) {
    Surface(
        modifier = Modifier
            .size(sizeDp.dp)
            .shadow(
                elevation = 8.dp,       // shadow size
                shape = CircleShape,    // circle
                clip = false            // shadow wont be clipped
            )
            .clip(CircleShape),         // circle clip
        shape = CircleShape
    ) {
        Image(
            painter = painterResource(imagePath),
            contentDescription = "User Avatar",
            modifier = Modifier.size(sizeDp.dp),
            contentScale = ContentScale.Crop // fill the bounds and crop excess
        )
    }
}

