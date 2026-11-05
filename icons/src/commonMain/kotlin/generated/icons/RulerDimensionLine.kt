package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.RulerDimensionLine: ImageVector
    get() {
        val current = _rulerDimensionLine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.RulerDimensionLine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 15 v-3 m4 3 v-3 m4 3 v-3 M2 8 V4 m20 2 H2 m20 2 V4 M6 15 v-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 15
                moveTo(x = 10.0f, y = 15.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // m 4 3
                moveToRelative(dx = 4.0f, dy = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // m 4 3
                moveToRelative(dx = 4.0f, dy = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // m 20 2
                moveToRelative(dx = 20.0f, dy = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 20 2
                moveToRelative(dx = 20.0f, dy = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // M 6 15
                moveTo(x = 6.0f, y = 15.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
            }
            // <rect width="20" height="8" rx="2.0" x="2.0" y="12.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
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
                // h -16
                horizontalLineToRelative(dx = -16.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _rulerDimensionLine = it }
    }

@Suppress("ObjectPropertyName")
private var _rulerDimensionLine: ImageVector? = null
