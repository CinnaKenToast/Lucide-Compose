package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EmiratiDirham: ImageVector
    get() {
        val current = _emiratiDirham
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.EmiratiDirham",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 4 a8 8 0 0 1 0 16 H6.4 A.4 .4 0 0 1 6 19.6 V4.4 A.4 .4 0 0 1 6.4 4z m-7 6 h17 M4 14 h17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 4
                moveTo(x = 11.0f, y = 4.0f)
                // a 8 8 0 0 1 0 16
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 16.0f,
                )
                // H 6.4
                horizontalLineTo(x = 6.4f)
                // A 0.4 0.4 0 0 1 6 19.6
                arcTo(
                    horizontalEllipseRadius = 0.4f,
                    verticalEllipseRadius = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 19.6f,
                )
                // V 4.4
                verticalLineTo(y = 4.4f)
                // A 0.4 0.4 0 0 1 6.4 4z
                arcTo(
                    horizontalEllipseRadius = 0.4f,
                    verticalEllipseRadius = 0.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.4f,
                    y1 = 4.0f,
                )
                close()
                // m -7 6
                moveToRelative(dx = -7.0f, dy = 6.0f)
                // h 17
                horizontalLineToRelative(dx = 17.0f)
                // M 4 14
                moveTo(x = 4.0f, y = 14.0f)
                // h 17
                horizontalLineToRelative(dx = 17.0f)
            }
        }.build().also { _emiratiDirham = it }
    }

@Suppress("ObjectPropertyName")
private var _emiratiDirham: ImageVector? = null
