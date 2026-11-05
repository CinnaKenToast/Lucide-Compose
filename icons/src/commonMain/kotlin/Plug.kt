package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Plug: ImageVector
    get() {
        val current = _plug
        if (current != null) return current

        return ImageVector.Builder(
            name = "Plug",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 v-5 m3 -9 V2 m2 6 a1 1 0 0 1 1 1 v4 a4 4 0 0 1 -4 4 h-4 a4 4 0 0 1 -4 -4 V9 a1 1 0 0 1 1 -1z M9 8 V2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // m 3 -9
                moveToRelative(dx = 3.0f, dy = -9.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // m 2 6
                moveToRelative(dx = 2.0f, dy = 6.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 4 4 0 0 1 -4 4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 4.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 4 4 0 0 1 -4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = -4.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 1 1 0 0 1 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // M 9 8
                moveTo(x = 9.0f, y = 8.0f)
                // V 2
                verticalLineTo(y = 2.0f)
            }
        }.build().also { _plug = it }
    }


@Suppress("ObjectPropertyName")
private var _plug: ImageVector? = null
