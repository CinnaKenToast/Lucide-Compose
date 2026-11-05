package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.AlignCenterVertical: ImageVector
    get() {
        val current = _alignCenterVertical
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.AlignCenterVertical",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 v20 M8 10 H4 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h4 m8 6 h4 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 h-4 M8 20 H7 a2 2 0 0 1 -2 -2 v-2 a2 2 0 0 1 2 -2 h1 m8 0 h1 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 h-1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // m 8 6
                moveToRelative(dx = 8.0f, dy = 6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // M 8 20
                moveTo(x = 8.0f, y = 20.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
                // m 8 0
                moveToRelative(dx = 8.0f, dy = 0.0f)
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // h -1
                horizontalLineToRelative(dx = -1.0f)
            }
        }.build().also { _alignCenterVertical = it }
    }

@Suppress("ObjectPropertyName")
private var _alignCenterVertical: ImageVector? = null
