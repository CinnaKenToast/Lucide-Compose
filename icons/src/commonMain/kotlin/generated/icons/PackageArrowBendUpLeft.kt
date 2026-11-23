package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PackageArrowBendUpLeft: ImageVector
    get() {
        val current = _packageArrowBendUpLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PackageArrowBendUpLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 15.34 V12 l8.71 -5 M17 22 l-3 -3 3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 15.34
                moveTo(x = 12.0f, y = 15.34f)
                // V 12
                verticalLineTo(y = 12.0f)
                // l 8.71 -5
                lineToRelative(dx = 8.71f, dy = -5.0f)
                // M 17 22
                moveTo(x = 17.0f, y = 22.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
            }
            // M21 15 V8 a2 2 0 0 0 -1 -1.73 l-7 -4 a2 2 0 0 0 -2 0 l-7 4 A2 2 0 0 0 3 8 v8 a2 2 0 0 0 1 1.73 l7 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 15
                moveTo(x = 21.0f, y = 15.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 0 -1 -1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.73f,
                )
                // l -7 -4
                lineToRelative(dx = -7.0f, dy = -4.0f)
                // a 2 2 0 0 0 -2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // l -7 4
                lineToRelative(dx = -7.0f, dy = 4.0f)
                // A 2 2 0 0 0 3 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 8.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 0 1 1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.73f,
                )
                // l 7 4
                lineToRelative(dx = 7.0f, dy = 4.0f)
            }
            // M22 22 v-1 a2 2 0 0 0 -2 -2 h-6 M3.29 7 12 12 M7.5 4.27 l9 5.15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 22
                moveTo(x = 22.0f, y = 22.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // M 3.29 7
                moveTo(x = 3.29f, y = 7.0f)
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // M 7.5 4.27
                moveTo(x = 7.5f, y = 4.27f)
                // l 9 5.15
                lineToRelative(dx = 9.0f, dy = 5.15f)
            }
        }.build().also { _packageArrowBendUpLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _packageArrowBendUpLeft: ImageVector? = null
