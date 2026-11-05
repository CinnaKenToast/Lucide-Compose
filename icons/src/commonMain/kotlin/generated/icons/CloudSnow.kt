package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CloudSnow: ImageVector
    get() {
        val current = _cloudSnow
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CloudSnow",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 14.9 A7 7 0 1 1 15.71 8 h1.79 a4.5 4.5 0 0 1 2.5 8.24 M8 15z M8 19z M12 17z M12 21z M16 15 h.01 M16 19 h.01
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
                // M 8 15z
                moveTo(x = 8.0f, y = 15.0f)
                close()
                // M 8 19z
                moveTo(x = 8.0f, y = 19.0f)
                close()
                // M 12 17z
                moveTo(x = 12.0f, y = 17.0f)
                close()
                // M 12 21z
                moveTo(x = 12.0f, y = 21.0f)
                close()
                // M 16 15
                moveTo(x = 16.0f, y = 15.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 16 19
                moveTo(x = 16.0f, y = 19.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
        }.build().also { _cloudSnow = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudSnow: ImageVector? = null
