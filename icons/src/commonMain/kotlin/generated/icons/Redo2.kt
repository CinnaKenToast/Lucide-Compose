package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Redo2: ImageVector
    get() {
        val current = _redo2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Redo2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 14 5 -5 -5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 14
                moveTo(x = 15.0f, y = 14.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
            }
            // M20 9 H9.5 A5.5 5.5 0 0 0 4 14.5 5.5 5.5 0 0 0 9.5 20 H13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 9
                moveTo(x = 20.0f, y = 9.0f)
                // H 9.5
                horizontalLineTo(x = 9.5f)
                // A 5.5 5.5 0 0 0 4 14.5
                arcTo(
                    horizontalEllipseRadius = 5.5f,
                    verticalEllipseRadius = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 14.5f,
                )
                // A 5.5 5.5 0 0 0 9.5 20
                arcTo(
                    horizontalEllipseRadius = 5.5f,
                    verticalEllipseRadius = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.5f,
                    y1 = 20.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
            }
        }.build().also { _redo2 = it }
    }

@Suppress("ObjectPropertyName")
private var _redo2: ImageVector? = null
