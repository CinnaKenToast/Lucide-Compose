package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookCopy: ImageVector
    get() {
        val current = _bookCopy
        if (current != null) return current

        return ImageVector.Builder(
            name = "BookCopy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M5 7 a2 2 0 0 0 -2 2 v11
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5 7
                moveTo(x = 5.0f, y = 7.0f)
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
                // v 11
                verticalLineToRelative(dy = 11.0f)
            }
            // M5.8 18 H5 a2 2 0 0 0 0 4 h9.5 a.5 .5 0 0 0 .5 -.5 V21 m-6 -6 V4 a2 2 0 0 1 2 -2 h9.5 A.5 .5 0 0 1 21 2.5 v14 a.5 .5 0 0 1 -.5 .5 H11 a2 2 0 0 1 0 -4 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 5.8 18
                moveTo(x = 5.8f, y = 18.0f)
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 2 2 0 0 0 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // h 9.5
                horizontalLineToRelative(dx = 9.5f)
                // a 0.5 0.5 0 0 0 0.5 -0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = -0.5f,
                )
                // V 21
                verticalLineTo(y = 21.0f)
                // m -6 -6
                moveToRelative(dx = -6.0f, dy = -6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 9.5
                horizontalLineToRelative(dx = 9.5f)
                // A 0.5 0.5 0 0 1 21 2.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 21.0f,
                    y1 = 2.5f,
                )
                // v 14
                verticalLineToRelative(dy = 14.0f)
                // a 0.5 0.5 0 0 1 -0.5 0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.5f,
                    dy1 = 0.5f,
                )
                // H 11
                horizontalLineTo(x = 11.0f)
                // a 2 2 0 0 1 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
        }.build().also { _bookCopy = it }
    }


@Suppress("ObjectPropertyName")
private var _bookCopy: ImageVector? = null
