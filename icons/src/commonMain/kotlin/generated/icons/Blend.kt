package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Blend: ImageVector
    get() {
        val current = _blend
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Blend",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="15.0" cy="9.0" radius="7.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 9
                moveTo(x = 15.0f, y = 9.0f)
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // a 7 7 0 1 1 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
                // a 7 7 0 1 1 -14 0z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="9.0" cy="15.0" radius="7.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 15
                moveTo(x = 9.0f, y = 15.0f)
                // m -7 0
                moveToRelative(dx = -7.0f, dy = 0.0f)
                // a 7 7 0 1 1 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
                // a 7 7 0 1 1 -14 0z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _blend = it }
    }

@Suppress("ObjectPropertyName")
private var _blend: ImageVector? = null
