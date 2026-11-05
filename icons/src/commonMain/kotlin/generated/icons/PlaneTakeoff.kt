package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PlaneTakeoff: ImageVector
    get() {
        val current = _planeTakeoff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PlaneTakeoff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 22 h20 M6.36 17.4 4 17 l-2 -4 1.1 -.55 a2 2 0 0 1 1.8 0 l.17 .1 a2 2 0 0 0 1.8 0 L8 12 5 6 l.9 -.45 a2 2 0 0 1 2.09 .2 l4.02 3 a2 2 0 0 0 2.1 .2 l4.19 -2.06 a2.4 2.4 0 0 1 1.73 -.17 L21 7 a1.4 1.4 0 0 1 .87 1.99 l-.38 .76 a2.4 2.4 0 0 1 -1.07 1.08 L7.58 17.2 a2 2 0 0 1 -1.22 .18Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 22
                moveTo(x = 2.0f, y = 22.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 6.36 17.4
                moveTo(x = 6.36f, y = 17.4f)
                // L 4 17
                lineTo(x = 4.0f, y = 17.0f)
                // l -2 -4
                lineToRelative(dx = -2.0f, dy = -4.0f)
                // l 1.1 -0.55
                lineToRelative(dx = 1.1f, dy = -0.55f)
                // a 2 2 0 0 1 1.8 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.8f,
                    dy1 = 0.0f,
                )
                // l 0.17 0.1
                lineToRelative(dx = 0.17f, dy = 0.1f)
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
                // L 8 12
                lineTo(x = 8.0f, y = 12.0f)
                // L 5 6
                lineTo(x = 5.0f, y = 6.0f)
                // l 0.9 -0.45
                lineToRelative(dx = 0.9f, dy = -0.45f)
                // a 2 2 0 0 1 2.09 0.2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.09f,
                    dy1 = 0.2f,
                )
                // l 4.02 3
                lineToRelative(dx = 4.02f, dy = 3.0f)
                // a 2 2 0 0 0 2.1 0.2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.1f,
                    dy1 = 0.2f,
                )
                // l 4.19 -2.06
                lineToRelative(dx = 4.19f, dy = -2.06f)
                // a 2.4 2.4 0 0 1 1.73 -0.17
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.73f,
                    dy1 = -0.17f,
                )
                // L 21 7
                lineTo(x = 21.0f, y = 7.0f)
                // a 1.4 1.4 0 0 1 0.87 1.99
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.87f,
                    dy1 = 1.99f,
                )
                // l -0.38 0.76
                lineToRelative(dx = -0.38f, dy = 0.76f)
                // a 2.4 2.4 0 0 1 -1.07 1.08
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.07f,
                    dy1 = 1.08f,
                )
                // L 7.58 17.2
                lineTo(x = 7.58f, y = 17.2f)
                // a 2 2 0 0 1 -1.22 0.18z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.22f,
                    dy1 = 0.18f,
                )
                close()
            }
        }.build().also { _planeTakeoff = it }
    }

@Suppress("ObjectPropertyName")
private var _planeTakeoff: ImageVector? = null
