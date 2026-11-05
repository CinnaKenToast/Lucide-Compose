package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StarPlus: ImageVector
    get() {
        val current = _starPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "StarPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.01 18.58 6.4 21.01 a.53 .53 0 0 1 -.77 -.56 l.88 -5.14 a2.1 2.1 0 0 0 -.61 -1.88 L2.16 9.8 a.53 .53 0 0 1 .3 -.91 l5.16 -.76 a2.1 2.1 0 0 0 1.6 -1.16 l2.3 -4.68 a.53 .53 0 0 1 .95 0 l2.31 4.68 a2.1 2.1 0 0 0 1.6 1.16 l5.17 .76 a.53 .53 0 0 1 .29 .9 L20 11.5 M15 18 h6 m-3 -3 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.01 18.58
                moveTo(x = 11.01f, y = 18.58f)
                // L 6.4 21.01
                lineTo(x = 6.4f, y = 21.01f)
                // a 0.53 0.53 0 0 1 -0.77 -0.56
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.77f,
                    dy1 = -0.56f,
                )
                // l 0.88 -5.14
                lineToRelative(dx = 0.88f, dy = -5.14f)
                // a 2.1 2.1 0 0 0 -0.61 -1.88
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.61f,
                    dy1 = -1.88f,
                )
                // L 2.16 9.8
                lineTo(x = 2.16f, y = 9.8f)
                // a 0.53 0.53 0 0 1 0.3 -0.91
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.3f,
                    dy1 = -0.91f,
                )
                // l 5.16 -0.76
                lineToRelative(dx = 5.16f, dy = -0.76f)
                // a 2.1 2.1 0 0 0 1.6 -1.16
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.6f,
                    dy1 = -1.16f,
                )
                // l 2.3 -4.68
                lineToRelative(dx = 2.3f, dy = -4.68f)
                // a 0.53 0.53 0 0 1 0.95 0
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.95f,
                    dy1 = 0.0f,
                )
                // l 2.31 4.68
                lineToRelative(dx = 2.31f, dy = 4.68f)
                // a 2.1 2.1 0 0 0 1.6 1.16
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.6f,
                    dy1 = 1.16f,
                )
                // l 5.17 0.76
                lineToRelative(dx = 5.17f, dy = 0.76f)
                // a 0.53 0.53 0 0 1 0.29 0.9
                arcToRelative(
                    a = 0.53f,
                    b = 0.53f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.29f,
                    dy1 = 0.9f,
                )
                // L 20 11.5
                lineTo(x = 20.0f, y = 11.5f)
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _starPlus = it }
    }


@Suppress("ObjectPropertyName")
private var _starPlus: ImageVector? = null
