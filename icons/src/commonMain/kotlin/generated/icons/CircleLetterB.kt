package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleLetterB: ImageVector
    get() {
        val current = _circleLetterB
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.CircleLetterB",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M9 12 h4.85 a2.2 2.2 0 0 1 1.52 .59 2 2 0 0 1 0 2.82 A2.2 2.2 0 0 1 13.85 16 H9.5 A.5 .5 0 0 1 9 15.5 v-7 A.5 .5 0 0 1 9.5 8 H13 a2 2 0 0 1 0 4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9 12
                moveTo(x = 9.0f, y = 12.0f)
                // h 4.85
                horizontalLineToRelative(dx = 4.85f)
                // a 2.2 2.2 0 0 1 1.52 0.59
                arcToRelative(
                    a = 2.2f,
                    b = 2.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.52f,
                    dy1 = 0.59f,
                )
                // a 2 2 0 0 1 0 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 2.82f,
                )
                // A 2.2 2.2 0 0 1 13.85 16
                arcTo(
                    horizontalEllipseRadius = 2.2f,
                    verticalEllipseRadius = 2.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 13.85f,
                    y1 = 16.0f,
                )
                // H 9.5
                horizontalLineTo(x = 9.5f)
                // A 0.5 0.5 0 0 1 9 15.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 15.5f,
                )
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // A 0.5 0.5 0 0 1 9.5 8
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.5f,
                    y1 = 8.0f,
                )
                // H 13
                horizontalLineTo(x = 13.0f)
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
            }
            // <circle cx="12.0" cy="12.0" radius="10.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _circleLetterB = it }
    }

@Suppress("ObjectPropertyName")
private var _circleLetterB: ImageVector? = null
