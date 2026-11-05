package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RockingChair: ImageVector
    get() {
        val current = _rockingChair
        if (current != null) return current

        return ImageVector.Builder(
            name = "RockingChair",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 13 3.7 7.42 M3 19 a15 15 0 0 0 18 0 M3 2 l3.21 9.63 A2 2 0 0 0 8.11 13 H18 m-9 0 -3.7 7.42
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 13
                moveTo(x = 15.0f, y = 13.0f)
                // l 3.7 7.42
                lineToRelative(dx = 3.7f, dy = 7.42f)
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // a 15 15 0 0 0 18 0
                arcToRelative(
                    a = 15.0f,
                    b = 15.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 18.0f,
                    dy1 = 0.0f,
                )
                // M 3 2
                moveTo(x = 3.0f, y = 2.0f)
                // l 3.21 9.63
                lineToRelative(dx = 3.21f, dy = 9.63f)
                // A 2 2 0 0 0 8.11 13
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.11f,
                    y1 = 13.0f,
                )
                // H 18
                horizontalLineTo(x = 18.0f)
                // m -9 0
                moveToRelative(dx = -9.0f, dy = 0.0f)
                // l -3.7 7.42
                lineToRelative(dx = -3.7f, dy = 7.42f)
            }
        }.build().also { _rockingChair = it }
    }


@Suppress("ObjectPropertyName")
private var _rockingChair: ImageVector? = null
