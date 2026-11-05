package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Piano: ImageVector
    get() {
        val current = _piano
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Piano",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 13 v4 m4 -4 v4 m4 -4 v4 M2 13 h20 m0 -1.5 A3.5 3.5 0 0 0 18.5 8 a3.5 3.5 0 0 1 -3.17 -2 A7 7 0 0 0 2 9 v10 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2z M6 13 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 13
                moveTo(x = 10.0f, y = 13.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 4 -4
                moveToRelative(dx = 4.0f, dy = -4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // M 2 13
                moveTo(x = 2.0f, y = 13.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // m 0 -1.5
                moveToRelative(dx = 0.0f, dy = -1.5f)
                // A 3.5 3.5 0 0 0 18.5 8
                arcTo(
                    horizontalEllipseRadius = 3.5f,
                    verticalEllipseRadius = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.5f,
                    y1 = 8.0f,
                )
                // a 3.5 3.5 0 0 1 -3.17 -2
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.17f,
                    dy1 = -2.0f,
                )
                // A 7 7 0 0 0 2 9
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 9.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 0 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _piano = it }
    }

@Suppress("ObjectPropertyName")
private var _piano: ImageVector? = null
