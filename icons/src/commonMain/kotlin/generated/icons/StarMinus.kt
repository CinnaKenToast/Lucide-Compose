package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.StarMinus: ImageVector
    get() {
        val current = _starMinus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.StarMinus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 18 h6 m-3.31 -4 a2 2 0 0 1 .41 -.57 l3.74 -3.64 a.53 .53 0 0 0 -.3 -.9 l-5.16 -.76 a2.1 2.1 0 0 1 -1.6 -1.16 l-2.3 -4.68 a.53 .53 0 0 0 -.96 0 l-2.3 4.68 a2.1 2.1 0 0 1 -1.6 1.16 L2.45 8.9 a.53 .53 0 0 0 -.29 .9 l3.74 3.64 a2.1 2.1 0 0 1 .6 1.88 l-.87 5.14 a.53 .53 0 0 0 .77 .56 L11 18.58 l.03 -.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3.31 -4
                moveToRelative(dx = -3.31f, dy = -4.0f)
                // a 2 2 0 0 1 0.41 -0.57
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.41f,
                    dy1 = -0.57f,
                )
                // l 3.74 -3.64
                lineToRelative(dx = 3.74f, dy = -3.64f)
                // a 0.53 0.53 0 0 0 -0.3 -0.9
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = -0.9f,
                )
                // l -5.16 -0.76
                lineToRelative(dx = -5.16f, dy = -0.76f)
                // a 2.1 2.1 0 0 1 -1.6 -1.16
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.6f,
                    dy1 = -1.16f,
                )
                // l -2.3 -4.68
                lineToRelative(dx = -2.3f, dy = -4.68f)
                // a 0.53 0.53 0 0 0 -0.96 0
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.96f,
                    dy1 = 0.0f,
                )
                // l -2.3 4.68
                lineToRelative(dx = -2.3f, dy = 4.68f)
                // a 2.1 2.1 0 0 1 -1.6 1.16
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.6f,
                    dy1 = 1.16f,
                )
                // L 2.45 8.9
                lineTo(x = 2.45f, y = 8.9f)
                // a 0.53 0.53 0 0 0 -0.29 0.9
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.29f,
                    dy1 = 0.9f,
                )
                // l 3.74 3.64
                lineToRelative(dx = 3.74f, dy = 3.64f)
                // a 2.1 2.1 0 0 1 0.6 1.88
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.6f,
                    dy1 = 1.88f,
                )
                // l -0.87 5.14
                lineToRelative(dx = -0.87f, dy = 5.14f)
                // a 0.53 0.53 0 0 0 0.77 0.56
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.77f,
                    dy1 = 0.56f,
                )
                // L 11 18.58
                lineTo(x = 11.0f, y = 18.58f)
                // l 0.03 -0.01
                lineToRelative(dx = 0.03f, dy = -0.01f)
            }
        }.build().also { _starMinus = it }
    }

@Suppress("ObjectPropertyName")
private var _starMinus: ImageVector? = null
