package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RotateCcwKey: ImageVector
    get() {
        val current = _rotateCcwKey
        if (current != null) return current

        return ImageVector.Builder(
            name = "RotateCcwKey",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 7 v6 m0 -4 h2 M3 12 a9 9 0 1 0 9 -9 9.7 9.7 0 0 0 -6.74 2.74 L3 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 7
                moveTo(x = 12.0f, y = 7.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // a 9 9 0 1 0 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
                // a 9.7 9.7 0 0 0 -6.74 2.74
                arcToRelative(
                    a = 9.7f,
                    b = 9.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.74f,
                    dy1 = 2.74f,
                )
                // L 3 8
                lineTo(x = 3.0f, y = 8.0f)
            }
            // M3 3 v5 h5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
            }
            // <circle cx="12.0" cy="15.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
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
        }.build().also { _rotateCcwKey = it }
    }


@Suppress("ObjectPropertyName")
private var _rotateCcwKey: ImageVector? = null
