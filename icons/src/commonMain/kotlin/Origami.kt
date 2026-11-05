package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Origami: ImageVector
    get() {
        val current = _origami
        if (current != null) return current

        return ImageVector.Builder(
            name = "Origami",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 V4 a1 1 0 0 1 1 -1 h6.3 a1 1 0 0 1 .65 1.76 l-4.7 4.02 M12 21 l-7.41 -7.41 A2 2 0 0 1 4 12.17 V6.42 A1 1 0 0 1 5.7 5.7 L20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // a 1 1 0 0 1 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // h 6.3
                horizontalLineToRelative(dx = 6.3f)
                // a 1 1 0 0 1 0.65 1.76
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.65f,
                    dy1 = 1.76f,
                )
                // l -4.7 4.02
                lineToRelative(dx = -4.7f, dy = 4.02f)
                // M 12 21
                moveTo(x = 12.0f, y = 21.0f)
                // l -7.41 -7.41
                lineToRelative(dx = -7.41f, dy = -7.41f)
                // A 2 2 0 0 1 4 12.17
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 12.17f,
                )
                // V 6.42
                verticalLineTo(y = 6.42f)
                // A 1 1 0 0 1 5.7 5.7
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 5.7f,
                    y1 = 5.7f,
                )
                // L 20 20
                lineTo(x = 20.0f, y = 20.0f)
            }
            // m12.21 3.38 8.42 14.97 a1 1 0 0 1 -.17 1.2 L19.3 20.7 A1 1 0 0 1 18.6 21 H6.35 a1 1 0 0 1 -.62 -.22 L3.25 18.8 a1 1 0 0 1 .63 -1.78 l4.17 .03
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.21 3.38
                moveTo(x = 12.21f, y = 3.38f)
                // l 8.42 14.97
                lineToRelative(dx = 8.42f, dy = 14.97f)
                // a 1 1 0 0 1 -0.17 1.2
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.17f,
                    dy1 = 1.2f,
                )
                // L 19.3 20.7
                lineTo(x = 19.3f, y = 20.7f)
                // A 1 1 0 0 1 18.6 21
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.6f,
                    y1 = 21.0f,
                )
                // H 6.35
                horizontalLineTo(x = 6.35f)
                // a 1 1 0 0 1 -0.62 -0.22
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.62f,
                    dy1 = -0.22f,
                )
                // L 3.25 18.8
                lineTo(x = 3.25f, y = 18.8f)
                // a 1 1 0 0 1 0.63 -1.78
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.63f,
                    dy1 = -1.78f,
                )
                // l 4.17 0.03
                lineToRelative(dx = 4.17f, dy = 0.03f)
            }
        }.build().also { _origami = it }
    }


@Suppress("ObjectPropertyName")
private var _origami: ImageVector? = null
