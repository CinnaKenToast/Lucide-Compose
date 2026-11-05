package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareCenterlineDashedVertical: ImageVector
    get() {
        val current = _squareCenterlineDashedVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquareCenterlineDashedVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 8 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v3 m18 8 v3 a2 2 0 0 1 -2 2 H5 a2 2 0 0 1 -2 -2 v-3 m1 -4 H2 m8 0 H8 m8 0 h-2 m8 0 h-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 8
                moveTo(x = 21.0f, y = 8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 18 8
                moveToRelative(dx = 18.0f, dy = 8.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // m 1 -4
                moveToRelative(dx = 1.0f, dy = -4.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
            }
        }.build().also { _squareCenterlineDashedVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _squareCenterlineDashedVertical: ImageVector? = null
