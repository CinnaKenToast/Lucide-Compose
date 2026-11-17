package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Doghouse: ImageVector
    get() {
        val current = _doghouse
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Doghouse",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m2 9.72 8.82 -6.34 a2 2 0 0 1 2.36 0 L22 9.73
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 9.72
                moveTo(x = 2.0f, y = 9.72f)
                // l 8.82 -6.34
                lineToRelative(dx = 8.82f, dy = -6.34f)
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
                // L 22 9.73
                lineTo(x = 22.0f, y = 9.73f)
            }
            // m20 8.28 -1 10.9 A2 2 0 0 1 17 21 H7 a2 2 0 0 1 -2 -1.82 L4 8.28
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 8.28
                moveTo(x = 20.0f, y = 8.28f)
                // l -1 10.9
                lineToRelative(dx = -1.0f, dy = 10.9f)
                // A 2 2 0 0 1 17 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 17.0f,
                    y1 = 21.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 2 2 0 0 1 -2 -1.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -1.82f,
                )
                // L 4 8.28
                lineTo(x = 4.0f, y = 8.28f)
            }
            // M8.5 9.94 a7 7 0 0 1 7 0 M9 21 v-5 a3 3 0 0 1 6 0 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8.5 9.94
                moveTo(x = 8.5f, y = 9.94f)
                // a 7 7 0 0 1 7 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 0.0f,
                )
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 3 3 0 0 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
        }.build().also { _doghouse = it }
    }

@Suppress("ObjectPropertyName")
private var _doghouse: ImageVector? = null
