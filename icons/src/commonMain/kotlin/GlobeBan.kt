package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GlobeBan: ImageVector
    get() {
        val current = _globeBan
        if (current != null) return current

        return ImageVector.Builder(
            name = "GlobeBan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 a14.5 14.5 0 0 1 -4 -10 c0 -2.86 1 -6.74 3 -9.95 A10 10 0 0 0 12 22 m3.17 -18.83 5.66 5.66 M15.86 14 A14.5 14.5 0 0 1 12 22 a10 10 0 0 0 9.95 -9 M2 12 h10.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // a 14.5 14.5 0 0 1 -4 -10
                arcToRelative(
                    a = 14.5f,
                    b = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -10.0f,
                )
                // c 0 -2.86 1 -6.74 3 -9.95
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.86f,
                    dx2 = 1.0f,
                    dy2 = -6.74f,
                    dx3 = 3.0f,
                    dy3 = -9.95f,
                )
                // A 10 10 0 0 0 12 22
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                // m 3.17 -18.83
                moveToRelative(dx = 3.17f, dy = -18.83f)
                // l 5.66 5.66
                lineToRelative(dx = 5.66f, dy = 5.66f)
                // M 15.86 14
                moveTo(x = 15.86f, y = 14.0f)
                // A 14.5 14.5 0 0 1 12 22
                arcTo(
                    horizontalEllipseRadius = 14.5f,
                    verticalEllipseRadius = 14.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 22.0f,
                )
                // a 10 10 0 0 0 9.95 -9
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 9.95f,
                    dy1 = -9.0f,
                )
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 10.5
                horizontalLineToRelative(dx = 10.5f)
            }
            // <circle cx="18.0" cy="6.0" radius="4.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 6
                moveTo(x = 18.0f, y = 6.0f)
                // m -4 0
                moveToRelative(dx = -4.0f, dy = 0.0f)
                // a 4 4 0 1 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // a 4 4 0 1 1 -8 0z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _globeBan = it }
    }


@Suppress("ObjectPropertyName")
private var _globeBan: ImageVector? = null
