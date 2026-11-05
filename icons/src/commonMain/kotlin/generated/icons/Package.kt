package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Package: ImageVector
    get() {
        val current = _package
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Package",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 21.73 a2 2 0 0 0 2 0 l7 -4 A2 2 0 0 0 21 16 V8 a2 2 0 0 0 -1 -1.73 l-7 -4 a2 2 0 0 0 -2 0 l-7 4 A2 2 0 0 0 3 8 v8 a2 2 0 0 0 1 1.73z M12 22 V12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 21.73
                moveTo(x = 11.0f, y = 21.73f)
                // a 2 2 0 0 0 2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // l 7 -4
                lineToRelative(dx = 7.0f, dy = -4.0f)
                // A 2 2 0 0 0 21 16
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 16.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 0 -1 -1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.73f,
                )
                // l -7 -4
                lineToRelative(dx = -7.0f, dy = -4.0f)
                // a 2 2 0 0 0 -2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // l -7 4
                lineToRelative(dx = -7.0f, dy = 4.0f)
                // A 2 2 0 0 0 3 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 8.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 0 1 1.73z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.73f,
                )
                close()
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // V 12
                verticalLineTo(y = 12.0f)
            }
            // <polyline points="3.29 7.0 12.0 12.0 20.71 7.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3.29 7
                moveTo(x = 3.29f, y = 7.0f)
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // L 20.71 7
                lineTo(x = 20.71f, y = 7.0f)
            }
            // m7.5 4.27 9 5.15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.5 4.27
                moveTo(x = 7.5f, y = 4.27f)
                // l 9 5.15
                lineToRelative(dx = 9.0f, dy = 5.15f)
            }
        }.build().also { _package = it }
    }

@Suppress("ObjectPropertyName")
private var _package: ImageVector? = null
