package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Equal: ImageVector
    get() {
        val current = _equal
        if (current != null) return current

        return ImageVector.Builder(
            name = "Equal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <line x1="5.0" y1="9.0" x2="19.0" y2="9.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 9
                moveTo(x = 5.0f, y = 9.0f)
                // L 19 9
                lineTo(x = 19.0f, y = 9.0f)
            }
            // <line x1="5.0" y1="15.0" x2="19.0" y2="15.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 15
                moveTo(x = 5.0f, y = 15.0f)
                // L 19 15
                lineTo(x = 19.0f, y = 15.0f)
            }
        }.build().also { _equal = it }
    }


@Suppress("ObjectPropertyName")
private var _equal: ImageVector? = null
