package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Boxes: ImageVector
    get() {
        val current = _boxes
        if (current != null) return current

        return ImageVector.Builder(
            name = "Boxes",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2.97 12.92 A2 2 0 0 0 2 14.63 v3.24 a2 2 0 0 0 .97 1.71 l3 1.8 a2 2 0 0 0 2.06 0 L12 19 v-5.5 l-5 -3z M7 16.5 l-4.74 -2.85 M7 16.5 l5 -3 m-5 3 v5.17 m5 -8.17 V19 l3.97 2.38 a2 2 0 0 0 2.06 0 l3 -1.8 A2 2 0 0 0 22 17.87 v-3.24 a2 2 0 0 0 -.97 -1.71 L17 10.5z m5 3 -5 -3 m5 3 4.74 -2.85 M17 16.5 v5.17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2.97 12.92
                moveTo(x = 2.97f, y = 12.92f)
                // A 2 2 0 0 0 2 14.63
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 14.63f,
                )
                // v 3.24
                verticalLineToRelative(dy = 3.24f)
                // a 2 2 0 0 0 0.97 1.71
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.97f,
                    dy1 = 1.71f,
                )
                // l 3 1.8
                lineToRelative(dx = 3.0f, dy = 1.8f)
                // a 2 2 0 0 0 2.06 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.06f,
                    dy1 = 0.0f,
                )
                // L 12 19
                lineTo(x = 12.0f, y = 19.0f)
                // v -5.5
                verticalLineToRelative(dy = -5.5f)
                // l -5 -3z
                lineToRelative(dx = -5.0f, dy = -3.0f)
                close()
                // M 7 16.5
                moveTo(x = 7.0f, y = 16.5f)
                // l -4.74 -2.85
                lineToRelative(dx = -4.74f, dy = -2.85f)
                // M 7 16.5
                moveTo(x = 7.0f, y = 16.5f)
                // l 5 -3
                lineToRelative(dx = 5.0f, dy = -3.0f)
                // m -5 3
                moveToRelative(dx = -5.0f, dy = 3.0f)
                // v 5.17
                verticalLineToRelative(dy = 5.17f)
                // m 5 -8.17
                moveToRelative(dx = 5.0f, dy = -8.17f)
                // V 19
                verticalLineTo(y = 19.0f)
                // l 3.97 2.38
                lineToRelative(dx = 3.97f, dy = 2.38f)
                // a 2 2 0 0 0 2.06 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.06f,
                    dy1 = 0.0f,
                )
                // l 3 -1.8
                lineToRelative(dx = 3.0f, dy = -1.8f)
                // A 2 2 0 0 0 22 17.87
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 17.87f,
                )
                // v -3.24
                verticalLineToRelative(dy = -3.24f)
                // a 2 2 0 0 0 -0.97 -1.71
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.97f,
                    dy1 = -1.71f,
                )
                // L 17 10.5z
                lineTo(x = 17.0f, y = 10.5f)
                close()
                // m 5 3
                moveToRelative(dx = 5.0f, dy = 3.0f)
                // l -5 -3
                lineToRelative(dx = -5.0f, dy = -3.0f)
                // m 5 3
                moveToRelative(dx = 5.0f, dy = 3.0f)
                // l 4.74 -2.85
                lineToRelative(dx = 4.74f, dy = -2.85f)
                // M 17 16.5
                moveTo(x = 17.0f, y = 16.5f)
                // v 5.17
                verticalLineToRelative(dy = 5.17f)
            }
            // M7.97 4.42 A2 2 0 0 0 7 6.13 v4.37 l5 3 5 -3 V6.13 a2 2 0 0 0 -.97 -1.71 l-3 -1.8 a2 2 0 0 0 -2.06 0z M12 8 7.26 5.15 M12 8 l4.74 -2.85 M12 13.5 V8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7.97 4.42
                moveTo(x = 7.97f, y = 4.42f)
                // A 2 2 0 0 0 7 6.13
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 7.0f,
                    y1 = 6.13f,
                )
                // v 4.37
                verticalLineToRelative(dy = 4.37f)
                // l 5 3
                lineToRelative(dx = 5.0f, dy = 3.0f)
                // l 5 -3
                lineToRelative(dx = 5.0f, dy = -3.0f)
                // V 6.13
                verticalLineTo(y = 6.13f)
                // a 2 2 0 0 0 -0.97 -1.71
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.97f,
                    dy1 = -1.71f,
                )
                // l -3 -1.8
                lineToRelative(dx = -3.0f, dy = -1.8f)
                // a 2 2 0 0 0 -2.06 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.06f,
                    dy1 = 0.0f,
                )
                close()
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // L 7.26 5.15
                lineTo(x = 7.26f, y = 5.15f)
                // M 12 8
                moveTo(x = 12.0f, y = 8.0f)
                // l 4.74 -2.85
                lineToRelative(dx = 4.74f, dy = -2.85f)
                // M 12 13.5
                moveTo(x = 12.0f, y = 13.5f)
                // V 8
                verticalLineTo(y = 8.0f)
            }
        }.build().also { _boxes = it }
    }


@Suppress("ObjectPropertyName")
private var _boxes: ImageVector? = null
