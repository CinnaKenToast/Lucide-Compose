package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Map: ImageVector
    get() {
        val current = _map
        if (current != null) return current

        return ImageVector.Builder(
            name = "Map",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14.1 5.55 a2 2 0 0 0 1.8 0 l3.65 -1.83 A1 1 0 0 1 21 4.62 v12.76 a1 1 0 0 1 -.55 .9 l-4.56 2.27 a2 2 0 0 1 -1.78 0 l-4.22 -2.1 a2 2 0 0 0 -1.78 0 l-3.66 1.83 A1 1 0 0 1 3 19.38 V6.62 a1 1 0 0 1 .55 -.9 l4.56 -2.27 a2 2 0 0 1 1.78 0z M15 5.76 v15 M9 3.24 v15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.1 5.55
                moveTo(x = 14.1f, y = 5.55f)
                // a 2 2 0 0 0 1.8 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.8f,
                    dy1 = 0.0f,
                )
                // l 3.65 -1.83
                lineToRelative(dx = 3.65f, dy = -1.83f)
                // A 1 1 0 0 1 21 4.62
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 4.62f,
                )
                // v 12.76
                verticalLineToRelative(dy = 12.76f)
                // a 1 1 0 0 1 -0.55 0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.55f,
                    dy1 = 0.9f,
                )
                // l -4.56 2.27
                lineToRelative(dx = -4.56f, dy = 2.27f)
                // a 2 2 0 0 1 -1.78 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.78f,
                    dy1 = 0.0f,
                )
                // l -4.22 -2.1
                lineToRelative(dx = -4.22f, dy = -2.1f)
                // a 2 2 0 0 0 -1.78 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.78f,
                    dy1 = 0.0f,
                )
                // l -3.66 1.83
                lineToRelative(dx = -3.66f, dy = 1.83f)
                // A 1 1 0 0 1 3 19.38
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.0f,
                    y1 = 19.38f,
                )
                // V 6.62
                verticalLineTo(y = 6.62f)
                // a 1 1 0 0 1 0.55 -0.9
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.55f,
                    dy1 = -0.9f,
                )
                // l 4.56 -2.27
                lineToRelative(dx = 4.56f, dy = -2.27f)
                // a 2 2 0 0 1 1.78 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.78f,
                    dy1 = 0.0f,
                )
                close()
                // M 15 5.76
                moveTo(x = 15.0f, y = 5.76f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // M 9 3.24
                moveTo(x = 9.0f, y = 3.24f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
            }
        }.build().also { _map = it }
    }


@Suppress("ObjectPropertyName")
private var _map: ImageVector? = null
