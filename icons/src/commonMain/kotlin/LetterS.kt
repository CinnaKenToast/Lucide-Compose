package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Letters: ImageVector
    get() {
        val current = _letters
        if (current != null) return current

        return ImageVector.Builder(
            name = "Letters",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15 8 H9 m12 7.35 a4 4 0 1 0 0 5.3 M3 18 h4 a2 2 0 0 1 0 4 H3.5 A.5 .5 0 0 1 3 21.5 v-7 A.5 .5 0 0 1 3.5 14 H6 a2 2 0 0 1 0 4 m2 -8 3.45 -7.65 a.6 .6 0 0 1 1.1 0 L16 10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 8
                moveTo(x = 15.0f, y = 8.0f)
                // H 9
                horizontalLineTo(x = 9.0f)
                // m 12 7.35
                moveToRelative(dx = 12.0f, dy = 7.35f)
                // a 4 4 0 1 0 0 5.3
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 5.3f,
                )
                // M 3 18
                moveTo(x = 3.0f, y = 18.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // H 3.5
                horizontalLineTo(x = 3.5f)
                // A 0.5 0.5 0 0 1 3 21.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.0f,
                    y1 = 21.5f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // A 0.5 0.5 0 0 1 3.5 14
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.5f,
                    y1 = 14.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 1 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // m 2 -8
                moveToRelative(dx = 2.0f, dy = -8.0f)
                // l 3.45 -7.65
                lineToRelative(dx = 3.45f, dy = -7.65f)
                // a 0.6 0.6 0 0 1 1.1 0
                arcToRelative(
                    a = 0.6f,
                    b = 0.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                )
                // L 16 10
                lineTo(x = 16.0f, y = 10.0f)
            }
        }.build().also { _letters = it }
    }


@Suppress("ObjectPropertyName")
private var _letters: ImageVector? = null
