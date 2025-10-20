package com.example.stampu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild
import dev.chrisbanes.haze.hazeEffect
import dev.chrisbanes.haze.hazeSource
import dev.chrisbanes.haze.materials.ExperimentalHazeMaterialsApi
import dev.chrisbanes.haze.materials.HazeMaterials
import dev.chrisbanes.haze.rememberHazeState
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import stampu.composeapp.generated.resources.Res
import stampu.composeapp.generated.resources.image_me

@OptIn(ExperimentalHazeMaterialsApi::class)
@Composable
@Preview
fun ProfileSimpleView() {
    val hazeState = rememberHazeState()
    Box(
        modifier = Modifier
            .padding(vertical = 24.dp, horizontal = 64.dp)
            .fillMaxWidth()
            .height(64.dp)
//            .hazeEffect(state = hazeState, style = HazeMaterials.ultraThin())
    ) {
        ProfileSection()
    }
}


@OptIn(ExperimentalHazeMaterialsApi::class)
@Composable
fun ProfileSection() {
    val hazeState = rememberHazeState()
    MaterialTheme {
        Row(
            modifier = Modifier.hazeEffect(state = hazeState, style = HazeMaterials.ultraThin()),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            UserAvatar()

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Username",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White
                )
                Text(
                    text = "Lvl 2",
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun UserAvatar(
    imagePath: DrawableResource = Res.drawable.image_me,
    sizeDp: Int = 50 // size in dp
) {
    Surface(
        modifier = Modifier
            .size(sizeDp.dp)
            .shadow(
                elevation = 18.dp,       // shadow size
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

