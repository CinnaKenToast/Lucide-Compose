package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Hd: ImageVector
    get() {
        val current = _hd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Hd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 12 H6 m4 3 V9 m4 5.5 a.5 .5 0 0 0 .5 .5 h1 a2.5 2.5 0 0 0 2.5 -2.5 v-1 A2.5 2.5 0 0 0 15.5 9 h-1 A.5 .5 0 0 0 14 9.5z M6 15 V9
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 12
                moveTo(x = 10.0f, y = 12.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // m 4 3
                moveToRelative(dx = 4.0f, dy = 3.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // m 4 5.5
                moveToRelative(dx = 4.0f, dy = 5.5f)
                // a 0.5 0.5 0 0 0 0.5 0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = 0.5f,
                )
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // a 2.5 2.5 0 0 0 2.5 -2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.5f,
                    dy1 = -2.5f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // A 2.5 2.5 0 0 0 15.5 9
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.5f,
                    y1 = 9.0f,
                )
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // A 0.5 0.5 0 0 0 14 9.5z
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 9.5f,
                )
                close()
                // M 6 15
                moveTo(x = 6.0f, y = 15.0f)
                // V 9
                verticalLineTo(y = 9.0f)
            }
            // <rect width="20" height="14" rx="2.0" x="2.0" y="5.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 7
                moveTo(x = 2.0f, y = 7.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
                // h -16
                horizontalLineToRelative(dx = -16.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _hd = it }
    }

@Suppress("ObjectPropertyName")
private var _hd: ImageVector? = null
