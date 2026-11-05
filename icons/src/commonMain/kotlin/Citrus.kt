package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Citrus: ImageVector
    get() {
        val current = _citrus
        if (current != null) return current

        return ImageVector.Builder(
            name = "Citrus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21.66 17.67 a1.1 1.1 0 0 1 -.04 1.6 A12 12 0 0 1 4.73 2.38 a1.1 1.1 0 0 1 1.61 -.04z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.66 17.67
                moveTo(x = 21.66f, y = 17.67f)
                // a 1.1 1.1 0 0 1 -0.04 1.6
                arcToRelative(
                    a = 1.1f,
                    b = 1.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.04f,
                    dy1 = 1.6f,
                )
                // A 12 12 0 0 1 4.73 2.38
                arcTo(
                    horizontalEllipseRadius = 12.0f,
                    verticalEllipseRadius = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.73f,
                    y1 = 2.38f,
                )
                // a 1.1 1.1 0 0 1 1.61 -0.04z
                arcToRelative(
                    a = 1.1f,
                    b = 1.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.61f,
                    dy1 = -0.04f,
                )
                close()
            }
            // M19.65 15.66 A8 8 0 0 1 8.35 4.34 M14 10 l-5.5 5.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.65 15.66
                moveTo(x = 19.65f, y = 15.66f)
                // A 8 8 0 0 1 8.35 4.34
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.35f,
                    y1 = 4.34f,
                )
                // M 14 10
                moveTo(x = 14.0f, y = 10.0f)
                // l -5.5 5.5
                lineToRelative(dx = -5.5f, dy = 5.5f)
            }
            // M14 17.85 V10 H6.15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 17.85
                moveTo(x = 14.0f, y = 17.85f)
                // V 10
                verticalLineTo(y = 10.0f)
                // H 6.15
                horizontalLineTo(x = 6.15f)
            }
        }.build().also { _citrus = it }
    }


@Suppress("ObjectPropertyName")
private var _citrus: ImageVector? = null
