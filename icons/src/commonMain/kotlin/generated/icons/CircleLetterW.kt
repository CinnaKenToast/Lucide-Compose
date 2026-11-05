package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleLetterW: ImageVector
    get() {
        val current = _circleLetterW
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CircleLetterW",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m16 8 -1.6 7.6 a.5 .5 0 0 1 -.96 .04 l-.96 -3.28 a.5 .5 0 0 0 -.96 0 l-.96 3.28 a.5 .5 0 0 1 -.97 -.04 L8 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 8
                moveTo(x = 16.0f, y = 8.0f)
                // l -1.6 7.6
                lineToRelative(dx = -1.6f, dy = 7.6f)
                // a 0.5 0.5 0 0 1 -0.96 0.04
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.96f,
                    dy1 = 0.04f,
                )
                // l -0.96 -3.28
                lineToRelative(dx = -0.96f, dy = -3.28f)
                // a 0.5 0.5 0 0 0 -0.96 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.96f,
                    dy1 = 0.0f,
                )
                // l -0.96 3.28
                lineToRelative(dx = -0.96f, dy = 3.28f)
                // a 0.5 0.5 0 0 1 -0.97 -0.04
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.97f,
                    dy1 = -0.04f,
                )
                // L 8 8
                lineTo(x = 8.0f, y = 8.0f)
            }
            // <circle cx="12.0" cy="12.0" radius="10.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _circleLetterW = it }
    }

@Suppress("ObjectPropertyName")
private var _circleLetterW: ImageVector? = null
