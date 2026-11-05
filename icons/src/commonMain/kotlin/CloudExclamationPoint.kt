package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudExclamationPoint: ImageVector
    get() {
        val current = _cloudExclamationPoint
        if (current != null) return current

        return ImageVector.Builder(
            name = "CloudExclamationPoint",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 v4 m0 4z m-3.88 -3.05 A7 7 0 1 1 15.7 8 h1.79 a1 1 0 0 1 0 9 h-1.64
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0 4z
                moveToRelative(dx = 0.0f, dy = 4.0f)
                close()
                // m -3.88 -3.05
                moveToRelative(dx = -3.88f, dy = -3.05f)
                // A 7 7 0 1 1 15.7 8
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 15.7f,
                    y1 = 8.0f,
                )
                // h 1.79
                horizontalLineToRelative(dx = 1.79f)
                // a 1 1 0 0 1 0 9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 9.0f,
                )
                // h -1.64
                horizontalLineToRelative(dx = -1.64f)
            }
        }.build().also { _cloudExclamationPoint = it }
    }


@Suppress("ObjectPropertyName")
private var _cloudExclamationPoint: ImageVector? = null
