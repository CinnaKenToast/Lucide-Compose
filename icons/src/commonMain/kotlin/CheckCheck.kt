package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckCheck: ImageVector
    get() {
        val current = _checkCheck
        if (current != null) return current

        return ImageVector.Builder(
            name = "CheckCheck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 6 7 17 l-5 -5 m20 -2 -7.5 7.5 L13 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // L 7 17
                lineTo(x = 7.0f, y = 17.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
                // m 20 -2
                moveToRelative(dx = 20.0f, dy = -2.0f)
                // l -7.5 7.5
                lineToRelative(dx = -7.5f, dy = 7.5f)
                // L 13 16
                lineTo(x = 13.0f, y = 16.0f)
            }
        }.build().also { _checkCheck = it }
    }


@Suppress("ObjectPropertyName")
private var _checkCheck: ImageVector? = null
