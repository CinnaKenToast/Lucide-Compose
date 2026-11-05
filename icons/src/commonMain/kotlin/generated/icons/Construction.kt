package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Construction: ImageVector
    get() {
        val current = _construction
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Construction",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <rect width="20" height="8" rx="1.0" x="2.0" y="6.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 7
                moveTo(x = 2.0f, y = 7.0f)
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
                // h 18
                horizontalLineToRelative(dx = 18.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // h -18
                horizontalLineToRelative(dx = -18.0f)
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
            // M17 14 v7 M7 14 v7 M17 3 v3 M7 3 v3 m3 8 L2.3 6.3 M14 6 l7.7 7.7 M8 6 l8 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 14
                moveTo(x = 17.0f, y = 14.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // M 7 14
                moveTo(x = 7.0f, y = 14.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // M 17 3
                moveTo(x = 17.0f, y = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 7 3
                moveTo(x = 7.0f, y = 3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 3 8
                moveToRelative(dx = 3.0f, dy = 8.0f)
                // L 2.3 6.3
                lineTo(x = 2.3f, y = 6.3f)
                // M 14 6
                moveTo(x = 14.0f, y = 6.0f)
                // l 7.7 7.7
                lineToRelative(dx = 7.7f, dy = 7.7f)
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
                // l 8 8
                lineToRelative(dx = 8.0f, dy = 8.0f)
            }
        }.build().also { _construction = it }
    }

@Suppress("ObjectPropertyName")
private var _construction: ImageVector? = null
