package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Scale: ImageVector
    get() {
        val current = _scale
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Scale",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 v18 m7 -13 3 8 a5 5 0 0 1 -6 0z V7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // m 7 -13
                moveToRelative(dx = 7.0f, dy = -13.0f)
                // l 3 8
                lineToRelative(dx = 3.0f, dy = 8.0f)
                // a 5 5 0 0 1 -6 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
                // V 7
                verticalLineTo(y = 7.0f)
            }
            // M3 7 h1 a17 17 0 0 0 8 -2 17 17 0 0 0 8 2 h1 M5 8 l3 8 a5 5 0 0 1 -6 0z V7 m2 14 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 7
                moveTo(x = 3.0f, y = 7.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 17 17 0 0 0 8 -2
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = -2.0f,
                )
                // a 17 17 0 0 0 8 2
                arcToRelative(
                    a = 17.0f,
                    b = 17.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 2.0f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // l 3 8
                lineToRelative(dx = 3.0f, dy = 8.0f)
                // a 5 5 0 0 1 -6 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
                // V 7
                verticalLineTo(y = 7.0f)
                // m 2 14
                moveToRelative(dx = 2.0f, dy = 14.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
        }.build().also { _scale = it }
    }

@Suppress("ObjectPropertyName")
private var _scale: ImageVector? = null
