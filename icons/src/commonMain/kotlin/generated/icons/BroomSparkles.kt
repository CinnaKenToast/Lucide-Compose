package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BroomSparkles: ImageVector
    get() {
        val current = _broomSparkles
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BroomSparkles",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 2 v2 m1 -1 h-2 m3.5 7.5 L22 2 m-7.27 11.84 a2 2 0 0 0 -.31 -2.42 l-1.84 -1.84 a2 2 0 0 0 -2.42 -.31 L2.5 13.73 a1 1 0 0 0 -.2 1.57 l6.4 6.4 a1 1 0 0 0 1.57 -.2z M20 15 v4 m2 -2 h-4 M4 4 v4 m1 10 2 -2 M6 6 H2 m5.7 4.7 5.6 5.6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 2
                moveTo(x = 11.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 1 -1
                moveToRelative(dx = 1.0f, dy = -1.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 3.5 7.5
                moveToRelative(dx = 3.5f, dy = 7.5f)
                // L 22 2
                lineTo(x = 22.0f, y = 2.0f)
                // m -7.27 11.84
                moveToRelative(dx = -7.27f, dy = 11.84f)
                // a 2 2 0 0 0 -0.31 -2.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.31f,
                    dy1 = -2.42f,
                )
                // l -1.84 -1.84
                lineToRelative(dx = -1.84f, dy = -1.84f)
                // a 2 2 0 0 0 -2.42 -0.31
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.42f,
                    dy1 = -0.31f,
                )
                // L 2.5 13.73
                lineTo(x = 2.5f, y = 13.73f)
                // a 1 1 0 0 0 -0.2 1.57
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.2f,
                    dy1 = 1.57f,
                )
                // l 6.4 6.4
                lineToRelative(dx = 6.4f, dy = 6.4f)
                // a 1 1 0 0 0 1.57 -0.2z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.57f,
                    dy1 = -0.2f,
                )
                close()
                // M 20 15
                moveTo(x = 20.0f, y = 15.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 2 -2
                moveToRelative(dx = 2.0f, dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 1 10
                moveToRelative(dx = 1.0f, dy = 10.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // M 6 6
                moveTo(x = 6.0f, y = 6.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 5.7 4.7
                moveToRelative(dx = 5.7f, dy = 4.7f)
                // l 5.6 5.6
                lineToRelative(dx = 5.6f, dy = 5.6f)
            }
        }.build().also { _broomSparkles = it }
    }

@Suppress("ObjectPropertyName")
private var _broomSparkles: ImageVector? = null
