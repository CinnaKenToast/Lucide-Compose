package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tractor: ImageVector
    get() {
        val current = _tractor
        if (current != null) return current

        return ImageVector.Builder(
            name = "Tractor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m10 11 11 .9 a1 1 0 0 1 .8 1.1 l-.66 4.16 a1 1 0 0 1 -1 .84 H20 m-4 0 h-5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 11
                moveTo(x = 10.0f, y = 11.0f)
                // l 11 0.9
                lineToRelative(dx = 11.0f, dy = 0.9f)
                // a 1 1 0 0 1 0.8 1.1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.8f,
                    dy1 = 1.1f,
                )
                // l -0.66 4.16
                lineToRelative(dx = -0.66f, dy = 4.16f)
                // a 1 1 0 0 1 -1 0.84
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.84f,
                )
                // H 20
                horizontalLineTo(x = 20.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
            }
            // M18 5 a1 1 0 0 0 -1 1 v5.57 M3 4 h8.13 a1 1 0 0 1 .99 .86 L13 11.25 M4 11 V4 m3 11z M8 10.1 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 5
                moveTo(x = 18.0f, y = 5.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 5.57
                verticalLineToRelative(dy = 5.57f)
                // M 3 4
                moveTo(x = 3.0f, y = 4.0f)
                // h 8.13
                horizontalLineToRelative(dx = 8.13f)
                // a 1 1 0 0 1 0.99 0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.99f,
                    dy1 = 0.86f,
                )
                // L 13 11.25
                lineTo(x = 13.0f, y = 11.25f)
                // M 4 11
                moveTo(x = 4.0f, y = 11.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // m 3 11z
                moveToRelative(dx = 3.0f, dy = 11.0f)
                close()
                // M 8 10.1
                moveTo(x = 8.0f, y = 10.1f)
                // V 4
                verticalLineTo(y = 4.0f)
            }
            // <circle cx="18.0" cy="18.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 18
                moveTo(x = 18.0f, y = 18.0f)
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
            // <circle cx="7.0" cy="15.0" radius="5.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 15
                moveTo(x = 7.0f, y = 15.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _tractor = it }
    }


@Suppress("ObjectPropertyName")
private var _tractor: ImageVector? = null
