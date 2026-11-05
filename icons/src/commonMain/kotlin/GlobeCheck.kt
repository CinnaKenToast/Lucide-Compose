package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GlobeCheck: ImageVector
    get() {
        val current = _globeCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "GlobeCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 6 2 2 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 6
                moveTo(x = 15.0f, y = 6.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
            // M2 12 h20 A10 10 0 1 1 12 2 a14.5 14.5 0 0 0 0 20 14.5 14.5 0 0 0 4 -10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
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
                // a 14.5 14.5 0 0 0 0 20
                arcToRelative(
                    a = 14.5f,
                    b = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 20.0f,
                )
                // a 14.5 14.5 0 0 0 4 -10
                arcToRelative(
                    a = 14.5f,
                    b = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = -10.0f,
                )
            }
        }.build().also { _globeCheck = it }
    }


@Suppress("ObjectPropertyName")
private var _globeCheck: ImageVector? = null
