package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Usb: ImageVector
    get() {
        val current = _usb
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Usb",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="10.0" cy="7.0" radius="1.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 7
                moveTo(x = 10.0f, y = 7.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="4.0" cy="20.0" radius="1.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M4.7 19.3 19 5 m2 -2 -3 1 2 2Z M9.26 7.68 5 12 l2 5 m3 -3 5 2 3.5 -3.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4.7 19.3
                moveTo(x = 4.7f, y = 19.3f)
                // L 19 5
                lineTo(x = 19.0f, y = 5.0f)
                // m 2 -2
                moveToRelative(dx = 2.0f, dy = -2.0f)
                // l -3 1
                lineToRelative(dx = -3.0f, dy = 1.0f)
                // l 2 2z
                lineToRelative(dx = 2.0f, dy = 2.0f)
                close()
                // M 9.26 7.68
                moveTo(x = 9.26f, y = 7.68f)
                // L 5 12
                lineTo(x = 5.0f, y = 12.0f)
                // l 2 5
                lineToRelative(dx = 2.0f, dy = 5.0f)
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // l 5 2
                lineToRelative(dx = 5.0f, dy = 2.0f)
                // l 3.5 -3.5
                lineToRelative(dx = 3.5f, dy = -3.5f)
            }
            // m18 12 1 -1 1 1 -1 1Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 12
                moveTo(x = 18.0f, y = 12.0f)
                // l 1 -1
                lineToRelative(dx = 1.0f, dy = -1.0f)
                // l 1 1
                lineToRelative(dx = 1.0f, dy = 1.0f)
                // l -1 1z
                lineToRelative(dx = -1.0f, dy = 1.0f)
                close()
            }
        }.build().also { _usb = it }
    }

@Suppress("ObjectPropertyName")
private var _usb: ImageVector? = null
