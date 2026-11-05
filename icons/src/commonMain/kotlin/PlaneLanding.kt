package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlaneLanding: ImageVector
    get() {
        val current = _planeLanding
        if (current != null) return current

        return ImageVector.Builder(
            name = "PlaneLanding",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 22 h20 M3.77 10.77 2 9 l2 -4.5 1.1 .55 C5.65 5.33 6 5.89 6 6.5 s.35 1.17 .9 1.45 L8 8.5 l3 -6 1.05 .53 a2 2 0 0 1 1.09 1.52 l.72 5.4 a2 2 0 0 0 1.09 1.52 l4.4 2.2 a2.5 2.5 0 0 1 1.01 .96 l.6 1.03 a1.42 1.42 0 0 1 -1.06 2.1 l-1.18 .15 a2.3 2.3 0 0 1 -1.37 -.24 L4.29 11.15 a2 2 0 0 1 -.52 -.38
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
                // M 3.77 10.77
                moveTo(x = 3.77f, y = 10.77f)
                // L 2 9
                lineTo(x = 2.0f, y = 9.0f)
                // l 2 -4.5
                lineToRelative(dx = 2.0f, dy = -4.5f)
                // l 1.1 0.55
                lineToRelative(dx = 1.1f, dy = 0.55f)
                // C 5.65 5.33 6 5.89 6 6.5
                curveTo(
                    x1 = 5.65f,
                    y1 = 5.33f,
                    x2 = 6.0f,
                    y2 = 5.89f,
                    x3 = 6.0f,
                    y3 = 6.5f,
                )
                // s 0.35 1.17 0.9 1.45
                reflectiveCurveToRelative(
                    dx1 = 0.35f,
                    dy1 = 1.17f,
                    dx2 = 0.9f,
                    dy2 = 1.45f,
                )
                // L 8 8.5
                lineTo(x = 8.0f, y = 8.5f)
                // l 3 -6
                lineToRelative(dx = 3.0f, dy = -6.0f)
                // l 1.05 0.53
                lineToRelative(dx = 1.05f, dy = 0.53f)
                // a 2 2 0 0 1 1.09 1.52
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.09f,
                    dy1 = 1.52f,
                )
                // l 0.72 5.4
                lineToRelative(dx = 0.72f, dy = 5.4f)
                // a 2 2 0 0 0 1.09 1.52
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.09f,
                    dy1 = 1.52f,
                )
                // l 4.4 2.2
                lineToRelative(dx = 4.4f, dy = 2.2f)
                // a 2.5 2.5 0 0 1 1.01 0.96
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.01f,
                    dy1 = 0.96f,
                )
                // l 0.6 1.03
                lineToRelative(dx = 0.6f, dy = 1.03f)
                // a 1.42 1.42 0 0 1 -1.06 2.1
                arcToRelative(
                    a = 1.42f,
                    b = 1.42f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.06f,
                    dy1 = 2.1f,
                )
                // l -1.18 0.15
                lineToRelative(dx = -1.18f, dy = 0.15f)
                // a 2.3 2.3 0 0 1 -1.37 -0.24
                arcToRelative(
                    a = 2.3f,
                    b = 2.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.37f,
                    dy1 = -0.24f,
                )
                // L 4.29 11.15
                lineTo(x = 4.29f, y = 11.15f)
                // a 2 2 0 0 1 -0.52 -0.38
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.52f,
                    dy1 = -0.38f,
                )
            }
        }.build().also { _planeLanding = it }
    }


@Suppress("ObjectPropertyName")
private var _planeLanding: ImageVector? = null
