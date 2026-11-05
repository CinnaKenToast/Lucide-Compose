package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SquareLetterM: ImageVector
    get() {
        val current = _squareLetterM
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.SquareLetterM",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M8 16 V8.5 a.5 .5 0 0 1 .9 -.3 l2.7 3.6 a.5 .5 0 0 0 .8 0 l2.7 -3.6 A.5 .5 0 0 1 16 8.5 V16
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // V 8.5
                verticalLineTo(y = 8.5f)
                // a 0.5 0.5 0 0 1 0.9 -0.3
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.9f,
                    dy1 = -0.3f,
                )
                // l 2.7 3.6
                lineToRelative(dx = 2.7f, dy = 3.6f)
                // a 0.5 0.5 0 0 0 0.8 0
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = 0.0f,
                )
                // l 2.7 -3.6
                lineToRelative(dx = 2.7f, dy = -3.6f)
                // A 0.5 0.5 0 0 1 16 8.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 16.0f,
                    y1 = 8.5f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
            }
            // <rect width="18" height="18" rx="2.0" x="3.0" y="3.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 5
                moveTo(x = 3.0f, y = 5.0f)
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
                // h 14
                horizontalLineToRelative(dx = 14.0f)
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
                // v 14
                verticalLineToRelative(dy = 14.0f)
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
                // h -14
                horizontalLineToRelative(dx = -14.0f)
                // a 2 2 0 0 1 -2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _squareLetterM = it }
    }

@Suppress("ObjectPropertyName")
private var _squareLetterM: ImageVector? = null
