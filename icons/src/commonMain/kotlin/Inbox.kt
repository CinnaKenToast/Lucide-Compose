package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inbox: ImageVector
    get() {
        val current = _inbox
        if (current != null) return current

        return ImageVector.Builder(
            name = "Inbox",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <polyline points="22.0 12.0 16.0 12.0 14.0 15.0 10.0 15.0 8.0 12.0 2.0 12.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 12
                moveTo(x = 22.0f, y = 12.0f)
                // L 16 12
                lineTo(x = 16.0f, y = 12.0f)
                // L 14 15
                lineTo(x = 14.0f, y = 15.0f)
                // L 10 15
                lineTo(x = 10.0f, y = 15.0f)
                // L 8 12
                lineTo(x = 8.0f, y = 12.0f)
                // L 2 12
                lineTo(x = 2.0f, y = 12.0f)
            }
            // M5.45 5.11 2 12 v6 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-6 l-3.45 -6.89 A2 2 0 0 0 16.76 4 H7.24 a2 2 0 0 0 -1.79 1.11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.45 5.11
                moveTo(x = 5.45f, y = 5.11f)
                // L 2 12
                lineTo(x = 2.0f, y = 12.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // l -3.45 -6.89
                lineToRelative(dx = -3.45f, dy = -6.89f)
                // A 2 2 0 0 0 16.76 4
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.76f,
                    y1 = 4.0f,
                )
                // H 7.24
                horizontalLineTo(x = 7.24f)
                // a 2 2 0 0 0 -1.79 1.11
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.79f,
                    dy1 = 1.11f,
                )
            }
        }.build().also { _inbox = it }
    }


@Suppress("ObjectPropertyName")
private var _inbox: ImageVector? = null
