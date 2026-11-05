package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Diff: ImageVector
    get() {
        val current = _diff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Diff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 v14 m-7 -7 h14 M5 21 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // m -7 -7
                moveToRelative(dx = -7.0f, dy = -7.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _diff = it }
    }

@Suppress("ObjectPropertyName")
private var _diff: ImageVector? = null
