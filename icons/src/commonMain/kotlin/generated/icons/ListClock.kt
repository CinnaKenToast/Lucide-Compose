package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ListClock: ImageVector
    get() {
        val current = _listClock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ListClock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 13 v2.2 l1.6 1 M3 12 h3.46 M3 19 h3.83 M3 5 h18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 13
                moveTo(x = 16.0f, y = 13.0f)
                // v 2.2
                verticalLineToRelative(dy = 2.2f)
                // l 1.6 1
                lineToRelative(dx = 1.6f, dy = 1.0f)
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // h 3.46
                horizontalLineToRelative(dx = 3.46f)
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // h 3.83
                horizontalLineToRelative(dx = 3.83f)
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
            }
            // <circle cx="16.0" cy="15.0" radius="6.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 15
                moveTo(x = 16.0f, y = 15.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // a 6 6 0 1 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 6 6 0 1 1 -12 0z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _listClock = it }
    }

@Suppress("ObjectPropertyName")
private var _listClock: ImageVector? = null
