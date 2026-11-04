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

val Lightbulb: ImageVector
    get() {
        val current = _lightbulb
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Lightbulb",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 14 c.2 -1 .7 -1.7 1.5 -2.5 1 -.9 1.5 -2.2 1.5 -3.5 A6 6 0 0 0 6 8 c0 1 .2 2.2 1.5 3.5 C8.2 12.2 8.8 13 9 14 m0 4 h6 m-5 4 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 14
                moveTo(x = 15.0f, y = 14.0f)
                // c 0.2 -1 0.7 -1.7 1.5 -2.5
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = -1.0f,
                    dx2 = 0.7f,
                    dy2 = -1.7f,
                    dx3 = 1.5f,
                    dy3 = -2.5f,
                )
                // c 1 -0.9 1.5 -2.2 1.5 -3.5
                curveToRelative(
                    dx1 = 1.0f,
                    dy1 = -0.9f,
                    dx2 = 1.5f,
                    dy2 = -2.2f,
                    dx3 = 1.5f,
                    dy3 = -3.5f,
                )
                // A 6 6 0 0 0 6 8
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 8.0f,
                )
                // c 0 1 0.2 2.2 1.5 3.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.0f,
                    dx2 = 0.2f,
                    dy2 = 2.2f,
                    dx3 = 1.5f,
                    dy3 = 3.5f,
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
        }.build().also { _lightbulb = it }
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
                imageVector = Lightbulb,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _lightbulb: ImageVector? = null
