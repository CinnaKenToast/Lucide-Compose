package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CircleOff: ImageVector
    get() {
        val current = _circleOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "CircleOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 2 20 20 M8.35 2.69 A10 10 0 0 1 21.3 15.65 m-2.22 3.43 A10 10 0 1 1 4.92 4.92
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 8.35 2.69
                moveTo(x = 8.35f, y = 2.69f)
                // A 10 10 0 0 1 21.3 15.65
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.3f,
                    y1 = 15.65f,
                )
                // m -2.22 3.43
                moveToRelative(dx = -2.22f, dy = 3.43f)
                // A 10 10 0 1 1 4.92 4.92
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 4.92f,
                    y1 = 4.92f,
                )
            }
        }.build().also { _circleOff = it }
    }


@Suppress("ObjectPropertyName")
private var _circleOff: ImageVector? = null
