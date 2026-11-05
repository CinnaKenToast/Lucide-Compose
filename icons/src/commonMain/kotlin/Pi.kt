package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pi: ImageVector
    get() {
        val current = _pi
        if (current != null) return current

        return ImageVector.Builder(
            name = "Pi",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <line x1="9.0" y1="4.0" x2="9.0" y2="20.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
                // L 9 20
                lineTo(x = 9.0f, y = 20.0f)
            }
            // M4 7 c0 -1.7 1.3 -3 3 -3 h13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 7
                moveTo(x = 4.0f, y = 7.0f)
                // c 0 -1.7 1.3 -3 3 -3
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.7f,
                    dx2 = 1.3f,
                    dy2 = -3.0f,
                    dx3 = 3.0f,
                    dy3 = -3.0f,
                )
                // h 13
                horizontalLineToRelative(dx = 13.0f)
            }
            // M18 20 c-1.7 0 -3 -1.3 -3 -3 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 20
                moveTo(x = 18.0f, y = 20.0f)
                // c -1.7 0 -3 -1.3 -3 -3
                curveToRelative(
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                    dx2 = -3.0f,
                    dy2 = -1.3f,
                    dx3 = -3.0f,
                    dy3 = -3.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
            }
        }.build().also { _pi = it }
    }


@Suppress("ObjectPropertyName")
private var _pi: ImageVector? = null
