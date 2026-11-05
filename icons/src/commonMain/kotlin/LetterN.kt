package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterN: ImageVector
    get() {
        val current = _letterN
        if (current != null) return current

        return ImageVector.Builder(
            name = "LetterN",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 20 V4.25 a.25 .25 0 0 1 .46 -.14 l11.09 15.78 A.25 .25 0 0 0 18 19.75 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 20
                moveTo(x = 6.0f, y = 20.0f)
                // V 4.25
                verticalLineTo(y = 4.25f)
                // a 0.25 0.25 0 0 1 0.46 -0.14
                arcToRelative(
                    a = 0.25f,
                    b = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.46f,
                    dy1 = -0.14f,
                )
                // l 11.09 15.78
                lineToRelative(dx = 11.09f, dy = 15.78f)
                // A 0.25 0.25 0 0 0 18 19.75
                arcTo(
                    horizontalEllipseRadius = 0.25f,
                    verticalEllipseRadius = 0.25f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 19.75f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
            }
        }.build().also { _letterN = it }
    }


@Suppress("ObjectPropertyName")
private var _letterN: ImageVector? = null
