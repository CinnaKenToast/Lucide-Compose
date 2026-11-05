package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MouseOff: ImageVector
    get() {
        val current = _mouseOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MouseOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6 v.34 m6.22 11.88 A7 7 0 0 1 5 15 V9 a7 7 0 0 1 .78 -3.22 M19 13.34 V9 A7 7 0 0 0 8.56 2.9 M22 22 2 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // v 0.34
                verticalLineToRelative(dy = 0.34f)
                // m 6.22 11.88
                moveToRelative(dx = 6.22f, dy = 11.88f)
                // A 7 7 0 0 1 5 15
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 15.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 7 7 0 0 1 0.78 -3.22
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.78f,
                    dy1 = -3.22f,
                )
                // M 19 13.34
                moveTo(x = 19.0f, y = 13.34f)
                // V 9
                verticalLineTo(y = 9.0f)
                // A 7 7 0 0 0 8.56 2.9
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.56f,
                    y1 = 2.9f,
                )
                // M 22 22
                moveTo(x = 22.0f, y = 22.0f)
                // L 2 2
                lineTo(x = 2.0f, y = 2.0f)
            }
        }.build().also { _mouseOff = it }
    }

@Suppress("ObjectPropertyName")
private var _mouseOff: ImageVector? = null
