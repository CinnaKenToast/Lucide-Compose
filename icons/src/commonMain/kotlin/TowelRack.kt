package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TowelRack: ImageVector
    get() {
        val current = _towelRack
        if (current != null) return current

        return ImageVector.Builder(
            name = "TowelRack",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M22 7 h-2 M6.5 3 h11 A2.5 2.5 0 0 1 20 5.5 V20 a1 1 0 0 1 -1 1 h-9 a1 1 0 0 1 -1 -1 V5.5 a1 1 0 0 0 -5 0 V17 a1 1 0 0 0 1 1 h4 M9 7 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 7
                moveTo(x = 22.0f, y = 7.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // M 6.5 3
                moveTo(x = 6.5f, y = 3.0f)
                // h 11
                horizontalLineToRelative(dx = 11.0f)
                // A 2.5 2.5 0 0 1 20 5.5
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 5.5f,
                )
                // V 20
                verticalLineTo(y = 20.0f)
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
                // h -9
                horizontalLineToRelative(dx = -9.0f)
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
                // V 5.5
                verticalLineTo(y = 5.5f)
                // a 1 1 0 0 0 -5 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                // V 17
                verticalLineTo(y = 17.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // M 9 7
                moveTo(x = 9.0f, y = 7.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _towelRack = it }
    }


@Suppress("ObjectPropertyName")
private var _towelRack: ImageVector? = null
