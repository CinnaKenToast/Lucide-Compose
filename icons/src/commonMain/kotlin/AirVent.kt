package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AirVent: ImageVector
    get() {
        val current = _airVent
        if (current != null) return current

        return ImageVector.Builder(
            name = "AirVent",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 17.5 a2.5 2.5 0 1 1 -4 2.03 V12 m-8 0 H4 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 h-2 M6 8 h12 M6.6 15.57 A2 2 0 1 0 10 17 v-5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 17.5
                moveTo(x = 18.0f, y = 17.5f)
                // a 2.5 2.5 0 1 1 -4 2.03
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 2.03f,
                )
                // V 12
                verticalLineTo(y = 12.0f)
                // m -8 0
                moveToRelative(dx = -8.0f, dy = 0.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
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
                // h 16
                horizontalLineToRelative(dx = 16.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
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
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // M 6.6 15.57
                moveTo(x = 6.6f, y = 15.57f)
                // A 2 2 0 1 0 10 17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 17.0f,
                )
                // v -5
                verticalLineToRelative(dy = -5.0f)
            }
        }.build().also { _airVent = it }
    }


@Suppress("ObjectPropertyName")
private var _airVent: ImageVector? = null
