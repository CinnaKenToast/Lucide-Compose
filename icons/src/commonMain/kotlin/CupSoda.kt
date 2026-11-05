package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CupSoda: ImageVector
    get() {
        val current = _cupSoda
        if (current != null) return current

        return ImageVector.Builder(
            name = "CupSoda",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m6 8 1.75 12.28 a2 2 0 0 0 2 1.72 h4.54 a2 2 0 0 0 2 -1.72 L18 8 M5 8 h14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 8
                moveTo(x = 6.0f, y = 8.0f)
                // l 1.75 12.28
                lineToRelative(dx = 1.75f, dy = 12.28f)
                // a 2 2 0 0 0 2 1.72
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 1.72f,
                )
                // h 4.54
                horizontalLineToRelative(dx = 4.54f)
                // a 2 2 0 0 0 2 -1.72
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -1.72f,
                )
                // L 18 8
                lineTo(x = 18.0f, y = 8.0f)
                // M 5 8
                moveTo(x = 5.0f, y = 8.0f)
                // h 14
                horizontalLineToRelative(dx = 14.0f)
            }
            // M7 15 a6.5 6.5 0 0 1 5 0 6.5 6.5 0 0 0 5 0 m-5 -7 1 -6 h2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 15
                moveTo(x = 7.0f, y = 15.0f)
                // a 6.5 6.5 0 0 1 5 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 6.5 6.5 0 0 0 5 0
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // m -5 -7
                moveToRelative(dx = -5.0f, dy = -7.0f)
                // l 1 -6
                lineToRelative(dx = 1.0f, dy = -6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
            }
        }.build().also { _cupSoda = it }
    }


@Suppress("ObjectPropertyName")
private var _cupSoda: ImageVector? = null
