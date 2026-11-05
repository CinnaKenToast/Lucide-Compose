package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DollarSign: ImageVector
    get() {
        val current = _dollarSign
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.DollarSign",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3 v18 m5 -16 H9.5 a1 1 0 0 0 0 7 h5 a1 1 0 0 1 0 7 H6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3
                moveTo(x = 12.0f, y = 3.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
                // m 5 -16
                moveToRelative(dx = 5.0f, dy = -16.0f)
                // H 9.5
                horizontalLineTo(x = 9.5f)
                // a 1 1 0 0 0 0 7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 7.0f,
                )
                // h 5
                horizontalLineToRelative(dx = 5.0f)
                // a 1 1 0 0 1 0 7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 7.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
            }
        }.build().also { _dollarSign = it }
    }

@Suppress("ObjectPropertyName")
private var _dollarSign: ImageVector? = null
