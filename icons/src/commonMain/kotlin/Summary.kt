package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Summary: ImageVector
    get() {
        val current = _summary
        if (current != null) return current

        return ImageVector.Builder(
            name = "Summary",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 4 H7 m11 12 3 3 -3 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 4
                moveTo(x = 15.0f, y = 4.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // m 11 12
                moveToRelative(dx = 11.0f, dy = 12.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
            }
            // M3 4 v13 a2 2 0 0 0 2 2 h16 M7 14 h7 M7 9 h12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 4
                moveTo(x = 3.0f, y = 4.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 7 14
                moveTo(x = 7.0f, y = 14.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // M 7 9
                moveTo(x = 7.0f, y = 9.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
            }
        }.build().also { _summary = it }
    }


@Suppress("ObjectPropertyName")
private var _summary: ImageVector? = null
