package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Repeat: ImageVector
    get() {
        val current = _repeat
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Repeat",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m17 2 4 4 -4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 2
                moveTo(x = 17.0f, y = 2.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // l -4 4
                lineToRelative(dx = -4.0f, dy = 4.0f)
            }
            // M3 11 v-1 a4 4 0 0 1 4 -4 h14 M7 22 l-4 -4 4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 11
                moveTo(x = 3.0f, y = 11.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // M 7 22
                moveTo(x = 7.0f, y = 22.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
            }
            // M21 13 v1 a4 4 0 0 1 -4 4 H3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 13
                moveTo(x = 21.0f, y = 13.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
            }
        }.build().also { _repeat = it }
    }

@Suppress("ObjectPropertyName")
private var _repeat: ImageVector? = null
