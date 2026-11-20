package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.DiagramSankey: ImageVector
    get() {
        val current = _diagramSankey
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.DiagramSankey",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M21 12 c-2.53 0 -4.06 -.5 -5.1 -1.08 a10 10 0 0 1 -2.73 -2.52 c-.85 -1.02 -1.97 -2.47 -3.56 -3.56 A11.3 11.3 0 0 0 3 3 a1 1 0 0 0 -1 1 v3 a1 1 0 0 0 1 1 c1.94 0 3.02 .44 3.8 .97 .87 .6 1.5 1.4 2.53 2.63 a18 18 0 0 0 2.69 2.72
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 12
                moveTo(x = 21.0f, y = 12.0f)
                // c -2.53 0 -4.06 -0.5 -5.1 -1.08
                curveToRelative(
                    dx1 = -2.53f,
                    dy1 = 0.0f,
                    dx2 = -4.06f,
                    dy2 = -0.5f,
                    dx3 = -5.1f,
                    dy3 = -1.08f,
                )
                // a 10 10 0 0 1 -2.73 -2.52
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.73f,
                    dy1 = -2.52f,
                )
                // c -0.85 -1.02 -1.97 -2.47 -3.56 -3.56
                curveToRelative(
                    dx1 = -0.85f,
                    dy1 = -1.02f,
                    dx2 = -1.97f,
                    dy2 = -2.47f,
                    dx3 = -3.56f,
                    dy3 = -3.56f,
                )
                // A 11.3 11.3 0 0 0 3 3
                arcTo(
                    horizontalEllipseRadius = 11.3f,
                    verticalEllipseRadius = 11.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 3.0f,
                )
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // c 1.94 0 3.02 0.44 3.8 0.97
                curveToRelative(
                    dx1 = 1.94f,
                    dy1 = 0.0f,
                    dx2 = 3.02f,
                    dy2 = 0.44f,
                    dx3 = 3.8f,
                    dy3 = 0.97f,
                )
                // c 0.87 0.6 1.5 1.4 2.53 2.63
                curveToRelative(
                    dx1 = 0.87f,
                    dy1 = 0.6f,
                    dx2 = 1.5f,
                    dy2 = 1.4f,
                    dx3 = 2.53f,
                    dy3 = 2.63f,
                )
                // a 18 18 0 0 0 2.69 2.72
                arcToRelative(
                    a = 18.0f,
                    b = 18.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.69f,
                    dy1 = 2.72f,
                )
            }
            // M3 16 a1 1 0 0 0 -1 1 v3 a1 1 0 0 0 1 1 c10 0 10 -4 18 -4 a1 1 0 0 0 1 -1 v-3 a1 1 0 0 0 -1 -1 c-8 0 -8 4 -18 4 M3 3 h18 a1 1 0 0 1 1 1 v3 a1 1 0 0 1 -1 1 h-8.04
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 3 16
                moveTo(x = 3.0f, y = 16.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
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
                // c 10 0 10 -4 18 -4
                curveToRelative(
                    dx1 = 10.0f,
                    dy1 = 0.0f,
                    dx2 = 10.0f,
                    dy2 = -4.0f,
                    dx3 = 18.0f,
                    dy3 = -4.0f,
                )
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
                // v -3
                verticalLineToRelative(dy = -3.0f)
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
                // c -8 0 -8 4 -18 4
                curveToRelative(
                    dx1 = -8.0f,
                    dy1 = 0.0f,
                    dx2 = -8.0f,
                    dy2 = 4.0f,
                    dx3 = -18.0f,
                    dy3 = 4.0f,
                )
                // M 3 3
                moveTo(x = 3.0f, y = 3.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
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
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 1 1 0 0 1 -1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = 1.0f,
                )
                // h -8.04
                horizontalLineToRelative(dx = -8.04f)
            }
        }.build().also { _diagramSankey = it }
    }

@Suppress("ObjectPropertyName")
private var _diagramSankey: ImageVector? = null
