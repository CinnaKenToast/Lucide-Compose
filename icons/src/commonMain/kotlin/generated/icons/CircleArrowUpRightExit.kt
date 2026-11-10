package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleArrowUpRightExit: ImageVector
    get() {
        val current = _circleArrowUpRightExit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CircleArrowUpRightExit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 12 A10 10 0 1 1 12 2 m10 0 L12 12 m4 -10 h6 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // A 10 10 0 1 1 12 2
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 2.0f,
                )
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // m 4 -10
                moveToRelative(dx = 4.0f, dy = -10.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _circleArrowUpRightExit = it }
    }

@Suppress("ObjectPropertyName")
private var _circleArrowUpRightExit: ImageVector? = null
