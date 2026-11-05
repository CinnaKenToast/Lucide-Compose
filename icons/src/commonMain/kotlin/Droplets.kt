package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Droplets: ImageVector
    get() {
        val current = _droplets
        if (current != null) return current

        return ImageVector.Builder(
            name = "Droplets",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M7 16.3 c2.2 0 4 -1.83 4 -4.05 0 -1.16 -.57 -2.26 -1.71 -3.19 S7.29 6.75 7 5.3 C6.71 6.75 5.86 8.14 4.71 9.06 S3 11.1 3 12.25 c0 2.22 1.8 4.05 4 4.05
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 16.3
                moveTo(x = 7.0f, y = 16.3f)
                // c 2.2 0 4 -1.83 4 -4.05
                curveToRelative(
                    dx1 = 2.2f,
                    dy1 = 0.0f,
                    dx2 = 4.0f,
                    dy2 = -1.83f,
                    dx3 = 4.0f,
                    dy3 = -4.05f,
                )
                // c 0 -1.16 -0.57 -2.26 -1.71 -3.19
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.16f,
                    dx2 = -0.57f,
                    dy2 = -2.26f,
                    dx3 = -1.71f,
                    dy3 = -3.19f,
                )
                // S 7.29 6.75 7 5.3
                reflectiveCurveTo(
                    x1 = 7.29f,
                    y1 = 6.75f,
                    x2 = 7.0f,
                    y2 = 5.3f,
                )
                // C 6.71 6.75 5.86 8.14 4.71 9.06
                curveTo(
                    x1 = 6.71f,
                    y1 = 6.75f,
                    x2 = 5.86f,
                    y2 = 8.14f,
                    x3 = 4.71f,
                    y3 = 9.06f,
                )
                // S 3 11.1 3 12.25
                reflectiveCurveTo(
                    x1 = 3.0f,
                    y1 = 11.1f,
                    x2 = 3.0f,
                    y2 = 12.25f,
                )
                // c 0 2.22 1.8 4.05 4 4.05
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 2.22f,
                    dx2 = 1.8f,
                    dy2 = 4.05f,
                    dx3 = 4.0f,
                    dy3 = 4.05f,
                )
            }
            // M12.56 6.6 A11 11 0 0 0 14 3.02 c.5 2.5 2 4.9 4 6.5 s3 3.5 3 5.5 a6.98 6.98 0 0 1 -11.91 4.97
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.56 6.6
                moveTo(x = 12.56f, y = 6.6f)
                // A 11 11 0 0 0 14 3.02
                arcTo(
                    horizontalEllipseRadius = 11.0f,
                    verticalEllipseRadius = 11.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 3.02f,
                )
                // c 0.5 2.5 2 4.9 4 6.5
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = 2.5f,
                    dx2 = 2.0f,
                    dy2 = 4.9f,
                    dx3 = 4.0f,
                    dy3 = 6.5f,
                )
                // s 3 3.5 3 5.5
                reflectiveCurveToRelative(
                    dx1 = 3.0f,
                    dy1 = 3.5f,
                    dx2 = 3.0f,
                    dy2 = 5.5f,
                )
                // a 6.98 6.98 0 0 1 -11.91 4.97
                arcToRelative(
                    a = 6.98f,
                    b = 6.98f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -11.91f,
                    dy1 = 4.97f,
                )
            }
        }.build().also { _droplets = it }
    }


@Suppress("ObjectPropertyName")
private var _droplets: ImageVector? = null
