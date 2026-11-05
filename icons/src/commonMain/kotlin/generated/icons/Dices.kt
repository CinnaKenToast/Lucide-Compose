package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Dices: ImageVector
    get() {
        val current = _dices
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Dices",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <rect width="12" height="12" rx="2.0" ry="2.0" x="2.0" y="10.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
            // m17.92 14 3.5 -3.5 a2.24 2.24 0 0 0 0 -3 l-5 -4.92 a2.24 2.24 0 0 0 -3 0 L10 6 M6 18z M10 14z M15 6z M18 9 h.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.92 14
                moveTo(x = 17.92f, y = 14.0f)
                // l 3.5 -3.5
                lineToRelative(dx = 3.5f, dy = -3.5f)
                // a 2.24 2.24 0 0 0 0 -3
                arcToRelative(
                    a = 2.24f,
                    b = 2.24f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.0f,
                )
                // l -5 -4.92
                lineToRelative(dx = -5.0f, dy = -4.92f)
                // a 2.24 2.24 0 0 0 -3 0
                arcToRelative(
                    a = 2.24f,
                    b = 2.24f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                // L 10 6
                lineTo(x = 10.0f, y = 6.0f)
                // M 6 18z
                moveTo(x = 6.0f, y = 18.0f)
                close()
                // M 10 14z
                moveTo(x = 10.0f, y = 14.0f)
                close()
                // M 15 6z
                moveTo(x = 15.0f, y = 6.0f)
                close()
                // M 18 9
                moveTo(x = 18.0f, y = 9.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
        }.build().also { _dices = it }
    }

@Suppress("ObjectPropertyName")
private var _dices: ImageVector? = null
