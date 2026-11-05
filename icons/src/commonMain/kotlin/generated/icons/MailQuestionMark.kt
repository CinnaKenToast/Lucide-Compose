package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MailQuestionMark: ImageVector
    get() {
        val current = _mailQuestionMark
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MailQuestionMark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 10.5 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h12.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 10.5
                moveTo(x = 22.0f, y = 10.5f)
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
                // h 12.5
                horizontalLineToRelative(dx = 12.5f)
            }
            // m22 7 -8.97 5.7 a1.9 1.9 0 0 1 -2.06 0 L2 7 m16 8.28 c.2 -.4 .5 -.8 .9 -1 a2.1 2.1 0 0 1 2.6 .4 2 2 0 0 1 .5 1.3 c0 1.3 -2 2 -2 2 M20 22 v.01
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
                // L 2 7
                lineTo(x = 2.0f, y = 7.0f)
                // m 16 8.28
                moveToRelative(dx = 16.0f, dy = 8.28f)
                // c 0.2 -0.4 0.5 -0.8 0.9 -1
                curveToRelative(
                    dx1 = 0.2f,
                    dy1 = -0.4f,
                    dx2 = 0.5f,
                    dy2 = -0.8f,
                    dx3 = 0.9f,
                    dy3 = -1.0f,
                )
                // a 2.1 2.1 0 0 1 2.6 0.4
                arcToRelative(
                    a = 2.1f,
                    b = 2.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.6f,
                    dy1 = 0.4f,
                )
                // a 2 2 0 0 1 0.5 1.3
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = 1.3f,
                )
                // c 0 1.3 -2 2 -2 2
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.3f,
                    dx2 = -2.0f,
                    dy2 = 2.0f,
                    dx3 = -2.0f,
                    dy3 = 2.0f,
                )
                // M 20 22
                moveTo(x = 20.0f, y = 22.0f)
                // v 0.01
                verticalLineToRelative(dy = 0.01f)
            }
        }.build().also { _mailQuestionMark = it }
    }

@Suppress("ObjectPropertyName")
private var _mailQuestionMark: ImageVector? = null
