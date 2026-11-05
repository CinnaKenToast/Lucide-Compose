package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Timeline: ImageVector
    get() {
        val current = _timeline
        if (current != null) return current

        return ImageVector.Builder(
            name = "Timeline",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 12z M4 16z M4 20z M4 4z M4 8z m5.4 5.41 A2 2 0 0 0 10.83 14 H19 a1 1 0 0 0 1 -1 v-2 a1 1 0 0 0 -1 -1 h-8.17 a2 2 0 0 0 -1.42 .59 L8 12z m0 8 A2 2 0 0 0 10.83 22 H19 a1 1 0 0 0 1 -1 v-2 a1 1 0 0 0 -1 -1 h-8.17 a2 2 0 0 0 -1.42 .59 L8 20z m0 -16 A2 2 0 0 0 10.83 6 H19 a1 1 0 0 0 1 -1 V3 a1 1 0 0 0 -1 -1 h-8.17 A2 2 0 0 0 9.4 2.59 L8 4z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 12z
                moveTo(x = 4.0f, y = 12.0f)
                close()
                // M 4 16z
                moveTo(x = 4.0f, y = 16.0f)
                close()
                // M 4 20z
                moveTo(x = 4.0f, y = 20.0f)
                close()
                // M 4 4z
                moveTo(x = 4.0f, y = 4.0f)
                close()
                // M 4 8z
                moveTo(x = 4.0f, y = 8.0f)
                close()
                // m 5.4 5.41
                moveToRelative(dx = 5.4f, dy = 5.41f)
                // A 2 2 0 0 0 10.83 14
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.83f,
                    y1 = 14.0f,
                )
                // H 19
                horizontalLineTo(x = 19.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -8.17
                horizontalLineToRelative(dx = -8.17f)
                // a 2 2 0 0 0 -1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.59f,
                )
                // L 8 12z
                lineTo(x = 8.0f, y = 12.0f)
                close()
                // m 0 8
                moveToRelative(dx = 0.0f, dy = 8.0f)
                // A 2 2 0 0 0 10.83 22
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.83f,
                    y1 = 22.0f,
                )
                // H 19
                horizontalLineTo(x = 19.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -8.17
                horizontalLineToRelative(dx = -8.17f)
                // a 2 2 0 0 0 -1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.42f,
                    dy1 = 0.59f,
                )
                // L 8 20z
                lineTo(x = 8.0f, y = 20.0f)
                close()
                // m 0 -16
                moveToRelative(dx = 0.0f, dy = -16.0f)
                // A 2 2 0 0 0 10.83 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.83f,
                    y1 = 6.0f,
                )
                // H 19
                horizontalLineTo(x = 19.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // V 3
                verticalLineTo(y = 3.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -8.17
                horizontalLineToRelative(dx = -8.17f)
                // A 2 2 0 0 0 9.4 2.59
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.4f,
                    y1 = 2.59f,
                )
                // L 8 4z
                lineTo(x = 8.0f, y = 4.0f)
                close()
            }
        }.build().also { _timeline = it }
    }


@Suppress("ObjectPropertyName")
private var _timeline: ImageVector? = null
