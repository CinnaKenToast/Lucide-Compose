package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SkipBack: ImageVector
    get() {
        val current = _skipBack
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SkipBack",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17.97 4.29 A2 2 0 0 1 21 6 v12 a2 2 0 0 1 -3.03 1.72 l-10 -6 a2 2 0 0 1 0 -3.44z M3 20 V4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17.97 4.29
                moveTo(x = 17.97f, y = 4.29f)
                // A 2 2 0 0 1 21 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 6.0f,
                )
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // a 2 2 0 0 1 -3.03 1.72
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.03f,
                    dy1 = 1.72f,
                )
                // l -10 -6
                lineToRelative(dx = -10.0f, dy = -6.0f)
                // a 2 2 0 0 1 0 -3.44z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -3.44f,
                )
                close()
                // M 3 20
                moveTo(x = 3.0f, y = 20.0f)
                // V 4
                verticalLineTo(y = 4.0f)
            }
        }.build().also { _skipBack = it }
    }

@Suppress("ObjectPropertyName")
private var _skipBack: ImageVector? = null
