package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Tags: ImageVector
    get() {
        val current = _tags
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Tags",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13.17 2 a2 2 0 0 1 1.42 .59 l6.7 6.7 a2.4 2.4 0 0 1 0 3.41 l-4.59 4.6 a2.4 2.4 0 0 1 -3.4 0 l-6.71 -6.71 A2 2 0 0 1 6 9.17 V3 a1 1 0 0 1 1 -1z M2 7 v6.17 a2 2 0 0 0 .59 1.42 l6.7 6.7 a2.4 2.4 0 0 0 3.2 .2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.17 2
                moveTo(x = 13.17f, y = 2.0f)
                // a 2 2 0 0 1 1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = 0.59f,
                )
                // l 6.7 6.7
                lineToRelative(dx = 6.7f, dy = 6.7f)
                // a 2.4 2.4 0 0 1 0 3.41
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.41f,
                )
                // l -4.59 4.6
                lineToRelative(dx = -4.59f, dy = 4.6f)
                // a 2.4 2.4 0 0 1 -3.4 0
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.4f,
                    dy1 = 0.0f,
                )
                // l -6.71 -6.71
                lineToRelative(dx = -6.71f, dy = -6.71f)
                // A 2 2 0 0 1 6 9.17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 9.17f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 1 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // M 2 7
                moveTo(x = 2.0f, y = 7.0f)
                // v 6.17
                verticalLineToRelative(dy = 6.17f)
                // a 2 2 0 0 0 0.59 1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.59f,
                    dy1 = 1.42f,
                )
                // l 6.7 6.7
                lineToRelative(dx = 6.7f, dy = 6.7f)
                // a 2.4 2.4 0 0 0 3.2 0.2
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.2f,
                    dy1 = 0.2f,
                )
            }
            // <circle cx="10.5" cy="6.5" radius="0.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.5 6.5
                moveTo(x = 10.5f, y = 6.5f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _tags = it }
    }

@Suppress("ObjectPropertyName")
private var _tags: ImageVector? = null
