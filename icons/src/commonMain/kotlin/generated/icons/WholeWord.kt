package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WholeWord: ImageVector
    get() {
        val current = _wholeWord
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.WholeWord",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // <circle cx="7.0" cy="12.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M10 9 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 9
                moveTo(x = 10.0f, y = 9.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
            // <circle cx="17.0" cy="12.0" radius="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 12
                moveTo(x = 17.0f, y = 12.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M14 7 v8 m8 2 v1 c0 .5 -.5 1 -1 1 H3 c-.5 0 -1 -.5 -1 -1 v-1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 7
                moveTo(x = 14.0f, y = 7.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 8 2
                moveToRelative(dx = 8.0f, dy = 2.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // c 0 0.5 -0.5 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.5f,
                    dx2 = -0.5f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // H 3
                horizontalLineTo(x = 3.0f)
                // c -0.5 0 -1 -0.5 -1 -1
                curveToRelative(
                    dx1 = -0.5f,
                    dy1 = 0.0f,
                    dx2 = -1.0f,
                    dy2 = -0.5f,
                    dx3 = -1.0f,
                    dy3 = -1.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
            }
        }.build().also { _wholeWord = it }
    }

@Suppress("ObjectPropertyName")
private var _wholeWord: ImageVector? = null
