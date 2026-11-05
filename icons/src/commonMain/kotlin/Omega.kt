package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Omega: ImageVector
    get() {
        val current = _omega
        if (current != null) return current

        return ImageVector.Builder(
            name = "Omega",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M3 20 h4.5 A.5 .5 0 0 0 8 19.5 v-.28 a.5 .5 0 0 0 -.25 -.44 8 8 0 1 1 8.5 0 A.5 .5 0 0 0 16 19.22 v.28 a.5 .5 0 0 0 .5 .5 H21
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 20
                moveTo(x = 3.0f, y = 20.0f)
                // h 4.5
                horizontalLineToRelative(dx = 4.5f)
                // A 0.5 0.5 0 0 0 8 19.5
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 19.5f,
                )
                // v -0.28
                verticalLineToRelative(dy = -0.28f)
                // a 0.5 0.5 0 0 0 -0.25 -0.44
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.25f,
                    dy1 = -0.44f,
                )
                // a 8 8 0 1 1 8.5 0
                arcToRelative(
                    a = 8.0f,
                    b = 8.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 8.5f,
                    dy1 = 0.0f,
                )
                // A 0.5 0.5 0 0 0 16 19.22
                arcTo(
                    horizontalEllipseRadius = 0.5f,
                    verticalEllipseRadius = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 16.0f,
                    y1 = 19.22f,
                )
                // v 0.28
                verticalLineToRelative(dy = 0.28f)
                // a 0.5 0.5 0 0 0 0.5 0.5
                arcToRelative(
                    a = 0.5f,
                    b = 0.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = 0.5f,
                )
                // H 21
                horizontalLineTo(x = 21.0f)
            }
        }.build().also { _omega = it }
    }


@Suppress("ObjectPropertyName")
private var _omega: ImageVector? = null
