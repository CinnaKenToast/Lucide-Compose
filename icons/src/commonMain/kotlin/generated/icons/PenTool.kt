package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PenTool: ImageVector
    get() {
        val current = _penTool
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PenTool",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m18 13 -.65 -4.74 A4 4 0 0 0 14.59 5 L5.43 2.1 A2 2 0 0 0 3.4 2.6 L2.59 3.4 a2 2 0 0 0 -.5 2.02 L5 14.59 a4 4 0 0 0 3.27 2.76 L13 18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 13
                moveTo(x = 18.0f, y = 13.0f)
                // l -0.65 -4.74
                lineToRelative(dx = -0.65f, dy = -4.74f)
                // A 4 4 0 0 0 14.59 5
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.59f,
                    y1 = 5.0f,
                )
                // L 5.43 2.1
                lineTo(x = 5.43f, y = 2.1f)
                // A 2 2 0 0 0 3.4 2.6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.4f,
                    y1 = 2.6f,
                )
                // L 2.59 3.4
                lineTo(x = 2.59f, y = 3.4f)
                // a 2 2 0 0 0 -0.5 2.02
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = 2.02f,
                )
                // L 5 14.59
                lineTo(x = 5.0f, y = 14.59f)
                // a 4 4 0 0 0 3.27 2.76
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.27f,
                    dy1 = 2.76f,
                )
                // L 13 18
                lineTo(x = 13.0f, y = 18.0f)
            }
            // M18.65 12.35 a1.2 1.2 0 0 1 1.7 0 l1.3 1.3 a1.2 1.2 0 0 1 0 1.7 l-6.3 6.3 a1.2 1.2 0 0 1 -1.7 0 l-1.3 -1.3 a1.2 1.2 0 0 1 0 -1.7z M3 3 l6.59 6.59
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.65 12.35
                moveTo(x = 18.65f, y = 12.35f)
                // a 1.2 1.2 0 0 1 1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 1.3 1.3
                lineToRelative(dx = 1.3f, dy = 1.3f)
                // a 1.2 1.2 0 0 1 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l -6.3 6.3
                lineToRelative(dx = -6.3f, dy = 6.3f)
                // a 1.2 1.2 0 0 1 -1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // l -1.3 -1.3
                lineToRelative(dx = -1.3f, dy = -1.3f)
                // a 1.2 1.2 0 0 1 0 -1.7z
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.7f,
                )
                close()
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // l 6.59 6.59
                lineToRelative(dx = 6.59f, dy = 6.59f)
            }
            // <circle cx="11.0" cy="11.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 11
                moveTo(x = 11.0f, y = 11.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _penTool = it }
    }

@Suppress("ObjectPropertyName")
private var _penTool: ImageVector? = null
