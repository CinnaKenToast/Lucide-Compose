package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquircleDashed: ImageVector
    get() {
        val current = _squircleDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquircleDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.77 3.04 a34 34 0 0 0 -3.54 0 m3.54 17.92 a33 33 0 0 1 -3.54 0 m9.95 -3.22 a4.6 4.6 0 0 1 -2.44 2.44 m2.44 -13.92 a4.6 4.6 0 0 0 -2.44 -2.44 m3.22 6.41 a33 33 0 0 1 0 3.54 M3.04 10.23 a34 34 0 0 0 0 3.54 m3.22 6.4 a4.6 4.6 0 0 1 -2.44 -2.43 M6.26 3.82 a4.6 4.6 0 0 0 -2.44 2.44
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.77 3.04
                moveTo(x = 13.77f, y = 3.04f)
                // a 34 34 0 0 0 -3.54 0
                arcToRelative(
                    a = 34.0f,
                    b = 34.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.54f,
                    dy1 = 0.0f,
                )
                // m 3.54 17.92
                moveToRelative(dx = 3.54f, dy = 17.92f)
                // a 33 33 0 0 1 -3.54 0
                arcToRelative(
                    a = 33.0f,
                    b = 33.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.54f,
                    dy1 = 0.0f,
                )
                // m 9.95 -3.22
                moveToRelative(dx = 9.95f, dy = -3.22f)
                // a 4.6 4.6 0 0 1 -2.44 2.44
                arcToRelative(
                    a = 4.6f,
                    b = 4.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.44f,
                    dy1 = 2.44f,
                )
                // m 2.44 -13.92
                moveToRelative(dx = 2.44f, dy = -13.92f)
                // a 4.6 4.6 0 0 0 -2.44 -2.44
                arcToRelative(
                    a = 4.6f,
                    b = 4.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.44f,
                    dy1 = -2.44f,
                )
                // m 3.22 6.41
                moveToRelative(dx = 3.22f, dy = 6.41f)
                // a 33 33 0 0 1 0 3.54
                arcToRelative(
                    a = 33.0f,
                    b = 33.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.54f,
                )
                // M 3.04 10.23
                moveTo(x = 3.04f, y = 10.23f)
                // a 34 34 0 0 0 0 3.54
                arcToRelative(
                    a = 34.0f,
                    b = 34.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.54f,
                )
                // m 3.22 6.4
                moveToRelative(dx = 3.22f, dy = 6.4f)
                // a 4.6 4.6 0 0 1 -2.44 -2.43
                arcToRelative(
                    a = 4.6f,
                    b = 4.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.44f,
                    dy1 = -2.43f,
                )
                // M 6.26 3.82
                moveTo(x = 6.26f, y = 3.82f)
                // a 4.6 4.6 0 0 0 -2.44 2.44
                arcToRelative(
                    a = 4.6f,
                    b = 4.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.44f,
                    dy1 = 2.44f,
                )
            }
        }.build().also { _squircleDashed = it }
    }

@Suppress("ObjectPropertyName")
private var _squircleDashed: ImageVector? = null
