package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Store: ImageVector
    get() {
        val current = _store
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Store",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 21 v-5 a1 1 0 0 0 -1 -1 h-4 a1 1 0 0 0 -1 1 v5 m8.77 -10.69 a1.1 1.1 0 0 0 -1.54 0 2.5 2.5 0 0 1 -3.46 0 1.1 1.1 0 0 0 -1.54 0 2.5 2.5 0 0 1 -3.46 0 1.1 1.1 0 0 0 -1.54 0 2.5 2.5 0 0 1 -3.77 -3.25 l2.88 -4.18 A2 2 0 0 1 7 2 h10 a2 2 0 0 1 1.65 .87 l2.9 4.2 a2.5 2.5 0 0 1 -3.78 3.24
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 21
                moveTo(x = 15.0f, y = 21.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m 8.77 -10.69
                moveToRelative(dx = 8.77f, dy = -10.69f)
                // a 1.1 1.1 0 0 0 -1.54 0
                arcToRelative(
                    a = 1.1f,
                    b = 1.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.54f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 0 1 -3.46 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.46f,
                    dy1 = 0.0f,
                )
                // a 1.1 1.1 0 0 0 -1.54 0
                arcToRelative(
                    a = 1.1f,
                    b = 1.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.54f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 0 1 -3.46 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.46f,
                    dy1 = 0.0f,
                )
                // a 1.1 1.1 0 0 0 -1.54 0
                arcToRelative(
                    a = 1.1f,
                    b = 1.1f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.54f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 0 1 -3.77 -3.25
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.77f,
                    dy1 = -3.25f,
                )
                // l 2.88 -4.18
                lineToRelative(dx = 2.88f, dy = -4.18f)
                // A 2 2 0 0 1 7 2
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.0f,
                    y1 = 2.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 2 2 0 0 1 1.65 0.87
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.65f,
                    dy1 = 0.87f,
                )
                // l 2.9 4.2
                lineToRelative(dx = 2.9f, dy = 4.2f)
                // a 2.5 2.5 0 0 1 -3.78 3.24
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.78f,
                    dy1 = 3.24f,
                )
            }
            // M4 10.95 V19 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 2 -2 v-8.05
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 4 10.95
                moveTo(x = 4.0f, y = 10.95f)
                // V 19
                verticalLineTo(y = 19.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // v -8.05
                verticalLineToRelative(dy = -8.05f)
            }
        }.build().also { _store = it }
    }

@Suppress("ObjectPropertyName")
private var _store: ImageVector? = null
