package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CaseSensitive: ImageVector
    get() {
        val current = _caseSensitive
        if (current != null) return current

        return ImageVector.Builder(
            name = "CaseSensitive",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 16 4.04 -9.69 a.5 .5 0 0 1 .92 0 L11 16 m11 -7 v7 M3.3 13 h6.4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 16
                moveTo(x = 2.0f, y = 16.0f)
                // l 4.04 -9.69
                lineToRelative(dx = 4.04f, dy = -9.69f)
                // a 0.5 0.5 0 0 1 0.92 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.92f,
                    dy1 = 0.0f,
                )
                // L 11 16
                lineTo(x = 11.0f, y = 16.0f)
                // m 11 -7
                moveToRelative(dx = 11.0f, dy = -7.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // M 3.3 13
                moveTo(x = 3.3f, y = 13.0f)
                // h 6.4
                horizontalLineToRelative(dx = 6.4f)
            }
            // <circle cx="18.5" cy="12.5" radius="3.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.5 12.5
                moveTo(x = 18.5f, y = 12.5f)
                // m -3.5 0
                moveToRelative(dx = -3.5f, dy = 0.0f)
                // a 3.5 3.5 0 1 1 7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // a 3.5 3.5 0 1 1 -7 0z
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _caseSensitive = it }
    }


@Suppress("ObjectPropertyName")
private var _caseSensitive: ImageVector? = null
