package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Transgender: ImageVector
    get() {
        val current = _transgender
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Transgender",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 16 v6 m2 -2 h-4 m8 -18 h4 v4 M2 2 l7.17 7.17 M2 5.36 V2 h3.36 M22 2 l-7.17 7.17 M8 5 5 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 2 -2
                moveToRelative(dx = 2.0f, dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // m 8 -18
                moveToRelative(dx = 8.0f, dy = -18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 7.17 7.17
                lineToRelative(dx = 7.17f, dy = 7.17f)
                // M 2 5.36
                moveTo(x = 2.0f, y = 5.36f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h 3.36
                horizontalLineToRelative(dx = 3.36f)
                // M 22 2
                moveTo(x = 22.0f, y = 2.0f)
                // l -7.17 7.17
                lineToRelative(dx = -7.17f, dy = 7.17f)
                // M 8 5
                moveTo(x = 8.0f, y = 5.0f)
                // L 5 8
                lineTo(x = 5.0f, y = 8.0f)
            }
            // <circle cx="12.0" cy="12.0" radius="4.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _transgender = it }
    }

@Suppress("ObjectPropertyName")
private var _transgender: ImageVector? = null
