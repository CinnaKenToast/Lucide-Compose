package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pilcrow: ImageVector
    get() {
        val current = _pilcrow
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Pilcrow",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M13 4 v16 m4 -16 v16 m2 -16 H9.5 a4.5 4.5 0 0 0 0 9 H13
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13 4
                moveTo(x = 13.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // m 4 -16
                moveToRelative(dx = 4.0f, dy = -16.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // m 2 -16
                moveToRelative(dx = 2.0f, dy = -16.0f)
                // H 9.5
                horizontalLineTo(x = 9.5f)
                // a 4.5 4.5 0 0 0 0 9
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 9.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
            }
        }.build().also { _pilcrow = it }
    }

@Suppress("ObjectPropertyName")
private var _pilcrow: ImageVector? = null
