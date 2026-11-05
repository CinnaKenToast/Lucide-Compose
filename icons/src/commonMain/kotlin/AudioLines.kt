package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AudioLines: ImageVector
    get() {
        val current = _audioLines
        if (current != null) return current

        return ImageVector.Builder(
            name = "AudioLines",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 10 v3 m4 -7 v11 m4 -14 v18 m4 -13 v7 m4 -10 v13 m4 -8 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 4 -7
                moveToRelative(dx = 4.0f, dy = -7.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // m 4 -14
                moveToRelative(dx = 4.0f, dy = -14.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // m 4 -13
                moveToRelative(dx = 4.0f, dy = -13.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // m 4 -10
                moveToRelative(dx = 4.0f, dy = -10.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // m 4 -8
                moveToRelative(dx = 4.0f, dy = -8.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _audioLines = it }
    }


@Suppress("ObjectPropertyName")
private var _audioLines: ImageVector? = null
