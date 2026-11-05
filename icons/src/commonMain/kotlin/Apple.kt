package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Apple: ImageVector
    get() {
        val current = _apple
        if (current != null) return current

        return ImageVector.Builder(
            name = "Apple",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6.53 V3 a1 1 0 0 1 1 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6.53
                moveTo(x = 12.0f, y = 6.53f)
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
            }
            // M18.24 21 A15 15 0 0 0 22 11 a6 6 0 0 0 -10 -4.47 A6 6 0 0 0 2 11 a15 15 0 0 0 3.76 10 3 3 0 0 0 3.65 .65 5.5 5.5 0 0 1 5.18 0 A3 3 0 0 0 18.24 21
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.24 21
                moveTo(x = 18.24f, y = 21.0f)
                // A 15 15 0 0 0 22 11
                arcTo(
                    horizontalEllipseRadius = 15.0f,
                    verticalEllipseRadius = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 11.0f,
                )
                // a 6 6 0 0 0 -10 -4.47
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -10.0f,
                    dy1 = -4.47f,
                )
                // A 6 6 0 0 0 2 11
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 11.0f,
                )
                // a 15 15 0 0 0 3.76 10
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.76f,
                    dy1 = 10.0f,
                )
                // a 3 3 0 0 0 3.65 0.65
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.65f,
                    dy1 = 0.65f,
                )
                // a 5.5 5.5 0 0 1 5.18 0
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.18f,
                    dy1 = 0.0f,
                )
                // A 3 3 0 0 0 18.24 21
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.24f,
                    y1 = 21.0f,
                )
            }
        }.build().also { _apple = it }
    }


@Suppress("ObjectPropertyName")
private var _apple: ImageVector? = null
