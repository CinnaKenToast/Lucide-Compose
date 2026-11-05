package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BusFront: ImageVector
    get() {
        val current = _busFront
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BusFront",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 6 2 7 m8 -1 h4 m8 1 -2 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // L 2 7
                lineTo(x = 2.0f, y = 7.0f)
                // m 8 -1
                moveToRelative(dx = 8.0f, dy = -1.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 8 1
                moveToRelative(dx = 8.0f, dy = 1.0f)
                // l -2 -1
                lineToRelative(dx = -2.0f, dy = -1.0f)
            }
            // <rect width="16" height="16" rx="2.0" x="4.0" y="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 5
                moveTo(x = 4.0f, y = 5.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // h -12
                horizontalLineToRelative(dx = -12.0f)
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
            // M4 11 h16 M8 15z M16 15 h.01 M6 19 v2 m12 0 v-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 11
                moveTo(x = 4.0f, y = 11.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 8 15z
                moveTo(x = 8.0f, y = 15.0f)
                close()
                // M 16 15
                moveTo(x = 16.0f, y = 15.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 6 19
                moveTo(x = 6.0f, y = 19.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 12 0
                moveToRelative(dx = 12.0f, dy = 0.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
            }
        }.build().also { _busFront = it }
    }

@Suppress("ObjectPropertyName")
private var _busFront: ImageVector? = null
