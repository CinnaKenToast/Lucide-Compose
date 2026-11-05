package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Factory: ImageVector
    get() {
        val current = _factory
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Factory",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 16z M16 16 h.01 M3 19 a2 2 0 0 0 2 2 h14 a2 2 0 0 0 2 -2 V8.5 a.5 .5 0 0 0 -.77 -.42 l-4.46 2.84 A.5 .5 0 0 1 15 10.5 v-2 a.5 .5 0 0 0 -.77 -.42 l-4.46 2.84 A.5 .5 0 0 1 9 10.5 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2z m5 -3z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 16z
                moveTo(x = 12.0f, y = 16.0f)
                close()
                // M 16 16
                moveTo(x = 16.0f, y = 16.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // V 8.5
                verticalLineTo(y = 8.5f)
                // a 0.5 0.5 0 0 0 -0.77 -0.42
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.77f,
                    dy1 = -0.42f,
                )
                // l -4.46 2.84
                lineToRelative(dx = -4.46f, dy = 2.84f)
                // A 0.5 0.5 0 0 1 15 10.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 10.5f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 0.5 0.5 0 0 0 -0.77 -0.42
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.77f,
                    dy1 = -0.42f,
                )
                // l -4.46 2.84
                lineToRelative(dx = -4.46f, dy = 2.84f)
                // A 0.5 0.5 0 0 1 9 10.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 10.5f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
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
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 0 -2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                close()
                // m 5 -3z
                moveToRelative(dx = 5.0f, dy = -3.0f)
                close()
            }
        }.build().also { _factory = it }
    }

@Suppress("ObjectPropertyName")
private var _factory: ImageVector? = null
