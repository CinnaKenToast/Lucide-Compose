package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Presentation: ImageVector
    get() {
        val current = _presentation
        if (current != null) return current

        return ImageVector.Builder(
            name = "Presentation",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2 3 h20 m-1 0 v11 a2 2 0 0 1 -2 2 H5 a2 2 0 0 1 -2 -2 V3 m4 18 5 -5 5 5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 3
                moveTo(x = 2.0f, y = 3.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // v 11
                verticalLineToRelative(dy = 11.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // V 3
                verticalLineTo(y = 3.0f)
                // m 4 18
                moveToRelative(dx = 4.0f, dy = 18.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
            }
        }.build().also { _presentation = it }
    }


@Suppress("ObjectPropertyName")
private var _presentation: ImageVector? = null
