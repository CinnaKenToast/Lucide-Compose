package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Blender: ImageVector
    get() {
        val current = _blender
        if (current != null) return current

        return ImageVector.Builder(
            name = "Blender",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 14 a2 2 0 0 0 -1.96 1.62 L5.02 20.8 A1 1 0 0 0 6 22 h12 a1 1 0 0 0 .98 -1.2 l-1.02 -5.18 A2 2 0 0 0 16 14z m9 -12 -1 12 m-8 0 L7 2 m.57 6.79 A5 5 0 0 0 12 8 a5 5 0 0 1 4.56 -.75 M19 2 H5 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 .69 1.5 M12 18z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 14
                moveTo(x = 8.0f, y = 14.0f)
                // a 2 2 0 0 0 -1.96 1.62
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.96f,
                    dy1 = 1.62f,
                )
                // L 5.02 20.8
                lineTo(x = 5.02f, y = 20.8f)
                // A 1 1 0 0 0 6 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.0f,
                    y1 = 22.0f,
                )
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 1 1 0 0 0 0.98 -1.2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.98f,
                    dy1 = -1.2f,
                )
                // l -1.02 -5.18
                lineToRelative(dx = -1.02f, dy = -5.18f)
                // A 2 2 0 0 0 16 14z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 14.0f,
                )
                close()
                // m 9 -12
                moveToRelative(dx = 9.0f, dy = -12.0f)
                // l -1 12
                lineToRelative(dx = -1.0f, dy = 12.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // L 7 2
                lineTo(x = 7.0f, y = 2.0f)
                // m 0.57 6.79
                moveToRelative(dx = 0.57f, dy = 6.79f)
                // A 5 5 0 0 0 12 8
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 8.0f,
                )
                // a 5 5 0 0 1 4.56 -0.75
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.56f,
                    dy1 = -0.75f,
                )
                // M 19 2
                moveTo(x = 19.0f, y = 2.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // a 2 2 0 0 0 0.69 1.5
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.69f,
                    dy1 = 1.5f,
                )
                // M 12 18z
                moveTo(x = 12.0f, y = 18.0f)
                close()
            }
        }.build().also { _blender = it }
    }


@Suppress("ObjectPropertyName")
private var _blender: ImageVector? = null
