package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TentTree: ImageVector
    get() {
        val current = _tentTree
        if (current != null) return current

        return ImageVector.Builder(
            name = "TentTree",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="4.0" cy="4.0" radius="2.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m14 5 3 -3 3 3 m-6 5 3 -3 3 3 m-3 4 V2 m0 12 H7 l-5 8 h20Z m-9 0 v8 m1 -8 5 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 5
                moveTo(x = 14.0f, y = 5.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // m -6 5
                moveToRelative(dx = -6.0f, dy = 5.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // m -3 4
                moveToRelative(dx = -3.0f, dy = 4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // m 0 12
                moveToRelative(dx = 0.0f, dy = 12.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
                // l -5 8
                lineToRelative(dx = -5.0f, dy = 8.0f)
                // h 20z
                horizontalLineToRelative(dx = 20.0f)
                close()
                // m -9 0
                moveToRelative(dx = -9.0f, dy = 0.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 1 -8
                moveToRelative(dx = 1.0f, dy = -8.0f)
                // l 5 8
                lineToRelative(dx = 5.0f, dy = 8.0f)
            }
        }.build().also { _tentTree = it }
    }


@Suppress("ObjectPropertyName")
private var _tentTree: ImageVector? = null
