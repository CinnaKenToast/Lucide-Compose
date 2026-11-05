package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CigaretteOff: ImageVector
    get() {
        val current = _cigaretteOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "CigaretteOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 H3 a1 1 0 0 0 -1 1 v2 a1 1 0 0 0 1 1 h13 m2 -8 c0 -2.5 -2 -2.5 -2 -5 M2 2 l20 20 m-1 -10 a1 1 0 0 1 1 1 v2 a1 1 0 0 1 -.5 .87 M22 8 c0 -2.5 -2 -2.5 -2 -5 M7 12 v4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // H 3
                horizontalLineTo(x = 3.0f)
                // a 1 1 0 0 0 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 13
                horizontalLineToRelative(dx = 13.0f)
                // m 2 -8
                moveToRelative(dx = 2.0f, dy = -8.0f)
                // c 0 -2.5 -2 -2.5 -2 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.5f,
                    dx2 = -2.0f,
                    dy2 = -2.5f,
                    dx3 = -2.0f,
                    dy3 = -5.0f,
                )
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
                // m -1 -10
                moveToRelative(dx = -1.0f, dy = -10.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 1 -0.5 0.87
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.5f,
                    dy1 = 0.87f,
                )
                // M 22 8
                moveTo(x = 22.0f, y = 8.0f)
                // c 0 -2.5 -2 -2.5 -2 -5
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -2.5f,
                    dx2 = -2.0f,
                    dy2 = -2.5f,
                    dx3 = -2.0f,
                    dy3 = -5.0f,
                )
                // M 7 12
                moveTo(x = 7.0f, y = 12.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _cigaretteOff = it }
    }


@Suppress("ObjectPropertyName")
private var _cigaretteOff: ImageVector? = null
