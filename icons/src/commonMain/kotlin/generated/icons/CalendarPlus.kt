package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CalendarPlus: ImageVector
    get() {
        val current = _calendarPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CalendarPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 18 h6 M16 2 v3 m3 10 v6 m2 -9.5 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h8.3 M3 9 h18 M8 2 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 18
                moveTo(x = 16.0f, y = 18.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 3 10
                moveToRelative(dx = 3.0f, dy = 10.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 2 -9.5
                moveToRelative(dx = 2.0f, dy = -9.5f)
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
                // h 8.3
                horizontalLineToRelative(dx = 8.3f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _calendarPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _calendarPlus: ImageVector? = null
