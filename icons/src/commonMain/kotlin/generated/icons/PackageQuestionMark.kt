package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.PackageQuestionMark: ImageVector
    get() {
        val current = _packageQuestionMark
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.PackageQuestionMark",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 22 V12 l8.71 -5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 22
                moveTo(x = 12.0f, y = 22.0f)
                // V 12
                verticalLineTo(y = 12.0f)
                // l 8.71 -5
                lineToRelative(dx = 8.71f, dy = -5.0f)
            }
            // M21 10.34 V8 a2 2 0 0 0 -1 -1.73 l-7 -4 a2 2 0 0 0 -2 0 l-7 4 A2 2 0 0 0 3 8 v8 a2 2 0 0 0 1 1.73 l7 4 a2 2 0 0 0 2 0 l2.33 -1.33 M3.29 7 12 12 M7.5 4.27 l9 5.15
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 10.34
                moveTo(x = 21.0f, y = 10.34f)
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
                // l -7 -4
                lineToRelative(dx = -7.0f, dy = -4.0f)
                // a 2 2 0 0 0 -2 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // l -7 4
                lineToRelative(dx = -7.0f, dy = 4.0f)
                // A 2 2 0 0 0 3 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 8.0f,
                )
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // a 2 2 0 0 0 1 1.73
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.73f,
                )
                // l 7 4
                lineToRelative(dx = 7.0f, dy = 4.0f)
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
                // l 2.33 -1.33
                lineToRelative(dx = 2.33f, dy = -1.33f)
                // M 3.29 7
                moveTo(x = 3.29f, y = 7.0f)
                // L 12 12
                lineTo(x = 12.0f, y = 12.0f)
                // M 7.5 4.27
                moveTo(x = 7.5f, y = 4.27f)
                // l 9 5.15
                lineToRelative(dx = 9.0f, dy = 5.15f)
            }
            // M19 18.5 c.5 -1 2 -1 2 -2.5 a2 2 0 0 0 -2 -2 2.5 2.5 0 0 0 -2 1 m2 7 h.01
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 19 18.5
                moveTo(x = 19.0f, y = 18.5f)
                // c 0.5 -1 2 -1 2 -2.5
                curveToRelative(
                    dx1 = 0.5f,
                    dy1 = -1.0f,
                    dx2 = 2.0f,
                    dy2 = -1.0f,
                    dx3 = 2.0f,
                    dy3 = -2.5f,
                )
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // a 2.5 2.5 0 0 0 -2 1
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 1.0f,
                )
                // m 2 7
                moveToRelative(dx = 2.0f, dy = 7.0f)
                // h 0.01
                horizontalLineToRelative(dx = 0.01f)
            }
        }.build().also { _packageQuestionMark = it }
    }

@Suppress("ObjectPropertyName")
private var _packageQuestionMark: ImageVector? = null
