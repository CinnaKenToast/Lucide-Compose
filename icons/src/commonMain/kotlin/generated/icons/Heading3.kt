package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Heading3: ImageVector
    get() {
        val current = _heading3
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Heading3",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 12 h8 m-8 6 V6 m8 12 V6 m5.5 4.5 c1.7 -1 3.5 0 3.5 1.5 a2 2 0 0 1 -2 2 m-2 3.5 c2 1.5 4 .3 4 -1.5 a2 2 0 0 0 -2 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 6
                moveToRelative(dx = -8.0f, dy = 6.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // m 8 12
                moveToRelative(dx = 8.0f, dy = 12.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // m 5.5 4.5
                moveToRelative(dx = 5.5f, dy = 4.5f)
                // c 1.7 -1 3.5 0 3.5 1.5
                curveToRelative(
                    dx1 = 1.7f,
                    dy1 = -1.0f,
                    dx2 = 3.5f,
                    dy2 = 0.0f,
                    dx3 = 3.5f,
                    dy3 = 1.5f,
                )
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m -2 3.5
                moveToRelative(dx = -2.0f, dy = 3.5f)
                // c 2 1.5 4 0.3 4 -1.5
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.5f,
                    dx2 = 4.0f,
                    dy2 = 0.3f,
                    dx3 = 4.0f,
                    dy3 = -1.5f,
                )
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
            }
        }.build().also { _heading3 = it }
    }

@Suppress("ObjectPropertyName")
private var _heading3: ImageVector? = null
