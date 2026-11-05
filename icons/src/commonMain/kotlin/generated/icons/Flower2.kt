package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Flower2: ImageVector
    get() {
        val current = _flower2
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Flower2",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 5 a3 3 0 1 1 3 3 m-3 -3 a3 3 0 1 0 -3 3 m3 -3 v1 M9 8 a3 3 0 1 0 3 3 M9 8 h1 m5 0 a3 3 0 1 1 -3 3 m3 -3 h-1 m-2 3 v-1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 5
                moveTo(x = 12.0f, y = 5.0f)
                // a 3 3 0 1 1 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // a 3 3 0 1 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // M 9 8
                moveTo(x = 9.0f, y = 8.0f)
                // a 3 3 0 1 0 3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 3.0f,
                    dy1 = 3.0f,
                )
                // M 9 8
                moveTo(x = 9.0f, y = 8.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 5 0
                moveToRelative(dx = 5.0f, dy = 0.0f)
                // a 3 3 0 1 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // m 3 -3
                moveToRelative(dx = 3.0f, dy = -3.0f)
                // h -1
                horizontalLineToRelative(dx = -1.0f)
                // m -2 3
                moveToRelative(dx = -2.0f, dy = 3.0f)
                // v -1
                verticalLineToRelative(dy = -1.0f)
            }
            // <circle cx="12.0" cy="8.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M12 10 v12 m0 0 c4.2 0 7 -1.67 7 -5 -4.2 0 -7 1.67 -7 5 m0 0 c-4.2 0 -7 -1.67 -7 -5 4.2 0 7 1.67 7 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 10
                moveTo(x = 12.0f, y = 10.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // c 4.2 0 7 -1.67 7 -5
                curveToRelative(
                    dx1 = 4.2f,
                    dy1 = 0.0f,
                    dx2 = 7.0f,
                    dy2 = -1.67f,
                    dx3 = 7.0f,
                    dy3 = -5.0f,
                )
                // c -4.2 0 -7 1.67 -7 5
                curveToRelative(
                    dx1 = -4.2f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = 1.67f,
                    dx3 = -7.0f,
                    dy3 = 5.0f,
                )
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // c -4.2 0 -7 -1.67 -7 -5
                curveToRelative(
                    dx1 = -4.2f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = -1.67f,
                    dx3 = -7.0f,
                    dy3 = -5.0f,
                )
                // c 4.2 0 7 1.67 7 5
                curveToRelative(
                    dx1 = 4.2f,
                    dy1 = 0.0f,
                    dx2 = 7.0f,
                    dy2 = 1.67f,
                    dx3 = 7.0f,
                    dy3 = 5.0f,
                )
            }
        }.build().also { _flower2 = it }
    }

@Suppress("ObjectPropertyName")
private var _flower2: ImageVector? = null
