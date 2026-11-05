package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowDownAZ: ImageVector
    get() {
        val current = _arrowDownAZ
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowDownAZ",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m3 16 4 4 4 -4 m-4 4 V4 m13 4 h-5 m0 2 V6.5 a2.5 2.5 0 0 1 5 0 V10 m-5 4 h5 l-5 6 h5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // m 13 4
                moveToRelative(dx = 13.0f, dy = 4.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // m 0 2
                moveToRelative(dx = 0.0f, dy = 2.0f)
                // V 6.5
                verticalLineTo(y = 6.5f)
                // a 2.5 2.5 0 0 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // m -5 4
                moveToRelative(dx = -5.0f, dy = 4.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // l -5 6
                lineToRelative(dx = -5.0f, dy = 6.0f)
                // h 5
                horizontalLineToRelative(dx = 5.0f)
            }
        }.build().also { _arrowDownAZ = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowDownAZ: ImageVector? = null
