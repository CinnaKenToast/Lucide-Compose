package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleArrowOutUpLeft: ImageVector
    get() {
        val current = _circleArrowOutUpLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CircleArrowOutUpLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 8 V2 h6 M2 2 l10 10 m0 -10 A10 10 0 1 1 2 12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 10 10
                lineToRelative(dx = 10.0f, dy = 10.0f)
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // A 10 10 0 1 1 2 12
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 12.0f,
                )
            }
        }.build().also { _circleArrowOutUpLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _circleArrowOutUpLeft: ImageVector? = null
