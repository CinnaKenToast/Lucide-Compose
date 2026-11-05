package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Palette: ImageVector
    get() {
        val current = _palette
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Palette",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 a1 1 0 0 1 0 -20 10 9 0 0 1 10 9 5 5 0 0 1 -5 5 h-2.25 a1.75 1.75 0 0 0 -1.4 2.8 l.3 .4 a1.75 1.75 0 0 1 -1.4 2.8z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // a 1 1 0 0 1 0 -20
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -20.0f,
                )
                // a 10 9 0 0 1 10 9
                arcToRelative(
                    a = 10.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 9.0f,
                )
                // a 5 5 0 0 1 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // h -2.25
                horizontalLineToRelative(dx = -2.25f)
                // a 1.75 1.75 0 0 0 -1.4 2.8
                arcToRelative(
                    a = 1.75f,
                    b = 1.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 2.8f,
                )
                // l 0.3 0.4
                lineToRelative(dx = 0.3f, dy = 0.4f)
                // a 1.75 1.75 0 0 1 -1.4 2.8z
                arcToRelative(
                    a = 1.75f,
                    b = 1.75f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = 2.8f,
                )
                close()
            }
            // <circle cx="13.5" cy="6.5" radius="0.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.5 6.5
                moveTo(x = 13.5f, y = 6.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="17.5" cy="10.5" radius="0.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.5 10.5
                moveTo(x = 17.5f, y = 10.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="6.5" cy="12.5" radius="0.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6.5 12.5
                moveTo(x = 6.5f, y = 12.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="8.5" cy="7.5" radius="0.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.5 7.5
                moveTo(x = 8.5f, y = 7.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _palette = it }
    }

@Suppress("ObjectPropertyName")
private var _palette: ImageVector? = null
