package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Elevator: ImageVector
    get() {
        val current = _elevator
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Elevator",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m18 10 2 -2 2 2 m-4 4 2 2 2 -2 M2 19 h14 M4 19 V7 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2 v12 M9 5 v14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 10
                moveTo(x = 18.0f, y = 10.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // M 2 19
                moveTo(x = 2.0f, y = 19.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // M 4 19
                moveTo(x = 4.0f, y = 19.0f)
                // V 7
                verticalLineTo(y = 7.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
            }
        }.build().also { _elevator = it }
    }

@Suppress("ObjectPropertyName")
private var _elevator: ImageVector? = null
