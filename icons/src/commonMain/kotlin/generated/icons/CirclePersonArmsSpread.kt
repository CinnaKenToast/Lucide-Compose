package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CirclePersonArmsSpread: ImageVector
    get() {
        val current = _circlePersonArmsSpread
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CirclePersonArmsSpread",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 17 -3 -3 m-4 -4 s2 1 4 1 4 -1 4 -1 m-7 7 3 -3 v-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 17
                moveTo(x = 15.0f, y = 17.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // m -4 -4
                moveToRelative(dx = -4.0f, dy = -4.0f)
                // s 2 1 4 1
                reflectiveCurveToRelative(
                    dx1 = 2.0f,
                    dy1 = 1.0f,
                    dx2 = 4.0f,
                    dy2 = 1.0f,
                )
                // s 4 -1 4 -1
                reflectiveCurveToRelative(
                    dx1 = 4.0f,
                    dy1 = -1.0f,
                    dx2 = 4.0f,
                    dy2 = -1.0f,
                )
                // m -7 7
                moveToRelative(dx = -7.0f, dy = 7.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
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
            // <circle cx="12.0" cy="7.0" radius="0.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 7
                moveTo(x = 12.0f, y = 7.0f)
                // m -0.5 0
                moveToRelative(dx = -0.5f, dy = 0.0f)
                // a 0.5 0.5 0 1 1 1 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 0.0f,
                )
                // a 0.5 0.5 0 1 1 -1 0z
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _circlePersonArmsSpread = it }
    }

@Suppress("ObjectPropertyName")
private var _circlePersonArmsSpread: ImageVector? = null
