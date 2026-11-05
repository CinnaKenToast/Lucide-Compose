package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareKanbanPlus: ImageVector
    get() {
        val current = _squareKanbanPlus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquareKanbanPlus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 7 v4 m.35 10 H5 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h14 a2 2 0 0 1 2 2 v7.35 M15 18 h6 M16 7 v4.54 M18 21 v-6 M8 7 v7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 7
                moveTo(x = 12.0f, y = 7.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // m 0.35 10
                moveToRelative(dx = 0.35f, dy = 10.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // v 7.35
                verticalLineToRelative(dy = 7.35f)
                // M 15 18
                moveTo(x = 15.0f, y = 18.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 16 7
                moveTo(x = 16.0f, y = 7.0f)
                // v 4.54
                verticalLineToRelative(dy = 4.54f)
                // M 18 21
                moveTo(x = 18.0f, y = 21.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // M 8 7
                moveTo(x = 8.0f, y = 7.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
            }
        }.build().also { _squareKanbanPlus = it }
    }

@Suppress("ObjectPropertyName")
private var _squareKanbanPlus: ImageVector? = null
