package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Balloon: ImageVector
    get() {
        val current = _balloon
        if (current != null) return current

        return ImageVector.Builder(
            name = "Balloon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 16 v1 a2 2 0 0 0 2 2 h1 a2 2 0 0 1 2 2 v1 M12 6 a2 2 0 0 1 2 2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 16
                moveTo(x = 12.0f, y = 16.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
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
                // h 1
                horizontalLineToRelative(dx = 1.0f)
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
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
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
            }
            // M18 8 c0 4 -3.5 8 -6 8 s-6 -4 -6 -8 a6 6 0 0 1 12 0
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 8
                moveTo(x = 18.0f, y = 8.0f)
                // c 0 4 -3.5 8 -6 8
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                    dx2 = -3.5f,
                    dy2 = 8.0f,
                    dx3 = -6.0f,
                    dy3 = 8.0f,
                )
                // s -6 -4 -6 -8
                reflectiveCurveToRelative(
                    dx1 = -6.0f,
                    dy1 = -4.0f,
                    dx2 = -6.0f,
                    dy2 = -8.0f,
                )
                // a 6 6 0 0 1 12 0
                arcToRelative(
                    a = 6.0f,
                    b = 6.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 12.0f,
                    dy1 = 0.0f,
                )
            }
        }.build().also { _balloon = it }
    }


@Suppress("ObjectPropertyName")
private var _balloon: ImageVector? = null
