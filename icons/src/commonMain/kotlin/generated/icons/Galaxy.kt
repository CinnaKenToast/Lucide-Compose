package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Galaxy: ImageVector
    get() {
        val current = _galaxy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Galaxy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 15.1 a5.04 6.52 28.25 0 0 -8 -6.2 5.04 6.52 28.25 0 0 8 6.2 A11.88 7.29 -60.76 0 1 4.03 7 M17 21 h.01 M7 3z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 15.1
                moveTo(x = 16.0f, y = 15.1f)
                // a 5.04 6.52 28.25 0 0 -8 -6.2
                arcToRelative(
                    a = 5.04f,
                    b = 6.52f,
                    theta = 28.25f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.0f,
                    dy1 = -6.2f,
                )
                // a 5.04 6.52 28.25 0 0 8 6.2
                arcToRelative(
                    a = 5.04f,
                    b = 6.52f,
                    theta = 28.25f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.0f,
                    dy1 = 6.2f,
                )
                // A 11.88 7.29 -60.76 0 1 4.03 7
                arcTo(
                    horizontalEllipseRadius = 11.88f,
                    verticalEllipseRadius = 7.29f,
                    theta = -60.76f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.03f,
                    y1 = 7.0f,
                )
                // M 17 21
                moveTo(x = 17.0f, y = 21.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 7 3z
                moveTo(x = 7.0f, y = 3.0f)
                close()
            }
            // M8 8.9 A11.89 7.29 -60.76 0 1 19.97 17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 8.9
                moveTo(x = 8.0f, y = 8.9f)
                // A 11.89 7.29 -60.76 0 1 19.97 17
                arcTo(
                    horizontalEllipseRadius = 11.89f,
                    verticalEllipseRadius = 7.29f,
                    theta = -60.76f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 19.97f,
                    y1 = 17.0f,
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
        }.build().also { _galaxy = it }
    }

@Suppress("ObjectPropertyName")
private var _galaxy: ImageVector? = null
