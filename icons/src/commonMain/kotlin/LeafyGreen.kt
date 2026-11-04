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

val LeafyGreen: ImageVector
    get() {
        val current = _leafyGreen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.LeafyGreen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 22 c1.25 -.99 2.27 -1.97 3.9 -2.2 a5.6 5.6 0 0 1 3.8 1.5 4 4 0 0 0 6.19 -2.35 3.5 3.5 0 0 0 3.69 -5.12 A3.5 3.5 0 0 0 20.95 8 3.5 3.5 0 1 0 16 3.05 a3.5 3.5 0 0 0 -5.83 1.37 3.5 3.5 0 0 0 -5.12 3.7 4 4 0 0 0 -2.34 6.15 C3.5 15.42 4.4 16.7 4.2 18.1 3.93 19.74 3.01 20.73 2 22 m0 0 L17 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // c 1.25 -0.99 2.27 -1.97 3.9 -2.2
                curveToRelative(
                    dx1 = 1.25f,
                    dy1 = -0.99f,
                    dx2 = 2.27f,
                    dy2 = -1.97f,
                    dx3 = 3.9f,
                    dy3 = -2.2f,
                )
                // a 5.6 5.6 0 0 1 3.8 1.5
                arcToRelative(
                    a = 5.6f,
                    b = 5.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.8f,
                    dy1 = 1.5f,
                )
                // a 4 4 0 0 0 6.19 -2.35
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.19f,
                    dy1 = -2.35f,
                )
                // a 3.5 3.5 0 0 0 3.69 -5.12
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.69f,
                    dy1 = -5.12f,
                )
                // A 3.5 3.5 0 0 0 20.95 8
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.95f,
                    y1 = 8.0f,
                )
                // A 3.5 3.5 0 1 0 16 3.05
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 3.05f,
                )
                // a 3.5 3.5 0 0 0 -5.83 1.37
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.83f,
                    dy1 = 1.37f,
                )
                // a 3.5 3.5 0 0 0 -5.12 3.7
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.12f,
                    dy1 = 3.7f,
                )
                // a 4 4 0 0 0 -2.34 6.15
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.34f,
                    dy1 = 6.15f,
                )
                // C 3.5 15.42 4.4 16.7 4.2 18.1
                curveTo(
                    x1 = 3.5f,
                    y1 = 15.42f,
                    x2 = 4.4f,
                    y2 = 16.7f,
                    x3 = 4.2f,
                    y3 = 18.1f,
                )
                // C 3.93 19.74 3.01 20.73 2 22
                curveTo(
                    x1 = 3.93f,
                    y1 = 19.74f,
                    x2 = 3.01f,
                    y2 = 20.73f,
                    x3 = 2.0f,
                    y3 = 22.0f,
                )
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // L 17 7
                lineTo(x = 17.0f, y = 7.0f)
            }
        }.build().also { _leafyGreen = it }
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
                imageVector = LeafyGreen,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _leafyGreen: ImageVector? = null
