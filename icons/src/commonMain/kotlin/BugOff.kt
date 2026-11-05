package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BugOff: ImageVector
    get() {
        val current = _bugOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "BugOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 20 v-8 m.66 -5 H14 a4 4 0 0 1 4 4 v1.34 m-3.88 -8.46 L16 2 m1.12 15.12 A6 6 0 0 1 6 14 v-3 a4 4 0 0 1 1.72 -3.29 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 20
                moveTo(x = 12.0f, y = 20.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // m 0.66 -5
                moveToRelative(dx = 0.66f, dy = -5.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // a 4 4 0 0 1 4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 4.0f,
                )
                // v 1.34
                verticalLineToRelative(dy = 1.34f)
                // m -3.88 -8.46
                moveToRelative(dx = -3.88f, dy = -8.46f)
                // L 16 2
                lineTo(x = 16.0f, y = 2.0f)
                // m 1.12 15.12
                moveToRelative(dx = 1.12f, dy = 15.12f)
                // A 6 6 0 0 1 6 14
                arcTo(
                    horizontalEllipseRadius = 6.0f,
                    verticalEllipseRadius = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 14.0f,
                )
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // a 4 4 0 0 1 1.72 -3.29
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.72f,
                    dy1 = -3.29f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
            // M21 5 a4 4 0 0 1 -3.55 3.97 M22 13 h-3.34 M3 21 a4 4 0 0 1 3.81 -4 M3 5 a4 4 0 0 0 3.55 3.97 M6 13 H2 M8 2 l1.88 1.88 M9.71 4.06 A3 3 0 0 1 15 6 v1.13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 5
                moveTo(x = 21.0f, y = 5.0f)
                // a 4 4 0 0 1 -3.55 3.97
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.55f,
                    dy1 = 3.97f,
                )
                // M 22 13
                moveTo(x = 22.0f, y = 13.0f)
                // h -3.34
                horizontalLineToRelative(dx = -3.34f)
                // M 3 21
                moveTo(x = 3.0f, y = 21.0f)
                // a 4 4 0 0 1 3.81 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.81f,
                    dy1 = -4.0f,
                )
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
                // a 4 4 0 0 0 3.55 3.97
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.55f,
                    dy1 = 3.97f,
                )
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // M 8 2
                moveTo(x = 8.0f, y = 2.0f)
                // l 1.88 1.88
                lineToRelative(dx = 1.88f, dy = 1.88f)
                // M 9.71 4.06
                moveTo(x = 9.71f, y = 4.06f)
                // A 3 3 0 0 1 15 6
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 6.0f,
                )
                // v 1.13
                verticalLineToRelative(dy = 1.13f)
            }
        }.build().also { _bugOff = it }
    }


@Suppress("ObjectPropertyName")
private var _bugOff: ImageVector? = null
