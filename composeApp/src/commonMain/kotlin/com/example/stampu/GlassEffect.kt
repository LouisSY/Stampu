//package com.example.stampu
//
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Surface
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.unit.Dp
//import androidx.compose.ui.unit.dp
//import dev.chrisbanes.haze.rememberHazeState
//import dev.chrisbanes.haze.haze
//import dev.chrisbanes.haze.hazeEffect
//import dev.chrisbanes.haze.hazeSource
//import dev.chrisbanes.haze.materials.HazeMaterials
//
//@Composable
//fun GlassEffect(
//    modifier: Modifier = Modifier,
//    cornerRadius: Dp = 20.dp,
//    contentPadding: Dp = 16.dp,
//    hazeBlurStrength: Float = 0.6f,
//    content: @Composable () -> Unit
//) {
//    // Remember a shared haze state
//    val hazeState = rememberHazeState()
//
//    Box(
//        modifier = Modifier.hazeSource(hazeState)
//    ) {
//        // glass layer
//        Box(
//            modifier = modifier
//                .clip(RoundedCornerShape(cornerRadius))
//                .hazeEffect(state = hazeState, style = HazeMaterials.ultraThin())
//                .padding(contentPadding),
//            contentAlignment = Alignment.Center
//        ) {
//            Surface(
//                color = androidx.compose.ui.graphics.Color.Transparent,
//                tonalElevation = 0.dp,
//                shadowElevation = 0.dp,
//                shape = RoundedCornerShape(cornerRadius)
//            ) {
//                content()
//            }
//        }
//    }
//}