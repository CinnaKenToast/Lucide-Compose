package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ShowerHead: ImageVector
    get() {
        val current = _showerHead
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ShowerHead",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m4 4 2.5 2.5 m7 0 a4.95 4.95 0 0 0 -7 7 M15 5 5 15 m9 2 v.01 M10 16 v.01 M13 13z M16 10z M11 20 v.01 M17 14z M20 11z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 4
                moveTo(x = 4.0f, y = 4.0f)
                // l 2.5 2.5
                lineToRelative(dx = 2.5f, dy = 2.5f)
                // m 7 0
                moveToRelative(dx = 7.0f, dy = 0.0f)
                // a 4.95 4.95 0 0 0 -7 7
                arcToRelative(
                    a = 4.95f,
                    b = 4.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // M 15 5
                moveTo(x = 15.0f, y = 5.0f)
                // L 5 15
                lineTo(x = 5.0f, y = 15.0f)
                // m 9 2
                moveToRelative(dx = 9.0f, dy = 2.0f)
                // v 0.01
                verticalLineToRelative(dy = 0.01f)
                // M 10 16
                moveTo(x = 10.0f, y = 16.0f)
                // v 0.01
                verticalLineToRelative(dy = 0.01f)
                // M 13 13z
                moveTo(x = 13.0f, y = 13.0f)
                close()
                // M 16 10z
                moveTo(x = 16.0f, y = 10.0f)
                close()
                // M 11 20
                moveTo(x = 11.0f, y = 20.0f)
                // v 0.01
                verticalLineToRelative(dy = 0.01f)
                // M 17 14z
                moveTo(x = 17.0f, y = 14.0f)
                close()
                // M 20 11z
                moveTo(x = 20.0f, y = 11.0f)
                close()
            }
        }.build().also { _showerHead = it }
    }

@Suppress("ObjectPropertyName")
private var _showerHead: ImageVector? = null
