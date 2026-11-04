package com.shipsco.lucide_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Sparkle: ImageVector
    get() {
        val current = _sparkle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Sparkle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.02 2.81 a1 1 0 0 1 1.96 0 l1.05 5.56 a2 2 0 0 0 1.6 1.6 l5.56 1.05 a1 1 0 0 1 0 1.96 l-5.56 1.05 a2 2 0 0 0 -1.6 1.6 l-1.05 5.56 a1 1 0 0 1 -1.96 0 l-1.05 -5.56 a2 2 0 0 0 -1.6 -1.6 l-5.56 -1.05 a1 1 0 0 1 0 -1.96 l5.56 -1.05 a2 2 0 0 0 1.6 -1.6z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.02 2.81
                moveTo(x = 11.02f, y = 2.81f)
                // a 1 1 0 0 1 1.96 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.96f,
                    dy1 = 0.0f,
                )
                // l 1.05 5.56
                lineToRelative(dx = 1.05f, dy = 5.56f)
                // a 2 2 0 0 0 1.6 1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.6f,
                    dy1 = 1.6f,
                )
                // l 5.56 1.05
                lineToRelative(dx = 5.56f, dy = 1.05f)
                // a 1 1 0 0 1 0 1.96
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.96f,
                )
                // l -5.56 1.05
                lineToRelative(dx = -5.56f, dy = 1.05f)
                // a 2 2 0 0 0 -1.6 1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.6f,
                    dy1 = 1.6f,
                )
                // l -1.05 5.56
                lineToRelative(dx = -1.05f, dy = 5.56f)
                // a 1 1 0 0 1 -1.96 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.96f,
                    dy1 = 0.0f,
                )
                // l -1.05 -5.56
                lineToRelative(dx = -1.05f, dy = -5.56f)
                // a 2 2 0 0 0 -1.6 -1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.6f,
                    dy1 = -1.6f,
                )
                // l -5.56 -1.05
                lineToRelative(dx = -5.56f, dy = -1.05f)
                // a 1 1 0 0 1 0 -1.96
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.96f,
                )
                // l 5.56 -1.05
                lineToRelative(dx = 5.56f, dy = -1.05f)
                // a 2 2 0 0 0 1.6 -1.6z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.6f,
                    dy1 = -1.6f,
                )
                close()
            }
        }.build().also { _sparkle = it }
    }

@Preview
@Composable
private fun IconPreview() {
    com.shipsco.theme.AppTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                imageVector = Sparkle,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _sparkle: ImageVector? = null
