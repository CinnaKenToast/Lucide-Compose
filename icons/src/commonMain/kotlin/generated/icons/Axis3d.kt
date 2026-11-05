package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Axis3d: ImageVector
    get() {
        val current = _axis3d
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Axis3d",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.5 10.5 15 9 M4 4 v15 a1 1 0 0 0 1 1 h15 M4.3 19.7 6 18 m3 -3 1.5 -1.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.5 10.5
                moveTo(x = 13.5f, y = 10.5f)
                // L 15 9
                lineTo(x = 15.0f, y = 9.0f)
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // v 15
                verticalLineToRelative(dy = 15.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // M 4.3 19.7
                moveTo(x = 4.3f, y = 19.7f)
                // L 6 18
                lineTo(x = 6.0f, y = 18.0f)
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // l 1.5 -1.5
                lineToRelative(dx = 1.5f, dy = -1.5f)
            }
        }.build().also { _axis3d = it }
    }

@Suppress("ObjectPropertyName")
private var _axis3d: ImageVector? = null
