package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Astroid: ImageVector
    get() {
        val current = _astroid
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Astroid",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12.98 21.19 a1 1 0 0 1 -1.96 0 10 10 0 0 0 -8.2 -8.2 1 1 0 0 1 0 -1.97 10 10 0 0 0 8.2 -8.2 1 1 0 0 1 1.96 0 10 10 0 0 0 8.2 8.2 1 1 0 0 1 0 1.96 10 10 0 0 0 -8.2 8.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.98 21.19
                moveTo(x = 12.98f, y = 21.19f)
                // a 1 1 0 0 1 -1.96 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.96f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 0 0 -8.2 -8.2
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.2f,
                    dy1 = -8.2f,
                )
                // a 1 1 0 0 1 0 -1.97
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.97f,
                )
                // a 10 10 0 0 0 8.2 -8.2
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.2f,
                    dy1 = -8.2f,
                )
                // a 1 1 0 0 1 1.96 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.96f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 0 0 8.2 8.2
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 8.2f,
                    dy1 = 8.2f,
                )
                // a 1 1 0 0 1 0 1.96
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.96f,
                )
                // a 10 10 0 0 0 -8.2 8.2
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -8.2f,
                    dy1 = 8.2f,
                )
            }
        }.build().also { _astroid = it }
    }

@Suppress("ObjectPropertyName")
private var _astroid: ImageVector? = null
