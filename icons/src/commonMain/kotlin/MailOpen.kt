package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MailOpen: ImageVector
    get() {
        val current = _mailOpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "MailOpen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21.2 8.4 A2 2 0 0 1 22 10 v10 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 V10 a2 2 0 0 1 .8 -1.6 l8 -6 a2 2 0 0 1 2.4 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.2 8.4
                moveTo(x = 21.2f, y = 8.4f)
                // A 2 2 0 0 1 22 10
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 10.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // a 2 2 0 0 1 0.8 -1.6
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.8f,
                    dy1 = -1.6f,
                )
                // l 8 -6
                lineToRelative(dx = 8.0f, dy = -6.0f)
                // a 2 2 0 0 1 2.4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.4f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m22 10 -8.97 5.7 a1.9 1.9 0 0 1 -2.06 0 L2 10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 10
                moveTo(x = 22.0f, y = 10.0f)
                // l -8.97 5.7
                lineToRelative(dx = -8.97f, dy = 5.7f)
                // a 1.9 1.9 0 0 1 -2.06 0
                arcToRelative(
                    a = 1.9f,
                    b = 1.9f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.06f,
                    dy1 = 0.0f,
                )
                // L 2 10
                lineTo(x = 2.0f, y = 10.0f)
            }
        }.build().also { _mailOpen = it }
    }


@Suppress("ObjectPropertyName")
private var _mailOpen: ImageVector? = null
