package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TreePalm: ImageVector
    get() {
        val current = _treePalm
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TreePalm",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 8 c0 -2.76 -2.46 -5 -5.5 -5 S2 5.24 2 8 h2 l1 -1 1 1 h4 m3 -.86 A6 6 0 0 1 16.5 6 c3.04 0 5.5 2.24 5.5 5 h-3 l-1 -1 -1 1 h-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 8
                moveTo(x = 13.0f, y = 8.0f)
                // c 0 -2.76 -2.46 -5 -5.5 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.76f,
                    dx2 = -2.46f,
                    dy2 = -5.0f,
                    dx3 = -5.5f,
                    dy3 = -5.0f,
                )
                // S 2 5.24 2 8
                reflectiveCurveTo(
                    x1 = 2.0f,
                    y1 = 5.24f,
                    x2 = 2.0f,
                    y2 = 8.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // l 1 -1
                lineToRelative(dx = 1.0f, dy = -1.0f)
                // l 1 1
                lineToRelative(dx = 1.0f, dy = 1.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 3 -0.86
                moveToRelative(dx = 3.0f, dy = -0.86f)
                // A 6 6 0 0 1 16.5 6
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.5f,
                    y1 = 6.0f,
                )
                // c 3.04 0 5.5 2.24 5.5 5
                curveToRelative(
                    dx1 = 3.04f,
                    dy1 = 0.0f,
                    dx2 = 5.5f,
                    dy2 = 2.24f,
                    dx3 = 5.5f,
                    dy3 = 5.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // l -1 -1
                lineToRelative(dx = -1.0f, dy = -1.0f)
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
            }
            // M5.89 9.71 c-2.15 2.15 -2.3 5.47 -.35 7.43 l4.24 -4.25 .7 -.7 .71 -.71 2.12 -2.12 c-1.95 -1.96 -5.27 -1.8 -7.42 .35
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.89 9.71
                moveTo(x = 5.89f, y = 9.71f)
                // c -2.15 2.15 -2.3 5.47 -0.35 7.43
                curveToRelative(
                    dx1 = -2.15f,
                    dy1 = 2.15f,
                    dx2 = -2.3f,
                    dy2 = 5.47f,
                    dx3 = -0.35f,
                    dy3 = 7.43f,
                )
                // l 4.24 -4.25
                lineToRelative(dx = 4.24f, dy = -4.25f)
                // l 0.7 -0.7
                lineToRelative(dx = 0.7f, dy = -0.7f)
                // l 0.71 -0.71
                lineToRelative(dx = 0.71f, dy = -0.71f)
                // l 2.12 -2.12
                lineToRelative(dx = 2.12f, dy = -2.12f)
                // c -1.95 -1.96 -5.27 -1.8 -7.42 0.35
                curveToRelative(
                    dx1 = -1.95f,
                    dy1 = -1.96f,
                    dx2 = -5.27f,
                    dy2 = -1.8f,
                    dx3 = -7.42f,
                    dy3 = 0.35f,
                )
            }
            // M11 15.5 c.5 2.5 -.17 4.5 -1 6.5 h4 c2 -5.5 -.5 -12 -1 -14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 15.5
                moveTo(x = 11.0f, y = 15.5f)
                // c 0.5 2.5 -0.17 4.5 -1 6.5
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 2.5f,
                    dx2 = -0.17f,
                    dy2 = 4.5f,
                    dx3 = -1.0f,
                    dy3 = 6.5f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 2 -5.5 -0.5 -12 -1 -14
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = -5.5f,
                    dx2 = -0.5f,
                    dy2 = -12.0f,
                    dx3 = -1.0f,
                    dy3 = -14.0f,
                )
            }
        }.build().also { _treePalm = it }
    }

@Suppress("ObjectPropertyName")
private var _treePalm: ImageVector? = null
