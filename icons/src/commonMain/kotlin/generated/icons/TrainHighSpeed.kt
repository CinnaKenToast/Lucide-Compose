package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TrainHighSpeed: ImageVector
    get() {
        val current = _trainHighSpeed
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TrainHighSpeed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 21 h20 M2 3 c4 0 11 0 18 7 2 2 4 7 -2 7 H2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 21
                moveTo(x = 2.0f, y = 21.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // M 2 3
                moveTo(x = 2.0f, y = 3.0f)
                // c 4 0 11 0 18 7
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 11.0f,
                    dy2 = 0.0f,
                    dx3 = 18.0f,
                    dy3 = 7.0f,
                )
                // c 2 2 4 7 -2 7
                curveToRelative(
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                    dx2 = 4.0f,
                    dy2 = 7.0f,
                    dx3 = -2.0f,
                    dy3 = 7.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
            }
            // M2 9 h3 a1 1 0 0 1 0 4 H2 m7 -9 c0 4 3 7 11 7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 9
                moveTo(x = 2.0f, y = 9.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // a 1 1 0 0 1 0 4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 7 -9
                moveToRelative(dx = 7.0f, dy = -9.0f)
                // c 0 4 3 7 11 7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = 3.0f,
                    dy2 = 7.0f,
                    dx3 = 11.0f,
                    dy3 = 7.0f,
                )
            }
        }.build().also { _trainHighSpeed = it }
    }

@Suppress("ObjectPropertyName")
private var _trainHighSpeed: ImageVector? = null
