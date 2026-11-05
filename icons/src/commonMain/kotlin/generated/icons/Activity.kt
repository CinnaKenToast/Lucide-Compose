package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Activity: ImageVector
    get() {
        val current = _activity
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Activity",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 12 h-2.48 a2 2 0 0 0 -1.93 1.46 l-2.35 8.36 a.25 .25 0 0 1 -.48 0 L9.24 2.18 a.25 .25 0 0 0 -.48 0 l-2.35 8.36 A2 2 0 0 1 4.49 12 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // h -2.48
                horizontalLineToRelative(dx = -2.48f)
                // a 2 2 0 0 0 -1.93 1.46
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.93f,
                    dy1 = 1.46f,
                )
                // l -2.35 8.36
                lineToRelative(dx = -2.35f, dy = 8.36f)
                // a 0.25 0.25 0 0 1 -0.48 0
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.48f,
                    dy1 = 0.0f,
                )
                // L 9.24 2.18
                lineTo(x = 9.24f, y = 2.18f)
                // a 0.25 0.25 0 0 0 -0.48 0
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.48f,
                    dy1 = 0.0f,
                )
                // l -2.35 8.36
                lineToRelative(dx = -2.35f, dy = 8.36f)
                // A 2 2 0 0 1 4.49 12
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.49f,
                    y1 = 12.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _activity = it }
    }

@Suppress("ObjectPropertyName")
private var _activity: ImageVector? = null
