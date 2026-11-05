package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ArrowBigUp: ImageVector
    get() {
        val current = _arrowBigUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ArrowBigUp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9 19 a1 1 0 0 0 1 1 h4 a1 1 0 0 0 1 -1 v-6 a1 1 0 0 1 1 -1 h3.3 a.7 .7 0 0 0 .5 -1.2 l-7.1 -7.1 a1 1 0 0 0 -1.4 0 l-7.1 7.1 A.7 .7 0 0 0 4.7 12 H8 a1 1 0 0 1 1 1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 19
                moveTo(x = 9.0f, y = 19.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
                // h 3.3
                horizontalLineToRelative(dx = 3.3f)
                // a 0.7 0.7 0 0 0 0.5 -1.2
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = -1.2f,
                )
                // l -7.1 -7.1
                lineToRelative(dx = -7.1f, dy = -7.1f)
                // a 1 1 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // l -7.1 7.1
                lineToRelative(dx = -7.1f, dy = 7.1f)
                // A 0.7 0.7 0 0 0 4.7 12
                arcTo(
                    horizontalEllipseRadius = 0.7f,
                    verticalEllipseRadius = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.7f,
                    y1 = 12.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 1 1 0 0 1 1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                close()
            }
        }.build().also { _arrowBigUp = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowBigUp: ImageVector? = null
