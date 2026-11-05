package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.EthernetPort: ImageVector
    get() {
        val current = _ethernetPort
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.EthernetPort",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 8 v1 m4 -1 v1 m4 -1 v1 m1 8 a2 2 0 0 0 -1.76 1.06 l-.47 .88 A2 2 0 0 1 15 20 H9 a2 2 0 0 1 -1.76 -1.06 l-.47 -.88 A2 2 0 0 0 5 17 H4 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v9 a2 2 0 0 1 -2 2z M6 8 v1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 8
                moveTo(x = 10.0f, y = 8.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 4 -1
                moveToRelative(dx = 4.0f, dy = -1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 4 -1
                moveToRelative(dx = 4.0f, dy = -1.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // m 1 8
                moveToRelative(dx = 1.0f, dy = 8.0f)
                // a 2 2 0 0 0 -1.76 1.06
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.76f,
                    dy1 = 1.06f,
                )
                // l -0.47 0.88
                lineToRelative(dx = -0.47f, dy = 0.88f)
                // A 2 2 0 0 1 15 20
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.0f,
                    y1 = 20.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 2 2 0 0 1 -1.76 -1.06
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.76f,
                    dy1 = -1.06f,
                )
                // l -0.47 -0.88
                lineToRelative(dx = -0.47f, dy = -0.88f)
                // A 2 2 0 0 0 5 17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 17.0f,
                )
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
                // V 6
                verticalLineTo(y = 6.0f)
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
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // a 2 2 0 0 1 -2 2z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                close()
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
            }
        }.build().also { _ethernetPort = it }
    }

@Suppress("ObjectPropertyName")
private var _ethernetPort: ImageVector? = null
