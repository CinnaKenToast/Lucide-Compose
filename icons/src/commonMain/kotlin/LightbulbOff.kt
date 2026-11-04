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

val LightbulbOff: ImageVector
    get() {
        val current = _lightbulbOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.LightbulbOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16.8 11.2 c.8 -.9 1.2 -2 1.2 -3.2 a6 6 0 0 0 -9.3 -5 M2 2 l20 20 M6.3 6.3 a4.7 4.7 0 0 0 1.2 5.2 C8.2 12.2 8.8 13 9 14 m0 4 h6 m-5 4 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.8 11.2
                moveTo(x = 16.8f, y = 11.2f)
                // c 0.8 -0.9 1.2 -2 1.2 -3.2
                curveToRelative(
                    dx1 = 0.8f,
                    dy1 = -0.9f,
                    dx2 = 1.2f,
                    dy2 = -2.0f,
                    dx3 = 1.2f,
                    dy3 = -3.2f,
                )
                // a 6 6 0 0 0 -9.3 -5
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.3f,
                    dy1 = -5.0f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 6.3 6.3
                moveTo(x = 6.3f, y = 6.3f)
                // a 4.7 4.7 0 0 0 1.2 5.2
                arcToRelative(
                    a = 4.7f,
                    b = 4.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.2f,
                    dy1 = 5.2f,
                )
                // C 8.2 12.2 8.8 13 9 14
                curveTo(
                    x1 = 8.2f,
                    y1 = 12.2f,
                    x2 = 8.8f,
                    y2 = 13.0f,
                    x3 = 9.0f,
                    y3 = 14.0f,
                )
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -5 4
                moveToRelative(dx = -5.0f, dy = 4.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _lightbulbOff = it }
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
                imageVector = LightbulbOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lightbulbOff: ImageVector? = null
