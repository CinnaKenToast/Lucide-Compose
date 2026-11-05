package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableColumnsSplit: ImageVector
    get() {
        val current = _tableColumnsSplit
        if (current != null) return current

        return ImageVector.Builder(
            name = "TableColumnsSplit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 14 v2 m0 4 v2 m0 -20 v2 m0 4 v2 M2 15 h8 M2 3 h6 a2 2 0 0 1 2 2 v14 a2 2 0 0 1 -2 2 H2 M2 9 h8 m12 6 h-4 m4 -12 h-2 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h2 m0 -12 h-4 M5 3 v18
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 14
                moveTo(x = 14.0f, y = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -20
                moveToRelative(dx = 0.0f, dy = -20.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 4
                moveToRelative(dx = 0.0f, dy = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // M 2 15
                moveTo(x = 2.0f, y = 15.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // M 2 3
                moveTo(x = 2.0f, y = 3.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // H 2
                horizontalLineTo(x = 2.0f)
                // M 2 9
                moveTo(x = 2.0f, y = 9.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m 12 6
                moveToRelative(dx = 12.0f, dy = 6.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // m 4 -12
                moveToRelative(dx = 4.0f, dy = -12.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 0 -12
                moveToRelative(dx = 0.0f, dy = -12.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // M 5 3
                moveTo(x = 5.0f, y = 3.0f)
                // v 18
                verticalLineToRelative(dy = 18.0f)
            }
        }.build().also { _tableColumnsSplit = it }
    }


@Suppress("ObjectPropertyName")
private var _tableColumnsSplit: ImageVector? = null
