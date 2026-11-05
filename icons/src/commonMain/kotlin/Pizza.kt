package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pizza: ImageVector
    get() {
        val current = _pizza
        if (current != null) return current

        return ImageVector.Builder(
            name = "Pizza",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 14 -1 1 m2.75 3.25 -1.25 1.42 m5.27 -14.02 A15.7 15.7 0 0 0 5.65 17.77 M18.8 9.3 a1 1 0 0 0 2.1 7.7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 14
                moveTo(x = 12.0f, y = 14.0f)
                // l -1 1
                lineToRelative(dx = -1.0f, dy = 1.0f)
                // m 2.75 3.25
                moveToRelative(dx = 2.75f, dy = 3.25f)
                // l -1.25 1.42
                lineToRelative(dx = -1.25f, dy = 1.42f)
                // m 5.27 -14.02
                moveToRelative(dx = 5.27f, dy = -14.02f)
                // A 15.7 15.7 0 0 0 5.65 17.77
                arcTo(
                    horizontalEllipseRadius = 15.7f,
                    verticalEllipseRadius = 15.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.65f,
                    y1 = 17.77f,
                )
                // M 18.8 9.3
                moveTo(x = 18.8f, y = 9.3f)
                // a 1 1 0 0 0 2.1 7.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.1f,
                    dy1 = 7.7f,
                )
            }
            // M21.96 20.73 a1 1 0 0 1 -1.23 1.23 l-18 -5 a1 1 0 0 1 -.7 -1.23 19.7 19.7 0 0 1 13.7 -13.7 1 1 0 0 1 1.23 .7z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21.96 20.73
                moveTo(x = 21.96f, y = 20.73f)
                // a 1 1 0 0 1 -1.23 1.23
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.23f,
                    dy1 = 1.23f,
                )
                // l -18 -5
                lineToRelative(dx = -18.0f, dy = -5.0f)
                // a 1 1 0 0 1 -0.7 -1.23
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = -1.23f,
                )
                // a 19.7 19.7 0 0 1 13.7 -13.7
                arcToRelative(
                    a = 19.7f,
                    b = 19.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 13.7f,
                    dy1 = -13.7f,
                )
                // a 1 1 0 0 1 1.23 0.7z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.23f,
                    dy1 = 0.7f,
                )
                close()
            }
        }.build().also { _pizza = it }
    }


@Suppress("ObjectPropertyName")
private var _pizza: ImageVector? = null
