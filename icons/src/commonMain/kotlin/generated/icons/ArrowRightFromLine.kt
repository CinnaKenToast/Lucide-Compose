package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowRightFromLine: ImageVector
    get() {
        val current = _arrowRightFromLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowRightFromLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 5 v14 m18 -7 H7 m8 6 6 -6 -6 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // m 18 -7
                moveToRelative(dx = 18.0f, dy = -7.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // m 8 6
                moveToRelative(dx = 8.0f, dy = 6.0f)
                // l 6 -6
                lineToRelative(dx = 6.0f, dy = -6.0f)
                // l -6 -6
                lineToRelative(dx = -6.0f, dy = -6.0f)
            }
        }.build().also { _arrowRightFromLine = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRightFromLine: ImageVector? = null
