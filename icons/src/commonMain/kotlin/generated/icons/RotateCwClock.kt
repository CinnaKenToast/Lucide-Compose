package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RotateCwClock: ImageVector
    get() {
        val current = _rotateCwClock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.RotateCwClock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 7 v5 l4 2 m0 -6 h5 V3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 7
                moveTo(x = 12.0f, y = 7.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // l 4 2
                lineToRelative(dx = 4.0f, dy = 2.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // V 3
                verticalLineTo(y = 3.0f)
            }
            // m21 8 -2.3 -2.3 A9.7 9.7 0 0 0 12 3 a9 9 0 1 0 9 9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // l -2.3 -2.3
                lineToRelative(dx = -2.3f, dy = -2.3f)
                // A 9.7 9.7 0 0 0 12 3
                arcTo(
                    horizontalEllipseRadius = 9.7f,
                    verticalEllipseRadius = 9.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 3.0f,
                )
                // a 9 9 0 1 0 9 9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 9.0f,
                    dy1 = 9.0f,
                )
            }
        }.build().also { _rotateCwClock = it }
    }

@Suppress("ObjectPropertyName")
private var _rotateCwClock: ImageVector? = null
