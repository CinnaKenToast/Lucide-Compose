package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Link: ImageVector
    get() {
        val current = _link
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Link",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 13 a5 5 0 0 0 7.54 .54 l3 -3 a5 5 0 0 0 -7.07 -7.07 l-1.72 1.71
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // a 5 5 0 0 0 7.54 0.54
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.54f,
                    dy1 = 0.54f,
                )
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // a 5 5 0 0 0 -7.07 -7.07
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.07f,
                    dy1 = -7.07f,
                )
                // l -1.72 1.71
                lineToRelative(dx = -1.72f, dy = 1.71f)
            }
            // M14 11 a5 5 0 0 0 -7.54 -.54 l-3 3 a5 5 0 0 0 7.07 7.07 l1.71 -1.71
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 11
                moveTo(x = 14.0f, y = 11.0f)
                // a 5 5 0 0 0 -7.54 -0.54
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.54f,
                    dy1 = -0.54f,
                )
                // l -3 3
                lineToRelative(dx = -3.0f, dy = 3.0f)
                // a 5 5 0 0 0 7.07 7.07
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.07f,
                    dy1 = 7.07f,
                )
                // l 1.71 -1.71
                lineToRelative(dx = 1.71f, dy = -1.71f)
            }
        }.build().also { _link = it }
    }

@Suppress("ObjectPropertyName")
private var _link: ImageVector? = null
