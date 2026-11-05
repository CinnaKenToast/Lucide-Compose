package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IvBag: ImageVector
    get() {
        val current = _ivBag
        if (current != null) return current

        return ImageVector.Builder(
            name = "IvBag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 18 v2 a2 2 0 0 0 2 2 h6 M6 11 c.72 .5 1.44 1 3 1 3 0 3 -2 6 -2 1.56 0 2.28 .5 3 1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 18
                moveTo(x = 12.0f, y = 18.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // M 6 11
                moveTo(x = 6.0f, y = 11.0f)
                // c 0.72 0.5 1.44 1 3 1
                curveToRelative(
                    dx1 = 0.72f,
                    dy1 = 0.5f,
                    dx2 = 1.44f,
                    dy2 = 1.0f,
                    dx3 = 3.0f,
                    dy3 = 1.0f,
                )
                // c 3 0 3 -2 6 -2
                curveToRelative(
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                    dx2 = 3.0f,
                    dy2 = -2.0f,
                    dx3 = 6.0f,
                    dy3 = -2.0f,
                )
                // c 1.56 0 2.28 0.5 3 1
                curveToRelative(
                    dx1 = 1.56f,
                    dy1 = 0.0f,
                    dx2 = 2.28f,
                    dy2 = 0.5f,
                    dx3 = 3.0f,
                    dy3 = 1.0f,
                )
            }
            // M9.3 3 c.45 0 .88 -.18 1.2 -.5 S11.25 2 11.7 2 h.6 c.45 0 .88 .18 1.2 .5 S14.25 3 14.7 3 H16 a2 2 0 0 1 2 2 v11 a2 2 0 0 1 -2 2 H8 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 9.3 3
                moveTo(x = 9.3f, y = 3.0f)
                // c 0.45 0 0.88 -0.18 1.2 -0.5
                curveToRelative(
                    dx1 = 0.45f,
                    dy1 = 0.0f,
                    dx2 = 0.88f,
                    dy2 = -0.18f,
                    dx3 = 1.2f,
                    dy3 = -0.5f,
                )
                // S 11.25 2 11.7 2
                reflectiveCurveTo(
                    x1 = 11.25f,
                    y1 = 2.0f,
                    x2 = 11.7f,
                    y2 = 2.0f,
                )
                // h 0.6
                horizontalLineToRelative(dx = 0.6f)
                // c 0.45 0 0.88 0.18 1.2 0.5
                curveToRelative(
                    dx1 = 0.45f,
                    dy1 = 0.0f,
                    dx2 = 0.88f,
                    dy2 = 0.18f,
                    dx3 = 1.2f,
                    dy3 = 0.5f,
                )
                // S 14.25 3 14.7 3
                reflectiveCurveTo(
                    x1 = 14.25f,
                    y1 = 3.0f,
                    x2 = 14.7f,
                    y2 = 3.0f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
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
                // v 11
                verticalLineToRelative(dy = 11.0f)
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
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // a 2 2 0 0 1 2 -2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                close()
            }
        }.build().also { _ivBag = it }
    }


@Suppress("ObjectPropertyName")
private var _ivBag: ImageVector? = null
