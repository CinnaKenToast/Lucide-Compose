package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FireExtinguisher: ImageVector
    get() {
        val current = _fireExtinguisher
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FireExtinguisher",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 6.5 V3 a1 1 0 0 0 -1 -1 h-2 a1 1 0 0 0 -1 1 v3.5 M9 18 h8 m1 -15 h-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 6.5
                moveTo(x = 15.0f, y = 6.5f)
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 3.5
                verticalLineToRelative(dy = 3.5f)
                // M 9 18
                moveTo(x = 9.0f, y = 18.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m 1 -15
                moveToRelative(dx = 1.0f, dy = -15.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
            }
            // M11 3 a6 6 0 0 0 -6 6 v11 m0 -7 h4 m8 -3 a4 4 0 0 0 -8 0 v10 a2 2 0 0 0 2 2 h4 a2 2 0 0 0 2 -2Z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 3
                moveTo(x = 11.0f, y = 3.0f)
                // a 6 6 0 0 0 -6 6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = 6.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 8 -3
                moveToRelative(dx = 8.0f, dy = -3.0f)
                // a 4 4 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 0 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _fireExtinguisher = it }
    }

@Suppress("ObjectPropertyName")
private var _fireExtinguisher: ImageVector? = null
