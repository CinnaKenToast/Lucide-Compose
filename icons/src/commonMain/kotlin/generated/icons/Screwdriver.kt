package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Screwdriver: ImageVector
    get() {
        val current = _screwdriver
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Screwdriver",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 7 h2.75 a1 1 0 0 0 .87 -.51 l1.25 -2.26 a1 1 0 0 0 -.16 -1.2 L20.96 2.3 a1 1 0 0 0 -1.05 -.23 l-2.4 1.32 A1 1 0 0 0 17 4.25z l-5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 7
                moveTo(x = 17.0f, y = 7.0f)
                // h 2.75
                horizontalLineToRelative(dx = 2.75f)
                // a 1 1 0 0 0 0.87 -0.51
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.87f,
                    dy1 = -0.51f,
                )
                // l 1.25 -2.26
                lineToRelative(dx = 1.25f, dy = -2.26f)
                // a 1 1 0 0 0 -0.16 -1.2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.16f,
                    dy1 = -1.2f,
                )
                // L 20.96 2.3
                lineTo(x = 20.96f, y = 2.3f)
                // a 1 1 0 0 0 -1.05 -0.23
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.05f,
                    dy1 = -0.23f,
                )
                // l -2.4 1.32
                lineToRelative(dx = -2.4f, dy = 1.32f)
                // A 1 1 0 0 0 17 4.25z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 4.25f,
                )
                close()
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
            }
            // M9.65 11.35 a1.2 1.2 0 0 1 1.7 0 l1.3 1.3 a1.2 1.2 0 0 1 0 1.7 l-.32 .31 c-.26 .27 -.6 .43 -.94 .6 a2.5 2.5 0 0 0 -1.13 1.14 c-.17 .33 -.33 .67 -.6 .94 l-4.04 4.04 a2.1 2.1 0 0 1 -3.46 -2.31 2 2 0 0 1 .46 -.69 l4.04 -4.04 c.26 -.27 .6 -.43 .94 -.6 a2.5 2.5 0 0 0 1.14 -1.14 c.17 -.33 .33 -.68 .6 -.94z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.65 11.35
                moveTo(x = 9.65f, y = 11.35f)
                // a 1.2 1.2 0 0 1 1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 1.3 1.3
                lineToRelative(dx = 1.3f, dy = 1.3f)
                // a 1.2 1.2 0 0 1 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l -0.32 0.31
                lineToRelative(dx = -0.32f, dy = 0.31f)
                // c -0.26 0.27 -0.6 0.43 -0.94 0.6
                curveToRelative(
                    dx1 = -0.26f,
                    dy1 = 0.27f,
                    dx2 = -0.6f,
                    dy2 = 0.43f,
                    dx3 = -0.94f,
                    dy3 = 0.6f,
                )
                // a 2.5 2.5 0 0 0 -1.13 1.14
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.13f,
                    dy1 = 1.14f,
                )
                // c -0.17 0.33 -0.33 0.67 -0.6 0.94
                curveToRelative(
                    dx1 = -0.17f,
                    dy1 = 0.33f,
                    dx2 = -0.33f,
                    dy2 = 0.67f,
                    dx3 = -0.6f,
                    dy3 = 0.94f,
                )
                // l -4.04 4.04
                lineToRelative(dx = -4.04f, dy = 4.04f)
                // a 2.1 2.1 0 0 1 -3.46 -2.31
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.46f,
                    dy1 = -2.31f,
                )
                // a 2 2 0 0 1 0.46 -0.69
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.46f,
                    dy1 = -0.69f,
                )
                // l 4.04 -4.04
                lineToRelative(dx = 4.04f, dy = -4.04f)
                // c 0.26 -0.27 0.6 -0.43 0.94 -0.6
                curveToRelative(
                    dx1 = 0.26f,
                    dy1 = -0.27f,
                    dx2 = 0.6f,
                    dy2 = -0.43f,
                    dx3 = 0.94f,
                    dy3 = -0.6f,
                )
                // a 2.5 2.5 0 0 0 1.14 -1.14
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.14f,
                    dy1 = -1.14f,
                )
                // c 0.17 -0.33 0.33 -0.68 0.6 -0.94z
                curveToRelative(
                    dx1 = 0.17f,
                    dy1 = -0.33f,
                    dx2 = 0.33f,
                    dy2 = -0.68f,
                    dx3 = 0.6f,
                    dy3 = -0.94f,
                )
                close()
            }
        }.build().also { _screwdriver = it }
    }

@Suppress("ObjectPropertyName")
private var _screwdriver: ImageVector? = null
