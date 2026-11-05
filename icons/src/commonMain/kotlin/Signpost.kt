package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Signpost: ImageVector
    get() {
        val current = _signpost
        if (current != null) return current

        return ImageVector.Builder(
            name = "Signpost",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 13 v8 m0 -18 v3 m-9.65 4.35 a1.2 1.2 0 0 1 0 -1.7 l2.06 -2.06 A2 2 0 0 1 5.83 6 h12.34 a2 2 0 0 1 1.42 .59 l2.06 2.06 a1.2 1.2 0 0 1 0 1.7 l-2.06 2.06 A2 2 0 0 1 18.17 13 H5.83 a2 2 0 0 1 -1.42 -.59z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 13
                moveTo(x = 12.0f, y = 13.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // m 0 -18
                moveToRelative(dx = 0.0f, dy = -18.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m -9.65 4.35
                moveToRelative(dx = -9.65f, dy = 4.35f)
                // a 1.2 1.2 0 0 1 0 -1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -1.7f,
                )
                // l 2.06 -2.06
                lineToRelative(dx = 2.06f, dy = -2.06f)
                // A 2 2 0 0 1 5.83 6
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.83f,
                    y1 = 6.0f,
                )
                // h 12.34
                horizontalLineToRelative(dx = 12.34f)
                // a 2 2 0 0 1 1.42 0.59
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.42f,
                    dy1 = 0.59f,
                )
                // l 2.06 2.06
                lineToRelative(dx = 2.06f, dy = 2.06f)
                // a 1.2 1.2 0 0 1 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // l -2.06 2.06
                lineToRelative(dx = -2.06f, dy = 2.06f)
                // A 2 2 0 0 1 18.17 13
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.17f,
                    y1 = 13.0f,
                )
                // H 5.83
                horizontalLineTo(x = 5.83f)
                // a 2 2 0 0 1 -1.42 -0.59z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.42f,
                    dy1 = -0.59f,
                )
                close()
            }
        }.build().also { _signpost = it }
    }


@Suppress("ObjectPropertyName")
private var _signpost: ImageVector? = null
