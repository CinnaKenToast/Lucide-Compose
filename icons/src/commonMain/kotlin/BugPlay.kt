package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BugPlay: ImageVector
    get() {
        val current = _bugPlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "BugPlay",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 19.66 A6 6 0 0 1 6 14 v-3 a4 4 0 0 1 4 -4 h4 a4 4 0 0 1 4 3.97
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 19.66
                moveTo(x = 10.0f, y = 19.66f)
                // A 6 6 0 0 1 6 14
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 14.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 4 4 0 0 1 4 3.97
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 3.97f,
                )
            }
            // M14 15 a1 1 0 0 1 1.52 -.86 l5 3 a1 1 0 0 1 0 1.72 l-5 3 A1 1 0 0 1 14 21z m.12 -11.12 L16 2 m5 3 a4 4 0 0 1 -3.55 3.97 M3 21 a4 4 0 0 1 3.81 -4 M3 5 a4 4 0 0 0 3.55 3.97 M6 13 H2 M8 2 l1.88 1.88 M9 7.13 V6 a3 3 0 1 1 6 0 v1.13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 15
                moveTo(x = 14.0f, y = 15.0f)
                // a 1 1 0 0 1 1.52 -0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.52f,
                    dy1 = -0.86f,
                )
                // l 5 3
                lineToRelative(dx = 5.0f, dy = 3.0f)
                // a 1 1 0 0 1 0 1.72
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.72f,
                )
                // l -5 3
                lineToRelative(dx = -5.0f, dy = 3.0f)
                // A 1 1 0 0 1 14 21z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.0f,
                    y1 = 21.0f,
                )
                close()
                // m 0.12 -11.12
                moveToRelative(dx = 0.12f, dy = -11.12f)
                // L 16 2
                lineTo(x = 16.0f, y = 2.0f)
                // m 5 3
                moveToRelative(dx = 5.0f, dy = 3.0f)
                // a 4 4 0 0 1 -3.55 3.97
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.55f,
                    dy1 = 3.97f,
                )
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // a 4 4 0 0 1 3.81 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.81f,
                    dy1 = -4.0f,
                )
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // a 4 4 0 0 0 3.55 3.97
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.55f,
                    dy1 = 3.97f,
                )
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // l 1.88 1.88
                lineToRelative(dx = 1.88f, dy = 1.88f)
                // M 9 7.13
                moveTo(x = 9.0f, y = 7.13f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v 1.13
                verticalLineToRelative(dy = 1.13f)
            }
        }.build().also { _bugPlay = it }
    }


@Suppress("ObjectPropertyName")
private var _bugPlay: ImageVector? = null
