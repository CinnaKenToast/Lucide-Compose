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

val MousePointerClick: ImageVector
    get() {
        val current = _mousePointerClick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.MousePointerClick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 4.1 12 6 M5.1 8 2.2 7.2 M6 12 l-1.9 2 M7.2 2.2 8 5.1 m1.04 4.59 a.5 .5 0 0 1 .65 -.65 l11 4.5 a.5 .5 0 0 1 -.07 .95 l-4.35 1.04 a1 1 0 0 0 -.74 .74 l-1.04 4.35 a.5 .5 0 0 1 -.95 .07z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 4.1
                moveTo(x = 14.0f, y = 4.1f)
                // L 12 6
                lineTo(x = 12.0f, y = 6.0f)
                // M 5.1 8
                moveTo(x = 5.1f, y = 8.0f)
                // L 2.2 7.2
                lineTo(x = 2.2f, y = 7.2f)
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // l -1.9 2
                lineToRelative(dx = -1.9f, dy = 2.0f)
                // M 7.2 2.2
                moveTo(x = 7.2f, y = 2.2f)
                // L 8 5.1
                lineTo(x = 8.0f, y = 5.1f)
                // m 1.04 4.59
                moveToRelative(dx = 1.04f, dy = 4.59f)
                // a 0.5 0.5 0 0 1 0.65 -0.65
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.65f,
                    dy1 = -0.65f,
                )
                // l 11 4.5
                lineToRelative(dx = 11.0f, dy = 4.5f)
                // a 0.5 0.5 0 0 1 -0.07 0.95
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.07f,
                    dy1 = 0.95f,
                )
                // l -4.35 1.04
                lineToRelative(dx = -4.35f, dy = 1.04f)
                // a 1 1 0 0 0 -0.74 0.74
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.74f,
                    dy1 = 0.74f,
                )
                // l -1.04 4.35
                lineToRelative(dx = -1.04f, dy = 4.35f)
                // a 0.5 0.5 0 0 1 -0.95 0.07z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.95f,
                    dy1 = 0.07f,
                )
                close()
            }
        }.build().also { _mousePointerClick = it }
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
                imageVector = MousePointerClick,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _mousePointerClick: ImageVector? = null
