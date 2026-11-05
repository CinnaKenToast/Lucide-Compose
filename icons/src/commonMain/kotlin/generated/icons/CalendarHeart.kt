package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CalendarHeart: ImageVector
    get() {
        val current = _calendarHeart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CalendarHeart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.13 21 H5 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h14 a2 2 0 0 1 2 2 v5.13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.13 21
                moveTo(x = 12.13f, y = 21.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 5.13
                verticalLineToRelative(dy = 5.13f)
            }
            // M14.62 17.8 A2.25 2.25 0 1 1 18 14.84 a2.25 2.25 0 1 1 3.38 2.96 l-2.63 2.86 a1 1 0 0 1 -1.5 0z M16 2 v3 M3 9 h18 M8 2 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.62 17.8
                moveTo(x = 14.62f, y = 17.8f)
                // A 2.25 2.25 0 1 1 18 14.84
                arcTo(
                    horizontalEllipseRadius = 2.25f,
                    verticalEllipseRadius = 2.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 14.84f,
                )
                // a 2.25 2.25 0 1 1 3.38 2.96
                arcToRelative(
                    a = 2.25f,
                    b = 2.25f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.38f,
                    dy1 = 2.96f,
                )
                // l -2.63 2.86
                lineToRelative(dx = -2.63f, dy = 2.86f)
                // a 1 1 0 0 1 -1.5 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.5f,
                    dy1 = 0.0f,
                )
                close()
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _calendarHeart = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarHeart: ImageVector? = null
