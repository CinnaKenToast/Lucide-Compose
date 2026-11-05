package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Flower: ImageVector
    get() {
        val current = _flower
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Flower",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="12.0" cy="12.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12 16.5 A4.5 4.5 0 1 1 7.5 12 4.5 4.5 0 1 1 12 7.5 a4.5 4.5 0 1 1 4.5 4.5 4.5 4.5 0 1 1 -4.5 4.5 m0 -9 V9 m-4.5 3 H9 m7.5 0 H15 m-3 4.5 V15 M8 8 l1.88 1.88 m4.24 0 L16 8 m-8 8 1.88 -1.88 m4.24 0 L16 16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 16.5
                moveTo(x = 12.0f, y = 16.5f)
                // A 4.5 4.5 0 1 1 7.5 12
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 7.5f,
                    y1 = 12.0f,
                )
                // A 4.5 4.5 0 1 1 12 7.5
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 7.5f,
                )
                // a 4.5 4.5 0 1 1 4.5 4.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.5f,
                    dy1 = 4.5f,
                )
                // a 4.5 4.5 0 1 1 -4.5 4.5
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.5f,
                    dy1 = 4.5f,
                )
                // m 0 -9
                moveToRelative(dx = 0.0f, dy = -9.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // m -4.5 3
                moveToRelative(dx = -4.5f, dy = 3.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // m 7.5 0
                moveToRelative(dx = 7.5f, dy = 0.0f)
                // H 15
                horizontalLineTo(x = 15.0f)
                // m -3 4.5
                moveToRelative(dx = -3.0f, dy = 4.5f)
                // V 15
                verticalLineTo(y = 15.0f)
                // M 8 8
                moveTo(x = 8.0f, y = 8.0f)
                // l 1.88 1.88
                lineToRelative(dx = 1.88f, dy = 1.88f)
                // m 4.24 0
                moveToRelative(dx = 4.24f, dy = 0.0f)
                // L 16 8
                lineTo(x = 16.0f, y = 8.0f)
                // m -8 8
                moveToRelative(dx = -8.0f, dy = 8.0f)
                // l 1.88 -1.88
                lineToRelative(dx = 1.88f, dy = -1.88f)
                // m 4.24 0
                moveToRelative(dx = 4.24f, dy = 0.0f)
                // L 16 16
                lineTo(x = 16.0f, y = 16.0f)
            }
        }.build().also { _flower = it }
    }

@Suppress("ObjectPropertyName")
private var _flower: ImageVector? = null
