package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TriangleDashed: ImageVector
    get() {
        val current = _triangleDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "TriangleDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.17 4.2 a2 2 0 0 1 3.67 0 M14 21 h2 M15.87 7.74 l1 1.74 m1.98 3.47 1 1.73 m1.97 3.5 A2 2 0 0 1 20 21 M4.02 21 a2 2 0 0 1 -1.83 -2.84 m2.95 -5.2 -1 1.72 M8 21 h2 M8.1 7.74 l-1 1.74
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.17 4.2
                moveTo(x = 10.17f, y = 4.2f)
                // a 2 2 0 0 1 3.67 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.67f,
                    dy1 = 0.0f,
                )
                // M 14 21
                moveTo(x = 14.0f, y = 21.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 15.87 7.74
                moveTo(x = 15.87f, y = 7.74f)
                // l 1 1.74
                lineToRelative(dx = 1.0f, dy = 1.74f)
                // m 1.98 3.47
                moveToRelative(dx = 1.98f, dy = 3.47f)
                // l 1 1.73
                lineToRelative(dx = 1.0f, dy = 1.73f)
                // m 1.97 3.5
                moveToRelative(dx = 1.97f, dy = 3.5f)
                // A 2 2 0 0 1 20 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 21.0f,
                )
                // M 4.02 21
                moveTo(x = 4.02f, y = 21.0f)
                // a 2 2 0 0 1 -1.83 -2.84
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.83f,
                    dy1 = -2.84f,
                )
                // m 2.95 -5.2
                moveToRelative(dx = 2.95f, dy = -5.2f)
                // l -1 1.72
                lineToRelative(dx = -1.0f, dy = 1.72f)
                // M 8 21
                moveTo(x = 8.0f, y = 21.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 8.1 7.74
                moveTo(x = 8.1f, y = 7.74f)
                // l -1 1.74
                lineToRelative(dx = -1.0f, dy = 1.74f)
            }
        }.build().also { _triangleDashed = it }
    }


@Suppress("ObjectPropertyName")
private var _triangleDashed: ImageVector? = null
