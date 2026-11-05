package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FileMinusCorner: ImageVector
    get() {
        val current = _fileMinusCorner
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FileMinusCorner",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M20 14 V8 a2.4 2.4 0 0 0 -.7 -1.7 l-3.6 -3.6 A2.4 2.4 0 0 0 14 2 H6 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 14
                moveTo(x = 20.0f, y = 14.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2.4 2.4 0 0 0 -0.7 -1.7
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.7f,
                    dy1 = -1.7f,
                )
                // l -3.6 -3.6
                lineToRelative(dx = -3.6f, dy = -3.6f)
                // A 2.4 2.4 0 0 0 14 2
                arcTo(
                    horizontalEllipseRadius = 2.4f,
                    verticalEllipseRadius = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 2.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
            }
            // M14 2 v5 a1 1 0 0 0 1 1 h5 m-6 10 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // m -6 10
                moveToRelative(dx = -6.0f, dy = 10.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _fileMinusCorner = it }
    }

@Suppress("ObjectPropertyName")
private var _fileMinusCorner: ImageVector? = null
