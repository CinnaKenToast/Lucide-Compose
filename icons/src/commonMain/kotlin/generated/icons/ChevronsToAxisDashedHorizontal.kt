package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChevronsToAxisDashedHorizontal: ImageVector
    get() {
        val current = _chevronsToAxisDashedHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChevronsToAxisDashedHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 12 H8 m8 0 h-2 m2 9 -4 -4 -4 4 m8 -18 -4 4 -4 -4 m14 9 h-2 M4 12 H2
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
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 2 9
                moveToRelative(dx = 2.0f, dy = 9.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // m 8 -18
                moveToRelative(dx = 8.0f, dy = -18.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // m 14 9
                moveToRelative(dx = 14.0f, dy = 9.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // M 4 12
                moveTo(x = 4.0f, y = 12.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _chevronsToAxisDashedHorizontal = it }
    }

@Suppress("ObjectPropertyName")
private var _chevronsToAxisDashedHorizontal: ImageVector? = null
