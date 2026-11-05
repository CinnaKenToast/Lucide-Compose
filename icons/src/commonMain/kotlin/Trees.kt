package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trees: ImageVector
    get() {
        val current = _trees
        if (current != null) return current

        return ImageVector.Builder(
            name = "Trees",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M10 10 v.2 A3 3 0 0 1 8.9 16 H5 a3 3 0 0 1 -1 -5.8 V10 a3 3 0 0 1 6 0 m-3 6 v6 m6 -3 v3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 10 10
                moveTo(x = 10.0f, y = 10.0f)
                // v 0.2
                verticalLineToRelative(dy = 0.2f)
                // A 3 3 0 0 1 8.9 16
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.9f,
                    y1 = 16.0f,
                )
                // H 5
                horizontalLineTo(x = 5.0f)
                // a 3 3 0 0 1 -1 -5.8
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -5.8f,
                )
                // V 10
                verticalLineTo(y = 10.0f)
                // a 3 3 0 0 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // m -3 6
                moveToRelative(dx = -3.0f, dy = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // m 6 -3
                moveToRelative(dx = 6.0f, dy = -3.0f)
                // v 3
                verticalLineToRelative(dy = 3.0f)
            }
            // M12 19 h8.3 a1 1 0 0 0 .7 -1.7 L18 14 h.3 a1 1 0 0 0 .7 -1.7 L16 9 h.2 A1 1 0 0 0 17 7.3 L13 3 l-1.4 1.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 19
                moveTo(x = 12.0f, y = 19.0f)
                // h 8.3
                horizontalLineToRelative(dx = 8.3f)
                // a 1 1 0 0 0 0.7 -1.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = -1.7f,
                )
                // L 18 14
                lineTo(x = 18.0f, y = 14.0f)
                // h 0.3
                horizontalLineToRelative(dx = 0.3f)
                // a 1 1 0 0 0 0.7 -1.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.7f,
                    dy1 = -1.7f,
                )
                // L 16 9
                lineTo(x = 16.0f, y = 9.0f)
                // h 0.2
                horizontalLineToRelative(dx = 0.2f)
                // A 1 1 0 0 0 17 7.3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 17.0f,
                    y1 = 7.3f,
                )
                // L 13 3
                lineTo(x = 13.0f, y = 3.0f)
                // l -1.4 1.5
                lineToRelative(dx = -1.4f, dy = 1.5f)
            }
        }.build().also { _trees = it }
    }


@Suppress("ObjectPropertyName")
private var _trees: ImageVector? = null
