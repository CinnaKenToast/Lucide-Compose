package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Satellite: ImageVector
    get() {
        val current = _satellite
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Satellite",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m13.5 6.5 -3.15 -3.15 a1.2 1.2 0 0 0 -1.7 0 l-2.3 2.3 a1.2 1.2 0 0 0 0 1.7 L9.5 10.5 m7 -3 L19 5 m-1.5 5.5 3.15 3.15 a1.2 1.2 0 0 1 0 1.7 l-2.3 2.3 a1.2 1.2 0 0 1 -1.7 0 L13.5 14.5 M9 21 a6 6 0 0 0 -6 -6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.5 6.5
                moveTo(x = 13.5f, y = 6.5f)
                // l -3.15 -3.15
                lineToRelative(dx = -3.15f, dy = -3.15f)
                // a 1.2 1.2 0 0 0 -1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // l -2.3 2.3
                lineToRelative(dx = -2.3f, dy = 2.3f)
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
                // L 9.5 10.5
                lineTo(x = 9.5f, y = 10.5f)
                // m 7 -3
                moveToRelative(dx = 7.0f, dy = -3.0f)
                // L 19 5
                lineTo(x = 19.0f, y = 5.0f)
                // m -1.5 5.5
                moveToRelative(dx = -1.5f, dy = 5.5f)
                // l 3.15 3.15
                lineToRelative(dx = 3.15f, dy = 3.15f)
                // a 1.2 1.2 0 0 1 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l -2.3 2.3
                lineToRelative(dx = -2.3f, dy = 2.3f)
                // a 1.2 1.2 0 0 1 -1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // L 13.5 14.5
                lineTo(x = 13.5f, y = 14.5f)
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
                // a 6 6 0 0 0 -6 -6
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.0f,
                    dy1 = -6.0f,
                )
            }
            // M9.35 10.65 a1.2 1.2 0 0 0 0 1.7 l2.3 2.3 a1.2 1.2 0 0 0 1.7 0 l4.3 -4.3 a1.2 1.2 0 0 0 0 -1.7 l-2.3 -2.3 a1.2 1.2 0 0 0 -1.7 0z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.35 10.65
                moveTo(x = 9.35f, y = 10.65f)
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
                // l 4.3 -4.3
                lineToRelative(dx = 4.3f, dy = -4.3f)
                // a 1.2 1.2 0 0 0 0 -1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.7f,
                )
                // l -2.3 -2.3
                lineToRelative(dx = -2.3f, dy = -2.3f)
                // a 1.2 1.2 0 0 0 -1.7 0z
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _satellite = it }
    }

@Suppress("ObjectPropertyName")
private var _satellite: ImageVector? = null
