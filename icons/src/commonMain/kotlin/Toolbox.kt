package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolbox: ImageVector
    get() {
        val current = _toolbox
        if (current != null) return current

        return ImageVector.Builder(
            name = "Toolbox",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16 12 v4 m0 -10 V4 a2 2 0 0 0 -2 -2 h-4 a2 2 0 0 0 -2 2 v2 m9 0 a2 2 0 0 1 1.41 .59 l3 3 A2 2 0 0 1 22 11 v8 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 v-8 a2 2 0 0 1 .59 -1.41 l3 -3 A2 2 0 0 1 7 6z M2 14 h20 M8 12 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 12
                moveTo(x = 16.0f, y = 12.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0 -10
                moveToRelative(dx = 0.0f, dy = -10.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 9 0
                moveToRelative(dx = 9.0f, dy = 0.0f)
                // a 2 2 0 0 1 1.41 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.41f,
                    dy1 = 0.59f,
                )
                // l 3 3
                lineToRelative(dx = 3.0f, dy = 3.0f)
                // A 2 2 0 0 1 22 11
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 11.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // a 2 2 0 0 1 0.59 -1.41
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = -1.41f,
                )
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // A 2 2 0 0 1 7 6z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 6.0f,
                )
                close()
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _toolbox = it }
    }


@Suppress("ObjectPropertyName")
private var _toolbox: ImageVector? = null
