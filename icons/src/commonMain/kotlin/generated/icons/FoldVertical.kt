package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FoldVertical: ImageVector
    get() {
        val current = _foldVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FoldVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 v-6 m0 -8 V2 M4 12 H2 m8 0 H8 m8 0 h-2 m8 0 h-2 m-5 7 -3 -3 -3 3 m6 -14 -3 3 -3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m -5 7
                moveToRelative(dx = -5.0f, dy = 7.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // m 6 -14
                moveToRelative(dx = 6.0f, dy = -14.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
            }
        }.build().also { _foldVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _foldVertical: ImageVector? = null
