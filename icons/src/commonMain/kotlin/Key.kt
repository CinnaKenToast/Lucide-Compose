package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Key: ImageVector
    get() {
        val current = _key
        if (current != null) return current

        return ImageVector.Builder(
            name = "Key",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 21 9.6 -9.6 m-4.1 4.1 2.3 2.3 a1 1 0 0 1 0 1.4 l-2.1 2.1 a1 1 0 0 1 -1.4 0 L4 19
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // l 9.6 -9.6
                lineToRelative(dx = 9.6f, dy = -9.6f)
                // m -4.1 4.1
                moveToRelative(dx = -4.1f, dy = 4.1f)
                // l 2.3 2.3
                lineToRelative(dx = 2.3f, dy = 2.3f)
                // a 1 1 0 0 1 0 1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.4f,
                )
                // l -2.1 2.1
                lineToRelative(dx = -2.1f, dy = 2.1f)
                // a 1 1 0 0 1 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // L 4 19
                lineTo(x = 4.0f, y = 19.0f)
            }
            // <circle cx="15.5" cy="7.5" radius="5.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.5 7.5
                moveTo(x = 15.5f, y = 7.5f)
                // m -5.5 0
                moveToRelative(dx = -5.5f, dy = 0.0f)
                // a 5.5 5.5 0 1 1 11 0
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 11.0f,
                    dy1 = 0.0f,
                )
                // a 5.5 5.5 0 1 1 -11 0z
                arcToRelative(
                    a = 5.5f,
                    b = 5.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -11.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _key = it }
    }


@Suppress("ObjectPropertyName")
private var _key: ImageVector? = null
