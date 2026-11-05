package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SunDim: ImageVector
    get() {
        val current = _sunDim
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SunDim",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="12.0" radius="4.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12 4z M20 12 h.01 M12 20z M4 12z m13.65 -5.66z m0 11.32z m-11.32 0 h.01 m0 -11.32z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 4z
                moveTo(x = 12.0f, y = 4.0f)
                close()
                // M 20 12
                moveTo(x = 20.0f, y = 12.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 12 20z
                moveTo(x = 12.0f, y = 20.0f)
                close()
                // M 4 12z
                moveTo(x = 4.0f, y = 12.0f)
                close()
                // m 13.65 -5.66z
                moveToRelative(dx = 13.65f, dy = -5.66f)
                close()
                // m 0 11.32z
                moveToRelative(dx = 0.0f, dy = 11.32f)
                close()
                // m -11.32 0
                moveToRelative(dx = -11.32f, dy = 0.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // m 0 -11.32z
                moveToRelative(dx = 0.0f, dy = -11.32f)
                close()
            }
        }.build().also { _sunDim = it }
    }

@Suppress("ObjectPropertyName")
private var _sunDim: ImageVector? = null
