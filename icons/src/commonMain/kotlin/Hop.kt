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

val Hop: ImageVector
    get() {
        val current = _hop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Hop",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.82 16.12 A20 20 0 0 0 16 16.97 .92 .92 0 0 0 16.97 16 a20 20 0 0 0 -.85 -5.18 M11.5 6.5 c1.64 0 5 -.38 6.71 -1.07 .52 -.2 .55 -.82 .12 -1.17 A10 10 0 0 0 4.26 18.33 c.35 .43 .96 .4 1.17 -.12 .69 -1.71 1.07 -5.07 1.07 -6.71 1.34 .45 3.1 .9 4.88 .62 a.9 .9 0 0 0 .73 -.74 A9.6 9.6 0 0 0 11.5 6.5
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
                // A 0.92 0.92 0 0 0 16.97 16
                arcTo(
                    horizontalEllipseRadius = 0.92f,
                    verticalEllipseRadius = 0.92f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.97f,
                    y1 = 16.0f,
                )
                // a 20 20 0 0 0 -0.85 -5.18
                arcToRelative(
                    a = 20.0f,
                    b = 20.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.85f,
                    dy1 = -5.18f,
                )
                // M 11.5 6.5
                moveTo(x = 11.5f, y = 6.5f)
                // c 1.64 0 5 -0.38 6.71 -1.07
                curveToRelative(
                    dx1 = 1.64f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -0.38f,
                    dx3 = 6.71f,
                    dy3 = -1.07f,
                )
                // c 0.52 -0.2 0.55 -0.82 0.12 -1.17
                curveToRelative(
                    dx1 = 0.52f,
                    dy1 = -0.2f,
                    dx2 = 0.55f,
                    dy2 = -0.82f,
                    dx3 = 0.12f,
                    dy3 = -1.17f,
                )
                // A 10 10 0 0 0 4.26 18.33
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.26f,
                    y1 = 18.33f,
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
                // a 0.9 0.9 0 0 0 0.73 -0.74
                arcToRelative(
                    a = 0.9f,
                    b = 0.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.73f,
                    dy1 = -0.74f,
                )
                // A 9.6 9.6 0 0 0 11.5 6.5
                arcTo(
                    horizontalEllipseRadius = 9.6f,
                    verticalEllipseRadius = 9.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.5f,
                    y1 = 6.5f,
                )
            }
            // M15.62 16.95 a16 16 0 0 1 .5 4.28 .77 .77 0 0 1 -.9 .7 17 17 0 0 1 -4.08 -1.36
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.62 16.95
                moveTo(x = 15.62f, y = 16.95f)
                // a 16 16 0 0 1 0.5 4.28
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = 4.28f,
                )
                // a 0.77 0.77 0 0 1 -0.9 0.7
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.9f,
                    dy1 = 0.7f,
                )
                // a 17 17 0 0 1 -4.08 -1.36
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.08f,
                    dy1 = -1.36f,
                )
            }
            // M16.13 21.05 A18 18 0 0 0 21 21.96 .9 .9 0 0 0 21.96 21 a18 18 0 0 0 -.9 -4.87
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
                // A 0.9 0.9 0 0 0 21.96 21
                arcTo(
                    horizontalEllipseRadius = 0.9f,
                    verticalEllipseRadius = 0.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.96f,
                    y1 = 21.0f,
                )
                // a 18 18 0 0 0 -0.9 -4.87
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.9f,
                    dy1 = -4.87f,
                )
            }
            // M16.94 15.62 a16 16 0 0 0 4.29 .5 .77 .77 0 0 0 .7 -.9 17 17 0 0 0 -1.36 -4.08
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.94 15.62
                moveTo(x = 16.94f, y = 15.62f)
                // a 16 16 0 0 0 4.29 0.5
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.29f,
                    dy1 = 0.5f,
                )
                // a 0.77 0.77 0 0 0 0.7 -0.9
                arcToRelative(
                    a = 0.77f,
                    b = 0.77f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = -0.9f,
                )
                // a 17 17 0 0 0 -1.36 -4.08
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.36f,
                    dy1 = -4.08f,
                )
            }
            // M17.99 5.52 a21 21 0 0 1 3.15 4.5 .8 .8 0 0 1 -.68 1.13 c-2.33 .2 -5.3 -.32 -8.27 -1.57 M4.93 4.93 3 3 a.7 .7 0 0 1 0 -1 m6.58 10.18 c1.24 2.98 1.77 5.95 1.57 8.28 a.8 .8 0 0 1 -1.13 .68 21 21 0 0 1 -4.5 -3.15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
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
                // c -2.33 0.2 -5.3 -0.32 -8.27 -1.57
                curveToRelative(
                    dx1 = -2.33f,
                    dy1 = 0.2f,
                    dx2 = -5.3f,
                    dy2 = -0.32f,
                    dx3 = -8.27f,
                    dy3 = -1.57f,
                )
                // M 4.93 4.93
                moveTo(x = 4.93f, y = 4.93f)
                // L 3 3
                lineTo(x = 3.0f, y = 3.0f)
                // a 0.7 0.7 0 0 1 0 -1
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.0f,
                )
                // m 6.58 10.18
                moveToRelative(dx = 6.58f, dy = 10.18f)
                // c 1.24 2.98 1.77 5.95 1.57 8.28
                curveToRelative(
                    dx1 = 1.24f,
                    dy1 = 2.98f,
                    dx2 = 1.77f,
                    dy2 = 5.95f,
                    dx3 = 1.57f,
                    dy3 = 8.28f,
                )
                // a 0.8 0.8 0 0 1 -1.13 0.68
                arcToRelative(
                    a = 0.8f,
                    b = 0.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.13f,
                    dy1 = 0.68f,
                )
                // a 21 21 0 0 1 -4.5 -3.15
                arcToRelative(
                    a = 21.0f,
                    b = 21.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.5f,
                    dy1 = -3.15f,
                )
            }
        }.build().also { _hop = it }
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
                imageVector = Hop,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _hop: ImageVector? = null
