package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.MirrorRound: ImageVector
    get() {
        val current = _mirrorRound
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.MirrorRound",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 6.6 8.6 8 M12 18 v4 m3 -14.5 L9.5 13 M7 22 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 6.6
                moveTo(x = 10.0f, y = 6.6f)
                // L 8.6 8
                lineTo(x = 8.6f, y = 8.0f)
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 3 -14.5
                moveToRelative(dx = 3.0f, dy = -14.5f)
                // L 9.5 13
                lineTo(x = 9.5f, y = 13.0f)
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
            // <circle cx="12.0" cy="10.0" radius="8.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 8 8 0 1 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 1 1 -16 0z
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _mirrorRound = it }
    }

@Suppress("ObjectPropertyName")
private var _mirrorRound: ImageVector? = null
