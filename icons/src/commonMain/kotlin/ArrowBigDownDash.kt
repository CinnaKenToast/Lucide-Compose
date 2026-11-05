package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowBigDownDash: ImageVector
    get() {
        val current = _arrowBigDownDash
        if (current != null) return current

        return ImageVector.Builder(
            name = "ArrowBigDownDash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 8 a1 1 0 0 1 1 1 v2 a1 1 0 0 0 1 1 h3.3 a.7 .7 0 0 1 .5 1.2 l-6.95 6.95 a1.2 1.2 0 0 1 -1.7 0 L4.2 13.2 A.7 .7 0 0 1 4.7 12 H8 a1 1 0 0 0 1 -1 V9 a1 1 0 0 1 1 -1z M9 4 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 8
                moveTo(x = 14.0f, y = 8.0f)
                // a 1 1 0 0 1 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // a 1 1 0 0 0 1 1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                // h 3.3
                horizontalLineToRelative(dx = 3.3f)
                // a 0.7 0.7 0 0 1 0.5 1.2
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = 1.2f,
                )
                // l -6.95 6.95
                lineToRelative(dx = -6.95f, dy = 6.95f)
                // a 1.2 1.2 0 0 1 -1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // L 4.2 13.2
                lineTo(x = 4.2f, y = 13.2f)
                // A 0.7 0.7 0 0 1 4.7 12
                arcTo(
                    horizontalEllipseRadius = 0.7f,
                    verticalEllipseRadius = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.7f,
                    y1 = 12.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // V 9
                verticalLineTo(y = 9.0f)
                // a 1 1 0 0 1 1 -1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                close()
                // M 9 4
                moveTo(x = 9.0f, y = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _arrowBigDownDash = it }
    }


@Suppress("ObjectPropertyName")
private var _arrowBigDownDash: ImageVector? = null
