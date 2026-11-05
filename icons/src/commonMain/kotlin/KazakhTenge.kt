package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KazakhTenge: ImageVector
    get() {
        val current = _kazakhTenge
        if (current != null) return current

        return ImageVector.Builder(
            name = "KazakhTenge",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 8 v12 M6 4 h12 M6 8 h12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
            }
        }.build().also { _kazakhTenge = it }
    }


@Suppress("ObjectPropertyName")
private var _kazakhTenge: ImageVector? = null
