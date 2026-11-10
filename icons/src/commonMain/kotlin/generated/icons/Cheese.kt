package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cheese: ImageVector
    get() {
        val current = _cheese
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Cheese",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 11 a3 3 0 0 1 -6 0 5 5 0 0 1 6 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 11
                moveTo(x = 14.0f, y = 11.0f)
                // a 3 3 0 0 1 -6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                // a 5 5 0 0 1 6 0
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
            }
            // M14.3 2.44 a1.6 1.6 0 0 1 1.45 -.1 l.28 .14 A10.3 10.3 0 0 1 22 11 v8 a2 2 0 0 1 -2 2 h-1.75 a.3 .3 0 0 1 -.26 -.25 2 2 0 0 0 -3.97 0 A.3 .3 0 0 1 13.75 21 H4 a2 2 0 0 1 -2 -2 v-.75 a.3 .3 0 0 1 .25 -.26 A2 2 0 0 0 2.2 14 .2 .2 0 0 1 2 13.8 v-2.68 a2 2 0 0 1 .95 -1.7 l6.06 -3.74 a.3 .3 0 0 1 .27 0 A2.5 2.5 0 0 0 13 3.5 V3.4 a.3 .3 0 0 1 .12 -.24z M22 11 h-8 m-6 0 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.3 2.44
                moveTo(x = 14.3f, y = 2.44f)
                // a 1.6 1.6 0 0 1 1.45 -0.1
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.45f,
                    dy1 = -0.1f,
                )
                // l 0.28 0.14
                lineToRelative(dx = 0.28f, dy = 0.14f)
                // A 10.3 10.3 0 0 1 22 11
                arcTo(
                    horizontalEllipseRadius = 10.3f,
                    verticalEllipseRadius = 10.3f,
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
                // h -1.75
                horizontalLineToRelative(dx = -1.75f)
                // a 0.3 0.3 0 0 1 -0.26 -0.25
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.26f,
                    dy1 = -0.25f,
                )
                // a 2 2 0 0 0 -3.97 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.97f,
                    dy1 = 0.0f,
                )
                // A 0.3 0.3 0 0 1 13.75 21
                arcTo(
                    horizontalEllipseRadius = 0.3f,
                    verticalEllipseRadius = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.75f,
                    y1 = 21.0f,
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
                // v -0.75
                verticalLineToRelative(dy = -0.75f)
                // a 0.3 0.3 0 0 1 0.25 -0.26
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.25f,
                    dy1 = -0.26f,
                )
                // A 2 2 0 0 0 2.2 14
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.2f,
                    y1 = 14.0f,
                )
                // A 0.2 0.2 0 0 1 2 13.8
                arcTo(
                    horizontalEllipseRadius = 0.2f,
                    verticalEllipseRadius = 0.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 13.8f,
                )
                // v -2.68
                verticalLineToRelative(dy = -2.68f)
                // a 2 2 0 0 1 0.95 -1.7
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.95f,
                    dy1 = -1.7f,
                )
                // l 6.06 -3.74
                lineToRelative(dx = 6.06f, dy = -3.74f)
                // a 0.3 0.3 0 0 1 0.27 0
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.27f,
                    dy1 = 0.0f,
                )
                // A 2.5 2.5 0 0 0 13 3.5
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 13.0f,
                    y1 = 3.5f,
                )
                // V 3.4
                verticalLineTo(y = 3.4f)
                // a 0.3 0.3 0 0 1 0.12 -0.24z
                arcToRelative(
                    a = 0.3f,
                    b = 0.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.12f,
                    dy1 = -0.24f,
                )
                close()
                // M 22 11
                moveTo(x = 22.0f, y = 11.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _cheese = it }
    }

@Suppress("ObjectPropertyName")
private var _cheese: ImageVector? = null
