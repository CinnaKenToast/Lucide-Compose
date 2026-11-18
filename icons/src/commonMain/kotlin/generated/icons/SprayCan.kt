package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SprayCan: ImageVector
    get() {
        val current = _sprayCan
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SprayCan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 19 8 -3 M14 6 h-2 m6 2.17 V5 a1 1 0 0 0 -1 -1 h-2 a1 1 0 0 0 -1 1 v3.17 M20 11 l-8 3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 19
                moveTo(x = 12.0f, y = 19.0f)
                // l 8 -3
                lineToRelative(dx = 8.0f, dy = -3.0f)
                // M 14 6
                moveTo(x = 14.0f, y = 6.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 6 2.17
                moveToRelative(dx = 6.0f, dy = 2.17f)
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
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
                // v 3.17
                verticalLineToRelative(dy = 3.17f)
                // M 20 11
                moveTo(x = 20.0f, y = 11.0f)
                // l -8 3
                lineToRelative(dx = -8.0f, dy = 3.0f)
            }
            // M20 20 a2 2 0 0 1 -2 2 h-4 a2 2 0 0 1 -2 -2 v-9 a3 3 0 0 1 3 -3 h2 a3 3 0 0 1 3 3z M4 10z M4 2z M4 6z M8 4z M8 8z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 20
                moveTo(x = 20.0f, y = 20.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 3 3 0 0 1 3 3z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                close()
                // M 4 10z
                moveTo(x = 4.0f, y = 10.0f)
                close()
                // M 4 2z
                moveTo(x = 4.0f, y = 2.0f)
                close()
                // M 4 6z
                moveTo(x = 4.0f, y = 6.0f)
                close()
                // M 8 4z
                moveTo(x = 8.0f, y = 4.0f)
                close()
                // M 8 8z
                moveTo(x = 8.0f, y = 8.0f)
                close()
            }
        }.build().also { _sprayCan = it }
    }

@Suppress("ObjectPropertyName")
private var _sprayCan: ImageVector? = null
