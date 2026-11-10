package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.StrokeLineCapButt: ImageVector
    get() {
        val current = _strokeLineCapButt
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.StrokeLineCapButt",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 12 h2 M2 12 h2 M2 4 h18 a2 2 0 0 1 2 2 v12 a2 2 0 0 1 -2 2 H2 m18 -8 h2 M8 12 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 12
                moveTo(x = 14.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 2 4
                moveTo(x = 2.0f, y = 4.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // H 2
                horizontalLineTo(x = 2.0f)
                // m 18 -8
                moveToRelative(dx = 18.0f, dy = -8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 8 12
                moveTo(x = 8.0f, y = 12.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _strokeLineCapButt = it }
    }

@Suppress("ObjectPropertyName")
private var _strokeLineCapButt: ImageVector? = null
