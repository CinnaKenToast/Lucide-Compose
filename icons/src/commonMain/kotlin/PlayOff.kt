package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayOff: ImageVector
    get() {
        val current = _playOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "PlayOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.22 4.56 20 10.27 a2 2 0 0 1 0 3.46 l-.39 .23 m-3.57 2.08 -8.03 4.69 A2 2 0 0 1 5 19 V5 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.22 4.56
                moveTo(x = 10.22f, y = 4.56f)
                // L 20 10.27
                lineTo(x = 20.0f, y = 10.27f)
                // a 2 2 0 0 1 0 3.46
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.46f,
                )
                // l -0.39 0.23
                lineToRelative(dx = -0.39f, dy = 0.23f)
                // m -3.57 2.08
                moveToRelative(dx = -3.57f, dy = 2.08f)
                // l -8.03 4.69
                lineToRelative(dx = -8.03f, dy = 4.69f)
                // A 2 2 0 0 1 5 19
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 19.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _playOff = it }
    }


@Suppress("ObjectPropertyName")
private var _playOff: ImageVector? = null
