package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.FileTextSparkles: ImageVector
    get() {
        val current = _fileTextSparkles
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.FileTextSparkles",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 9 H8 m4.54 13 H6 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h8 m-.5 15 H8 m7 -9 a1 1 0 0 1 -1 -1 V2 a2.4 2.4 0 0 1 1.7 .7 l3.6 3.6 A2.4 2.4 0 0 1 20 8z m1 5 H8 m10 9 v-4 m2 2 h-4 m4 -12 v1.13 M21 13 v2 m1 -1 h-2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 9
                moveTo(x = 10.0f, y = 9.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 4.54 13
                moveToRelative(dx = 4.54f, dy = 13.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
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
                // V 4
                verticalLineTo(y = 4.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // m -0.5 15
                moveToRelative(dx = -0.5f, dy = 15.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 7 -9
                moveToRelative(dx = 7.0f, dy = -9.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // a 2.4 2.4 0 0 1 1.7 0.7
                arcToRelative(
                    a = 2.4f,
                    b = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.7f,
                    dy1 = 0.7f,
                )
                // l 3.6 3.6
                lineToRelative(dx = 3.6f, dy = 3.6f)
                // A 2.4 2.4 0 0 1 20 8z
                arcTo(
                    horizontalEllipseRadius = 2.4f,
                    verticalEllipseRadius = 2.4f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 20.0f,
                    y1 = 8.0f,
                )
                close()
                // m 1 5
                moveToRelative(dx = 1.0f, dy = 5.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // m 10 9
                moveToRelative(dx = 10.0f, dy = 9.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // m 2 2
                moveToRelative(dx = 2.0f, dy = 2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // m 4 -12
                moveToRelative(dx = 4.0f, dy = -12.0f)
                // v 1.13
                verticalLineToRelative(dy = 1.13f)
                // M 21 13
                moveTo(x = 21.0f, y = 13.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // m 1 -1
                moveToRelative(dx = 1.0f, dy = -1.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
            }
        }.build().also { _fileTextSparkles = it }
    }

@Suppress("ObjectPropertyName")
private var _fileTextSparkles: ImageVector? = null
