package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudDrizzle: ImageVector
    get() {
        val current = _cloudDrizzle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CloudDrizzle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 14.9 A7 7 0 1 1 15.71 8 h1.79 a4.5 4.5 0 0 1 2.5 8.24 M8 19 v1 m0 -6 v1 m8 4 v1 m0 -6 v1 m-4 6 v1 m0 -6 v1
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
                // M 8 19
                moveTo(x = 8.0f, y = 19.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 8 4
                moveToRelative(dx = 8.0f, dy = 4.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m -4 6
                moveToRelative(dx = -4.0f, dy = 6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
            }
        }.build().also { _cloudDrizzle = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudDrizzle: ImageVector? = null
