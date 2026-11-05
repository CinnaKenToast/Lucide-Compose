package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CalendarArrowRight: ImageVector
    get() {
        val current = _calendarArrowRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CalendarArrowRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 2 v3 m2 16 3 -3 h-6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 2 16
                moveToRelative(dx = 2.0f, dy = 16.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
            }
            // M21 12.34 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h7.35 M21 18 l-3 -3 M3 9 h18 M8 2 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 12.34
                moveTo(x = 21.0f, y = 12.34f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
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
                // h 7.35
                horizontalLineToRelative(dx = 7.35f)
                // M 21 18
                moveTo(x = 21.0f, y = 18.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _calendarArrowRight = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarArrowRight: ImageVector? = null
