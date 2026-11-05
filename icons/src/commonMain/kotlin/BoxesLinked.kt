package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BoxesLinked: ImageVector
    get() {
        val current = _boxesLinked
        if (current != null) return current

        return ImageVector.Builder(
            name = "BoxesLinked",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 6 h2 a2 2 0 0 1 2 2 v5 m-3.79 2.2 L18 17.4 V22
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 6
                moveTo(x = 14.0f, y = 6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // m -3.79 2.2
                moveToRelative(dx = -3.79f, dy = 2.2f)
                // L 18 17.4
                lineTo(x = 18.0f, y = 17.4f)
                // V 22
                verticalLineTo(y = 22.0f)
            }
            // M14.8 14.61 A1.6 1.6 0 0 0 14 16 v3.02 a1.6 1.6 0 0 0 .8 1.38 l2.4 1.4 a1.6 1.6 0 0 0 1.6 0 l2.4 -1.4 a1.6 1.6 0 0 0 .8 -1.38 v-3.02 a1.6 1.6 0 0 0 -.8 -1.38 l-2.4 -1.4 a1.6 1.6 0 0 0 -1.51 -.04z M18 17.4 l3.79 -2.2 M2.21 4.2 6 6.4 V16 a2 2 0 0 0 2 2 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14.8 14.61
                moveTo(x = 14.8f, y = 14.61f)
                // A 1.6 1.6 0 0 0 14 16
                arcTo(
                    horizontalEllipseRadius = 1.6f,
                    verticalEllipseRadius = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 16.0f,
                )
                // v 3.02
                verticalLineToRelative(dy = 3.02f)
                // a 1.6 1.6 0 0 0 0.8 1.38
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = 1.38f,
                )
                // l 2.4 1.4
                lineToRelative(dx = 2.4f, dy = 1.4f)
                // a 1.6 1.6 0 0 0 1.6 0
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.6f,
                    dy1 = 0.0f,
                )
                // l 2.4 -1.4
                lineToRelative(dx = 2.4f, dy = -1.4f)
                // a 1.6 1.6 0 0 0 0.8 -1.38
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = -1.38f,
                )
                // v -3.02
                verticalLineToRelative(dy = -3.02f)
                // a 1.6 1.6 0 0 0 -0.8 -1.38
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.8f,
                    dy1 = -1.38f,
                )
                // l -2.4 -1.4
                lineToRelative(dx = -2.4f, dy = -1.4f)
                // a 1.6 1.6 0 0 0 -1.51 -0.04z
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.51f,
                    dy1 = -0.04f,
                )
                close()
                // M 18 17.4
                moveTo(x = 18.0f, y = 17.4f)
                // l 3.79 -2.2
                lineToRelative(dx = 3.79f, dy = -2.2f)
                // M 2.21 4.2
                moveTo(x = 2.21f, y = 4.2f)
                // L 6 6.4
                lineTo(x = 6.0f, y = 6.4f)
                // V 16
                verticalLineTo(y = 16.0f)
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
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
            // M2.8 3.61 A1.6 1.6 0 0 0 2 5 v3 a1.6 1.6 0 0 0 .8 1.4 l2.4 1.38 a1.6 1.6 0 0 0 1.6 0 L9.2 9.4 A1.6 1.6 0 0 0 10 8.01 V5 A1.6 1.6 0 0 0 9.2 3.6 l-2.4 -1.4 A1.6 1.6 0 0 0 5.3 2.18z M6 6.4 l3.79 -2.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2.8 3.61
                moveTo(x = 2.8f, y = 3.61f)
                // A 1.6 1.6 0 0 0 2 5
                arcTo(
                    horizontalEllipseRadius = 1.6f,
                    verticalEllipseRadius = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 2.0f,
                    y1 = 5.0f,
                )
                // v 3
                verticalLineToRelative(dy = 3.0f)
                // a 1.6 1.6 0 0 0 0.8 1.4
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.8f,
                    dy1 = 1.4f,
                )
                // l 2.4 1.38
                lineToRelative(dx = 2.4f, dy = 1.38f)
                // a 1.6 1.6 0 0 0 1.6 0
                arcToRelative(
                    a = 1.6f,
                    b = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.6f,
                    dy1 = 0.0f,
                )
                // L 9.2 9.4
                lineTo(x = 9.2f, y = 9.4f)
                // A 1.6 1.6 0 0 0 10 8.01
                arcTo(
                    horizontalEllipseRadius = 1.6f,
                    verticalEllipseRadius = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 10.0f,
                    y1 = 8.01f,
                )
                // V 5
                verticalLineTo(y = 5.0f)
                // A 1.6 1.6 0 0 0 9.2 3.6
                arcTo(
                    horizontalEllipseRadius = 1.6f,
                    verticalEllipseRadius = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.2f,
                    y1 = 3.6f,
                )
                // l -2.4 -1.4
                lineToRelative(dx = -2.4f, dy = -1.4f)
                // A 1.6 1.6 0 0 0 5.3 2.18z
                arcTo(
                    horizontalEllipseRadius = 1.6f,
                    verticalEllipseRadius = 1.6f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.3f,
                    y1 = 2.18f,
                )
                close()
                // M 6 6.4
                moveTo(x = 6.0f, y = 6.4f)
                // l 3.79 -2.2
                lineToRelative(dx = 3.79f, dy = -2.2f)
            }
        }.build().also { _boxesLinked = it }
    }


@Suppress("ObjectPropertyName")
private var _boxesLinked: ImageVector? = null
