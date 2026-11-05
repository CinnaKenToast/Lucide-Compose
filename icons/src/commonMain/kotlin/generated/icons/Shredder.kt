package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shredder: ImageVector
    get() {
        val current = _shredder
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Shredder",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 13 V4 a2 2 0 0 1 2 -2 h8 a2.4 2.4 0 0 1 1.7 .7 l3.6 3.6 A2.4 2.4 0 0 1 20 8 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 13
                moveTo(x = 4.0f, y = 13.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2.4 2.4 0 0 1 1.7 0.7
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.7f,
                )
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // A 2.4 2.4 0 0 1 20 8
                arcTo(
                    horizontalEllipseRadius = 2.4f,
                    verticalEllipseRadius = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 8.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
            // M14 2 v5 a1 1 0 0 0 1 1 h5 M10 22 v-5 m4 2 v-2 m4 3 v-3 M2 13 h20 M6 20 v-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // M 10 22
                moveTo(x = 10.0f, y = 22.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // m 4 2
                moveToRelative(dx = 4.0f, dy = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 4 3
                moveToRelative(dx = 4.0f, dy = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // M 2 13
                moveTo(x = 2.0f, y = 13.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 6 20
                moveTo(x = 6.0f, y = 20.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
            }
        }.build().also { _shredder = it }
    }

@Suppress("ObjectPropertyName")
private var _shredder: ImageVector? = null
