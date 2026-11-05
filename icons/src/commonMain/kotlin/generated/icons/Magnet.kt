package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Magnet: ImageVector
    get() {
        val current = _magnet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Magnet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m12 15 4 4 M2.35 10.65 a1.2 1.2 0 0 0 0 1.7 l2.3 2.3 a1.2 1.2 0 0 0 1.7 0 l6.03 -6.03 a1 1 0 1 1 3 3 l-6.03 6.03 a1.2 1.2 0 0 0 0 1.7 l2.3 2.3 a1.2 1.2 0 0 0 1.7 0 l6.37 -6.37 a1 1 0 0 0 -11 -11z M5 8 l4 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 15
                moveTo(x = 12.0f, y = 15.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
                // M 2.35 10.65
                moveTo(x = 2.35f, y = 10.65f)
                // a 1.2 1.2 0 0 0 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l 2.3 2.3
                lineToRelative(dx = 2.3f, dy = 2.3f)
                // a 1.2 1.2 0 0 0 1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 6.03 -6.03
                lineToRelative(dx = 6.03f, dy = -6.03f)
                // a 1 1 0 1 1 3 3
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // l -6.03 6.03
                lineToRelative(dx = -6.03f, dy = 6.03f)
                // a 1.2 1.2 0 0 0 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l 2.3 2.3
                lineToRelative(dx = 2.3f, dy = 2.3f)
                // a 1.2 1.2 0 0 0 1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.7f,
                    dy1 = 0.0f,
                )
                // l 6.37 -6.37
                lineToRelative(dx = 6.37f, dy = -6.37f)
                // a 1 1 0 0 0 -11 -11z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -11.0f,
                    dy1 = -11.0f,
                )
                close()
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // l 4 4
                lineToRelative(dx = 4.0f, dy = 4.0f)
            }
        }.build().also { _magnet = it }
    }

@Suppress("ObjectPropertyName")
private var _magnet: ImageVector? = null
