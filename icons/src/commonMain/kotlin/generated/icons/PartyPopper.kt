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
            // M10 2.02 a3 3 0 0 1 .84 3.21 m3.69 3.62 c0 -.8 .37 -1.6 1.76 -1.6 1.12 0 1.85 -.51 1.85 -1.68 C18.15 2.95 20.6 2 22 2 m-7 0z M21 16 h.01 M22 11.76 a3 3 0 0 0 -4.25 .25 M22 7 h.01 M3.83 15.83 l4.3 4.3 m-2.67 -8.67 7 7 M6 3z m.58 5.47 a1 1 0 0 1 1.59 -.25 l7.6 7.45 a1 1 0 0 1 -.35 1.65 L3.3 22 A1 1 0 0 1 2 20.7 L6.54 8.58z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2.02
                moveTo(x = 10.0f, y = 2.02f)
                // a 3 3 0 0 1 0.84 3.21
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.84f,
                    dy1 = 3.21f,
                )
                // m 3.69 3.62
                moveToRelative(dx = 3.69f, dy = 3.62f)
                // c 0 -0.8 0.37 -1.6 1.76 -1.6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.8f,
                    dx2 = 0.37f,
                    dy2 = -1.6f,
                    dx3 = 1.76f,
                    dy3 = -1.6f,
                )
                // c 1.12 0 1.85 -0.51 1.85 -1.68
                curveToRelative(
                    dx1 = 1.12f,
                    dy1 = 0.0f,
                    dx2 = 1.85f,
                    dy2 = -0.51f,
                    dx3 = 1.85f,
                    dy3 = -1.68f,
                )
                // C 18.15 2.95 20.6 2 22 2
                curveTo(
                    x1 = 18.15f,
                    y1 = 2.95f,
                    x2 = 20.6f,
                    y2 = 2.0f,
                    x3 = 22.0f,
                    y3 = 2.0f,
                )
                // m -7 0z
                moveToRelative(dx = -7.0f, dy = 0.0f)
                close()
                // M 21 16
                moveTo(x = 21.0f, y = 16.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 22 11.76
                moveTo(x = 22.0f, y = 11.76f)
                // a 3 3 0 0 0 -4.25 0.25
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.25f,
                    dy1 = 0.25f,
                )
                // M 22 7
                moveTo(x = 22.0f, y = 7.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 3.83 15.83
                moveTo(x = 3.83f, y = 15.83f)
                // l 4.3 4.3
                lineToRelative(dx = 4.3f, dy = 4.3f)
                // m -2.67 -8.67
                moveToRelative(dx = -2.67f, dy = -8.67f)
                // l 7 7
                lineToRelative(dx = 7.0f, dy = 7.0f)
                // M 6 3z
                moveTo(x = 6.0f, y = 3.0f)
                close()
                // m 0.58 5.47
                moveToRelative(dx = 0.58f, dy = 5.47f)
                // a 1 1 0 0 1 1.59 -0.25
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.59f,
                    dy1 = -0.25f,
                )
                // l 7.6 7.45
                lineToRelative(dx = 7.6f, dy = 7.45f)
                // a 1 1 0 0 1 -0.35 1.65
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.35f,
                    dy1 = 1.65f,
                )
                // L 3.3 22
                lineTo(x = 3.3f, y = 22.0f)
                // A 1 1 0 0 1 2 20.7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 20.7f,
                )
                // L 6.54 8.58z
                lineTo(x = 6.54f, y = 8.58f)
                close()
            }
        }.build().also { _partyPopper = it }
    }

@Suppress("ObjectPropertyName")
private var _partyPopper: ImageVector? = null
