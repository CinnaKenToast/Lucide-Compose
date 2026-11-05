package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.TestTubes: ImageVector
    get() {
        val current = _testTubes
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.TestTubes",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9 2 v17.5 A2.5 2.5 0 0 1 6.5 22 2.5 2.5 0 0 1 4 19.5 V2 m16 0 v17.5 a2.5 2.5 0 0 1 -2.5 2.5 2.5 2.5 0 0 1 -2.5 -2.5 V2 M3 2 h7 m4 0 h7 M9 16 H4 m16 0 h-5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 2
                moveTo(x = 9.0f, y = 2.0f)
                // v 17.5
                verticalLineToRelative(dy = 17.5f)
                // A 2.5 2.5 0 0 1 6.5 22
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.5f,
                    y1 = 22.0f,
                )
                // A 2.5 2.5 0 0 1 4 19.5
                arcTo(
                    horizontalEllipseRadius = 2.5f,
                    verticalEllipseRadius = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 19.5f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // v 17.5
                verticalLineToRelative(dy = 17.5f)
                // a 2.5 2.5 0 0 1 -2.5 2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.5f,
                    dy1 = 2.5f,
                )
                // a 2.5 2.5 0 0 1 -2.5 -2.5
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.5f,
                    dy1 = -2.5f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // M 3 2
                moveTo(x = 3.0f, y = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // m 4 0
                moveToRelative(dx = 4.0f, dy = 0.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // M 9 16
                moveTo(x = 9.0f, y = 16.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // m 16 0
                moveToRelative(dx = 16.0f, dy = 0.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
            }
        }.build().also { _testTubes = it }
    }

@Suppress("ObjectPropertyName")
private var _testTubes: ImageVector? = null
