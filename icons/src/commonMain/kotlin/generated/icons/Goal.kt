package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Goal: ImageVector
    get() {
        val current = _goal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Goal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 13 V2 l8 4 -8 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 13
                moveTo(x = 12.0f, y = 13.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // l 8 4
                lineToRelative(dx = 8.0f, dy = 4.0f)
                // l -8 4
                lineToRelative(dx = -8.0f, dy = 4.0f)
            }
            // M20.56 10.22 A9 9 0 1 1 8.01 4.93
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20.56 10.22
                moveTo(x = 20.56f, y = 10.22f)
                // A 9 9 0 1 1 8.01 4.93
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 8.01f,
                    y1 = 4.93f,
                )
            }
            // M8 10 a5 5 0 1 0 8.9 2.02
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
                // a 5 5 0 1 0 8.9 2.02
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 8.9f,
                    dy1 = 2.02f,
                )
            }
        }.build().also { _goal = it }
    }

@Suppress("ObjectPropertyName")
private var _goal: ImageVector? = null
