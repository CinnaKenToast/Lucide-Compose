package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Tag: ImageVector
    get() {
        val current = _tag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Tag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.59 2.59 A2 2 0 0 0 11.17 2 H4 a2 2 0 0 0 -2 2 v7.17 a2 2 0 0 0 .59 1.42 l8.7 8.7 a2.43 2.43 0 0 0 3.42 0 l6.58 -6.58 a2.43 2.43 0 0 0 0 -3.42z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.59 2.59
                moveTo(x = 12.59f, y = 2.59f)
                // A 2 2 0 0 0 11.17 2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 11.17f,
                    y1 = 2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 7.17
                verticalLineToRelative(dy = 7.17f)
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
                // l 8.7 8.7
                lineToRelative(dx = 8.7f, dy = 8.7f)
                // a 2.43 2.43 0 0 0 3.42 0
                arcToRelative(
                    a = 2.43f,
                    b = 2.43f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.42f,
                    dy1 = 0.0f,
                )
                // l 6.58 -6.58
                lineToRelative(dx = 6.58f, dy = -6.58f)
                // a 2.43 2.43 0 0 0 0 -3.42z
                arcToRelative(
                    a = 2.43f,
                    b = 2.43f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.42f,
                )
                close()
            }
            // <circle cx="7.5" cy="7.5" radius="0.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.5 7.5
                moveTo(x = 7.5f, y = 7.5f)
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
        }.build().also { _tag = it }
    }

@Suppress("ObjectPropertyName")
private var _tag: ImageVector? = null
