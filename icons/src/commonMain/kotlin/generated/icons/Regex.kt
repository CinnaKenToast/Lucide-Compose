package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Regex: ImageVector
    get() {
        val current = _regex
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Regex",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 3 v10 m-4.33 -7.5 8.66 5 m-8.66 0 8.66 -5 M9 17 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h2 a2 2 0 0 0 2 -2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 3
                moveTo(x = 17.0f, y = 3.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // m -4.33 -7.5
                moveToRelative(dx = -4.33f, dy = -7.5f)
                // l 8.66 5
                lineToRelative(dx = 8.66f, dy = 5.0f)
                // m -8.66 0
                moveToRelative(dx = -8.66f, dy = 0.0f)
                // l 8.66 -5
                lineToRelative(dx = 8.66f, dy = -5.0f)
                // M 9 17
                moveTo(x = 9.0f, y = 17.0f)
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
                // H 5
                horizontalLineTo(x = 5.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // a 2 2 0 0 0 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _regex = it }
    }

@Suppress("ObjectPropertyName")
private var _regex: ImageVector? = null
