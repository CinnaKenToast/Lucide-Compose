package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CalendarCheck2: ImageVector
    get() {
        val current = _calendarCheck2
        if (current != null) return current

        return ImageVector.Builder(
            name = "CalendarCheck2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19 3 H5 m16 10 V5 m0 0 a2 2 0 0 0 -2 -2 M3 19 a2 2 0 0 0 2 2 M3 5 v14 M5 3 a2 2 0 0 0 -2 2 m13 14 2 2 4 -4 M16 2 v3 M3 9 h18 M5 21 h7.5 M8 2 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 3
                moveTo(x = 19.0f, y = 3.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // m 16 10
                moveToRelative(dx = 16.0f, dy = 10.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
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
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
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
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // M 5 3
                moveTo(x = 5.0f, y = 3.0f)
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
                // m 13 14
                moveToRelative(dx = 13.0f, dy = 14.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // M 16 2
                moveTo(x = 16.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
                // h 7.5
                horizontalLineToRelative(dx = 7.5f)
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _calendarCheck2 = it }
    }


@Suppress("ObjectPropertyName")
private var _calendarCheck2: ImageVector? = null
