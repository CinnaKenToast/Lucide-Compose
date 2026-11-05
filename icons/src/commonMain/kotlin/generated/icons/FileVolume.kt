package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FileVolume: ImageVector
    get() {
        val current = _fileVolume
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FileVolume",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M4 11.55 V4 a2 2 0 0 1 2 -2 h8 a2.4 2.4 0 0 1 1.7 .7 l3.6 3.6 A2.4 2.4 0 0 1 20 8 v12 a2 2 0 0 1 -2 2 h-1.95
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 11.55
                moveTo(x = 4.0f, y = 11.55f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // a 2.4 2.4 0 0 1 1.7 0.7
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.7f,
                )
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // A 2.4 2.4 0 0 1 20 8
                arcTo(
                    horizontalEllipseRadius = 2.4f,
                    verticalEllipseRadius = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 8.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // h -1.95
                horizontalLineToRelative(dx = -1.95f)
            }
            // M14 2 v5 a1 1 0 0 0 1 1 h5 m-8 7 a5 5 0 0 1 0 6 m-4 -6.5 a.5 .5 0 0 0 -.83 -.38 l-1.89 1.63 A1 1 0 0 1 4.63 16 H3.5 A.5 .5 0 0 0 3 16.5 v3 A.5 .5 0 0 0 3.5 20 h1.13 a1 1 0 0 1 .65 .25 l1.9 1.63 A.5 .5 0 0 0 8 21.5z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 2
                moveTo(x = 14.0f, y = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // m -8 7
                moveToRelative(dx = -8.0f, dy = 7.0f)
                // a 5 5 0 0 1 0 6
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // m -4 -6.5
                moveToRelative(dx = -4.0f, dy = -6.5f)
                // a 0.5 0.5 0 0 0 -0.83 -0.38
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.83f,
                    dy1 = -0.38f,
                )
                // l -1.89 1.63
                lineToRelative(dx = -1.89f, dy = 1.63f)
                // A 1 1 0 0 1 4.63 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.63f,
                    y1 = 16.0f,
                )
                // H 3.5
                horizontalLineTo(x = 3.5f)
                // A 0.5 0.5 0 0 0 3 16.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 16.5f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // A 0.5 0.5 0 0 0 3.5 20
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.5f,
                    y1 = 20.0f,
                )
                // h 1.13
                horizontalLineToRelative(dx = 1.13f)
                // a 1 1 0 0 1 0.65 0.25
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.65f,
                    dy1 = 0.25f,
                )
                // l 1.9 1.63
                lineToRelative(dx = 1.9f, dy = 1.63f)
                // A 0.5 0.5 0 0 0 8 21.5z
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 21.5f,
                )
                close()
            }
        }.build().also { _fileVolume = it }
    }

@Suppress("ObjectPropertyName")
private var _fileVolume: ImageVector? = null
