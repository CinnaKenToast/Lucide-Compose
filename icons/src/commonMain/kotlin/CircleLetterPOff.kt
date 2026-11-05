package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CircleLetterPOff: ImageVector
    get() {
        val current = _circleLetterPOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "CircleLetterPOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 h1 a2 2 0 0 0 0 -4 H9.5 A.5 .5 0 0 0 9 8.5 V9 m6.65 12.31 A10 10 0 0 1 2.7 8.35 M22 22 2 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 2 2 0 0 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // H 9.5
                horizontalLineTo(x = 9.5f)
                // A 0.5 0.5 0 0 0 9 8.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 8.5f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // m 6.65 12.31
                moveToRelative(dx = 6.65f, dy = 12.31f)
                // A 10 10 0 0 1 2.7 8.35
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.7f,
                    y1 = 8.35f,
                )
                // M 22 22
                moveTo(x = 22.0f, y = 22.0f)
                // L 2 2
                lineTo(x = 2.0f, y = 2.0f)
            }
            // M4.93 4.93 A10 10 0 0 1 21.66 9.4 a10 10 0 0 1 -2.59 9.66 M9 14.66 V16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.93 4.93
                moveTo(x = 4.93f, y = 4.93f)
                // A 10 10 0 0 1 21.66 9.4
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.66f,
                    y1 = 9.4f,
                )
                // a 10 10 0 0 1 -2.59 9.66
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.59f,
                    dy1 = 9.66f,
                )
                // M 9 14.66
                moveTo(x = 9.0f, y = 14.66f)
                // V 16
                verticalLineTo(y = 16.0f)
            }
        }.build().also { _circleLetterPOff = it }
    }


@Suppress("ObjectPropertyName")
private var _circleLetterPOff: ImageVector? = null
