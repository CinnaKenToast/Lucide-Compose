package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MailBadge: ImageVector
    get() {
        val current = _mailBadge
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MailBadge",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 7.7 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h8.25
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 7.7
                moveTo(x = 22.0f, y = 7.7f)
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
                // h 8.25
                horizontalLineToRelative(dx = 8.25f)
            }
            // M12 13 a2 2 0 0 1 -1.03 -.3 L2 7 m18.69 9.48 1.29 4.88 a.5 .5 0 0 1 -.7 .59 l-1.84 -.85 a1 1 0 0 0 -.88 0 l-1.85 .85 a.5 .5 0 0 1 -.69 -.6 l1.3 -4.87
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 13
                moveTo(x = 12.0f, y = 13.0f)
                // a 2 2 0 0 1 -1.03 -0.3
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.03f,
                    dy1 = -0.3f,
                )
                // L 2 7
                lineTo(x = 2.0f, y = 7.0f)
                // m 18.69 9.48
                moveToRelative(dx = 18.69f, dy = 9.48f)
                // l 1.29 4.88
                lineToRelative(dx = 1.29f, dy = 4.88f)
                // a 0.5 0.5 0 0 1 -0.7 0.59
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = 0.59f,
                )
                // l -1.84 -0.85
                lineToRelative(dx = -1.84f, dy = -0.85f)
                // a 1 1 0 0 0 -0.88 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.88f,
                    dy1 = 0.0f,
                )
                // l -1.85 0.85
                lineToRelative(dx = -1.85f, dy = 0.85f)
                // a 0.5 0.5 0 0 1 -0.69 -0.6
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.69f,
                    dy1 = -0.6f,
                )
                // l 1.3 -4.87
                lineToRelative(dx = 1.3f, dy = -4.87f)
            }
            // <circle cx="19.0" cy="14.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 14
                moveTo(x = 19.0f, y = 14.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _mailBadge = it }
    }

@Suppress("ObjectPropertyName")
private var _mailBadge: ImageVector? = null
