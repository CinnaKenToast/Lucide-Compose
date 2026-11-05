package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Faucet: ImageVector
    get() {
        val current = _faucet
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Faucet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10.08 5.43 5.57 4.08 a2 2 0 1 0 0 3.84 l4.51 -1.35 M12 8 v3 m1.92 -5.57 4.5 -1.35 a2 2 0 1 1 0 3.84 l-4.5 -1.35 M18 17 v-4 m4 -2 v8 m0 -7 h-3 a1 1 0 0 0 -1 1 h-2.54 a4 4 0 0 0 -6.91 -.02 L7 13 a5 5 0 0 0 -5 5 v1 a1 1 0 0 0 1 1 h2 a1 1 0 0 0 1 -1 v-1 a1 1 0 0 1 1 -1 l1.55 .02 a4 4 0 0 0 6.9 0 L18 17 a1 1 0 0 0 1 1 h3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10.08 5.43
                moveTo(x = 10.08f, y = 5.43f)
                // L 5.57 4.08
                lineTo(x = 5.57f, y = 4.08f)
                // a 2 2 0 1 0 0 3.84
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 3.84f,
                )
                // l 4.51 -1.35
                lineToRelative(dx = 4.51f, dy = -1.35f)
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 1.92 -5.57
                moveToRelative(dx = 1.92f, dy = -5.57f)
                // l 4.5 -1.35
                lineToRelative(dx = 4.5f, dy = -1.35f)
                // a 2 2 0 1 1 0 3.84
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 3.84f,
                )
                // l -4.5 -1.35
                lineToRelative(dx = -4.5f, dy = -1.35f)
                // M 18 17
                moveTo(x = 18.0f, y = 17.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m 4 -2
                moveToRelative(dx = 4.0f, dy = -2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 0 -7
                moveToRelative(dx = 0.0f, dy = -7.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
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
                // h -2.54
                horizontalLineToRelative(dx = -2.54f)
                // a 4 4 0 0 0 -6.91 -0.02
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -6.91f,
                    dy1 = -0.02f,
                )
                // L 7 13
                lineTo(x = 7.0f, y = 13.0f)
                // a 5 5 0 0 0 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // l 1.55 0.02
                lineToRelative(dx = 1.55f, dy = 0.02f)
                // a 4 4 0 0 0 6.9 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 6.9f,
                    dy1 = 0.0f,
                )
                // L 18 17
                lineTo(x = 18.0f, y = 17.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 3
                horizontalLineToRelative(dx = 3.0f)
            }
            // <circle cx="12.0" cy="6.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
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
        }.build().also { _faucet = it }
    }

@Suppress("ObjectPropertyName")
private var _faucet: ImageVector? = null
