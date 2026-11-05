package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Italic: ImageVector
    get() {
        val current = _italic
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Italic",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <line x1="19.0" y1="4.0" x2="10.0" y2="4.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 4
                moveTo(x = 19.0f, y = 4.0f)
                // L 10 4
                lineTo(x = 10.0f, y = 4.0f)
            }
            // <line x1="14.0" y1="20.0" x2="5.0" y2="20.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 20
                moveTo(x = 14.0f, y = 20.0f)
                // L 5 20
                lineTo(x = 5.0f, y = 20.0f)
            }
            // <line x1="15.0" y1="4.0" x2="9.0" y2="20.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 4
                moveTo(x = 15.0f, y = 4.0f)
                // L 9 20
                lineTo(x = 9.0f, y = 20.0f)
            }
        }.build().also { _italic = it }
    }

@Suppress("ObjectPropertyName")
private var _italic: ImageVector? = null
