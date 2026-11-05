package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LocateOff: ImageVector
    get() {
        val current = _locateOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LocateOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 19 v3 m0 -20 v3 m6.89 8.24 a7 7 0 0 0 -8.13 -8.13 M19 12 h3 M2 12 h3 M2 2 l20 20 M7.05 7.05 a7 7 0 0 0 9.9 9.9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 19
                moveTo(x = 12.0f, y = 19.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 0 -20
                moveToRelative(dx = 0.0f, dy = -20.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 6.89 8.24
                moveToRelative(dx = 6.89f, dy = 8.24f)
                // a 7 7 0 0 0 -8.13 -8.13
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.13f,
                    dy1 = -8.13f,
                )
                // M 19 12
                moveTo(x = 19.0f, y = 12.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 7.05 7.05
                moveTo(x = 7.05f, y = 7.05f)
                // a 7 7 0 0 0 9.9 9.9
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.9f,
                    dy1 = 9.9f,
                )
            }
        }.build().also { _locateOff = it }
    }

@Suppress("ObjectPropertyName")
private var _locateOff: ImageVector? = null
