package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudHail: ImageVector
    get() {
        val current = _cloudHail
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CloudHail",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 14.9 A7 7 0 1 1 15.71 8 h1.79 a4.5 4.5 0 0 1 2.5 8.24 M16 14 v2 m-8 -2 v2 m8 4 h.01 M8 20z M12 16 v2 m0 4z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 14.9
                moveTo(x = 4.0f, y = 14.9f)
                // A 7 7 0 1 1 15.71 8
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 15.71f,
                    y1 = 8.0f,
                )
                // h 1.79
                horizontalLineToRelative(dx = 1.79f)
                // a 4.5 4.5 0 0 1 2.5 8.24
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.5f,
                    dy1 = 8.24f,
                )
                // M 16 14
                moveTo(x = 16.0f, y = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m -8 -2
                moveToRelative(dx = -8.0f, dy = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 8 4
                moveToRelative(dx = 8.0f, dy = 4.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 8 20z
                moveTo(x = 8.0f, y = 20.0f)
                close()
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4z
                moveToRelative(dx = 0.0f, dy = 4.0f)
                close()
            }
        }.build().also { _cloudHail = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudHail: ImageVector? = null
