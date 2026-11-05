package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Brain: ImageVector
    get() {
        val current = _brain
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Brain",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 18 V5 m3 8 a4.2 4.2 0 0 1 -3 -4 4.2 4.2 0 0 1 -3 4 m8.7 -6.7 A3 3 0 1 0 12 5 a3 3 0 1 0 -5.7 1.3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // m 3 8
                moveToRelative(dx = 3.0f, dy = 8.0f)
                // a 4.2 4.2 0 0 1 -3 -4
                arcToRelative(
                    a = 4.2f,
                    b = 4.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = -4.0f,
                )
                // a 4.2 4.2 0 0 1 -3 4
                arcToRelative(
                    a = 4.2f,
                    b = 4.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 4.0f,
                )
                // m 8.7 -6.7
                moveToRelative(dx = 8.7f, dy = -6.7f)
                // A 3 3 0 1 0 12 5
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 5.0f,
                )
                // a 3 3 0 1 0 -5.7 1.3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -5.7f,
                    dy1 = 1.3f,
                )
            }
            // M18 5.13 a4 4 0 0 1 2.52 5.77
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 5.13
                moveTo(x = 18.0f, y = 5.13f)
                // a 4 4 0 0 1 2.52 5.77
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.52f,
                    dy1 = 5.77f,
                )
            }
            // M18 18 a4 4 0 0 0 2 -7.46
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
                // a 4 4 0 0 0 2 -7.46
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -7.46f,
                )
            }
            // M19.97 17.48 A4 4 0 1 1 12 18 a4 4 0 1 1 -7.97 -.52
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.97 17.48
                moveTo(x = 19.97f, y = 17.48f)
                // A 4 4 0 1 1 12 18
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 18.0f,
                )
                // a 4 4 0 1 1 -7.97 -0.52
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.97f,
                    dy1 = -0.52f,
                )
            }
            // M6 18 a4 4 0 0 1 -2 -7.46
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 18
                moveTo(x = 6.0f, y = 18.0f)
                // a 4 4 0 0 1 -2 -7.46
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -7.46f,
                )
            }
            // M6 5.13 a4 4 0 0 0 -2.52 5.77
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 5.13
                moveTo(x = 6.0f, y = 5.13f)
                // a 4 4 0 0 0 -2.52 5.77
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.52f,
                    dy1 = 5.77f,
                )
            }
        }.build().also { _brain = it }
    }

@Suppress("ObjectPropertyName")
private var _brain: ImageVector? = null
