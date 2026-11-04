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

val BellOff: ImageVector
    get() {
        val current = _bellOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BellOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.27 21 a2 2 0 0 0 3.46 0 M17 17 H4 a1 1 0 0 1 -.74 -1.67 C4.59 13.96 6 12.5 6 8 a6 6 0 0 1 .26 -1.74 M2 2 l20 20 M8.67 3.01 A6 6 0 0 1 18 8 c0 2.69 .77 4.65 1.7 6.05
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.27 21
                moveTo(x = 10.27f, y = 21.0f)
                // a 2 2 0 0 0 3.46 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.46f,
                    dy1 = 0.0f,
                )
                // M 17 17
                moveTo(x = 17.0f, y = 17.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 1 1 0 0 1 -0.74 -1.67
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.74f,
                    dy1 = -1.67f,
                )
                // C 4.59 13.96 6 12.5 6 8
                curveTo(
                    x1 = 4.59f,
                    y1 = 13.96f,
                    x2 = 6.0f,
                    y2 = 12.5f,
                    x3 = 6.0f,
                    y3 = 8.0f,
                )
                // a 6 6 0 0 1 0.26 -1.74
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.26f,
                    dy1 = -1.74f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 8.67 3.01
                moveTo(x = 8.67f, y = 3.01f)
                // A 6 6 0 0 1 18 8
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 8.0f,
                )
                // c 0 2.69 0.77 4.65 1.7 6.05
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.69f,
                    dx2 = 0.77f,
                    dy2 = 4.65f,
                    dx3 = 1.7f,
                    dy3 = 6.05f,
                )
            }
        }.build().also { _bellOff = it }
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
                imageVector = BellOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _bellOff: ImageVector? = null
