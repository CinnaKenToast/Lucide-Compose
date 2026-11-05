package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PaintbrushVertical: ImageVector
    get() {
        val current = _paintbrushVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PaintbrushVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 2 v2 m4 -2 v4 m3 -4 a1 1 0 0 1 1 1 v9 H6 V3 a1 1 0 0 1 1 -1z M6 12 a1 1 0 0 0 -1 1 v1 a2 2 0 0 0 2 2 h2 a1 1 0 0 1 1 1 v2.9 a2 2 0 1 0 4 0 V17 a1 1 0 0 1 1 -1 h2 a2 2 0 0 0 2 -2 v-1 a1 1 0 0 0 -1 -1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 2
                moveTo(x = 10.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 3 -4
                moveToRelative(dx = 3.0f, dy = -4.0f)
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
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 1 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v 2.9
                verticalLineToRelative(dy = 2.9f)
                // a 2 2 0 1 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // V 17
                verticalLineTo(y = 17.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
            }
        }.build().also { _paintbrushVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _paintbrushVertical: ImageVector? = null
