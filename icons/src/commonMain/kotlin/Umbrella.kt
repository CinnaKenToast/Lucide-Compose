package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Umbrella: ImageVector
    get() {
        val current = _umbrella
        if (current != null) return current

        return ImageVector.Builder(
            name = "Umbrella",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 13 v7 a2 2 0 0 0 4 0 M12 2 v2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 13
                moveTo(x = 12.0f, y = 13.0f)
                // v 7
                verticalLineToRelative(dy = 7.0f)
                // a 2 2 0 0 0 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
            }
            // M21 13 a1 1 0 0 0 .96 -1.27 10.28 10.28 0 0 0 -19.92 0 A1 1 0 0 0 3 13z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 21 13
                moveTo(x = 21.0f, y = 13.0f)
                // a 1 1 0 0 0 0.96 -1.27
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.96f,
                    dy1 = -1.27f,
                )
                // a 10.28 10.28 0 0 0 -19.92 0
                arcToRelative(
                    a = 10.28f,
                    b = 10.28f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -19.92f,
                    dy1 = 0.0f,
                )
                // A 1 1 0 0 0 3 13z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 3.0f,
                    y1 = 13.0f,
                )
                close()
            }
        }.build().also { _umbrella = it }
    }


@Suppress("ObjectPropertyName")
private var _umbrella: ImageVector? = null
