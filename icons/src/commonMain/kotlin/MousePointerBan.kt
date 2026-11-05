package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MousePointerBan: ImageVector
    get() {
        val current = _mousePointerBan
        if (current != null) return current

        return ImageVector.Builder(
            name = "MousePointerBan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2.03 2.68 a.5 .5 0 0 1 .65 -.65 l9 3.5 a.5 .5 0 0 1 -.03 .95 L8.2 7.54 A1 1 0 0 0 7.54 8.2 l-1.06 3.45 a.5 .5 0 0 1 -.95 .03z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2.03 2.68
                moveTo(x = 2.03f, y = 2.68f)
                // a 0.5 0.5 0 0 1 0.65 -0.65
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.65f,
                    dy1 = -0.65f,
                )
                // l 9 3.5
                lineToRelative(dx = 9.0f, dy = 3.5f)
                // a 0.5 0.5 0 0 1 -0.03 0.95
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.03f,
                    dy1 = 0.95f,
                )
                // L 8.2 7.54
                lineTo(x = 8.2f, y = 7.54f)
                // A 1 1 0 0 0 7.54 8.2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.54f,
                    y1 = 8.2f,
                )
                // l -1.06 3.45
                lineToRelative(dx = -1.06f, dy = 3.45f)
                // a 0.5 0.5 0 0 1 -0.95 0.03z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.95f,
                    dy1 = 0.03f,
                )
                close()
            }
            // <circle cx="16.0" cy="16.0" radius="6.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // a 6 6 0 1 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
                // a 6 6 0 1 1 -12 0z
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -12.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // m11.8 11.8 8.4 8.4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.8 11.8
                moveTo(x = 11.8f, y = 11.8f)
                // l 8.4 8.4
                lineToRelative(dx = 8.4f, dy = 8.4f)
            }
        }.build().also { _mousePointerBan = it }
    }


@Suppress("ObjectPropertyName")
private var _mousePointerBan: ImageVector? = null
