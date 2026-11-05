package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CornerLeftUp: ImageVector
    get() {
        val current = _cornerLeftUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CornerLeftUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 9 9 4 4 9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 9
                moveTo(x = 14.0f, y = 9.0f)
                // L 9 4
                lineTo(x = 9.0f, y = 4.0f)
                // L 4 9
                lineTo(x = 4.0f, y = 9.0f)
            }
            // M20 20 h-7 a4 4 0 0 1 -4 -4 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 20
                moveTo(x = 20.0f, y = 20.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
            }
        }.build().also { _cornerLeftUp = it }
    }

@Suppress("ObjectPropertyName")
private var _cornerLeftUp: ImageVector? = null
