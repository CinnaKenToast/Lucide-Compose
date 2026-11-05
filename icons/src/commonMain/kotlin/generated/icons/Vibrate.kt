package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Vibrate: ImageVector
    get() {
        val current = _vibrate
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Vibrate",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 8 2 2 -2 2 2 2 -2 2 m20 -8 -2 2 2 2 -2 2 2 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // m 20 -8
                moveToRelative(dx = 20.0f, dy = -8.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
            }
            // <rect width="8" height="14" rx="1.0" x="8.0" y="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // a 1 1 0 0 1 -1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
        }.build().also { _vibrate = it }
    }

@Suppress("ObjectPropertyName")
private var _vibrate: ImageVector? = null
