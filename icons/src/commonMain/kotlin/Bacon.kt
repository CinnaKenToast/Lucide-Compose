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

val Bacon: ImageVector
    get() {
        val current = _bacon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Bacon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2.8 16.8 C2 16.01 1.7 14.8 2.34 13.88 4.3 11.16 6.77 12.83 8.5 8.5 c1.87 -4.67 4.6 -2.37 6.59 -6.1 .22 -.42 .78 -.54 1.11 -.2 l5 5 c.8 .79 1.1 2.01 .45 2.92 -1.94 2.72 -4.42 1.05 -6.15 5.38 -1.87 4.67 -4.6 2.37 -6.59 6.1 -.22 .42 -.78 .54 -1.1 .2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2.8 16.8
                moveTo(x = 2.8f, y = 16.8f)
                // C 2 16.01 1.7 14.8 2.34 13.88
                curveTo(
                    x1 = 2.0f,
                    y1 = 16.01f,
                    x2 = 1.7f,
                    y2 = 14.8f,
                    x3 = 2.34f,
                    y3 = 13.88f,
                )
                // C 4.3 11.16 6.77 12.83 8.5 8.5
                curveTo(
                    x1 = 4.3f,
                    y1 = 11.16f,
                    x2 = 6.77f,
                    y2 = 12.83f,
                    x3 = 8.5f,
                    y3 = 8.5f,
                )
                // c 1.87 -4.67 4.6 -2.37 6.59 -6.1
                curveToRelative(
                    dx1 = 1.87f,
                    dy1 = -4.67f,
                    dx2 = 4.6f,
                    dy2 = -2.37f,
                    dx3 = 6.59f,
                    dy3 = -6.1f,
                )
                // c 0.22 -0.42 0.78 -0.54 1.11 -0.2
                curveToRelative(
                    dx1 = 0.22f,
                    dy1 = -0.42f,
                    dx2 = 0.78f,
                    dy2 = -0.54f,
                    dx3 = 1.11f,
                    dy3 = -0.2f,
                )
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // c 0.8 0.79 1.1 2.01 0.45 2.92
                curveToRelative(
                    dx1 = 0.8f,
                    dy1 = 0.79f,
                    dx2 = 1.1f,
                    dy2 = 2.01f,
                    dx3 = 0.45f,
                    dy3 = 2.92f,
                )
                // c -1.94 2.72 -4.42 1.05 -6.15 5.38
                curveToRelative(
                    dx1 = -1.94f,
                    dy1 = 2.72f,
                    dx2 = -4.42f,
                    dy2 = 1.05f,
                    dx3 = -6.15f,
                    dy3 = 5.38f,
                )
                // c -1.87 4.67 -4.6 2.37 -6.59 6.1
                curveToRelative(
                    dx1 = -1.87f,
                    dy1 = 4.67f,
                    dx2 = -4.6f,
                    dy2 = 2.37f,
                    dx3 = -6.59f,
                    dy3 = 6.1f,
                )
                // c -0.22 0.42 -0.78 0.54 -1.1 0.2z
                curveToRelative(
                    dx1 = -0.22f,
                    dy1 = 0.42f,
                    dx2 = -0.78f,
                    dy2 = 0.54f,
                    dx3 = -1.1f,
                    dy3 = 0.2f,
                )
                close()
            }
            // M4.5 18.5 c2 -5 5 -2 7 -7 s5 -2 7 -7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.5 18.5
                moveTo(x = 4.5f, y = 18.5f)
                // c 2 -5 5 -2 7 -7
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -5.0f,
                    dx2 = 5.0f,
                    dy2 = -2.0f,
                    dx3 = 7.0f,
                    dy3 = -7.0f,
                )
                // s 5 -2 7 -7
                reflectiveCurveToRelative(
                    dx1 = 5.0f,
                    dy1 = -2.0f,
                    dx2 = 7.0f,
                    dy2 = -7.0f,
                )
            }
        }.build().also { _bacon = it }
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
                imageVector = Bacon,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bacon: ImageVector? = null
