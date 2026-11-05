package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Houses: ImageVector
    get() {
        val current = _houses
        if (current != null) return current

        return ImageVector.Builder(
            name = "Houses",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12.68 4.24 .83 -.71 a1.45 1.45 0 0 1 1.88 0 l5.1 4.36 A1.5 1.5 0 0 1 21 9 v6.55 a1.45 1.45 0 0 1 -1 1.38 m-4.52 -5.04 A1.5 1.5 0 0 1 16 13 v6.55 A1.45 1.45 0 0 1 14.55 21 H4.36 a1.45 1.45 0 0 1 -1.45 -1.45 V13 a1.5 1.5 0 0 1 .52 -1.11 l5.09 -4.37 a1.45 1.45 0 0 1 1.88 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.68 4.24
                moveTo(x = 12.68f, y = 4.24f)
                // l 0.83 -0.71
                lineToRelative(dx = 0.83f, dy = -0.71f)
                // a 1.45 1.45 0 0 1 1.88 0
                arcToRelative(
                    a = 1.45f,
                    b = 1.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.88f,
                    dy1 = 0.0f,
                )
                // l 5.1 4.36
                lineToRelative(dx = 5.1f, dy = 4.36f)
                // A 1.5 1.5 0 0 1 21 9
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 9.0f,
                )
                // v 6.55
                verticalLineToRelative(dy = 6.55f)
                // a 1.45 1.45 0 0 1 -1 1.38
                arcToRelative(
                    a = 1.45f,
                    b = 1.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.38f,
                )
                // m -4.52 -5.04
                moveToRelative(dx = -4.52f, dy = -5.04f)
                // A 1.5 1.5 0 0 1 16 13
                arcTo(
                    horizontalEllipseRadius = 1.5f,
                    verticalEllipseRadius = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 13.0f,
                )
                // v 6.55
                verticalLineToRelative(dy = 6.55f)
                // A 1.45 1.45 0 0 1 14.55 21
                arcTo(
                    horizontalEllipseRadius = 1.45f,
                    verticalEllipseRadius = 1.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 14.55f,
                    y1 = 21.0f,
                )
                // H 4.36
                horizontalLineTo(x = 4.36f)
                // a 1.45 1.45 0 0 1 -1.45 -1.45
                arcToRelative(
                    a = 1.45f,
                    b = 1.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.45f,
                    dy1 = -1.45f,
                )
                // V 13
                verticalLineTo(y = 13.0f)
                // a 1.5 1.5 0 0 1 0.52 -1.11
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.52f,
                    dy1 = -1.11f,
                )
                // l 5.09 -4.37
                lineToRelative(dx = 5.09f, dy = -4.37f)
                // a 1.45 1.45 0 0 1 1.88 0z
                arcToRelative(
                    a = 1.45f,
                    b = 1.45f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.88f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M7.41 20.55 v-4 a1 1 0 0 1 1 -1 h2 a1 1 0 0 1 1 1 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.41 20.55
                moveTo(x = 7.41f, y = 20.55f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
            }
        }.build().also { _houses = it }
    }


@Suppress("ObjectPropertyName")
private var _houses: ImageVector? = null
