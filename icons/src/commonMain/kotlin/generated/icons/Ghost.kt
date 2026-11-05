package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Ghost: ImageVector
    get() {
        val current = _ghost
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Ghost",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 10 v1 m-7.47 9.47 a1.6 1.6 0 0 1 2.27 0 l1.06 1.06 a1.6 1.6 0 0 0 2.28 0 l1.05 -1.06 a1.6 1.6 0 0 1 2.28 0 l1.12 1.12 a1.4 1.4 0 0 0 2.41 -1 V10 a8 8 0 0 0 -16 0 v10.59 a1.4 1.4 0 0 0 2.41 1z M9 10 v1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 10
                moveTo(x = 15.0f, y = 10.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m -7.47 9.47
                moveToRelative(dx = -7.47f, dy = 9.47f)
                // a 1.6 1.6 0 0 1 2.27 0
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.27f,
                    dy1 = 0.0f,
                )
                // l 1.06 1.06
                lineToRelative(dx = 1.06f, dy = 1.06f)
                // a 1.6 1.6 0 0 0 2.28 0
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.28f,
                    dy1 = 0.0f,
                )
                // l 1.05 -1.06
                lineToRelative(dx = 1.05f, dy = -1.06f)
                // a 1.6 1.6 0 0 1 2.28 0
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.28f,
                    dy1 = 0.0f,
                )
                // l 1.12 1.12
                lineToRelative(dx = 1.12f, dy = 1.12f)
                // a 1.4 1.4 0 0 0 2.41 -1
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.41f,
                    dy1 = -1.0f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // a 8 8 0 0 0 -16 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -16.0f,
                    dy1 = 0.0f,
                )
                // v 10.59
                verticalLineToRelative(dy = 10.59f)
                // a 1.4 1.4 0 0 0 2.41 1z
                arcToRelative(
                    a = 1.4f,
                    b = 1.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.41f,
                    dy1 = 1.0f,
                )
                close()
                // M 9 10
                moveTo(x = 9.0f, y = 10.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
            }
        }.build().also { _ghost = it }
    }

@Suppress("ObjectPropertyName")
private var _ghost: ImageVector? = null
