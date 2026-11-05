package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Opacity: ImageVector
    get() {
        val current = _opacity
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Opacity",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 3z M12 9z M15 6z M18 3 h.01 M21 6 v13 a2 2 0 0 1 -2 2 H6 m-3 -9z M3 18z M3 6z M6 15z M6 3z M6 9z M9 12z M9 6z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 3z
                moveTo(x = 12.0f, y = 3.0f)
                close()
                // M 12 9z
                moveTo(x = 12.0f, y = 9.0f)
                close()
                // M 15 6z
                moveTo(x = 15.0f, y = 6.0f)
                close()
                // M 18 3
                moveTo(x = 18.0f, y = 3.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
                // M 21 6
                moveTo(x = 21.0f, y = 6.0f)
                // v 13
                verticalLineToRelative(dy = 13.0f)
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
                // H 6
                horizontalLineTo(x = 6.0f)
                // m -3 -9z
                moveToRelative(dx = -3.0f, dy = -9.0f)
                close()
                // M 3 18z
                moveTo(x = 3.0f, y = 18.0f)
                close()
                // M 3 6z
                moveTo(x = 3.0f, y = 6.0f)
                close()
                // M 6 15z
                moveTo(x = 6.0f, y = 15.0f)
                close()
                // M 6 3z
                moveTo(x = 6.0f, y = 3.0f)
                close()
                // M 6 9z
                moveTo(x = 6.0f, y = 9.0f)
                close()
                // M 9 12z
                moveTo(x = 9.0f, y = 12.0f)
                close()
                // M 9 6z
                moveTo(x = 9.0f, y = 6.0f)
                close()
            }
        }.build().also { _opacity = it }
    }

@Suppress("ObjectPropertyName")
private var _opacity: ImageVector? = null
