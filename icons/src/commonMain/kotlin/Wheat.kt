package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wheat: ImageVector
    get() {
        val current = _wheat
        if (current != null) return current

        return ImageVector.Builder(
            name = "Wheat",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 22 16 8 M3.47 12.53 5 11 l1.53 1.53 a3.5 3.5 0 0 1 0 4.94 L5 19 l-1.53 -1.53 a3.5 3.5 0 0 1 0 -4.94 m4 -4 L9 7 l1.53 1.53 a3.5 3.5 0 0 1 0 4.94 L9 15 l-1.53 -1.53 a3.5 3.5 0 0 1 0 -4.94 m4 -4 L13 3 l1.53 1.53 a3.5 3.5 0 0 1 0 4.94 L13 11 l-1.53 -1.53 a3.5 3.5 0 0 1 0 -4.94 M20 2 h2 v2 a4 4 0 0 1 -4 4 h-2 V6 a4 4 0 0 1 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // L 16 8
                lineTo(x = 16.0f, y = 8.0f)
                // M 3.47 12.53
                moveTo(x = 3.47f, y = 12.53f)
                // L 5 11
                lineTo(x = 5.0f, y = 11.0f)
                // l 1.53 1.53
                lineToRelative(dx = 1.53f, dy = 1.53f)
                // a 3.5 3.5 0 0 1 0 4.94
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.94f,
                )
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
                // l -1.53 -1.53
                lineToRelative(dx = -1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 1 0 -4.94
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.94f,
                )
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // L 9 7
                lineTo(x = 9.0f, y = 7.0f)
                // l 1.53 1.53
                lineToRelative(dx = 1.53f, dy = 1.53f)
                // a 3.5 3.5 0 0 1 0 4.94
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.94f,
                )
                // L 9 15
                lineTo(x = 9.0f, y = 15.0f)
                // l -1.53 -1.53
                lineToRelative(dx = -1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 1 0 -4.94
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.94f,
                )
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // L 13 3
                lineTo(x = 13.0f, y = 3.0f)
                // l 1.53 1.53
                lineToRelative(dx = 1.53f, dy = 1.53f)
                // a 3.5 3.5 0 0 1 0 4.94
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.94f,
                )
                // L 13 11
                lineTo(x = 13.0f, y = 11.0f)
                // l -1.53 -1.53
                lineToRelative(dx = -1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 1 0 -4.94
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.94f,
                )
                // M 20 2
                moveTo(x = 20.0f, y = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
            }
            // M11.47 17.47 13 19 l-1.53 1.53 a3.5 3.5 0 0 1 -4.94 0 L5 19 l1.53 -1.53 a3.5 3.5 0 0 1 4.94 0 m4 -4 L17 15 l-1.53 1.53 a3.5 3.5 0 0 1 -4.94 0 L9 15 l1.53 -1.53 a3.5 3.5 0 0 1 4.94 0 m4 -4 L21 11 l-1.53 1.53 a3.5 3.5 0 0 1 -4.94 0 L13 11 l1.53 -1.53 a3.5 3.5 0 0 1 4.94 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.47 17.47
                moveTo(x = 11.47f, y = 17.47f)
                // L 13 19
                lineTo(x = 13.0f, y = 19.0f)
                // l -1.53 1.53
                lineToRelative(dx = -1.53f, dy = 1.53f)
                // a 3.5 3.5 0 0 1 -4.94 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.94f,
                    dy1 = 0.0f,
                )
                // L 5 19
                lineTo(x = 5.0f, y = 19.0f)
                // l 1.53 -1.53
                lineToRelative(dx = 1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 1 4.94 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.94f,
                    dy1 = 0.0f,
                )
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // L 17 15
                lineTo(x = 17.0f, y = 15.0f)
                // l -1.53 1.53
                lineToRelative(dx = -1.53f, dy = 1.53f)
                // a 3.5 3.5 0 0 1 -4.94 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.94f,
                    dy1 = 0.0f,
                )
                // L 9 15
                lineTo(x = 9.0f, y = 15.0f)
                // l 1.53 -1.53
                lineToRelative(dx = 1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 1 4.94 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.94f,
                    dy1 = 0.0f,
                )
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // L 21 11
                lineTo(x = 21.0f, y = 11.0f)
                // l -1.53 1.53
                lineToRelative(dx = -1.53f, dy = 1.53f)
                // a 3.5 3.5 0 0 1 -4.94 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.94f,
                    dy1 = 0.0f,
                )
                // L 13 11
                lineTo(x = 13.0f, y = 11.0f)
                // l 1.53 -1.53
                lineToRelative(dx = 1.53f, dy = -1.53f)
                // a 3.5 3.5 0 0 1 4.94 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.94f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _wheat = it }
    }


@Suppress("ObjectPropertyName")
private var _wheat: ImageVector? = null
