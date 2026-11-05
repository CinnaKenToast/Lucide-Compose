package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareDashedMousePointer: ImageVector
    get() {
        val current = _squareDashedMousePointer
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquareDashedMousePointer",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.03 12.68 a.5 .5 0 0 1 .65 -.65 l9 3.5 a.5 .5 0 0 1 -.03 .95 l-3.45 1.07 a1 1 0 0 0 -.66 .66 l-1.06 3.44 a.5 .5 0 0 1 -.95 .03z M5 3 a2 2 0 0 0 -2 2 m16 -2 a2 2 0 0 1 2 2 M5 21 a2 2 0 0 1 -2 -2 M9 3 h1 M9 21 h2 m3 -18 h1 M3 9 v1 m18 -1 v2 M3 14 v1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.03 12.68
                moveTo(x = 12.03f, y = 12.68f)
                // a 0.5 0.5 0 0 1 0.65 -0.65
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.65f,
                    dy1 = -0.65f,
                )
                // l 9 3.5
                lineToRelative(dx = 9.0f, dy = 3.5f)
                // a 0.5 0.5 0 0 1 -0.03 0.95
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.03f,
                    dy1 = 0.95f,
                )
                // l -3.45 1.07
                lineToRelative(dx = -3.45f, dy = 1.07f)
                // a 1 1 0 0 0 -0.66 0.66
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.66f,
                    dy1 = 0.66f,
                )
                // l -1.06 3.44
                lineToRelative(dx = -1.06f, dy = 3.44f)
                // a 0.5 0.5 0 0 1 -0.95 0.03z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.95f,
                    dy1 = 0.03f,
                )
                close()
                // M 5 3
                moveTo(x = 5.0f, y = 3.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // m 16 -2
                moveToRelative(dx = 16.0f, dy = -2.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // M 5 21
                moveTo(x = 5.0f, y = 21.0f)
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
                // M 9 3
                moveTo(x = 9.0f, y = 3.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 9 21
                moveTo(x = 9.0f, y = 21.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 3 -18
                moveToRelative(dx = 3.0f, dy = -18.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // M 3 9
                moveTo(x = 3.0f, y = 9.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 18 -1
                moveToRelative(dx = 18.0f, dy = -1.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 3 14
                moveTo(x = 3.0f, y = 14.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
            }
        }.build().also { _squareDashedMousePointer = it }
    }

@Suppress("ObjectPropertyName")
private var _squareDashedMousePointer: ImageVector? = null
