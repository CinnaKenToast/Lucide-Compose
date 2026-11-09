package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.UserRoundExclamationPoint: ImageVector
    get() {
        val current = _userRoundExclamationPoint
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.UserRoundExclamationPoint",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M19.99 13 v4 m0 4 H20 M4 21 a8 8 0 0 1 11.99 -6.93
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19.99 13
                moveTo(x = 19.99f, y = 13.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // H 20
                horizontalLineTo(x = 20.0f)
                // M 4 21
                moveTo(x = 4.0f, y = 21.0f)
                // a 8 8 0 0 1 11.99 -6.93
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 11.99f,
                    dy1 = -6.93f,
                )
            }
            // <circle cx="12.0" cy="8.0" radius="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _userRoundExclamationPoint = it }
    }

@Suppress("ObjectPropertyName")
private var _userRoundExclamationPoint: ImageVector? = null
