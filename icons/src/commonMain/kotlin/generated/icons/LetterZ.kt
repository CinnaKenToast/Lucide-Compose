package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LetterZ: ImageVector
    get() {
        val current = _letterZ
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LetterZ",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M6 4 h11.5 a.5 .5 0 0 1 .39 .82 L6.1 19.18 A.5 .5 0 0 0 6.51 20 H18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 4
                moveTo(x = 6.0f, y = 4.0f)
                // h 11.5
                horizontalLineToRelative(dx = 11.5f)
                // a 0.5 0.5 0 0 1 0.39 0.82
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.39f,
                    dy1 = 0.82f,
                )
                // L 6.1 19.18
                lineTo(x = 6.1f, y = 19.18f)
                // A 0.5 0.5 0 0 0 6.51 20
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 6.51f,
                    y1 = 20.0f,
                )
                // H 18
                horizontalLineTo(x = 18.0f)
            }
        }.build().also { _letterZ = it }
    }

@Suppress("ObjectPropertyName")
private var _letterZ: ImageVector? = null
