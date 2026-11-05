package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChevronLast: ImageVector
    get() {
        val current = _chevronLast
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChevronLast",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m7 18 6 -6 -6 -6 m10 0 v12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
                // m 10 0
                moveToRelative(dx = 10.0f, dy = 0.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
            }
        }.build().also { _chevronLast = it }
    }

@Suppress("ObjectPropertyName")
private var _chevronLast: ImageVector? = null
