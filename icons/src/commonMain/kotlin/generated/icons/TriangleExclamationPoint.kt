package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TriangleExclamationPoint: ImageVector
    get() {
        val current = _triangleExclamationPoint
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TriangleExclamationPoint",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m21.73 18 -8 -14 a2 2 0 0 0 -3.48 0 l-8 14 A2 2 0 0 0 4 21 h16 a2 2 0 0 0 1.73 -3 M12 9 v4 m0 4z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.73 18
                moveTo(x = 21.73f, y = 18.0f)
                // l -8 -14
                lineToRelative(dx = -8.0f, dy = -14.0f)
                // a 2 2 0 0 0 -3.48 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.48f,
                    dy1 = 0.0f,
                )
                // l -8 14
                lineToRelative(dx = -8.0f, dy = 14.0f)
                // A 2 2 0 0 0 4 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 21.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 0 1.73 -3
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.73f,
                    dy1 = -3.0f,
                )
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0 4z
                moveToRelative(dx = 0.0f, dy = 4.0f)
                close()
            }
        }.build().also { _triangleExclamationPoint = it }
    }

@Suppress("ObjectPropertyName")
private var _triangleExclamationPoint: ImageVector? = null
