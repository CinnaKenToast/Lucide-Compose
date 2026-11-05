package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DecimalsArrowLeft: ImageVector
    get() {
        val current = _decimalsArrowLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "DecimalsArrowLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m13 21 -3 -3 3 -3 m7 3 H10 m-7 -7z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 21
                moveTo(x = 13.0f, y = 21.0f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // l 3 -3
                lineToRelative(dx = 3.0f, dy = -3.0f)
                // m 7 3
                moveToRelative(dx = 7.0f, dy = 3.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // m -7 -7z
                moveToRelative(dx = -7.0f, dy = -7.0f)
                close()
            }
            // <rect width="5" height="8" rx="2.5" x="6.0" y="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 5.5
                moveTo(x = 6.0f, y = 5.5f)
                // a 2.5 2.5 0 0 1 2.5 -2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.5f,
                    dy1 = -2.5f,
                )
                // h 0
                horizontalLineToRelative(dx = 0.0f)
                // a 2.5 2.5 0 0 1 2.5 2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.5f,
                    dy1 = 2.5f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 2.5 2.5 0 0 1 -2.5 2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.5f,
                    dy1 = 2.5f,
                )
                // h -0
                horizontalLineToRelative(dx = -0.0f)
                // a 2.5 2.5 0 0 1 -2.5 -2.5z
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.5f,
                    dy1 = -2.5f,
                )
                close()
            }
        }.build().also { _decimalsArrowLeft = it }
    }


@Suppress("ObjectPropertyName")
private var _decimalsArrowLeft: ImageVector? = null
