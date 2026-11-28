package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MailSend: ImageVector
    get() {
        val current = _mailSend
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MailSend",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21.32 14.04 a.5 .5 0 0 1 .65 .64 l-2.75 7 a.5 .5 0 0 1 -.93 .01 l-1.01 -2.43 a1 1 0 0 0 -.54 -.54 l-2.43 -1 a.5 .5 0 0 1 0 -.93z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.32 14.04
                moveTo(x = 21.32f, y = 14.04f)
                // a 0.5 0.5 0 0 1 0.65 0.64
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.65f,
                    dy1 = 0.64f,
                )
                // l -2.75 7
                lineToRelative(dx = -2.75f, dy = 7.0f)
                // a 0.5 0.5 0 0 1 -0.93 0.01
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.93f,
                    dy1 = 0.01f,
                )
                // l -1.01 -2.43
                lineToRelative(dx = -1.01f, dy = -2.43f)
                // a 1 1 0 0 0 -0.54 -0.54
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.54f,
                    dy1 = -0.54f,
                )
                // l -2.43 -1
                lineToRelative(dx = -2.43f, dy = -1.0f)
                // a 0.5 0.5 0 0 1 0 -0.93z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -0.93f,
                )
                close()
            }
            // M22 10 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h6.93
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 10
                moveTo(x = 22.0f, y = 10.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 6.93
                horizontalLineToRelative(dx = 6.93f)
            }
            // m22 7 -8.97 5.7 a2 2 0 0 1 -2.06 0 L2 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 7
                moveTo(x = 22.0f, y = 7.0f)
                // l -8.97 5.7
                lineToRelative(dx = -8.97f, dy = 5.7f)
                // a 2 2 0 0 1 -2.06 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.06f,
                    dy1 = 0.0f,
                )
                // L 2 7
                lineTo(x = 2.0f, y = 7.0f)
            }
        }.build().also { _mailSend = it }
    }

@Suppress("ObjectPropertyName")
private var _mailSend: ImageVector? = null
