package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TreePine: ImageVector
    get() {
        val current = _treePine
        if (current != null) return current

        return ImageVector.Builder(
            name = "TreePine",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // m17 14 3 3.3 a1 1 0 0 1 -.7 1.7 H4.7 A1 1 0 0 1 4 17.3 L7 14 H6.7 A1 1 0 0 1 6 12.3 L9 9 H8.8 A1 1 0 0 1 8 7.3 L12 3 l4 4.3 A1 1 0 0 1 15.2 9 H15 l3 3.3 a1 1 0 0 1 -.7 1.7z m-5 8 v-3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 14
                moveTo(x = 17.0f, y = 14.0f)
                // l 3 3.3
                lineToRelative(dx = 3.0f, dy = 3.3f)
                // a 1 1 0 0 1 -0.7 1.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = 1.7f,
                )
                // H 4.7
                horizontalLineTo(x = 4.7f)
                // A 1 1 0 0 1 4 17.3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 17.3f,
                )
                // L 7 14
                lineTo(x = 7.0f, y = 14.0f)
                // H 6.7
                horizontalLineTo(x = 6.7f)
                // A 1 1 0 0 1 6 12.3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 6.0f,
                    y1 = 12.3f,
                )
                // L 9 9
                lineTo(x = 9.0f, y = 9.0f)
                // H 8.8
                horizontalLineTo(x = 8.8f)
                // A 1 1 0 0 1 8 7.3
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 8.0f,
                    y1 = 7.3f,
                )
                // L 12 3
                lineTo(x = 12.0f, y = 3.0f)
                // l 4 4.3
                lineToRelative(dx = 4.0f, dy = 4.3f)
                // A 1 1 0 0 1 15.2 9
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 15.2f,
                    y1 = 9.0f,
                )
                // H 15
                horizontalLineTo(x = 15.0f)
                // l 3 3.3
                lineToRelative(dx = 3.0f, dy = 3.3f)
                // a 1 1 0 0 1 -0.7 1.7z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.7f,
                    dy1 = 1.7f,
                )
                close()
                // m -5 8
                moveToRelative(dx = -5.0f, dy = 8.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
            }
        }.build().also { _treePine = it }
    }


@Suppress("ObjectPropertyName")
private var _treePine: ImageVector? = null
