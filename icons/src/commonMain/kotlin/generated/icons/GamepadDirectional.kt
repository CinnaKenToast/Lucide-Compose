package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.GamepadDirectional: ImageVector
    get() {
        val current = _gamepadDirectional
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.GamepadDirectional",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11.15 15.85 a1.2 1.2 0 0 1 1.7 0 l1.56 1.56 A2 2 0 0 1 15 18.83 V21 a1 1 0 0 1 -1 1 h-4 a1 1 0 0 1 -1 -1 v-2.17 a2 2 0 0 1 .59 -1.42z M18.83 15 a2 2 0 0 1 -1.42 -.59 l-1.56 -1.56 a1.2 1.2 0 0 1 0 -1.7 l1.56 -1.56 A2 2 0 0 1 18.83 9 H21 a1 1 0 0 1 1 1 v4 a1 1 0 0 1 -1 1z M6.59 14.41 A2 2 0 0 1 5.17 15 H3 a1 1 0 0 1 -1 -1 v-4 a1 1 0 0 1 1 -1 h2.17 A2 2 0 0 1 6.6 9.59 l1.56 1.56 a1.2 1.2 0 0 1 0 1.7z M9 3 a1 1 0 0 1 1 -1 h4 a1 1 0 0 1 1 1 v2.17 a2 2 0 0 1 -.59 1.42 l-1.56 1.56 a1.2 1.2 0 0 1 -1.7 0 L9.59 6.59 A2 2 0 0 1 9 5.17z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11.15 15.85
                moveTo(x = 11.15f, y = 15.85f)
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
                // l 1.56 1.56
                lineToRelative(dx = 1.56f, dy = 1.56f)
                // A 2 2 0 0 1 15 18.83
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 18.83f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -2.17
                verticalLineToRelative(dy = -2.17f)
                // a 2 2 0 0 1 0.59 -1.42z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.59f,
                    dy1 = -1.42f,
                )
                close()
                // M 18.83 15
                moveTo(x = 18.83f, y = 15.0f)
                // a 2 2 0 0 1 -1.42 -0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.42f,
                    dy1 = -0.59f,
                )
                // l -1.56 -1.56
                lineToRelative(dx = -1.56f, dy = -1.56f)
                // a 1.2 1.2 0 0 1 0 -1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.7f,
                )
                // l 1.56 -1.56
                lineToRelative(dx = 1.56f, dy = -1.56f)
                // A 2 2 0 0 1 18.83 9
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.83f,
                    y1 = 9.0f,
                )
                // H 21
                horizontalLineTo(x = 21.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 1 1 0 0 1 -1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                close()
                // M 6.59 14.41
                moveTo(x = 6.59f, y = 14.41f)
                // A 2 2 0 0 1 5.17 15
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.17f,
                    y1 = 15.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 2.17
                horizontalLineToRelative(dx = 2.17f)
                // A 2 2 0 0 1 6.6 9.59
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.6f,
                    y1 = 9.59f,
                )
                // l 1.56 1.56
                lineToRelative(dx = 1.56f, dy = 1.56f)
                // a 1.2 1.2 0 0 1 0 1.7z
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                close()
                // M 9 3
                moveTo(x = 9.0f, y = 3.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 2.17
                verticalLineToRelative(dy = 2.17f)
                // a 2 2 0 0 1 -0.59 1.42
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.59f,
                    dy1 = 1.42f,
                )
                // l -1.56 1.56
                lineToRelative(dx = -1.56f, dy = 1.56f)
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
                // L 9.59 6.59
                lineTo(x = 9.59f, y = 6.59f)
                // A 2 2 0 0 1 9 5.17z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 5.17f,
                )
                close()
            }
        }.build().also { _gamepadDirectional = it }
    }

@Suppress("ObjectPropertyName")
private var _gamepadDirectional: ImageVector? = null
