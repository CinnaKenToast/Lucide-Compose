package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudCheck: ImageVector
    get() {
        val current = _cloudCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "CloudCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m17 15 -5.5 5.5 L9 18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 15
                moveTo(x = 17.0f, y = 15.0f)
                // l -5.5 5.5
                lineToRelative(dx = -5.5f, dy = 5.5f)
                // L 9 18
                lineTo(x = 9.0f, y = 18.0f)
            }
            // M5.52 16.07 A7 7 0 1 1 15.7 8 h1.79 a4.5 4.5 0 0 1 3.5 7.33
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.52 16.07
                moveTo(x = 5.52f, y = 16.07f)
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
                // a 4.5 4.5 0 0 1 3.5 7.33
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.5f,
                    dy1 = 7.33f,
                )
            }
        }.build().also { _cloudCheck = it }
    }


@Suppress("ObjectPropertyName")
private var _cloudCheck: ImageVector? = null
