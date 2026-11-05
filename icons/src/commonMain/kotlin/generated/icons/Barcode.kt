package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Barcode: ImageVector
    get() {
        val current = _barcode
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Barcode",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 5 v14 M8 5 v14 m4 -14 v14 m5 -14 v14 m4 -14 v14
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
                // M 8 5
                moveTo(x = 8.0f, y = 5.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // m 4 -14
                moveToRelative(dx = 4.0f, dy = -14.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // m 5 -14
                moveToRelative(dx = 5.0f, dy = -14.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // m 4 -14
                moveToRelative(dx = 4.0f, dy = -14.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
            }
        }.build().also { _barcode = it }
    }

@Suppress("ObjectPropertyName")
private var _barcode: ImageVector? = null
