package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CartonOff: ImageVector
    get() {
        val current = _cartonOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "CartonOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 10 H5 v10 a2 2 0 0 0 2 2 h10 a2 2 0 0 0 2 -2 v-1 m-6 3 v-9 m.9 -4.76 L16 6 h-4.34
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // m -6 3
                moveToRelative(dx = -6.0f, dy = 3.0f)
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // m 0.9 -4.76
                moveToRelative(dx = 0.9f, dy = -4.76f)
                // L 16 6
                lineTo(x = 16.0f, y = 6.0f)
                // h -4.34
                horizontalLineToRelative(dx = -4.34f)
            }
            // M19 13.34 V10 a2 2 0 0 0 -.54 -1.37 L16 6 V3 a1 1 0 0 0 -1 -1 H9 a1 1 0 0 0 -.86 .49 M2 2 l20 20 M7.03 7.03 l-1.5 1.6 A2 2 0 0 0 5 10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 13.34
                moveTo(x = 19.0f, y = 13.34f)
                // V 10
                verticalLineTo(y = 10.0f)
                // a 2 2 0 0 0 -0.54 -1.37
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.54f,
                    dy1 = -1.37f,
                )
                // L 16 6
                lineTo(x = 16.0f, y = 6.0f)
                // V 3
                verticalLineTo(y = 3.0f)
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
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 1 1 0 0 0 -0.86 0.49
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.86f,
                    dy1 = 0.49f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 7.03 7.03
                moveTo(x = 7.03f, y = 7.03f)
                // l -1.5 1.6
                lineToRelative(dx = -1.5f, dy = 1.6f)
                // A 2 2 0 0 0 5 10
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 10.0f,
                )
            }
        }.build().also { _cartonOff = it }
    }


@Suppress("ObjectPropertyName")
private var _cartonOff: ImageVector? = null
