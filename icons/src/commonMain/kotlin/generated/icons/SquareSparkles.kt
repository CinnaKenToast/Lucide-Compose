package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareSparkles: ImageVector
    get() {
        val current = _squareSparkles
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquareSparkles",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 15 H7 m8.41 -12.51 a.6 .6 0 0 1 1.18 0 l.63 3.33 a1.2 1.2 0 0 0 .96 .96 L21.5 7.4 a.6 .6 0 0 1 0 1.18 l-3.33 .63 a1.2 1.2 0 0 0 -.96 .96 L16.6 13.5 a.6 .6 0 0 1 -1.18 0 l-.63 -3.33 a1.2 1.2 0 0 0 -.96 -.96 L10.5 8.6 a.6 .6 0 0 1 0 -1.18 l3.33 -.63 a1.2 1.2 0 0 0 .96 -.96z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 15
                moveTo(x = 11.0f, y = 15.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // m 8.41 -12.51
                moveToRelative(dx = 8.41f, dy = -12.51f)
                // a 0.6 0.6 0 0 1 1.18 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.18f,
                    dy1 = 0.0f,
                )
                // l 0.63 3.33
                lineToRelative(dx = 0.63f, dy = 3.33f)
                // a 1.2 1.2 0 0 0 0.96 0.96
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.96f,
                    dy1 = 0.96f,
                )
                // L 21.5 7.4
                lineTo(x = 21.5f, y = 7.4f)
                // a 0.6 0.6 0 0 1 0 1.18
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.18f,
                )
                // l -3.33 0.63
                lineToRelative(dx = -3.33f, dy = 0.63f)
                // a 1.2 1.2 0 0 0 -0.96 0.96
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.96f,
                    dy1 = 0.96f,
                )
                // L 16.6 13.5
                lineTo(x = 16.6f, y = 13.5f)
                // a 0.6 0.6 0 0 1 -1.18 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.18f,
                    dy1 = 0.0f,
                )
                // l -0.63 -3.33
                lineToRelative(dx = -0.63f, dy = -3.33f)
                // a 1.2 1.2 0 0 0 -0.96 -0.96
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.96f,
                    dy1 = -0.96f,
                )
                // L 10.5 8.6
                lineTo(x = 10.5f, y = 8.6f)
                // a 0.6 0.6 0 0 1 0 -1.18
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.18f,
                )
                // l 3.33 -0.63
                lineToRelative(dx = 3.33f, dy = -0.63f)
                // a 1.2 1.2 0 0 0 0.96 -0.96z
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.96f,
                    dy1 = -0.96f,
                )
                close()
            }
            // M21 13 v6 a2 2 0 0 1 -2 2 H5 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h6 M9 13 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 13
                moveTo(x = 21.0f, y = 13.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 9 13
                moveTo(x = 9.0f, y = 13.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _squareSparkles = it }
    }

@Suppress("ObjectPropertyName")
private var _squareSparkles: ImageVector? = null
