package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shrub: ImageVector
    get() {
        val current = _shrub
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Shrub",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 v-5.17 a2 2 0 0 0 -.59 -1.42 L9.5 13.5 m5 1 L12 17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -5.17
                verticalLineToRelative(dy = -5.17f)
                // a 2 2 0 0 0 -0.59 -1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.59f,
                    dy1 = -1.42f,
                )
                // L 9.5 13.5
                lineTo(x = 9.5f, y = 13.5f)
                // m 5 1
                moveToRelative(dx = 5.0f, dy = 1.0f)
                // L 12 17
                lineTo(x = 12.0f, y = 17.0f)
            }
            // M17 8.8 A6 6 0 0 1 13.8 20 H10 A6.5 6.5 0 0 1 7 8 a5 5 0 0 1 10 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 8.8
                moveTo(x = 17.0f, y = 8.8f)
                // A 6 6 0 0 1 13.8 20
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.8f,
                    y1 = 20.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
                // A 6.5 6.5 0 0 1 7 8
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 8.0f,
                )
                // a 5 5 0 0 1 10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _shrub = it }
    }

@Suppress("ObjectPropertyName")
private var _shrub: ImageVector? = null
