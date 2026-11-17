package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowsFromAxisDashedHorizontal: ImageVector
    get() {
        val current = _arrowsFromAxisDashedHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowsFromAxisDashedHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 12 H8 m4 4 v6 m0 -20 v6 m4 4 h-2 m8 0 h-2 M4 12 H2 m7 7 3 3 3 -3 M9 5 l3 -3 3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 12
                moveTo(x = 10.0f, y = 12.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 0 -20
                moveToRelative(dx = 0.0f, dy = -20.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 4 4
                moveToRelative(dx = 4.0f, dy = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 7 7
                moveToRelative(dx = 7.0f, dy = 7.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // M 9 5
                moveTo(x = 9.0f, y = 5.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
            }
        }.build().also { _arrowsFromAxisDashedHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowsFromAxisDashedHorizontal: ImageVector? = null
