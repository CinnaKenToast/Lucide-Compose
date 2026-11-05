package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cone: ImageVector
    get() {
        val current = _cone
        if (current != null) return current

        return ImageVector.Builder(
            name = "Cone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m20.9 18.55 -8 -15.98 a1 1 0 0 0 -1.8 0 l-8 15.98
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20.9 18.55
                moveTo(x = 20.9f, y = 18.55f)
                // l -8 -15.98
                lineToRelative(dx = -8.0f, dy = -15.98f)
                // a 1 1 0 0 0 -1.8 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.8f,
                    dy1 = 0.0f,
                )
                // l -8 15.98
                lineToRelative(dx = -8.0f, dy = 15.98f)
            }
            // <ellipse cx="12.0" cy="19.0" rx="9.0" ry="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // A 9 3 0 1 0 12 22
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                // A 9 3 0 1 0 12 16z
                arcTo(
                    horizontalEllipseRadius = 9.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 16.0f,
                )
                close()
            }
        }.build().also { _cone = it }
    }


@Suppress("ObjectPropertyName")
private var _cone: ImageVector? = null
