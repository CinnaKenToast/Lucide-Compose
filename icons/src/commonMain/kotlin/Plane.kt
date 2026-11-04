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

val Plane: ImageVector
    get() {
        val current = _plane
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Plane",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17.8 19.2 16 11 l3.5 -3.5 C21 6 21.5 4 21 3 c-1 -.5 -3 0 -4.5 1.5 L13 8 4.8 6.2 C4.3 6.1 3.9 6.3 3.7 6.7 L3.4 7.2 c-.2 .5 -.1 1 .3 1.3 L9 12 l-2 3 H4 l-1 1 3 2 2 3 1 -1 v-3 l3 -2 3.5 5.3 c.3 .4 .8 .5 1.3 .3 l.5 -.2 c.4 -.3 .6 -.7 .5 -1.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.8 19.2
                moveTo(x = 17.8f, y = 19.2f)
                // L 16 11
                lineTo(x = 16.0f, y = 11.0f)
                // l 3.5 -3.5
                lineToRelative(dx = 3.5f, dy = -3.5f)
                // C 21 6 21.5 4 21 3
                curveTo(
                    x1 = 21.0f,
                    y1 = 6.0f,
                    x2 = 21.5f,
                    y2 = 4.0f,
                    x3 = 21.0f,
                    y3 = 3.0f,
                )
                // c -1 -0.5 -3 0 -4.5 1.5
                curveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.5f,
                    dx2 = -3.0f,
                    dy2 = 0.0f,
                    dx3 = -4.5f,
                    dy3 = 1.5f,
                )
                // L 13 8
                lineTo(x = 13.0f, y = 8.0f)
                // L 4.8 6.2
                lineTo(x = 4.8f, y = 6.2f)
                // C 4.3 6.1 3.9 6.3 3.7 6.7
                curveTo(
                    x1 = 4.3f,
                    y1 = 6.1f,
                    x2 = 3.9f,
                    y2 = 6.3f,
                    x3 = 3.7f,
                    y3 = 6.7f,
                )
                // L 3.4 7.2
                lineTo(x = 3.4f, y = 7.2f)
                // c -0.2 0.5 -0.1 1 0.3 1.3
                curveToRelative(
                    dx1 = -0.2f,
                    dy1 = 0.5f,
                    dx2 = -0.1f,
                    dy2 = 1.0f,
                    dx3 = 0.3f,
                    dy3 = 1.3f,
                )
                // L 9 12
                lineTo(x = 9.0f, y = 12.0f)
                // l -2 3
                lineToRelative(dx = -2.0f, dy = 3.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // l 3 2
                lineToRelative(dx = 3.0f, dy = 2.0f)
                // l 2 3
                lineToRelative(dx = 2.0f, dy = 3.0f)
                // l 1 -1
                lineToRelative(dx = 1.0f, dy = -1.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // l 3 -2
                lineToRelative(dx = 3.0f, dy = -2.0f)
                // l 3.5 5.3
                lineToRelative(dx = 3.5f, dy = 5.3f)
                // c 0.3 0.4 0.8 0.5 1.3 0.3
                curveToRelative(
                    dx1 = 0.3f,
                    dy1 = 0.4f,
                    dx2 = 0.8f,
                    dy2 = 0.5f,
                    dx3 = 1.3f,
                    dy3 = 0.3f,
                )
                // l 0.5 -0.2
                lineToRelative(dx = 0.5f, dy = -0.2f)
                // c 0.4 -0.3 0.6 -0.7 0.5 -1.2
                curveToRelative(
                    dx1 = 0.4f,
                    dy1 = -0.3f,
                    dx2 = 0.6f,
                    dy2 = -0.7f,
                    dx3 = 0.5f,
                    dy3 = -1.2f,
                )
            }
        }.build().also { _plane = it }
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
                imageVector = Plane,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _plane: ImageVector? = null
