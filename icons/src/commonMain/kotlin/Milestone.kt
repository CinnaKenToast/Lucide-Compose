package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Milestone: ImageVector
    get() {
        val current = _milestone
        if (current != null) return current

        return ImageVector.Builder(
            name = "Milestone",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 13 v8 m0 -18 v3 m6.17 0 a2 2 0 0 1 1.42 .59 l2.06 2.06 a1.2 1.2 0 0 1 0 1.7 l-2.06 2.06 A2 2 0 0 1 18.17 13 H4 a1 1 0 0 1 -1 -1 V7 a1 1 0 0 1 1 -1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 13
                moveTo(x = 12.0f, y = 13.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 0 -18
                moveToRelative(dx = 0.0f, dy = -18.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 6.17 0
                moveToRelative(dx = 6.17f, dy = 0.0f)
                // a 2 2 0 0 1 1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = 0.59f,
                )
                // l 2.06 2.06
                lineToRelative(dx = 2.06f, dy = 2.06f)
                // a 1.2 1.2 0 0 1 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l -2.06 2.06
                lineToRelative(dx = -2.06f, dy = 2.06f)
                // A 2 2 0 0 1 18.17 13
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.17f,
                    y1 = 13.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // V 7
                verticalLineTo(y = 7.0f)
                // a 1 1 0 0 1 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
            }
        }.build().also { _milestone = it }
    }


@Suppress("ObjectPropertyName")
private var _milestone: ImageVector? = null
