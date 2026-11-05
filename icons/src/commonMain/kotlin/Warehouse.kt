package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Warehouse: ImageVector
    get() {
        val current = _warehouse
        if (current != null) return current

        return ImageVector.Builder(
            name = "Warehouse",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 21 V10 a1 1 0 0 0 -1 -1 H7 a1 1 0 0 0 -1 1 v11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 21
                moveTo(x = 18.0f, y = 21.0f)
                // V 10
                verticalLineTo(y = 10.0f)
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
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 11
                verticalLineToRelative(dy = 11.0f)
            }
            // M22 19 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 1.13 -1.8 l7.95 -3.98 a2 2 0 0 1 1.84 0 l7.95 3.98 A2 2 0 0 1 22 8z M6 13 h12 M6 17 h12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 19
                moveTo(x = 22.0f, y = 19.0f)
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
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 1 1.13 -1.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.13f,
                    dy1 = -1.8f,
                )
                // l 7.95 -3.98
                lineToRelative(dx = 7.95f, dy = -3.98f)
                // a 2 2 0 0 1 1.84 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.84f,
                    dy1 = 0.0f,
                )
                // l 7.95 3.98
                lineToRelative(dx = 7.95f, dy = 3.98f)
                // A 2 2 0 0 1 22 8z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 8.0f,
                )
                close()
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // M 6 17
                moveTo(x = 6.0f, y = 17.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
            }
        }.build().also { _warehouse = it }
    }


@Suppress("ObjectPropertyName")
private var _warehouse: ImageVector? = null
