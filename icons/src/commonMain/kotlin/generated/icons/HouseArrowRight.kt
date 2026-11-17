package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HouseArrowRight: ImageVector
    get() {
        val current = _houseArrowRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HouseArrowRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.35 21 H5 a2 2 0 0 1 -2 -2 v-9 a2 2 0 0 1 .7 -1.53 l7 -6 a2 2 0 0 1 2.6 0 l7 6 A2 2 0 0 1 21 10 v2.34
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.35 21
                moveTo(x = 12.35f, y = 21.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // v -9
                verticalLineToRelative(dy = -9.0f)
                // a 2 2 0 0 1 0.7 -1.53
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.7f,
                    dy1 = -1.53f,
                )
                // l 7 -6
                lineToRelative(dx = 7.0f, dy = -6.0f)
                // a 2 2 0 0 1 2.6 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.6f,
                    dy1 = 0.0f,
                )
                // l 7 6
                lineToRelative(dx = 7.0f, dy = 6.0f)
                // A 2 2 0 0 1 21 10
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 10.0f,
                )
                // v 2.34
                verticalLineToRelative(dy = 2.34f)
            }
            // M14.87 12.5 A1 1 0 0 0 14 12 h-4 a1 1 0 0 0 -1 1 v8 m9 0 3 -3 h-6 m6 0 -3 -3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.87 12.5
                moveTo(x = 14.87f, y = 12.5f)
                // A 1 1 0 0 0 14 12
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 12.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 9 0
                moveToRelative(dx = 9.0f, dy = 0.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // m 6 0
                moveToRelative(dx = 6.0f, dy = 0.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
            }
        }.build().also { _houseArrowRight = it }
    }

@Suppress("ObjectPropertyName")
private var _houseArrowRight: ImageVector? = null
