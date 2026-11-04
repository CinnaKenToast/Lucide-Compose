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

val BeefOff: ImageVector
    get() {
        val current = _beefOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.BeefOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.77 6.1 a2.5 2.5 0 0 1 3.12 3.13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.77 6.1
                moveTo(x = 11.77f, y = 6.1f)
                // a 2.5 2.5 0 0 1 3.12 3.13
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.12f,
                    dy1 = 3.13f,
                )
            }
            // M17.85 12.19 a6.5 6.5 0 0 0 -9.03 -9.04 M18.02 18 C15.01 20.35 10.82 22 7 22 a3 3 0 0 1 -2.68 -1.66 L2.4 16.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.85 12.19
                moveTo(x = 17.85f, y = 12.19f)
                // a 6.5 6.5 0 0 0 -9.03 -9.04
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -9.03f,
                    dy1 = -9.04f,
                )
                // M 18.02 18
                moveTo(x = 18.02f, y = 18.0f)
                // C 15.01 20.35 10.82 22 7 22
                curveTo(
                    x1 = 15.01f,
                    y1 = 20.35f,
                    x2 = 10.82f,
                    y2 = 22.0f,
                    x3 = 7.0f,
                    y3 = 22.0f,
                )
                // a 3 3 0 0 1 -2.68 -1.66
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.68f,
                    dy1 = -1.66f,
                )
                // L 2.4 16.5
                lineTo(x = 2.4f, y = 16.5f)
            }
            // m18.5 6 2.19 4.5 a6.5 6.5 0 0 1 -.14 4.4 M2 2 l20 20 M6.36 6.37 6.28 6.6 c-1.1 3.13 -.78 3.9 -3.18 6.08 A3 3 0 0 0 5 18 c3.36 0 7 -1.27 9.85 -3.15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.5 6
                moveTo(x = 18.5f, y = 6.0f)
                // l 2.19 4.5
                lineToRelative(dx = 2.19f, dy = 4.5f)
                // a 6.5 6.5 0 0 1 -0.14 4.4
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.14f,
                    dy1 = 4.4f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 6.36 6.37
                moveTo(x = 6.36f, y = 6.37f)
                // L 6.28 6.6
                lineTo(x = 6.28f, y = 6.6f)
                // c -1.1 3.13 -0.78 3.9 -3.18 6.08
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 3.13f,
                    dx2 = -0.78f,
                    dy2 = 3.9f,
                    dx3 = -3.18f,
                    dy3 = 6.08f,
                )
                // A 3 3 0 0 0 5 18
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 18.0f,
                )
                // c 3.36 0 7 -1.27 9.85 -3.15
                curveToRelative(
                    dx1 = 3.36f,
                    dy1 = 0.0f,
                    dx2 = 7.0f,
                    dy2 = -1.27f,
                    dx3 = 9.85f,
                    dy3 = -3.15f,
                )
            }
        }.build().also { _beefOff = it }
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
                imageVector = BeefOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _beefOff: ImageVector? = null
