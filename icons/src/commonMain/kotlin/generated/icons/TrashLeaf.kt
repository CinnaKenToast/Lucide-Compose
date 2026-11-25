package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TrashLeaf: ImageVector
    get() {
        val current = _trashLeaf
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TrashLeaf",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 11 v3.12 M12 22 c0 -1.33 .84 -2.38 2.31 -2.67 A6 6 0 0 0 17 18 m-3 -7z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 11
                moveTo(x = 10.0f, y = 11.0f)
                // v 3.12
                verticalLineToRelative(dy = 3.12f)
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // c 0 -1.33 0.84 -2.38 2.31 -2.67
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.33f,
                    dx2 = 0.84f,
                    dy2 = -2.38f,
                    dx3 = 2.31f,
                    dy3 = -2.67f,
                )
                // A 6 6 0 0 0 17 18
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 18.0f,
                )
                // m -3 -7z
                moveToRelative(dx = -3.0f, dy = -7.0f)
                close()
            }
            // M17 22 a4 4 0 0 1 -.85 -7.91 c2.73 -.59 3.62 -.88 4.57 -2 a.25 .25 0 0 1 .43 .06 A11 11 0 0 1 22 16.5 c0 3 -2.24 5.5 -5 5.5 m2 -16 v2.48 M3 6 h18 M8 22 H7 a2 2 0 0 1 -2 -2 V6 m3 0 V4 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 22
                moveTo(x = 17.0f, y = 22.0f)
                // a 4 4 0 0 1 -0.85 -7.91
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.85f,
                    dy1 = -7.91f,
                )
                // c 2.73 -0.59 3.62 -0.88 4.57 -2
                curveToRelative(
                    dx1 = 2.73f,
                    dy1 = -0.59f,
                    dx2 = 3.62f,
                    dy2 = -0.88f,
                    dx3 = 4.57f,
                    dy3 = -2.0f,
                )
                // a 0.25 0.25 0 0 1 0.43 0.06
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.43f,
                    dy1 = 0.06f,
                )
                // A 11 11 0 0 1 22 16.5
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 16.5f,
                )
                // c 0 3 -2.24 5.5 -5 5.5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.0f,
                    dx2 = -2.24f,
                    dy2 = 5.5f,
                    dx3 = -5.0f,
                    dy3 = 5.5f,
                )
                // m 2 -16
                moveToRelative(dx = 2.0f, dy = -16.0f)
                // v 2.48
                verticalLineToRelative(dy = 2.48f)
                // M 3 6
                moveTo(x = 3.0f, y = 6.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 8 22
                moveTo(x = 8.0f, y = 22.0f)
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
                // m 3 0
                moveToRelative(dx = 3.0f, dy = 0.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _trashLeaf = it }
    }

@Suppress("ObjectPropertyName")
private var _trashLeaf: ImageVector? = null
