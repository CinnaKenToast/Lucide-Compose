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

val ShrimpOff: ImageVector
    get() {
        val current = _shrimpOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.ShrimpOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 2 a3.3 3.3 0 0 0 3.23 1.8 l6.17 -.56 A1 1 0 1 1 19.6 8 H13.5 M11 20 c-.5 .5 -1.12 1 -2.5 1 a1 1 0 0 1 0 -5 H12 a7 7 0 0 0 3.28 -.82
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // a 3.3 3.3 0 0 0 3.23 1.8
                arcToRelative(
                    a = 3.3f,
                    b = 3.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.23f,
                    dy1 = 1.8f,
                )
                // l 6.17 -0.56
                lineToRelative(dx = 6.17f, dy = -0.56f)
                // A 1 1 0 1 1 19.6 8
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 19.6f,
                    y1 = 8.0f,
                )
                // H 13.5
                horizontalLineTo(x = 13.5f)
                // M 11 20
                moveTo(x = 11.0f, y = 20.0f)
                // c -0.5 0.5 -1.12 1 -2.5 1
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.5f,
                    dx2 = -1.12f,
                    dy2 = 1.0f,
                    dx3 = -2.5f,
                    dy3 = 1.0f,
                )
                // a 1 1 0 0 1 0 -5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -5.0f,
                )
                // H 12
                horizontalLineTo(x = 12.0f)
                // a 7 7 0 0 0 3.28 -0.82
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.28f,
                    dy1 = -0.82f,
                )
            }
            // M11 22 c-.5 -.5 -1.12 -1 -2.5 -1 a6.5 6.5 0 0 1 -5.63 -3.25 6.44 6.44 0 0 1 5.24 -9.74 m9.93 4.53 A7 7 0 0 0 19 9 V8 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 22
                moveTo(x = 11.0f, y = 22.0f)
                // c -0.5 -0.5 -1.12 -1 -2.5 -1
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = -0.5f,
                    dx2 = -1.12f,
                    dy2 = -1.0f,
                    dx3 = -2.5f,
                    dy3 = -1.0f,
                )
                // a 6.5 6.5 0 0 1 -5.63 -3.25
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.63f,
                    dy1 = -3.25f,
                )
                // a 6.44 6.44 0 0 1 5.24 -9.74
                arcToRelative(
                    a = 6.44f,
                    b = 6.44f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.24f,
                    dy1 = -9.74f,
                )
                // m 9.93 4.53
                moveToRelative(dx = 9.93f, dy = 4.53f)
                // A 7 7 0 0 0 19 9
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 9.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
            // M8 16 c-2 0 -4.5 -4 -4 -6 m5.43 -.67 A8.5 8.5 0 0 0 10 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // c -2 0 -4.5 -4 -4 -6
                curveToRelative(
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                    dx2 = -4.5f,
                    dy2 = -4.0f,
                    dx3 = -4.0f,
                    dy3 = -6.0f,
                )
                // m 5.43 -0.67
                moveToRelative(dx = 5.43f, dy = -0.67f)
                // A 8.5 8.5 0 0 0 10 16
                arcTo(
                    horizontalEllipseRadius = 8.5f,
                    verticalEllipseRadius = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 16.0f,
                )
            }
        }.build().also { _shrimpOff = it }
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
                imageVector = ShrimpOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _shrimpOff: ImageVector? = null
