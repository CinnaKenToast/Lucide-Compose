package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Refrigerator: ImageVector
    get() {
        val current = _refrigerator
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Refrigerator",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 6 a4 4 0 0 1 4 -4 h6 a4 4 0 0 1 4 4 v14 a2 2 0 0 1 -2 2 H7 a2 2 0 0 1 -2 -2z m0 4 h14 m-4 -3 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 6
                moveTo(x = 5.0f, y = 6.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
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
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // m -4 -3
                moveToRelative(dx = -4.0f, dy = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _refrigerator = it }
    }

@Suppress("ObjectPropertyName")
private var _refrigerator: ImageVector? = null
