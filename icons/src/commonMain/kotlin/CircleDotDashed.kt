package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CircleDotDashed: ImageVector
    get() {
        val current = _circleDotDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "CircleDotDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.1 2.18 a10 10 0 0 1 3.8 0 m3.7 1.53 a10 10 0 0 1 2.69 2.7 m1.53 3.69 a10 10 0 0 1 0 3.8 m-1.53 3.7 a10 10 0 0 1 -2.7 2.69 m-3.69 1.53 a10 10 0 0 1 -3.8 0 m-3.7 -1.53 a10 10 0 0 1 -2.69 -2.7 M2.18 13.9 a10 10 0 0 1 0 -3.8 m1.53 -3.7 a10 10 0 0 1 2.7 -2.69
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
                // m 3.7 1.53
                moveToRelative(dx = 3.7f, dy = 1.53f)
                // a 10 10 0 0 1 2.69 2.7
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.69f,
                    dy1 = 2.7f,
                )
                // m 1.53 3.69
                moveToRelative(dx = 1.53f, dy = 3.69f)
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
                // m -1.53 3.7
                moveToRelative(dx = -1.53f, dy = 3.7f)
                // a 10 10 0 0 1 -2.7 2.69
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.7f,
                    dy1 = 2.69f,
                )
                // m -3.69 1.53
                moveToRelative(dx = -3.69f, dy = 1.53f)
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
                // m -3.7 -1.53
                moveToRelative(dx = -3.7f, dy = -1.53f)
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
                // m 1.53 -3.7
                moveToRelative(dx = 1.53f, dy = -3.7f)
                // a 10 10 0 0 1 2.7 -2.69
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.7f,
                    dy1 = -2.69f,
                )
            }
            // <circle cx="12.0" cy="12.0" radius="1.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _circleDotDashed = it }
    }


@Suppress("ObjectPropertyName")
private var _circleDotDashed: ImageVector? = null
