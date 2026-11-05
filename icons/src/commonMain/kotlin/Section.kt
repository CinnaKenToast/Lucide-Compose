package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Section: ImageVector
    get() {
        val current = _section
        if (current != null) return current

        return ImageVector.Builder(
            name = "Section",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 5 a4 3 0 0 0 -8 0 c0 4 8 3 8 7 a4 3 0 0 1 -8 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 5
                moveTo(x = 16.0f, y = 5.0f)
                // a 4 3 0 0 0 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                // c 0 4 8 3 8 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 8.0f,
                    dy2 = 3.0f,
                    dx3 = 8.0f,
                    dy3 = 7.0f,
                )
                // a 4 3 0 0 1 -8 0
                arcToRelative(
                    a = 4.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
            }
            // M8 19 a4 3 0 0 0 8 0 c0 -4 -8 -3 -8 -7 a4 3 0 0 1 8 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 19
                moveTo(x = 8.0f, y = 19.0f)
                // a 4 3 0 0 0 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // c 0 -4 -8 -3 -8 -7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                    dx2 = -8.0f,
                    dy2 = -3.0f,
                    dx3 = -8.0f,
                    dy3 = -7.0f,
                )
                // a 4 3 0 0 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _section = it }
    }


@Suppress("ObjectPropertyName")
private var _section: ImageVector? = null
