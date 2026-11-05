package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SkipForward: ImageVector
    get() {
        val current = _skipForward
        if (current != null) return current

        return ImageVector.Builder(
            name = "SkipForward",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 4 v16 M6.03 4.29 A2 2 0 0 0 3 6 v12 a2 2 0 0 0 3.03 1.72 l10 -6 a2 2 0 0 0 0 -3.44z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 4
                moveTo(x = 21.0f, y = 4.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // M 6.03 4.29
                moveTo(x = 6.03f, y = 4.29f)
                // A 2 2 0 0 0 3 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 6.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 0 3.03 1.72
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 3.03f,
                    dy1 = 1.72f,
                )
                // l 10 -6
                lineToRelative(dx = 10.0f, dy = -6.0f)
                // a 2 2 0 0 0 0 -3.44z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -3.44f,
                )
                close()
            }
        }.build().also { _skipForward = it }
    }


@Suppress("ObjectPropertyName")
private var _skipForward: ImageVector? = null
