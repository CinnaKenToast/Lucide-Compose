package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RefreshCw: ImageVector
    get() {
        val current = _refreshCw
        if (current != null) return current

        return ImageVector.Builder(
            name = "RefreshCw",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 12 a9 9 0 0 1 9 -9 9.8 9.8 0 0 1 6.74 2.74 L21 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 12
                moveTo(x = 3.0f, y = 12.0f)
                // a 9 9 0 0 1 9 -9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 9.0f,
                    dy1 = -9.0f,
                )
                // a 9.8 9.8 0 0 1 6.74 2.74
                arcToRelative(
                    a = 9.8f,
                    b = 9.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.74f,
                    dy1 = 2.74f,
                )
                // L 21 8
                lineTo(x = 21.0f, y = 8.0f)
            }
            // M21 3 v5 h-5 m5 4 a9 9 0 0 1 -9 9 9.8 9.8 0 0 1 -6.74 -2.74 L3 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 3
                moveTo(x = 21.0f, y = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // m 5 4
                moveToRelative(dx = 5.0f, dy = 4.0f)
                // a 9 9 0 0 1 -9 9
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -9.0f,
                    dy1 = 9.0f,
                )
                // a 9.8 9.8 0 0 1 -6.74 -2.74
                arcToRelative(
                    a = 9.8f,
                    b = 9.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.74f,
                    dy1 = -2.74f,
                )
                // L 3 16
                lineTo(x = 3.0f, y = 16.0f)
            }
            // M8 16 H3 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
        }.build().also { _refreshCw = it }
    }


@Suppress("ObjectPropertyName")
private var _refreshCw: ImageVector? = null
