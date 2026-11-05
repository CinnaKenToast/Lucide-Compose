package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EyeClosed: ImageVector
    get() {
        val current = _eyeClosed
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.EyeClosed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 18 -.72 -3.25 M2 8 a10.65 10.65 0 0 0 20 0 m-2 7 -1.73 -2.05 M4 15 l1.73 -2.05 M9 18 l.72 -3.25
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // l -0.72 -3.25
                lineToRelative(dx = -0.72f, dy = -3.25f)
                // M 2 8
                moveTo(x = 2.0f, y = 8.0f)
                // a 10.65 10.65 0 0 0 20 0
                arcToRelative(
                    a = 10.65f,
                    b = 10.65f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // m -2 7
                moveToRelative(dx = -2.0f, dy = 7.0f)
                // l -1.73 -2.05
                lineToRelative(dx = -1.73f, dy = -2.05f)
                // M 4 15
                moveTo(x = 4.0f, y = 15.0f)
                // l 1.73 -2.05
                lineToRelative(dx = 1.73f, dy = -2.05f)
                // M 9 18
                moveTo(x = 9.0f, y = 18.0f)
                // l 0.72 -3.25
                lineToRelative(dx = 0.72f, dy = -3.25f)
            }
        }.build().also { _eyeClosed = it }
    }

@Suppress("ObjectPropertyName")
private var _eyeClosed: ImageVector? = null
