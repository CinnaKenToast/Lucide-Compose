package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PartyPopper: ImageVector
    get() {
        val current = _partyPopper
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PartyPopper",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5.8 11.3 2 22 l10.7 -3.79 M4 3z M22 8 h.01 M15 2z M22 20 h.01 M22 2 l-2.24 .75 a2.9 2.9 0 0 0 -1.96 3.12 1.46 1.46 0 0 1 -1.45 1.63 h-.38 c-.86 0 -1.6 .6 -1.76 1.44 L14 10 m8 3 -.82 -.33 a1.47 1.47 0 0 0 -1.98 1.11 A1.45 1.45 0 0 1 17.77 15 H17 M11 2 l.33 .82 a1.47 1.47 0 0 1 -1.11 1.98 A1.44 1.44 0 0 0 9 6.23 V7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.8 11.3
                moveTo(x = 5.8f, y = 11.3f)
                // L 2 22
                lineTo(x = 2.0f, y = 22.0f)
                // l 10.7 -3.79
                lineToRelative(dx = 10.7f, dy = -3.79f)
                // M 4 3z
                moveTo(x = 4.0f, y = 3.0f)
                close()
                // M 22 8
                moveTo(x = 22.0f, y = 8.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 15 2z
                moveTo(x = 15.0f, y = 2.0f)
                close()
                // M 22 20
                moveTo(x = 22.0f, y = 20.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 22 2
                moveTo(x = 22.0f, y = 2.0f)
                // l -2.24 0.75
                lineToRelative(dx = -2.24f, dy = 0.75f)
                // a 2.9 2.9 0 0 0 -1.96 3.12
                arcToRelative(
                    a = 2.9f,
                    b = 2.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.96f,
                    dy1 = 3.12f,
                )
                // a 1.46 1.46 0 0 1 -1.45 1.63
                arcToRelative(
                    a = 1.46f,
                    b = 1.46f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.45f,
                    dy1 = 1.63f,
                )
                // h -0.38
                horizontalLineToRelative(dx = -0.38f)
                // c -0.86 0 -1.6 0.6 -1.76 1.44
                curveToRelative(
                    dx1 = -0.86f,
                    dy1 = 0.0f,
                    dx2 = -1.6f,
                    dy2 = 0.6f,
                    dx3 = -1.76f,
                    dy3 = 1.44f,
                )
                // L 14 10
                lineTo(x = 14.0f, y = 10.0f)
                // m 8 3
                moveToRelative(dx = 8.0f, dy = 3.0f)
                // l -0.82 -0.33
                lineToRelative(dx = -0.82f, dy = -0.33f)
                // a 1.47 1.47 0 0 0 -1.98 1.11
                arcToRelative(
                    a = 1.47f,
                    b = 1.47f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.98f,
                    dy1 = 1.11f,
                )
                // A 1.45 1.45 0 0 1 17.77 15
                arcTo(
                    horizontalEllipseRadius = 1.45f,
                    verticalEllipseRadius = 1.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.77f,
                    y1 = 15.0f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
                // M 11 2
                moveTo(x = 11.0f, y = 2.0f)
                // l 0.33 0.82
                lineToRelative(dx = 0.33f, dy = 0.82f)
                // a 1.47 1.47 0 0 1 -1.11 1.98
                arcToRelative(
                    a = 1.47f,
                    b = 1.47f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.11f,
                    dy1 = 1.98f,
                )
                // A 1.44 1.44 0 0 0 9 6.23
                arcTo(
                    horizontalEllipseRadius = 1.44f,
                    verticalEllipseRadius = 1.44f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.0f,
                    y1 = 6.23f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
            }
            // M11 13 c1.93 1.93 2.83 4.17 2 5 s-3.07 -.07 -5 -2 -2.83 -4.17 -2 -5 3.07 .07 5 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 13
                moveTo(x = 11.0f, y = 13.0f)
                // c 1.93 1.93 2.83 4.17 2 5
                curveToRelative(
                    dx1 = 1.93f,
                    dy1 = 1.93f,
                    dx2 = 2.83f,
                    dy2 = 4.17f,
                    dx3 = 2.0f,
                    dy3 = 5.0f,
                )
                // s -3.07 -0.07 -5 -2
                reflectiveCurveToRelative(
                    dx1 = -3.07f,
                    dy1 = -0.07f,
                    dx2 = -5.0f,
                    dy2 = -2.0f,
                )
                // s -2.83 -4.17 -2 -5
                reflectiveCurveToRelative(
                    dx1 = -2.83f,
                    dy1 = -4.17f,
                    dx2 = -2.0f,
                    dy2 = -5.0f,
                )
                // s 3.07 0.07 5 2
                reflectiveCurveToRelative(
                    dx1 = 3.07f,
                    dy1 = 0.07f,
                    dx2 = 5.0f,
                    dy2 = 2.0f,
                )
            }
        }.build().also { _partyPopper = it }
    }

@Suppress("ObjectPropertyName")
private var _partyPopper: ImageVector? = null
