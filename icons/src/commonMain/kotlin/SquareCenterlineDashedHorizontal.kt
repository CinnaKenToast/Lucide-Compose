package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SquareCenterlineDashedHorizontal: ImageVector
    get() {
        val current = _squareCenterlineDashedHorizontal
        if (current != null) return current

        return ImageVector.Builder(
            name = "SquareCenterlineDashedHorizontal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 3 H5 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h3 m8 -18 h3 a2 2 0 0 1 2 2 v14 a2 2 0 0 1 -2 2 h-3 m-4 -1 v2 m0 -8 v2 m0 -8 v2 m0 -8 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // m 8 -18
                moveToRelative(dx = 8.0f, dy = -18.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // m -4 -1
                moveToRelative(dx = -4.0f, dy = -1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _squareCenterlineDashedHorizontal = it }
    }


@Suppress("ObjectPropertyName")
private var _squareCenterlineDashedHorizontal: ImageVector? = null
