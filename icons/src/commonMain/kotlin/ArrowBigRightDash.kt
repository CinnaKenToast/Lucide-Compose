package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowBigRightDash: ImageVector
    get() {
        val current = _arrowBigRightDash
        if (current != null) return current

        return ImageVector.Builder(
            name = "ArrowBigRightDash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 9 a1 1 0 0 0 1 -1 V4.7 a.7 .7 0 0 1 1.2 -.5 l6.95 6.95 a1.2 1.2 0 0 1 0 1.7 L13.2 19.8 A.7 .7 0 0 1 12 19.3 V16 a1 1 0 0 0 -1 -1 H9 a1 1 0 0 1 -1 -1 v-4 a1 1 0 0 1 1 -1z M4 9 v6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 9
                moveTo(x = 11.0f, y = 9.0f)
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
                // V 4.7
                verticalLineTo(y = 4.7f)
                // a 0.7 0.7 0 0 1 1.2 -0.5
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.2f,
                    dy1 = -0.5f,
                )
                // l 6.95 6.95
                lineToRelative(dx = 6.95f, dy = 6.95f)
                // a 1.2 1.2 0 0 1 0 1.7
                arcToRelative(
                    a = 1.2f,
                    b = 1.2f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.7f,
                )
                // L 13.2 19.8
                lineTo(x = 13.2f, y = 19.8f)
                // A 0.7 0.7 0 0 1 12 19.3
                arcTo(
                    horizontalEllipseRadius = 0.7f,
                    verticalEllipseRadius = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 12.0f,
                    y1 = 19.3f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // a 1 1 0 0 1 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
                // v -4
                verticalLineToRelative(dy = -4.0f)
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
                // M 4 9
                moveTo(x = 4.0f, y = 9.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
            }
        }.build().also { _arrowBigRightDash = it }
    }


@Suppress("ObjectPropertyName")
private var _arrowBigRightDash: ImageVector? = null
