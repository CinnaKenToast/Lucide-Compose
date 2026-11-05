package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Utensils: ImageVector
    get() {
        val current = _utensils
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Utensils",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 2 v7 a2 2 0 0 0 2 2 h4 a2 2 0 0 0 2 -2 V2 M7 2 v20 m14 -7 V2 a5 5 0 0 0 -5 5 v6 a2 2 0 0 0 2 2z m0 0 v7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 2
                moveTo(x = 3.0f, y = 2.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
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
                // V 2
                verticalLineTo(y = 2.0f)
                // M 7 2
                moveTo(x = 7.0f, y = 2.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // m 14 -7
                moveToRelative(dx = 14.0f, dy = -7.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // a 5 5 0 0 0 -5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = 5.0f,
                )
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 2 2 0 0 0 2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                close()
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
            }
        }.build().also { _utensils = it }
    }

@Suppress("ObjectPropertyName")
private var _utensils: ImageVector? = null
