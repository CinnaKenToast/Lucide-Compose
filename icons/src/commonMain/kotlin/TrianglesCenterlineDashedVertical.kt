package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrianglesCenterlineDashedVertical: ImageVector
    get() {
        val current = _trianglesCenterlineDashedVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "TrianglesCenterlineDashedVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 14 v2 m0 4 v2 m0 -20 v2 m0 4 v2 m8.29 6.7 A1 1 0 0 0 22 16 V8 a1 1 0 0 0 -1.71 -.7 l-4 3.99 a1 1 0 0 0 0 1.42z m-16.58 0 A1 1 0 0 1 2 16 V8 a1 1 0 0 1 1.71 -.7 l4 3.99 a1 1 0 0 1 0 1.42z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 14
                moveTo(x = 12.0f, y = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -20
                moveToRelative(dx = 0.0f, dy = -20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 8.29 6.7
                moveToRelative(dx = 8.29f, dy = 6.7f)
                // A 1 1 0 0 0 22 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 16.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 0 -1.71 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.71f,
                    dy1 = -0.7f,
                )
                // l -4 3.99
                lineToRelative(dx = -4.0f, dy = 3.99f)
                // a 1 1 0 0 0 0 1.42z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                close()
                // m -16.58 0
                moveToRelative(dx = -16.58f, dy = 0.0f)
                // A 1 1 0 0 1 2 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 16.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 1 1.71 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.71f,
                    dy1 = -0.7f,
                )
                // l 4 3.99
                lineToRelative(dx = 4.0f, dy = 3.99f)
                // a 1 1 0 0 1 0 1.42z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                close()
            }
        }.build().also { _trianglesCenterlineDashedVertical = it }
    }


@Suppress("ObjectPropertyName")
private var _trianglesCenterlineDashedVertical: ImageVector? = null
