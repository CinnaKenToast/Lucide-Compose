package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowBigUpDash: ImageVector
    get() {
        val current = _arrowBigUpDash
        if (current != null) return current

        return ImageVector.Builder(
            name = "ArrowBigUpDash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M14 16 a1 1 0 0 0 1 -1 v-2 a1 1 0 0 1 1 -1 h3.3 a.7 .7 0 0 0 .5 -1.2 l-6.95 -6.95 a1.2 1.2 0 0 0 -1.7 0 L4.2 10.8 A.7 .7 0 0 0 4.7 12 H8 a1 1 0 0 1 1 1 v2 a1 1 0 0 0 1 1z m-5 4 h6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 14 16
                moveTo(x = 14.0f, y = 16.0f)
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
                // v -2
                verticalLineToRelative(dy = -2.0f)
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
                // h 3.3
                horizontalLineToRelative(dx = 3.3f)
                // a 0.7 0.7 0 0 0 0.5 -1.2
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.5f,
                    dy1 = -1.2f,
                )
                // l -6.95 -6.95
                lineToRelative(dx = -6.95f, dy = -6.95f)
                // a 1.2 1.2 0 0 0 -1.7 0
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.7f,
                    dy1 = 0.0f,
                )
                // L 4.2 10.8
                lineTo(x = 4.2f, y = 10.8f)
                // A 0.7 0.7 0 0 0 4.7 12
                arcTo(
                    horizontalEllipseRadius = 0.7f,
                    verticalEllipseRadius = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 4.7f,
                    y1 = 12.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // a 1 1 0 0 0 1 1z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = 1.0f,
                )
                close()
                // m -5 4
                moveToRelative(dx = -5.0f, dy = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _arrowBigUpDash = it }
    }


@Suppress("ObjectPropertyName")
private var _arrowBigUpDash: ImageVector? = null
