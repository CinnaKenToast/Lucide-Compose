package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SportShoe: ImageVector
    get() {
        val current = _sportShoe
        if (current != null) return current

        return ImageVector.Builder(
            name = "SportShoe",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m15 10.42 4.8 -5.07 M19 18 h3 M9.5 22 21.41 9.42 A2 2 0 0 0 21.2 6.4 l-5.61 -4.2 A1 1 0 0 0 14 3 v2 a2 2 0 0 1 -1.4 1.9 L8.69 8.06 A1 1 0 0 0 8 9 c-.15 6.4 -2.08 9 -4 9 a2 2 0 0 0 0 4 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15 10.42
                moveTo(x = 15.0f, y = 10.42f)
                // l 4.8 -5.07
                lineToRelative(dx = 4.8f, dy = -5.07f)
                // M 19 18
                moveTo(x = 19.0f, y = 18.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // M 9.5 22
                moveTo(x = 9.5f, y = 22.0f)
                // L 21.41 9.42
                lineTo(x = 21.41f, y = 9.42f)
                // A 2 2 0 0 0 21.2 6.4
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 21.2f,
                    y1 = 6.4f,
                )
                // l -5.61 -4.2
                lineToRelative(dx = -5.61f, dy = -4.2f)
                // A 1 1 0 0 0 14 3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 14.0f,
                    y1 = 3.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 2 2 0 0 1 -1.4 1.9
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.4f,
                    dy1 = 1.9f,
                )
                // L 8.69 8.06
                lineTo(x = 8.69f, y = 8.06f)
                // A 1 1 0 0 0 8 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.0f,
                    y1 = 9.0f,
                )
                // c -0.15 6.4 -2.08 9 -4 9
                curveToRelative(
                    dx1 = -0.15f,
                    dy1 = 6.4f,
                    dx2 = -2.08f,
                    dy2 = 9.0f,
                    dx3 = -4.0f,
                    dy3 = 9.0f,
                )
                // a 2 2 0 0 0 0 4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.0f,
                )
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
        }.build().also { _sportShoe = it }
    }


@Suppress("ObjectPropertyName")
private var _sportShoe: ImageVector? = null
