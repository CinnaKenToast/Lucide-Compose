package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SignpostBig: ImageVector
    get() {
        val current = _signpostBig
        if (current != null) return current

        return ImageVector.Builder(
            name = "SignpostBig",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 9 H4 L2 7 l2 -2 h6 m4 0 h6 l2 2 -2 2 h-6 m-4 13 V4 a2 2 0 1 1 4 0 v18 m-6 0 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 9
                moveTo(x = 10.0f, y = 9.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // L 2 7
                lineTo(x = 2.0f, y = 7.0f)
                // l 2 -2
                lineToRelative(dx = 2.0f, dy = -2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // l 2 2
                lineToRelative(dx = 2.0f, dy = 2.0f)
                // l -2 2
                lineToRelative(dx = -2.0f, dy = 2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // m -4 13
                moveToRelative(dx = -4.0f, dy = 13.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _signpostBig = it }
    }


@Suppress("ObjectPropertyName")
private var _signpostBig: ImageVector? = null
