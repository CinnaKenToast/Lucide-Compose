package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HandTruck: ImageVector
    get() {
        val current = _handTruck
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.HandTruck",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M15.61 7.1 13.5 2.59 a1 1 0 0 0 -1.33 -.49 l-2.3 1.08 A1 1 0 0 0 9.39 4.5 l4.78 10.24 a1 1 0 0 0 1.33 .49 l5.92 -2.77 a1 1 0 0 0 .49 -1.33 l-2.25 -4.8 a1 1 0 0 0 -1.33 -.5 l-6.83 3.2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 15.61 7.1
                moveTo(x = 15.61f, y = 7.1f)
                // L 13.5 2.59
                lineTo(x = 13.5f, y = 2.59f)
                // a 1 1 0 0 0 -1.33 -0.49
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.33f,
                    dy1 = -0.49f,
                )
                // l -2.3 1.08
                lineToRelative(dx = -2.3f, dy = 1.08f)
                // A 1 1 0 0 0 9.39 4.5
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 9.39f,
                    y1 = 4.5f,
                )
                // l 4.78 10.24
                lineToRelative(dx = 4.78f, dy = 10.24f)
                // a 1 1 0 0 0 1.33 0.49
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.33f,
                    dy1 = 0.49f,
                )
                // l 5.92 -2.77
                lineToRelative(dx = 5.92f, dy = -2.77f)
                // a 1 1 0 0 0 0.49 -1.33
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.49f,
                    dy1 = -1.33f,
                )
                // l -2.25 -4.8
                lineToRelative(dx = -2.25f, dy = -4.8f)
                // a 1 1 0 0 0 -1.33 -0.5
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.33f,
                    dy1 = -0.5f,
                )
                // l -6.83 3.2
                lineToRelative(dx = -6.83f, dy = 3.2f)
            }
            // M2 3.27 a2 2 0 0 1 2.81 .88 l7 15 a2 2 0 0 0 2.66 .97 L20 17.54
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2 3.27
                moveTo(x = 2.0f, y = 3.27f)
                // a 2 2 0 0 1 2.81 0.88
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.81f,
                    dy1 = 0.88f,
                )
                // l 7 15
                lineToRelative(dx = 7.0f, dy = 15.0f)
                // a 2 2 0 0 0 2.66 0.97
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.66f,
                    dy1 = 0.97f,
                )
                // L 20 17.54
                lineTo(x = 20.0f, y = 17.54f)
            }
            // <circle cx="10.0" cy="20.0" radius="2.0" fill="none" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 20
                moveTo(x = 10.0f, y = 20.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _handTruck = it }
    }

@Suppress("ObjectPropertyName")
private var _handTruck: ImageVector? = null
