package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Engine: ImageVector
    get() {
        val current = _engine
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Engine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 3 h6 m-3 0 v4 M2 10 v6 m0 -3 h4 m0 3 a2 2 0 0 0 2 2 h1 a2 2 0 0 1 1.6 .8 l.3 .4 a2 2 0 0 0 1.6 .8 h2.26 a2 2 0 0 0 1.8 -1.1 l1.66 -3.35 a1 1 0 0 1 .9 -.55 H21 a1 1 0 0 0 1 -1 v-4 a1 1 0 0 0 -1 -1 h-3.5 a1 1 0 0 1 -.8 -.4 l-.9 -1.2 A1 1 0 0 0 15 7 h-4 a1 1 0 0 0 -.8 .4 L9.3 8.6 A1 1 0 0 1 8.5 9 H7 a1 1 0 0 0 -1 1z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 3
                moveTo(x = 10.0f, y = 3.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // M 2 10
                moveTo(x = 2.0f, y = 10.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 0 -3
                moveToRelative(dx = 0.0f, dy = -3.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // m 0 3
                moveToRelative(dx = 0.0f, dy = 3.0f)
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
                // a 2 2 0 0 1 1.6 0.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.6f,
                    dy1 = 0.8f,
                )
                // l 0.3 0.4
                lineToRelative(dx = 0.3f, dy = 0.4f)
                // a 2 2 0 0 0 1.6 0.8
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.6f,
                    dy1 = 0.8f,
                )
                // h 2.26
                horizontalLineToRelative(dx = 2.26f)
                // a 2 2 0 0 0 1.8 -1.1
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.8f,
                    dy1 = -1.1f,
                )
                // l 1.66 -3.35
                lineToRelative(dx = 1.66f, dy = -3.35f)
                // a 1 1 0 0 1 0.9 -0.55
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.9f,
                    dy1 = -0.55f,
                )
                // H 21
                horizontalLineTo(x = 21.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // h -3.5
                horizontalLineToRelative(dx = -3.5f)
                // a 1 1 0 0 1 -0.8 -0.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.8f,
                    dy1 = -0.4f,
                )
                // l -0.9 -1.2
                lineToRelative(dx = -0.9f, dy = -1.2f)
                // A 1 1 0 0 0 15 7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 15.0f,
                    y1 = 7.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // a 1 1 0 0 0 -0.8 0.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.8f,
                    dy1 = 0.4f,
                )
                // L 9.3 8.6
                lineTo(x = 9.3f, y = 8.6f)
                // A 1 1 0 0 1 8.5 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.5f,
                    y1 = 9.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 1 1 0 0 0 -1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                close()
            }
        }.build().also { _engine = it }
    }

@Suppress("ObjectPropertyName")
private var _engine: ImageVector? = null
