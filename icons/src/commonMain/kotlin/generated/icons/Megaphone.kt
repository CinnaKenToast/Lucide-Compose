package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Megaphone: ImageVector
    get() {
        val current = _megaphone
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Megaphone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 6 a13 13 0 0 0 8.4 -2.8 A1 1 0 0 1 21 4 v12 a1 1 0 0 1 -1.6 .8 A13 13 0 0 0 11 14 H5 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 6
                moveTo(x = 11.0f, y = 6.0f)
                // a 13 13 0 0 0 8.4 -2.8
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.4f,
                    dy1 = -2.8f,
                )
                // A 1 1 0 0 1 21 4
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 4.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 1 1 0 0 1 -1.6 0.8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.6f,
                    dy1 = 0.8f,
                )
                // A 13 13 0 0 0 11 14
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.0f,
                    y1 = 14.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 1 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
            // M6 14 a12 12 0 0 0 2.4 7.2 2 2 0 0 0 3.2 -2.4 A8 8 0 0 1 10 14 M8 6 v8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 14
                moveTo(x = 6.0f, y = 14.0f)
                // a 12 12 0 0 0 2.4 7.2
                arcToRelative(
                    a = 12.0f,
                    b = 12.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.4f,
                    dy1 = 7.2f,
                )
                // a 2 2 0 0 0 3.2 -2.4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.2f,
                    dy1 = -2.4f,
                )
                // A 8 8 0 0 1 10 14
                arcTo(
                    horizontalEllipseRadius = 8.0f,
                    verticalEllipseRadius = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 10.0f,
                    y1 = 14.0f,
                )
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
            }
        }.build().also { _megaphone = it }
    }

@Suppress("ObjectPropertyName")
private var _megaphone: ImageVector? = null
