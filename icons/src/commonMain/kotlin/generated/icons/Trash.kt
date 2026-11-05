package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Trash: ImageVector
    get() {
        val current = _trash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Trash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 11 v6 m4 -6 v6 m5 -11 v14 a2 2 0 0 1 -2 2 H7 a2 2 0 0 1 -2 -2 V6 M3 6 h18 M8 6 V4 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 11
                moveTo(x = 10.0f, y = 11.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 4 -6
                moveToRelative(dx = 4.0f, dy = -6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 5 -11
                moveToRelative(dx = 5.0f, dy = -11.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // H 7
                horizontalLineTo(x = 7.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
                // M 3 6
                moveTo(x = 3.0f, y = 6.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 8 6
                moveTo(x = 8.0f, y = 6.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
            }
        }.build().also { _trash = it }
    }

@Suppress("ObjectPropertyName")
private var _trash: ImageVector? = null
