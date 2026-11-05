package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.VenusAndMars: ImageVector
    get() {
        val current = _venusAndMars
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.VenusAndMars",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 20 h4 m-2 -4 v6 m5 -20 h4 v4 m0 -4 -5.46 5.46
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 20
                moveTo(x = 10.0f, y = 20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m -2 -4
                moveToRelative(dx = -2.0f, dy = -4.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 5 -20
                moveToRelative(dx = 5.0f, dy = -20.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0 -4
                moveToRelative(dx = 0.0f, dy = -4.0f)
                // l -5.46 5.46
                lineToRelative(dx = -5.46f, dy = 5.46f)
            }
            // <circle cx="12.0" cy="11.0" radius="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 11
                moveTo(x = 12.0f, y = 11.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // a 5 5 0 1 1 10 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 1 1 -10 0z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -10.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _venusAndMars = it }
    }

@Suppress("ObjectPropertyName")
private var _venusAndMars: ImageVector? = null
