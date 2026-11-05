package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FishingHook: ImageVector
    get() {
        val current = _fishingHook
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FishingHook",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m17.59 11.41 -5.93 5.93 a1 1 0 0 1 -8 -8 l3.13 -3.13 A.7 .7 0 0 1 8 6.7 V10 m12.41 -1.41 L22 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.59 11.41
                moveTo(x = 17.59f, y = 11.41f)
                // l -5.93 5.93
                lineToRelative(dx = -5.93f, dy = 5.93f)
                // a 1 1 0 0 1 -8 -8
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = -8.0f,
                )
                // l 3.13 -3.13
                lineToRelative(dx = 3.13f, dy = -3.13f)
                // A 0.7 0.7 0 0 1 8 6.7
                arcTo(
                    horizontalEllipseRadius = 0.7f,
                    verticalEllipseRadius = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 6.7f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // m 12.41 -1.41
                moveToRelative(dx = 12.41f, dy = -1.41f)
                // L 22 7
                lineTo(x = 22.0f, y = 7.0f)
            }
            // <circle cx="19.0" cy="10.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 10
                moveTo(x = 19.0f, y = 10.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _fishingHook = it }
    }

@Suppress("ObjectPropertyName")
private var _fishingHook: ImageVector? = null
