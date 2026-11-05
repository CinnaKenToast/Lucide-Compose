package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Package2: ImageVector
    get() {
        val current = _package2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Package2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 v6 m4.76 -6 a2 2 0 0 1 1.8 1.1 l2.23 4.48 A2 2 0 0 1 21 9.47 V19 a2 2 0 0 1 -2 2 H5 a2 2 0 0 1 -2 -2 V9.47 a2 2 0 0 1 .21 -.9 L5.45 4.1 A2 2 0 0 1 7.24 3z M3.06 9.01 h17.89
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 4.76 -6
                moveToRelative(dx = 4.76f, dy = -6.0f)
                // a 2 2 0 0 1 1.8 1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.8f,
                    dy1 = 1.1f,
                )
                // l 2.23 4.48
                lineToRelative(dx = 2.23f, dy = 4.48f)
                // A 2 2 0 0 1 21 9.47
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 9.47f,
                )
                // V 19
                verticalLineTo(y = 19.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
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
                // V 9.47
                verticalLineTo(y = 9.47f)
                // a 2 2 0 0 1 0.21 -0.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.21f,
                    dy1 = -0.9f,
                )
                // L 5.45 4.1
                lineTo(x = 5.45f, y = 4.1f)
                // A 2 2 0 0 1 7.24 3z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.24f,
                    y1 = 3.0f,
                )
                close()
                // M 3.06 9.01
                moveTo(x = 3.06f, y = 9.01f)
                // h 17.89
                horizontalLineToRelative(dx = 17.89f)
            }
        }.build().also { _package2 = it }
    }

@Suppress("ObjectPropertyName")
private var _package2: ImageVector? = null
