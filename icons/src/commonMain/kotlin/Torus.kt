package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Torus: ImageVector
    get() {
        val current = _torus
        if (current != null) return current

        return ImageVector.Builder(
            name = "Torus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <ellipse cx="12.0" cy="11.0" rx="3.0" ry="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 9
                moveTo(x = 12.0f, y = 9.0f)
                // A 3 2 0 1 0 12 13
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 13.0f,
                )
                // A 3 2 0 1 0 12 9z
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 9.0f,
                )
                close()
            }
            // <ellipse cx="12.0" cy="12.5" rx="10.0" ry="8.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // A 10 8.5 0 1 0 12 21
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 21.0f,
                )
                // A 10 8.5 0 1 0 12 4z
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 8.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 4.0f,
                )
                close()
            }
        }.build().also { _torus = it }
    }


@Suppress("ObjectPropertyName")
private var _torus: ImageVector? = null
