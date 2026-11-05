package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mosque: ImageVector
    get() {
        val current = _mosque
        if (current != null) return current

        return ImageVector.Builder(
            name = "Mosque",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.27 2 a2 2 0 0 0 3.46 2 M14 5 v3 m2 14 v-3 a2 2 0 0 0 -4 0 v3 m9 -9 a9 9 0 0 0 -2.9 -3.63 C16.82 8.47 15.42 8 14 8 s-2.83 .47 -4.1 1.37 A9 9 0 0 0 7 13z M3 9 h4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.27 2
                moveTo(x = 12.27f, y = 2.0f)
                // a 2 2 0 0 0 3.46 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.46f,
                    dy1 = 2.0f,
                )
                // M 14 5
                moveTo(x = 14.0f, y = 5.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 2 14
                moveToRelative(dx = 2.0f, dy = 14.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 2 2 0 0 0 -4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 9 -9
                moveToRelative(dx = 9.0f, dy = -9.0f)
                // a 9 9 0 0 0 -2.9 -3.63
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.9f,
                    dy1 = -3.63f,
                )
                // C 16.82 8.47 15.42 8 14 8
                curveTo(
                    x1 = 16.82f,
                    y1 = 8.47f,
                    x2 = 15.42f,
                    y2 = 8.0f,
                    x3 = 14.0f,
                    y3 = 8.0f,
                )
                // s -2.83 0.47 -4.1 1.37
                reflectiveCurveToRelative(
                    dx1 = -2.83f,
                    dy1 = 0.47f,
                    dx2 = -4.1f,
                    dy2 = 1.37f,
                )
                // A 9 9 0 0 0 7 13z
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 13.0f,
                )
                close()
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
            }
            // M7 22 V6 a5 5 0 0 0 -2 -4 5 5 0 0 0 -2 4 v14 a2 2 0 0 0 2 2 h14 a2 2 0 0 0 2 -2 v-7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 5 5 0 0 0 -2 -4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -4.0f,
                )
                // a 5 5 0 0 0 -2 4
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 4.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
            }
        }.build().also { _mosque = it }
    }


@Suppress("ObjectPropertyName")
private var _mosque: ImageVector? = null
