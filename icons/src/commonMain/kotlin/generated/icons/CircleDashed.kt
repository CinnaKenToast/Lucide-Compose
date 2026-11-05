package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleDashed: ImageVector
    get() {
        val current = _circleDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CircleDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.1 2.18 a10 10 0 0 1 3.8 0 m0 19.64 a10 10 0 0 1 -3.8 0 m7.5 -18.1 a10 10 0 0 1 2.7 2.7 M2.18 13.9 a10 10 0 0 1 0 -3.8 m18.1 7.5 a10 10 0 0 1 -2.7 2.7 m4.24 -10.2 a10 10 0 0 1 0 3.8 M3.72 6.4 a10 10 0 0 1 2.7 -2.7 M6.4 20.28 a10 10 0 0 1 -2.69 -2.7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.1 2.18
                moveTo(x = 10.1f, y = 2.18f)
                // a 10 10 0 0 1 3.8 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.8f,
                    dy1 = 0.0f,
                )
                // m 0 19.64
                moveToRelative(dx = 0.0f, dy = 19.64f)
                // a 10 10 0 0 1 -3.8 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.8f,
                    dy1 = 0.0f,
                )
                // m 7.5 -18.1
                moveToRelative(dx = 7.5f, dy = -18.1f)
                // a 10 10 0 0 1 2.7 2.7
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.7f,
                    dy1 = 2.7f,
                )
                // M 2.18 13.9
                moveTo(x = 2.18f, y = 13.9f)
                // a 10 10 0 0 1 0 -3.8
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.8f,
                )
                // m 18.1 7.5
                moveToRelative(dx = 18.1f, dy = 7.5f)
                // a 10 10 0 0 1 -2.7 2.7
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.7f,
                    dy1 = 2.7f,
                )
                // m 4.24 -10.2
                moveToRelative(dx = 4.24f, dy = -10.2f)
                // a 10 10 0 0 1 0 3.8
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.8f,
                )
                // M 3.72 6.4
                moveTo(x = 3.72f, y = 6.4f)
                // a 10 10 0 0 1 2.7 -2.7
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.7f,
                    dy1 = -2.7f,
                )
                // M 6.4 20.28
                moveTo(x = 6.4f, y = 20.28f)
                // a 10 10 0 0 1 -2.69 -2.7
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.69f,
                    dy1 = -2.7f,
                )
            }
        }.build().also { _circleDashed = it }
    }

@Suppress("ObjectPropertyName")
private var _circleDashed: ImageVector? = null
