package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CodeXml: ImageVector
    get() {
        val current = _codeXml
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CodeXml",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m18 16 4 -4 -4 -4 M6 8 l-4 4 4 4 m8.5 -12 -5 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 16
                moveTo(x = 18.0f, y = 16.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // m 8.5 -12
                moveToRelative(dx = 8.5f, dy = -12.0f)
                // l -5 16
                lineToRelative(dx = -5.0f, dy = 16.0f)
            }
        }.build().also { _codeXml = it }
    }

@Suppress("ObjectPropertyName")
private var _codeXml: ImageVector? = null
