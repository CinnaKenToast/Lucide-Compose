package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Grid3x3Off: ImageVector
    get() {
        val current = _grid3x3Off
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Grid3x3Off",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 9.34 V3 M2 2 l20 20 m-1.59 -1.59 A2 2 0 0 1 19 21 H5 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 .59 -1.41 M20.66 15 H21 m0 -6 h-6.34
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 9.34
                moveTo(x = 15.0f, y = 9.34f)
                // V 3
                verticalLineTo(y = 3.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m -1.59 -1.59
                moveToRelative(dx = -1.59f, dy = -1.59f)
                // A 2 2 0 0 1 19 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.0f,
                    y1 = 21.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 1 0.59 -1.41
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = -1.41f,
                )
                // M 20.66 15
                moveTo(x = 20.66f, y = 15.0f)
                // H 21
                horizontalLineTo(x = 21.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // h -6.34
                horizontalLineToRelative(dx = -6.34f)
            }
            // M3 15 h12 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 15
                moveTo(x = 3.0f, y = 15.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
            // M3 9 h6 v12 M8.66 3 H19 a2 2 0 0 1 2 2 v10.34 M9 3 v.34
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // M 8.66 3
                moveTo(x = 8.66f, y = 3.0f)
                // H 19
                horizontalLineTo(x = 19.0f)
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
                // v 10.34
                verticalLineToRelative(dy = 10.34f)
                // M 9 3
                moveTo(x = 9.0f, y = 3.0f)
                // v 0.34
                verticalLineToRelative(dy = 0.34f)
            }
        }.build().also { _grid3x3Off = it }
    }

@Suppress("ObjectPropertyName")
private var _grid3x3Off: ImageVector? = null
