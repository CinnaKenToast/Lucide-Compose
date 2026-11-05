package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ScanBox: ImageVector
    get() {
        val current = _scanBox
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ScanBox",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 v5.5 M17 3 h2 a2 2 0 0 1 2 2 v2 m0 10 v2 a2 2 0 0 1 -2 2 h-2 M3 7 V5 a2 2 0 0 1 2 -2 h2 m0 18 H5 a2 2 0 0 1 -2 -2 v-2 m4.26 -7.75 L12 12 l4.74 -2.75
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // v 5.5
                verticalLineToRelative(dy = 5.5f)
                // M 17 3
                moveTo(x = 17.0f, y = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 10
                moveToRelative(dx = 0.0f, dy = 10.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // M 3 7
                moveTo(x = 3.0f, y = 7.0f)
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 0 18
                moveToRelative(dx = 0.0f, dy = 18.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 4.26 -7.75
                moveToRelative(dx = 4.26f, dy = -7.75f)
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // l 4.74 -2.75
                lineToRelative(dx = 4.74f, dy = -2.75f)
            }
            // M8 8.51 a2 2 0 0 0 -1 1.73 v3.52 a2 2 0 0 0 1 1.73 l3 1.74 a2 2 0 0 0 2 0 l3 -1.74 a2 2 0 0 0 1 -1.73 v-3.52 a2 2 0 0 0 -1 -1.73 l-3 -1.74 a2 2 0 0 0 -1.89 -.06z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 8.51
                moveTo(x = 8.0f, y = 8.51f)
                // a 2 2 0 0 0 -1 1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.73f,
                )
                // v 3.52
                verticalLineToRelative(dy = 3.52f)
                // a 2 2 0 0 0 1 1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.73f,
                )
                // l 3 1.74
                lineToRelative(dx = 3.0f, dy = 1.74f)
                // a 2 2 0 0 0 2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // l 3 -1.74
                lineToRelative(dx = 3.0f, dy = -1.74f)
                // a 2 2 0 0 0 1 -1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.73f,
                )
                // v -3.52
                verticalLineToRelative(dy = -3.52f)
                // a 2 2 0 0 0 -1 -1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.73f,
                )
                // l -3 -1.74
                lineToRelative(dx = -3.0f, dy = -1.74f)
                // a 2 2 0 0 0 -1.89 -0.06z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.89f,
                    dy1 = -0.06f,
                )
                close()
            }
        }.build().also { _scanBox = it }
    }

@Suppress("ObjectPropertyName")
private var _scanBox: ImageVector? = null
