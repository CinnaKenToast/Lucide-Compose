package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LetterF: ImageVector
    get() {
        val current = _letterF
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LetterF",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 12 h8 m-8 8 V5 a1 1 0 0 1 1 -1 h11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 12
                moveTo(x = 6.0f, y = 12.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -8 8
                moveToRelative(dx = -8.0f, dy = 8.0f)
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h 11
                horizontalLineToRelative(dx = 11.0f)
            }
        }.build().also { _letterF = it }
    }

@Suppress("ObjectPropertyName")
private var _letterF: ImageVector? = null
