package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Crown: ImageVector
    get() {
        val current = _crown
        if (current != null) return current

        return ImageVector.Builder(
            name = "Crown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.56 3.27 a.5 .5 0 0 1 .88 0 l2.95 5.6 a1 1 0 0 0 1.52 .3 l4.27 -3.67 a.5 .5 0 0 1 .8 .52 l-2.83 10.25 A1 1 0 0 1 18.19 17 H5.81 a1 1 0 0 1 -.96 -.73 L2.02 6.02 a.5 .5 0 0 1 .8 -.52 l4.27 3.66 a1 1 0 0 0 1.52 -.29z M5 21 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.56 3.27
                moveTo(x = 11.56f, y = 3.27f)
                // a 0.5 0.5 0 0 1 0.88 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.88f,
                    dy1 = 0.0f,
                )
                // l 2.95 5.6
                lineToRelative(dx = 2.95f, dy = 5.6f)
                // a 1 1 0 0 0 1.52 0.3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.52f,
                    dy1 = 0.3f,
                )
                // l 4.27 -3.67
                lineToRelative(dx = 4.27f, dy = -3.67f)
                // a 0.5 0.5 0 0 1 0.8 0.52
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.8f,
                    dy1 = 0.52f,
                )
                // l -2.83 10.25
                lineToRelative(dx = -2.83f, dy = 10.25f)
                // A 1 1 0 0 1 18.19 17
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.19f,
                    y1 = 17.0f,
                )
                // H 5.81
                horizontalLineTo(x = 5.81f)
                // a 1 1 0 0 1 -0.96 -0.73
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.96f,
                    dy1 = -0.73f,
                )
                // L 2.02 6.02
                lineTo(x = 2.02f, y = 6.02f)
                // a 0.5 0.5 0 0 1 0.8 -0.52
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.8f,
                    dy1 = -0.52f,
                )
                // l 4.27 3.66
                lineToRelative(dx = 4.27f, dy = 3.66f)
                // a 1 1 0 0 0 1.52 -0.29z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.52f,
                    dy1 = -0.29f,
                )
                close()
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _crown = it }
    }


@Suppress("ObjectPropertyName")
private var _crown: ImageVector? = null
