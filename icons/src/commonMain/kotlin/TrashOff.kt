package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrashOff: ImageVector
    get() {
        val current = _trashOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "TrashOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 11 v6 m4 0 v-3 m2 -8 V4 a2 2 0 0 0 -2 -2 h-4 a2 2 0 0 0 -1.58 .77 M19 6 v7.34 M2 2 l20 20 M21 6 h-9.34 M3 6 h3 M5 6 v14 a2 2 0 0 0 2 2 h10 a2 2 0 0 0 2 -2 v-1
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
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // m 2 -8
                moveToRelative(dx = 2.0f, dy = -8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 2 2 0 0 0 -1.58 0.77
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.58f,
                    dy1 = 0.77f,
                )
                // M 19 6
                moveTo(x = 19.0f, y = 6.0f)
                // v 7.34
                verticalLineToRelative(dy = 7.34f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // M 21 6
                moveTo(x = 21.0f, y = 6.0f)
                // h -9.34
                horizontalLineToRelative(dx = -9.34f)
                // M 3 6
                moveTo(x = 3.0f, y = 6.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // M 5 6
                moveTo(x = 5.0f, y = 6.0f)
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -1
                verticalLineToRelative(dy = -1.0f)
            }
        }.build().also { _trashOff = it }
    }


@Suppress("ObjectPropertyName")
private var _trashOff: ImageVector? = null
