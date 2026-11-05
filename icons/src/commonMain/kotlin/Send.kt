package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Send: ImageVector
    get() {
        val current = _send
        if (current != null) return current

        return ImageVector.Builder(
            name = "Send",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14.54 21.69 a.5 .5 0 0 0 .93 -.03 l6.5 -19 a.5 .5 0 0 0 -.63 -.63 l-19 6.5 A.5 .5 0 0 0 2.3 9.46 l7.93 3.18 a2 2 0 0 1 1.12 1.11z m7.31 -19.54 L10.91 13.09
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.54 21.69
                moveTo(x = 14.54f, y = 21.69f)
                // a 0.5 0.5 0 0 0 0.93 -0.03
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.93f,
                    dy1 = -0.03f,
                )
                // l 6.5 -19
                lineToRelative(dx = 6.5f, dy = -19.0f)
                // a 0.5 0.5 0 0 0 -0.63 -0.63
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.63f,
                    dy1 = -0.63f,
                )
                // l -19 6.5
                lineToRelative(dx = -19.0f, dy = 6.5f)
                // A 0.5 0.5 0 0 0 2.3 9.46
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.3f,
                    y1 = 9.46f,
                )
                // l 7.93 3.18
                lineToRelative(dx = 7.93f, dy = 3.18f)
                // a 2 2 0 0 1 1.12 1.11z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.12f,
                    dy1 = 1.11f,
                )
                close()
                // m 7.31 -19.54
                moveToRelative(dx = 7.31f, dy = -19.54f)
                // L 10.91 13.09
                lineTo(x = 10.91f, y = 13.09f)
            }
        }.build().also { _send = it }
    }


@Suppress("ObjectPropertyName")
private var _send: ImageVector? = null
