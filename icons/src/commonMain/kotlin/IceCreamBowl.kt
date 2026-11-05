package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IceCreamBowl: ImageVector
    get() {
        val current = _iceCreamBowl
        if (current != null) return current

        return ImageVector.Builder(
            name = "IceCreamBowl",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 17 c5 0 8 -2.69 8 -6 H4 c0 3.31 3 6 8 6 m-4 4 h8 m-4 -3 v3 M5.14 11 a3.5 3.5 0 1 1 6.71 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 17
                moveTo(x = 12.0f, y = 17.0f)
                // c 5 0 8 -2.69 8 -6
                curveToRelative(
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                    dx2 = 8.0f,
                    dy2 = -2.69f,
                    dx3 = 8.0f,
                    dy3 = -6.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // c 0 3.31 3 6 8 6
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 3.31f,
                    dx2 = 3.0f,
                    dy2 = 6.0f,
                    dx3 = 8.0f,
                    dy3 = 6.0f,
                )
                // m -4 4
                moveToRelative(dx = -4.0f, dy = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -4 -3
                moveToRelative(dx = -4.0f, dy = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // M 5.14 11
                moveTo(x = 5.14f, y = 11.0f)
                // a 3.5 3.5 0 1 1 6.71 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.71f,
                    dy1 = 0.0f,
                )
            }
            // M12.14 11 a3.5 3.5 0 1 1 6.71 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.14 11
                moveTo(x = 12.14f, y = 11.0f)
                // a 3.5 3.5 0 1 1 6.71 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.71f,
                    dy1 = 0.0f,
                )
            }
            // M15.5 6.5 a3.5 3.5 0 1 0 -7 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.5 6.5
                moveTo(x = 15.5f, y = 6.5f)
                // a 3.5 3.5 0 1 0 -7 0
                arcToRelative(
                    a = 3.5f,
                    b = 3.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _iceCreamBowl = it }
    }


@Suppress("ObjectPropertyName")
private var _iceCreamBowl: ImageVector? = null
