package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bomb: ImageVector
    get() {
        val current = _bomb
        if (current != null) return current

        return ImageVector.Builder(
            name = "Bomb",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="11.0" cy="13.0" radius="9.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 13
                moveTo(x = 11.0f, y = 13.0f)
                // m -9 0
                moveToRelative(dx = -9.0f, dy = 0.0f)
                // a 9 9 0 1 1 18 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 18.0f,
                    dy1 = 0.0f,
                )
                // a 9 9 0 1 1 -18 0z
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -18.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M14.35 4.65 16.3 2.7 a2.4 2.4 0 0 1 3.4 0 l1.6 1.6 a2.4 2.4 0 0 1 0 3.4 l-1.95 1.95 M22 2 l-1.5 1.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.35 4.65
                moveTo(x = 14.35f, y = 4.65f)
                // L 16.3 2.7
                lineTo(x = 16.3f, y = 2.7f)
                // a 2.4 2.4 0 0 1 3.4 0
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.4f,
                    dy1 = 0.0f,
                )
                // l 1.6 1.6
                lineToRelative(dx = 1.6f, dy = 1.6f)
                // a 2.4 2.4 0 0 1 0 3.4
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.4f,
                )
                // l -1.95 1.95
                lineToRelative(dx = -1.95f, dy = 1.95f)
                // M 22 2
                moveTo(x = 22.0f, y = 2.0f)
                // l -1.5 1.5
                lineToRelative(dx = -1.5f, dy = 1.5f)
            }
        }.build().also { _bomb = it }
    }


@Suppress("ObjectPropertyName")
private var _bomb: ImageVector? = null
