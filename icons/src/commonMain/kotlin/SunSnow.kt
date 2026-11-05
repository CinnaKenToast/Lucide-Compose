package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SunSnow: ImageVector
    get() {
        val current = _sunSnow
        if (current != null) return current

        return ImageVector.Builder(
            name = "SunSnow",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 21 v-1 m0 -16 V3 m0 6 a3 3 0 0 0 0 6 m4 5 1.25 -2.5 L18 18 M14 4 l1.25 2.5 L18 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 21
                moveTo(x = 10.0f, y = 21.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // m 0 -16
                moveToRelative(dx = 0.0f, dy = -16.0f)
                // V 3
                verticalLineTo(y = 3.0f)
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // a 3 3 0 0 0 0 6
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 6.0f,
                )
                // m 4 5
                moveToRelative(dx = 4.0f, dy = 5.0f)
                // l 1.25 -2.5
                lineToRelative(dx = 1.25f, dy = -2.5f)
                // L 18 18
                lineTo(x = 18.0f, y = 18.0f)
                // M 14 4
                moveTo(x = 14.0f, y = 4.0f)
                // l 1.25 2.5
                lineToRelative(dx = 1.25f, dy = 2.5f)
                // L 18 6
                lineTo(x = 18.0f, y = 6.0f)
            }
            // m17 21 -3 -6 1.5 -3 H22 m-5 -9 -3 6 1.5 3 M2 12 h1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 21
                moveTo(x = 17.0f, y = 21.0f)
                // l -3 -6
                lineToRelative(dx = -3.0f, dy = -6.0f)
                // l 1.5 -3
                lineToRelative(dx = 1.5f, dy = -3.0f)
                // H 22
                horizontalLineTo(x = 22.0f)
                // m -5 -9
                moveToRelative(dx = -5.0f, dy = -9.0f)
                // l -3 6
                lineToRelative(dx = -3.0f, dy = 6.0f)
                // l 1.5 3
                lineToRelative(dx = 1.5f, dy = 3.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
            }
            // m20 10 -1.5 2 1.5 2 M3.64 18.36 l.7 -.7 m0 -11.32 -.7 -.7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 10
                moveTo(x = 20.0f, y = 10.0f)
                // l -1.5 2
                lineToRelative(dx = -1.5f, dy = 2.0f)
                // l 1.5 2
                lineToRelative(dx = 1.5f, dy = 2.0f)
                // M 3.64 18.36
                moveTo(x = 3.64f, y = 18.36f)
                // l 0.7 -0.7
                lineToRelative(dx = 0.7f, dy = -0.7f)
                // m 0 -11.32
                moveToRelative(dx = 0.0f, dy = -11.32f)
                // l -0.7 -0.7
                lineToRelative(dx = -0.7f, dy = -0.7f)
            }
        }.build().also { _sunSnow = it }
    }


@Suppress("ObjectPropertyName")
private var _sunSnow: ImageVector? = null
