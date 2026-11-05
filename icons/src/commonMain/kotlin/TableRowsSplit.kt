package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableRowsSplit: ImageVector
    get() {
        val current = _tableRowsSplit
        if (current != null) return current

        return ImageVector.Builder(
            name = "TableRowsSplit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 10 h2 m-1 12 v-8 m0 -12 v4 M2 10 h2 m16 0 h2 M3 19 h18 M3 22 v-6 a2 2 135 0 1 2 -2 h14 a2 2 45 0 1 2 2 v6 M3 2 v2 a2 2 45 0 0 2 2 h14 a2 2 135 0 0 2 -2 V2 M8 10 h2 M9 22 v-8 M9 2 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 10
                moveTo(x = 14.0f, y = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m -1 12
                moveToRelative(dx = -1.0f, dy = 12.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // m 0 -12
                moveToRelative(dx = 0.0f, dy = -12.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 3 19
                moveTo(x = 3.0f, y = 19.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // M 3 22
                moveTo(x = 3.0f, y = 22.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 2 2 135 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 135.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 2 2 45 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 45.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // M 3 2
                moveTo(x = 3.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 2 2 45 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 45.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
                // a 2 2 135 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 135.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 9 22
                moveTo(x = 9.0f, y = 22.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _tableRowsSplit = it }
    }


@Suppress("ObjectPropertyName")
private var _tableRowsSplit: ImageVector? = null
