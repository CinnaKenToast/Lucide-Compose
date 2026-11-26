package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GlobeClock: ImageVector
    get() {
        val current = _globeClock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.GlobeClock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.5 15.76 A14.5 14.5 0 0 1 12 22 10 10 0 0 1 9.5 2.32 M17 5.5 v1.7 l1 .63 M2 12 h7.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.5 15.76
                moveTo(x = 15.5f, y = 15.76f)
                // A 14.5 14.5 0 0 1 12 22
                arcTo(
                    horizontalEllipseRadius = 14.5f,
                    verticalEllipseRadius = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                // A 10 10 0 0 1 9.5 2.32
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.5f,
                    y1 = 2.32f,
                )
                // M 17 5.5
                moveTo(x = 17.0f, y = 5.5f)
                // v 1.7
                verticalLineToRelative(dy = 1.7f)
                // l 1 0.63
                lineToRelative(dx = 1.0f, dy = 0.63f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 7.5
                horizontalLineToRelative(dx = 7.5f)
            }
            // M21.68 14.5 A10 10 0 0 1 12 22 a14.5 14.5 0 0 1 -4 -10 16 16 0 0 1 .3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.68 14.5
                moveTo(x = 21.68f, y = 14.5f)
                // A 10 10 0 0 1 12 22
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                // a 14.5 14.5 0 0 1 -4 -10
                arcToRelative(
                    a = 14.5f,
                    b = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -10.0f,
                )
                // a 16 16 0 0 1 0.3 -3
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.3f,
                    dy1 = -3.0f,
                )
            }
            // <circle cx="17.0" cy="7.0" radius="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 7
                moveTo(x = 17.0f, y = 7.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _globeClock = it }
    }

@Suppress("ObjectPropertyName")
private var _globeClock: ImageVector? = null
