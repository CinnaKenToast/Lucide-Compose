package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.LoaderCircle: ImageVector
    get() {
        val current = _loaderCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.LoaderCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 12 a9 9 0 1 1 -6.22 -8.56
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // a 9 9 0 1 1 -6.22 -8.56
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.22f,
                    dy1 = -8.56f,
                )
            }
        }.build().also { _loaderCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _loaderCircle: ImageVector? = null
