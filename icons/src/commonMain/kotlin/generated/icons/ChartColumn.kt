package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ChartColumn: ImageVector
    get() {
        val current = _chartColumn
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ChartColumn",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 3 v16 a2 2 0 0 0 2 2 h16 m-3 -4 V9 m-5 8 V5 M8 17 v-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // m -3 -4
                moveToRelative(dx = -3.0f, dy = -4.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // m -5 8
                moveToRelative(dx = -5.0f, dy = 8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // M 8 17
                moveTo(x = 8.0f, y = 17.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
            }
        }.build().also { _chartColumn = it }
    }

@Suppress("ObjectPropertyName")
private var _chartColumn: ImageVector? = null
