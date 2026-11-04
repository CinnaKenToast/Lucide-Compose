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

val Dog: ImageVector
    get() {
        val current = _dog
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Dog",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.25 16.25 h1.5 L12 17z M16 14 v.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.25 16.25
                moveTo(x = 11.25f, y = 16.25f)
                // h 1.5
                horizontalLineToRelative(dx = 1.5f)
                // L 12 17z
                lineTo(x = 12.0f, y = 17.0f)
                close()
                // M 16 14
                moveTo(x = 16.0f, y = 14.0f)
                // v 0.5
                verticalLineToRelative(dy = 0.5f)
            }
            // M4.42 11.25 A13 13 0 0 0 4 14.55 C4 18.74 7.58 21 12 21 s8 -2.27 8 -6.44 a12 12 0 0 0 -.5 -3.31 M8 14 v.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.42 11.25
                moveTo(x = 4.42f, y = 11.25f)
                // A 13 13 0 0 0 4 14.55
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 14.55f,
                )
                // C 4 18.74 7.58 21 12 21
                curveTo(
                    x1 = 4.0f,
                    y1 = 18.74f,
                    x2 = 7.58f,
                    y2 = 21.0f,
                    x3 = 12.0f,
                    y3 = 21.0f,
                )
                // s 8 -2.27 8 -6.44
                reflectiveCurveToRelative(
                    dx1 = 8.0f,
                    dy1 = -2.27f,
                    dx2 = 8.0f,
                    dy2 = -6.44f,
                )
                // a 12 12 0 0 0 -0.5 -3.31
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = -3.31f,
                )
                // M 8 14
                moveTo(x = 8.0f, y = 14.0f)
                // v 0.5
                verticalLineToRelative(dy = 0.5f)
            }
            // M8.5 8.5 A4 4 0 0 1 6.16 11 c-1.93 .72 -3.58 -.3 -3.66 -1 -.11 -1 1.18 -6.53 4 -7 1.92 -.32 3.65 .85 3.65 2.24 A7.5 7.5 0 0 1 14 5.28 c0 -1.4 1.84 -2.6 3.77 -2.28 2.82 .47 4.11 6 4 7 -.08 .7 -1.73 1.72 -3.66 1 -1.26 -.47 -1.85 -1.45 -2.24 -2.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.5 8.5
                moveTo(x = 8.5f, y = 8.5f)
                // A 4 4 0 0 1 6.16 11
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.16f,
                    y1 = 11.0f,
                )
                // c -1.93 0.72 -3.58 -0.3 -3.66 -1
                curveToRelative(
                    dx1 = -1.93f,
                    dy1 = 0.72f,
                    dx2 = -3.58f,
                    dy2 = -0.3f,
                    dx3 = -3.66f,
                    dy3 = -1.0f,
                )
                // c -0.11 -1 1.18 -6.53 4 -7
                curveToRelative(
                    dx1 = -0.11f,
                    dy1 = -1.0f,
                    dx2 = 1.18f,
                    dy2 = -6.53f,
                    dx3 = 4.0f,
                    dy3 = -7.0f,
                )
                // c 1.92 -0.32 3.65 0.85 3.65 2.24
                curveToRelative(
                    dx1 = 1.92f,
                    dy1 = -0.32f,
                    dx2 = 3.65f,
                    dy2 = 0.85f,
                    dx3 = 3.65f,
                    dy3 = 2.24f,
                )
                // A 7.5 7.5 0 0 1 14 5.28
                arcTo(
                    horizontalEllipseRadius = 7.5f,
                    verticalEllipseRadius = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 5.28f,
                )
                // c 0 -1.4 1.84 -2.6 3.77 -2.28
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                    dx2 = 1.84f,
                    dy2 = -2.6f,
                    dx3 = 3.77f,
                    dy3 = -2.28f,
                )
                // c 2.82 0.47 4.11 6 4 7
                curveToRelative(
                    dx1 = 2.82f,
                    dy1 = 0.47f,
                    dx2 = 4.11f,
                    dy2 = 6.0f,
                    dx3 = 4.0f,
                    dy3 = 7.0f,
                )
                // c -0.08 0.7 -1.73 1.72 -3.66 1
                curveToRelative(
                    dx1 = -0.08f,
                    dy1 = 0.7f,
                    dx2 = -1.73f,
                    dy2 = 1.72f,
                    dx3 = -3.66f,
                    dy3 = 1.0f,
                )
                // c -1.26 -0.47 -1.85 -1.45 -2.24 -2.5
                curveToRelative(
                    dx1 = -1.26f,
                    dy1 = -0.47f,
                    dx2 = -1.85f,
                    dy2 = -1.45f,
                    dx3 = -2.24f,
                    dy3 = -2.5f,
                )
            }
        }.build().also { _dog = it }
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
                imageVector = Dog,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _dog: ImageVector? = null
