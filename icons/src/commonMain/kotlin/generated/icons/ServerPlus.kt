package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ServerPlus: ImageVector
    get() {
        val current = _serverPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.ServerPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.5 10 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v2 m-6 6 h6 m-3 -3 v6 m3 3 v2 a2 2 0 0 1 -2 2 H4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h8.5 M6 18z M6 6z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.5 10
                moveTo(x = 12.5f, y = 10.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m -6 6
                moveToRelative(dx = -6.0f, dy = 6.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 -3
                moveToRelative(dx = -3.0f, dy = -3.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 3 3
                moveToRelative(dx = 3.0f, dy = 3.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 8.5
                horizontalLineToRelative(dx = 8.5f)
                // M 6 18z
                moveTo(x = 6.0f, y = 18.0f)
                close()
                // M 6 6z
                moveTo(x = 6.0f, y = 6.0f)
                close()
            }
        }.build().also { _serverPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _serverPlus: ImageVector? = null
