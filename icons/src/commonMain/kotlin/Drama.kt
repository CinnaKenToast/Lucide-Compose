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

val Drama: ImageVector
    get() {
        val current = _drama
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Drama",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 11z M14 6z M18 6 h.01 M6.5 13.1z M22 5 c0 9 -4 12 -6 12 s-6 -3 -6 -12 q0 -3 6 -3 c6 0 6 1 6 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 11z
                moveTo(x = 10.0f, y = 11.0f)
                close()
                // M 14 6z
                moveTo(x = 14.0f, y = 6.0f)
                close()
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 6.5 13.1z
                moveTo(x = 6.5f, y = 13.1f)
                close()
                // M 22 5
                moveTo(x = 22.0f, y = 5.0f)
                // c 0 9 -4 12 -6 12
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.0f,
                    dx2 = -4.0f,
                    dy2 = 12.0f,
                    dx3 = -6.0f,
                    dy3 = 12.0f,
                )
                // s -6 -3 -6 -12
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -3.0f,
                    dx2 = -6.0f,
                    dy2 = -12.0f,
                )
                // q 0 -3 6 -3
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                    dx2 = 6.0f,
                    dy2 = -3.0f,
                )
                // c 6 0 6 1 6 3
                curveToRelative(
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                    dx2 = 6.0f,
                    dy2 = 1.0f,
                    dx3 = 6.0f,
                    dy3 = 3.0f,
                )
            }
            // M17.4 9.9 c-.8 .8 -2 .8 -2.8 0 m-4.5 -2.8 C9 7.2 7.7 7.7 6 8.6 c-3.5 2 -4.7 3.9 -3.7 5.6 4.5 7.8 9.5 8.4 11.2 7.4 .9 -.5 1.9 -2.1 1.9 -4.7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.4 9.9
                moveTo(x = 17.4f, y = 9.9f)
                // c -0.8 0.8 -2 0.8 -2.8 0
                curveToRelative(
                    dx1 = -0.8f,
                    dy1 = 0.8f,
                    dx2 = -2.0f,
                    dy2 = 0.8f,
                    dx3 = -2.8f,
                    dy3 = 0.0f,
                )
                // m -4.5 -2.8
                moveToRelative(dx = -4.5f, dy = -2.8f)
                // C 9 7.2 7.7 7.7 6 8.6
                curveTo(
                    x1 = 9.0f,
                    y1 = 7.2f,
                    x2 = 7.7f,
                    y2 = 7.7f,
                    x3 = 6.0f,
                    y3 = 8.6f,
                )
                // c -3.5 2 -4.7 3.9 -3.7 5.6
                curveToRelative(
                    dx1 = -3.5f,
                    dy1 = 2.0f,
                    dx2 = -4.7f,
                    dy2 = 3.9f,
                    dx3 = -3.7f,
                    dy3 = 5.6f,
                )
                // c 4.5 7.8 9.5 8.4 11.2 7.4
                curveToRelative(
                    dx1 = 4.5f,
                    dy1 = 7.8f,
                    dx2 = 9.5f,
                    dy2 = 8.4f,
                    dx3 = 11.2f,
                    dy3 = 7.4f,
                )
                // c 0.9 -0.5 1.9 -2.1 1.9 -4.7
                curveToRelative(
                    dx1 = 0.9f,
                    dy1 = -0.5f,
                    dx2 = 1.9f,
                    dy2 = -2.1f,
                    dx3 = 1.9f,
                    dy3 = -4.7f,
                )
            }
            // M9.1 16.5 c.3 -1.1 1.4 -1.7 2.4 -1.4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.1 16.5
                moveTo(x = 9.1f, y = 16.5f)
                // c 0.3 -1.1 1.4 -1.7 2.4 -1.4
                curveToRelative(
                    dx1 = 0.3f,
                    dy1 = -1.1f,
                    dx2 = 1.4f,
                    dy2 = -1.7f,
                    dx3 = 2.4f,
                    dy3 = -1.4f,
                )
            }
        }.build().also { _drama = it }
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
                imageVector = Drama,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _drama: ImageVector? = null
