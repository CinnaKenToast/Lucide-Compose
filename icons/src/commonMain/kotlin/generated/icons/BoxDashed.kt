package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BoxDashed: ImageVector
    get() {
        val current = _boxDashed
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.BoxDashed",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 v3 m0 7 v-3 m6.27 -.27 1.73 -1 A2 2 0 0 0 21 16 v-2 m-.3 -7 L18 8.55 M21 10 V8 a2 2 0 0 0 -1 -1.73 l-1.73 -1 M3 10 V8 a2 2 0 0 1 1 -1.73 l1.73 -1 M3.3 7 6 8.55 M5.73 18.73 l-1.73 -1 A2 2 0 0 1 3 16 v-2 m6.27 6.73 1.73 1 a2 2 0 0 0 2 0 l1.73 -1 M9.27 3.27 l1.73 -1 a2 2 0 0 1 2 0 l1.73 1 m-5.26 7.27 L12 12 l2.53 -1.46
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // m 0 7
                moveToRelative(dx = 0.0f, dy = 7.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // m 6.27 -0.27
                moveToRelative(dx = 6.27f, dy = -0.27f)
                // l 1.73 -1
                lineToRelative(dx = 1.73f, dy = -1.0f)
                // A 2 2 0 0 0 21 16
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.0f,
                    y1 = 16.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m -0.3 -7
                moveToRelative(dx = -0.3f, dy = -7.0f)
                // L 18 8.55
                lineTo(x = 18.0f, y = 8.55f)
                // M 21 10
                moveTo(x = 21.0f, y = 10.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 0 -1 -1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.73f,
                )
                // l -1.73 -1
                lineToRelative(dx = -1.73f, dy = -1.0f)
                // M 3 10
                moveTo(x = 3.0f, y = 10.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // a 2 2 0 0 1 1 -1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.73f,
                )
                // l 1.73 -1
                lineToRelative(dx = 1.73f, dy = -1.0f)
                // M 3.3 7
                moveTo(x = 3.3f, y = 7.0f)
                // L 6 8.55
                lineTo(x = 6.0f, y = 8.55f)
                // M 5.73 18.73
                moveTo(x = 5.73f, y = 18.73f)
                // l -1.73 -1
                lineToRelative(dx = -1.73f, dy = -1.0f)
                // A 2 2 0 0 1 3 16
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 3.0f,
                    y1 = 16.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // m 6.27 6.73
                moveToRelative(dx = 6.27f, dy = 6.73f)
                // l 1.73 1
                lineToRelative(dx = 1.73f, dy = 1.0f)
                // a 2 2 0 0 0 2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // l 1.73 -1
                lineToRelative(dx = 1.73f, dy = -1.0f)
                // M 9.27 3.27
                moveTo(x = 9.27f, y = 3.27f)
                // l 1.73 -1
                lineToRelative(dx = 1.73f, dy = -1.0f)
                // a 2 2 0 0 1 2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // l 1.73 1
                lineToRelative(dx = 1.73f, dy = 1.0f)
                // m -5.26 7.27
                moveToRelative(dx = -5.26f, dy = 7.27f)
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // l 2.53 -1.46
                lineToRelative(dx = 2.53f, dy = -1.46f)
            }
        }.build().also { _boxDashed = it }
    }

@Suppress("ObjectPropertyName")
private var _boxDashed: ImageVector? = null
