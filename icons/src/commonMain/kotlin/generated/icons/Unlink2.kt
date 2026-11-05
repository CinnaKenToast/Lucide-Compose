package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Unlink2: ImageVector
    get() {
        val current = _unlink2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Unlink2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 7 h2 a5 5 0 0 1 0 10 h-2 m-6 0 H7 A5 5 0 0 1 7 7 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 7
                moveTo(x = 15.0f, y = 7.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 5 5 0 0 1 0 10
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 10.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // A 5 5 0 0 1 7 7
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 7.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _unlink2 = it }
    }

@Suppress("ObjectPropertyName")
private var _unlink2: ImageVector? = null
