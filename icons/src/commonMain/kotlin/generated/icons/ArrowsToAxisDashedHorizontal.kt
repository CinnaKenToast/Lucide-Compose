package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowsToAxisDashedHorizontal: ImageVector
    get() {
        val current = _arrowsToAxisDashedHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowsToAxisDashedHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 12 H8 m4 10 v-6 m0 -8 V2 m3 17 -3 -3 -3 3 m6 -14 -3 3 -3 -3 m7 7 h-2 m8 0 h-2 M4 12 H2
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
                // m 4 10
                moveToRelative(dx = 4.0f, dy = 10.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // m 3 17
                moveToRelative(dx = 3.0f, dy = 17.0f)
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
                // m 7 7
                moveToRelative(dx = 7.0f, dy = 7.0f)
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
            }
        }.build().also { _arrowsToAxisDashedHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowsToAxisDashedHorizontal: ImageVector? = null
