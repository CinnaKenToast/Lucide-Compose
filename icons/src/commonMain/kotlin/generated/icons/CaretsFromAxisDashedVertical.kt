package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CaretsFromAxisDashedVertical: ImageVector
    get() {
        val current = _caretsFromAxisDashedVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CaretsFromAxisDashedVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 14 v2 m0 4 v2 m0 -20 v2 m0 4 v2 m5.71 6.7 A1 1 0 0 1 16 16 V8 a1 1 0 0 1 1.71 -.7 l4 3.99 a1 1 0 0 1 0 1.42z m-11.42 0 A1 1 0 0 0 8 16 V8 A1 1 0 0 0 6.3 7.3 l-4 3.99 a1 1 0 0 0 0 1.42z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 14
                moveTo(x = 12.0f, y = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -20
                moveToRelative(dx = 0.0f, dy = -20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 5.71 6.7
                moveToRelative(dx = 5.71f, dy = 6.7f)
                // A 1 1 0 0 1 16 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 16.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 1 1.71 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.71f,
                    dy1 = -0.7f,
                )
                // l 4 3.99
                lineToRelative(dx = 4.0f, dy = 3.99f)
                // a 1 1 0 0 1 0 1.42z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                close()
                // m -11.42 0
                moveToRelative(dx = -11.42f, dy = 0.0f)
                // A 1 1 0 0 0 8 16
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 16.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // A 1 1 0 0 0 6.3 7.3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.3f,
                    y1 = 7.3f,
                )
                // l -4 3.99
                lineToRelative(dx = -4.0f, dy = 3.99f)
                // a 1 1 0 0 0 0 1.42z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.42f,
                )
                close()
            }
        }.build().also { _caretsFromAxisDashedVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _caretsFromAxisDashedVertical: ImageVector? = null
