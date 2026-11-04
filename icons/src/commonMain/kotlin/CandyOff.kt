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

val CandyOff: ImageVector
    get() {
        val current = _candyOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.CandyOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 10 v7.9 m1.8 -11.75 a5 5 0 0 1 6.05 6.05 M14 6.1 v2.24 m1.5 7.23 -.96 .96 a5 5 0 0 1 -7.07 0 5 5 0 0 1 0 -7.07 L8.43 8.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // v 7.9
                verticalLineToRelative(dy = 7.9f)
                // m 1.8 -11.75
                moveToRelative(dx = 1.8f, dy = -11.75f)
                // a 5 5 0 0 1 6.05 6.05
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.05f,
                    dy1 = 6.05f,
                )
                // M 14 6.1
                moveTo(x = 14.0f, y = 6.1f)
                // v 2.24
                verticalLineToRelative(dy = 2.24f)
                // m 1.5 7.23
                moveToRelative(dx = 1.5f, dy = 7.23f)
                // l -0.96 0.96
                lineToRelative(dx = -0.96f, dy = 0.96f)
                // a 5 5 0 0 1 -7.07 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -7.07f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 0 1 0 -7.07
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -7.07f,
                )
                // L 8.43 8.5
                lineTo(x = 8.43f, y = 8.5f)
            }
            // M16 7 V3 a1 1 0 0 1 1.7 -.7 A2.5 2.5 0 0 0 19.87 3 a1 1 0 0 1 1.13 1.13 2.5 2.5 0 0 0 .72 2.15 A1 1 0 0 1 21 8 h-4 M2 2 l20 20 M8 17 v4 a1 1 0 0 1 -1.7 .7 A2.5 2.5 0 0 0 4.13 21 a1 1 0 0 1 -1.13 -1.13 2.5 2.5 0 0 0 -.72 -2.15 A1 1 0 0 1 3 16 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 7
                moveTo(x = 16.0f, y = 7.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 1 1.7 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = -0.7f,
                )
                // A 2.5 2.5 0 0 0 19.87 3
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.87f,
                    y1 = 3.0f,
                )
                // a 1 1 0 0 1 1.13 1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.13f,
                    dy1 = 1.13f,
                )
                // a 2.5 2.5 0 0 0 0.72 2.15
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.72f,
                    dy1 = 2.15f,
                )
                // A 1 1 0 0 1 21 8
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 8.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 8 17
                moveTo(x = 8.0f, y = 17.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 1 1 0 0 1 -1.7 0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.7f,
                    dy1 = 0.7f,
                )
                // A 2.5 2.5 0 0 0 4.13 21
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.13f,
                    y1 = 21.0f,
                )
                // a 1 1 0 0 1 -1.13 -1.13
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.13f,
                    dy1 = -1.13f,
                )
                // a 2.5 2.5 0 0 0 -0.72 -2.15
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.72f,
                    dy1 = -2.15f,
                )
                // A 1 1 0 0 1 3 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.0f,
                    y1 = 16.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
        }.build().also { _candyOff = it }
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
                imageVector = CandyOff,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _candyOff: ImageVector? = null
