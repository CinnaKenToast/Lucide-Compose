package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Type: ImageVector
    get() {
        val current = _type
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Type",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 4 v16 M4 7 V5 a1 1 0 0 1 1 -1 h14 a1 1 0 0 1 1 1 v2 M9 20 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 4
                moveTo(x = 12.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // M 4 7
                moveTo(x = 4.0f, y = 7.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 9 20
                moveTo(x = 9.0f, y = 20.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _type = it }
    }

@Suppress("ObjectPropertyName")
private var _type: ImageVector? = null
