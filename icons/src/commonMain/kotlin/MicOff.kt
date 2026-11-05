package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MicOff: ImageVector
    get() {
        val current = _micOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "MicOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 19 v3 m3 -12.66 V5 a3 3 0 0 0 -5.68 -1.33 m7.63 13.28 A7 7 0 0 1 5 12 v-2 m13.89 3.23 A7 7 0 0 0 19 12 v-2 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 19
                moveTo(x = 12.0f, y = 19.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 3 -12.66
                moveToRelative(dx = 3.0f, dy = -12.66f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 3 3 0 0 0 -5.68 -1.33
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.68f,
                    dy1 = -1.33f,
                )
                // m 7.63 13.28
                moveToRelative(dx = 7.63f, dy = 13.28f)
                // A 7 7 0 0 1 5 12
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.0f,
                    y1 = 12.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 13.89 3.23
                moveToRelative(dx = 13.89f, dy = 3.23f)
                // A 7 7 0 0 0 19 12
                arcTo(
                    horizontalEllipseRadius = 7.0f,
                    verticalEllipseRadius = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 19.0f,
                    y1 = 12.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
            // M9 9 v3 a3 3 0 0 0 5.12 2.12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 3 3 0 0 0 5.12 2.12
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.12f,
                    dy1 = 2.12f,
                )
            }
        }.build().also { _micOff = it }
    }


@Suppress("ObjectPropertyName")
private var _micOff: ImageVector? = null
