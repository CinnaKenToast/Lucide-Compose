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

val HopOff: ImageVector
    get() {
        val current = _hopOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.HopOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.82 16.12 A20 20 0 0 0 16 16.97 a1 1 0 0 0 .7 -.27
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.82 16.12
                moveTo(x = 10.82f, y = 16.12f)
                // A 20 20 0 0 0 16 16.97
                arcTo(
                    horizontalEllipseRadius = 20.0f,
                    verticalEllipseRadius = 20.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 16.97f,
                )
                // a 1 1 0 0 0 0.7 -0.27
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = -0.27f,
                )
            }
            // M11.14 20.57 a17 17 0 0 0 4.08 1.37 .8 .8 0 0 0 .9 -.71 16 16 0 0 0 -.5 -4.28
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.14 20.57
                moveTo(x = 11.14f, y = 20.57f)
                // a 17 17 0 0 0 4.08 1.37
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.08f,
                    dy1 = 1.37f,
                )
                // a 0.8 0.8 0 0 0 0.9 -0.71
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.9f,
                    dy1 = -0.71f,
                )
                // a 16 16 0 0 0 -0.5 -4.28
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = -4.28f,
                )
            }
            // M16.13 21.05 A18 18 0 0 0 21 21.96 a1 1 0 0 0 .7 -.26 M17.99 5.52 a21 21 0 0 1 3.15 4.5 .8 .8 0 0 1 -.68 1.13 14 14 0 0 1 -3.9 -.25
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.13 21.05
                moveTo(x = 16.13f, y = 21.05f)
                // A 18 18 0 0 0 21 21.96
                arcTo(
                    horizontalEllipseRadius = 18.0f,
                    verticalEllipseRadius = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 21.96f,
                )
                // a 1 1 0 0 0 0.7 -0.26
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = -0.26f,
                )
                // M 17.99 5.52
                moveTo(x = 17.99f, y = 5.52f)
                // a 21 21 0 0 1 3.15 4.5
                arcToRelative(
                    a = 21.0f,
                    b = 21.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.15f,
                    dy1 = 4.5f,
                )
                // a 0.8 0.8 0 0 1 -0.68 1.13
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.68f,
                    dy1 = 1.13f,
                )
                // a 14 14 0 0 1 -3.9 -0.25
                arcToRelative(
                    a = 14.0f,
                    b = 14.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.9f,
                    dy1 = -0.25f,
                )
            }
            // M20.57 11.14 a17 17 0 0 1 1.37 4.08 .8 .8 0 0 1 -.31 .75 M4.93 4.93 a10 10 0 0 0 -.67 13.4 c.35 .43 .96 .4 1.17 -.12 .69 -1.71 1.07 -5.07 1.07 -6.71 1.34 .45 3.1 .9 4.88 .62 a1 1 0 0 0 .48 -.24
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20.57 11.14
                moveTo(x = 20.57f, y = 11.14f)
                // a 17 17 0 0 1 1.37 4.08
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.37f,
                    dy1 = 4.08f,
                )
                // a 0.8 0.8 0 0 1 -0.31 0.75
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.31f,
                    dy1 = 0.75f,
                )
                // M 4.93 4.93
                moveTo(x = 4.93f, y = 4.93f)
                // a 10 10 0 0 0 -0.67 13.4
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.67f,
                    dy1 = 13.4f,
                )
                // c 0.35 0.43 0.96 0.4 1.17 -0.12
                curveToRelative(
                    dx1 = 0.35f,
                    dy1 = 0.43f,
                    dx2 = 0.96f,
                    dy2 = 0.4f,
                    dx3 = 1.17f,
                    dy3 = -0.12f,
                )
                // c 0.69 -1.71 1.07 -5.07 1.07 -6.71
                curveToRelative(
                    dx1 = 0.69f,
                    dy1 = -1.71f,
                    dx2 = 1.07f,
                    dy2 = -5.07f,
                    dx3 = 1.07f,
                    dy3 = -6.71f,
                )
                // c 1.34 0.45 3.1 0.9 4.88 0.62
                curveToRelative(
                    dx1 = 1.34f,
                    dy1 = 0.45f,
                    dx2 = 3.1f,
                    dy2 = 0.9f,
                    dx3 = 4.88f,
                    dy3 = 0.62f,
                )
                // a 1 1 0 0 0 0.48 -0.24
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.48f,
                    dy1 = -0.24f,
                )
            }
            // M5.52 17.99 a21 21 0 0 0 4.5 3.15 .8 .8 0 0 0 1.13 -.68 c.2 -2.34 -.33 -5.3 -1.57 -8.28 m-1.23 -9.5 a10 10 0 0 1 9.98 1.58 c.43 .35 .4 .96 -.12 1.17 -1.5 .6 -4.3 .98 -6.07 1.05 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.52 17.99
                moveTo(x = 5.52f, y = 17.99f)
                // a 21 21 0 0 0 4.5 3.15
                arcToRelative(
                    a = 21.0f,
                    b = 21.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.5f,
                    dy1 = 3.15f,
                )
                // a 0.8 0.8 0 0 0 1.13 -0.68
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.13f,
                    dy1 = -0.68f,
                )
                // c 0.2 -2.34 -0.33 -5.3 -1.57 -8.28
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = -2.34f,
                    dx2 = -0.33f,
                    dy2 = -5.3f,
                    dx3 = -1.57f,
                    dy3 = -8.28f,
                )
                // m -1.23 -9.5
                moveToRelative(dx = -1.23f, dy = -9.5f)
                // a 10 10 0 0 1 9.98 1.58
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.98f,
                    dy1 = 1.58f,
                )
                // c 0.43 0.35 0.4 0.96 -0.12 1.17
                curveToRelative(
                    dx1 = 0.43f,
                    dy1 = 0.35f,
                    dx2 = 0.4f,
                    dy2 = 0.96f,
                    dx3 = -0.12f,
                    dy3 = 1.17f,
                )
                // c -1.5 0.6 -4.3 0.98 -6.07 1.05
                curveToRelative(
                    dx1 = -1.5f,
                    dy1 = 0.6f,
                    dx2 = -4.3f,
                    dy2 = 0.98f,
                    dx3 = -6.07f,
                    dy3 = 1.05f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _hopOff = it }
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
                imageVector = HopOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _hopOff: ImageVector? = null
