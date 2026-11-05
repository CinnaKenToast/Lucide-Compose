package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WandSparkles: ImageVector
    get() {
        val current = _wandSparkles
        if (current != null) return current

        return ImageVector.Builder(
            name = "WandSparkles",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m21.64 3.64 -1.28 -1.28 a1.2 1.2 0 0 0 -1.72 0 L2.36 18.64 a1.2 1.2 0 0 0 0 1.72 l1.28 1.28 a1.2 1.2 0 0 0 1.72 0 L21.64 5.36 a1.2 1.2 0 0 0 0 -1.72 M14 7 l3 3 M5 6 v4 m14 4 v4 M10 2 v2 M7 8 H3 m18 8 h-4 M11 3 H9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.64 3.64
                moveTo(x = 21.64f, y = 3.64f)
                // l -1.28 -1.28
                lineToRelative(dx = -1.28f, dy = -1.28f)
                // a 1.2 1.2 0 0 0 -1.72 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.72f,
                    dy1 = 0.0f,
                )
                // L 2.36 18.64
                lineTo(x = 2.36f, y = 18.64f)
                // a 1.2 1.2 0 0 0 0 1.72
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.72f,
                )
                // l 1.28 1.28
                lineToRelative(dx = 1.28f, dy = 1.28f)
                // a 1.2 1.2 0 0 0 1.72 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.72f,
                    dy1 = 0.0f,
                )
                // L 21.64 5.36
                lineTo(x = 21.64f, y = 5.36f)
                // a 1.2 1.2 0 0 0 0 -1.72
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.72f,
                )
                // M 14 7
                moveTo(x = 14.0f, y = 7.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // M 5 6
                moveTo(x = 5.0f, y = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 14 4
                moveToRelative(dx = 14.0f, dy = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 7 8
                moveTo(x = 7.0f, y = 8.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // m 18 8
                moveToRelative(dx = 18.0f, dy = 8.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // M 11 3
                moveTo(x = 11.0f, y = 3.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
            }
        }.build().also { _wandSparkles = it }
    }


@Suppress("ObjectPropertyName")
private var _wandSparkles: ImageVector? = null
