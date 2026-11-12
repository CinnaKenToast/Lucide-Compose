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
            // M22 10.35 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h12.3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 10.35
                moveTo(x = 22.0f, y = 10.35f)
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
                // h 12.3
                horizontalLineToRelative(dx = 12.3f)
            }
            // m22 7 -8.97 5.7 a2 2 0 0 1 -2.06 0 L2 7 m18 11.5 c.5 -1 2 -1 2 -2.5 a2 2 0 0 0 -2 -2 2.5 2.5 0 0 0 -2 1 m2 7 h.01
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
                // m 18 11.5
                moveToRelative(dx = 18.0f, dy = 11.5f)
                // c 0.5 -1 2 -1 2 -2.5
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                    dx3 = 2.0f,
                    dy3 = -2.5f,
                )
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
                // a 2.5 2.5 0 0 0 -2 1
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                )
                // m 2 7
                moveToRelative(dx = 2.0f, dy = 7.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
        }.build().also { _mailQuestionMark = it }
    }

@Suppress("ObjectPropertyName")
private var _mailQuestionMark: ImageVector? = null
