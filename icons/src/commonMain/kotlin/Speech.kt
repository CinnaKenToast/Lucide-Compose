package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Speech: ImageVector
    get() {
        val current = _speech
        if (current != null) return current

        return ImageVector.Builder(
            name = "Speech",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8.8 20 v-4.1 l1.9 .2 a2.3 2.3 0 0 0 2.16 -2.1 V8.3 A5.37 5.37 0 0 0 2 8.25 c0 2.8 .66 3.05 1 4.55 a6 6 0 0 1 .03 2.76 L2 20 m17.8 -2.2 a7.5 7.5 0 0 0 0 -10.6 M17 15 a3.5 3.5 0 0 0 -.02 -4.97
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.8 20
                moveTo(x = 8.8f, y = 20.0f)
                // v -4.1
                verticalLineToRelative(dy = -4.1f)
                // l 1.9 0.2
                lineToRelative(dx = 1.9f, dy = 0.2f)
                // a 2.3 2.3 0 0 0 2.16 -2.1
                arcToRelative(
                    a = 2.3f,
                    b = 2.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.16f,
                    dy1 = -2.1f,
                )
                // V 8.3
                verticalLineTo(y = 8.3f)
                // A 5.37 5.37 0 0 0 2 8.25
                arcTo(
                    horizontalEllipseRadius = 5.37f,
                    verticalEllipseRadius = 5.37f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 8.25f,
                )
                // c 0 2.8 0.66 3.05 1 4.55
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.8f,
                    dx2 = 0.66f,
                    dy2 = 3.05f,
                    dx3 = 1.0f,
                    dy3 = 4.55f,
                )
                // a 6 6 0 0 1 0.03 2.76
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.03f,
                    dy1 = 2.76f,
                )
                // L 2 20
                lineTo(x = 2.0f, y = 20.0f)
                // m 17.8 -2.2
                moveToRelative(dx = 17.8f, dy = -2.2f)
                // a 7.5 7.5 0 0 0 0 -10.6
                arcToRelative(
                    a = 7.5f,
                    b = 7.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -10.6f,
                )
                // M 17 15
                moveTo(x = 17.0f, y = 15.0f)
                // a 3.5 3.5 0 0 0 -0.02 -4.97
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.02f,
                    dy1 = -4.97f,
                )
            }
        }.build().also { _speech = it }
    }


@Suppress("ObjectPropertyName")
private var _speech: ImageVector? = null
