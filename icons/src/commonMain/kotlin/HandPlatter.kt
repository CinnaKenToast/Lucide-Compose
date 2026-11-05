package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HandPlatter: ImageVector
    get() {
        val current = _handPlatter
        if (current != null) return current

        return ImageVector.Builder(
            name = "HandPlatter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 V2 m3.4 15.4 3.2 -2.8 a2 2 0 1 1 2.8 2.9 l-3.6 3.3 A3.6 3.6 0 0 1 15 22 h-4 c-1.1 0 -2.1 -.4 -2.8 -1.2 l-1.3 -1.46 A1 1 0 0 0 6.15 19 H5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // m 3.4 15.4
                moveToRelative(dx = 3.4f, dy = 15.4f)
                // l 3.2 -2.8
                lineToRelative(dx = 3.2f, dy = -2.8f)
                // a 2 2 0 1 1 2.8 2.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.8f,
                    dy1 = 2.9f,
                )
                // l -3.6 3.3
                lineToRelative(dx = -3.6f, dy = 3.3f)
                // A 3.6 3.6 0 0 1 15 22
                arcTo(
                    horizontalEllipseRadius = 3.6f,
                    verticalEllipseRadius = 3.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 22.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // c -1.1 0 -2.1 -0.4 -2.8 -1.2
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -2.1f,
                    dy2 = -0.4f,
                    dx3 = -2.8f,
                    dy3 = -1.2f,
                )
                // l -1.3 -1.46
                lineToRelative(dx = -1.3f, dy = -1.46f)
                // A 1 1 0 0 0 6.15 19
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.15f,
                    y1 = 19.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
            }
            // M2 14 h12 a2 2 0 0 1 0 4 h-2 m-8 -8 h16 M5 10 a7 7 0 0 1 14 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 14
                moveTo(x = 2.0f, y = 14.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // m -8 -8
                moveToRelative(dx = -8.0f, dy = -8.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // M 5 10
                moveTo(x = 5.0f, y = 10.0f)
                // a 7 7 0 0 1 14 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 14.0f,
                    dy1 = 0.0f,
                )
            }
            // M5 14 v6 a1 1 0 0 1 -1 1 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 14
                moveTo(x = 5.0f, y = 14.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
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
                // H 2
                horizontalLineTo(x = 2.0f)
            }
        }.build().also { _handPlatter = it }
    }


@Suppress("ObjectPropertyName")
private var _handPlatter: ImageVector? = null
