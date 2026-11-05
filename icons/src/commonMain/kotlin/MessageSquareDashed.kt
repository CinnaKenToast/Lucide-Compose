package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageSquareDashed: ImageVector
    get() {
        val current = _messageSquareDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "MessageSquareDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 3 h2 m0 16 h-2 M2 12 v-2 m0 6 v5.29 a.71 .71 0 0 0 1.21 .5 l1.15 -1.15 M20 19 a2 2 0 0 0 2 -2 v-1 m0 -6 v2 m0 -6 V5 a2 2 0 0 0 -2 -2 M4 3 a2 2 0 0 0 -2 2 v1 m6 13 h2 M8 3 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 3
                moveTo(x = 14.0f, y = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // m 0 16
                moveToRelative(dx = 0.0f, dy = 16.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // M 2 12
                moveTo(x = 2.0f, y = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 0 6
                moveToRelative(dx = 0.0f, dy = 6.0f)
                // v 5.29
                verticalLineToRelative(dy = 5.29f)
                // a 0.71 0.71 0 0 0 1.21 0.5
                arcToRelative(
                    a = 0.71f,
                    b = 0.71f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.21f,
                    dy1 = 0.5f,
                )
                // l 1.15 -1.15
                lineToRelative(dx = 1.15f, dy = -1.15f)
                // M 20 19
                moveTo(x = 20.0f, y = 19.0f)
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
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 0 -6
                moveToRelative(dx = 0.0f, dy = -6.0f)
                // V 5
                verticalLineTo(y = 5.0f)
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
                // M 4 3
                moveTo(x = 4.0f, y = 3.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 6 13
                moveToRelative(dx = 6.0f, dy = 13.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // M 8 3
                moveTo(x = 8.0f, y = 3.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _messageSquareDashed = it }
    }


@Suppress("ObjectPropertyName")
private var _messageSquareDashed: ImageVector? = null
