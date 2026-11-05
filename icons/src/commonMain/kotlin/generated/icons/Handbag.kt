package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Handbag: ImageVector
    get() {
        val current = _handbag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.lucide_compose.Lucide.Handbag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M2.05 18.57 A2 2 0 0 0 4 21 h16 a2 2 0 0 0 1.95 -2.43 l-2 -9 A2 2 0 0 0 18 8 H6 a2 2 0 0 0 -1.95 1.57z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 2.05 18.57
                moveTo(x = 2.05f, y = 18.57f)
                // A 2 2 0 0 0 4 21
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.0f,
                    y1 = 21.0f,
                )
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // a 2 2 0 0 0 1.95 -2.43
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.95f,
                    dy1 = -2.43f,
                )
                // l -2 -9
                lineToRelative(dx = -2.0f, dy = -9.0f)
                // A 2 2 0 0 0 18 8
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.0f,
                    y1 = 8.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 0 -1.95 1.57z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.95f,
                    dy1 = 1.57f,
                )
                close()
            }
            // M8 11 V6 a4 4 0 0 1 8 0 v5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 8 11
                moveTo(x = 8.0f, y = 11.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // a 4 4 0 0 1 8 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 8.0f,
                    dy1 = 0.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
            }
        }.build().also { _handbag = it }
    }

@Suppress("ObjectPropertyName")
private var _handbag: ImageVector? = null
