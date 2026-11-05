package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Birdhouse: ImageVector
    get() {
        val current = _birdhouse
        if (current != null) return current

        return ImageVector.Builder(
            name = "Birdhouse",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 18 v4 m5 -4 1.96 -11.47 M3 8 l7.82 -5.61 a2 2 0 0 1 2.36 0 L21 8 M4 18 h16 M7 18 5.04 6.53
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 5 -4
                moveToRelative(dx = 5.0f, dy = -4.0f)
                // l 1.96 -11.47
                lineToRelative(dx = 1.96f, dy = -11.47f)
                // M 3 8
                moveTo(x = 3.0f, y = 8.0f)
                // l 7.82 -5.61
                lineToRelative(dx = 7.82f, dy = -5.61f)
                // a 2 2 0 0 1 2.36 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.36f,
                    dy1 = 0.0f,
                )
                // L 21 8
                lineTo(x = 21.0f, y = 8.0f)
                // M 4 18
                moveTo(x = 4.0f, y = 18.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
                // L 5.04 6.53
                lineTo(x = 5.04f, y = 6.53f)
            }
            // <circle cx="12.0" cy="10.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _birdhouse = it }
    }


@Suppress("ObjectPropertyName")
private var _birdhouse: ImageVector? = null
