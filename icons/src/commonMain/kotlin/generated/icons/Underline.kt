package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Underline: ImageVector
    get() {
        val current = _underline
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Underline",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 4 v6 a6 6 0 0 0 12 0 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 6 6 0 0 0 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
            }
            // <line x1="4.0" y1="20.0" x2="20.0" y2="20.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 20
                moveTo(x = 4.0f, y = 20.0f)
                // L 20 20
                lineTo(x = 20.0f, y = 20.0f)
            }
        }.build().also { _underline = it }
    }

@Suppress("ObjectPropertyName")
private var _underline: ImageVector? = null
