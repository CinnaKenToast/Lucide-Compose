package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SearchCode: ImageVector
    get() {
        val current = _searchCode
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SearchCode",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m13 13.5 2 -2.5 -2 -2.5 M21 21 l-4.3 -4.3 M9 8.5 7 11 l2 2.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 13.5
                moveTo(x = 13.0f, y = 13.5f)
                // l 2 -2.5
                lineToRelative(dx = 2.0f, dy = -2.5f)
                // l -2 -2.5
                lineToRelative(dx = -2.0f, dy = -2.5f)
                // M 21 21
                moveTo(x = 21.0f, y = 21.0f)
                // l -4.3 -4.3
                lineToRelative(dx = -4.3f, dy = -4.3f)
                // M 9 8.5
                moveTo(x = 9.0f, y = 8.5f)
                // L 7 11
                lineTo(x = 7.0f, y = 11.0f)
                // l 2 2.5
                lineToRelative(dx = 2.0f, dy = 2.5f)
            }
            // <circle cx="11.0" cy="11.0" radius="8.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 11
                moveTo(x = 11.0f, y = 11.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // a 8 8 0 1 1 16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 16.0f,
                    dy1 = 0.0f,
                )
                // a 8 8 0 1 1 -16 0z
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _searchCode = it }
    }

@Suppress("ObjectPropertyName")
private var _searchCode: ImageVector? = null
