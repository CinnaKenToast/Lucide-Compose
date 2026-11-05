package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Frame: ImageVector
    get() {
        val current = _frame
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Frame",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <line x1="22.0" y1="6.0" x2="2.0" y2="6.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 6
                moveTo(x = 22.0f, y = 6.0f)
                // L 2 6
                lineTo(x = 2.0f, y = 6.0f)
            }
            // <line x1="22.0" y1="18.0" x2="2.0" y2="18.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 18
                moveTo(x = 22.0f, y = 18.0f)
                // L 2 18
                lineTo(x = 2.0f, y = 18.0f)
            }
            // <line x1="6.0" y1="2.0" x2="6.0" y2="22.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 2
                moveTo(x = 6.0f, y = 2.0f)
                // L 6 22
                lineTo(x = 6.0f, y = 22.0f)
            }
            // <line x1="18.0" y1="2.0" x2="18.0" y2="22.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 2
                moveTo(x = 18.0f, y = 2.0f)
                // L 18 22
                lineTo(x = 18.0f, y = 22.0f)
            }
        }.build().also { _frame = it }
    }

@Suppress("ObjectPropertyName")
private var _frame: ImageVector? = null
