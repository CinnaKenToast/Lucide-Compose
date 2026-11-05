package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ellipse: ImageVector
    get() {
        val current = _ellipse
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Ellipse",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <ellipse cx="12.0" cy="12.0" rx="10.0" ry="6.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // A 10 6 0 1 0 12 18
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 18.0f,
                )
                // A 10 6 0 1 0 12 6z
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 6.0f,
                )
                close()
            }
        }.build().also { _ellipse = it }
    }

@Suppress("ObjectPropertyName")
private var _ellipse: ImageVector? = null
