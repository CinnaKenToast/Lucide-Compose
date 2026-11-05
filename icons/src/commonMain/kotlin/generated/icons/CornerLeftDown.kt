package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CornerLeftDown: ImageVector
    get() {
        val current = _cornerLeftDown
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CornerLeftDown",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m14 15 -5 5 -5 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 15
                moveTo(x = 14.0f, y = 15.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l -5 -5
                lineToRelative(dx = -5.0f, dy = -5.0f)
            }
            // M20 4 h-7 a4 4 0 0 0 -4 4 v12
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20 4
                moveTo(x = 20.0f, y = 4.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // a 4 4 0 0 0 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
            }
        }.build().also { _cornerLeftDown = it }
    }

@Suppress("ObjectPropertyName")
private var _cornerLeftDown: ImageVector? = null
