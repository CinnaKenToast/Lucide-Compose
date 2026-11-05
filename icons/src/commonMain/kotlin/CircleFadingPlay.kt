package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CircleFadingPlay: ImageVector
    get() {
        val current = _circleFadingPlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "CircleFadingPlay",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 2 a10 10 0 0 1 7.38 16.75 M9 9 a1 1 0 0 1 1.52 -.86 l5 3 a1 1 0 0 1 0 1.72 l-5 3 A1 1 0 0 1 9 15z M2.5 8.88 a10 10 0 0 0 -.5 3 M2.83 16 a10 10 0 0 0 2.43 3.4 M4.64 5.24 a10 10 0 0 1 .89 -.86 m3.11 17.04 a10 10 0 0 0 7.64 -.38
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 2
                moveTo(x = 12.0f, y = 2.0f)
                // a 10 10 0 0 1 7.38 16.75
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.38f,
                    dy1 = 16.75f,
                )
                // M 9 9
                moveTo(x = 9.0f, y = 9.0f)
                // a 1 1 0 0 1 1.52 -0.86
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 1.52f,
                    dy1 = -0.86f,
                )
                // l 5 3
                lineToRelative(dx = 5.0f, dy = 3.0f)
                // a 1 1 0 0 1 0 1.72
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 1.72f,
                )
                // l -5 3
                lineToRelative(dx = -5.0f, dy = 3.0f)
                // A 1 1 0 0 1 9 15z
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 15.0f,
                )
                close()
                // M 2.5 8.88
                moveTo(x = 2.5f, y = 8.88f)
                // a 10 10 0 0 0 -0.5 3
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.5f,
                    dy1 = 3.0f,
                )
                // M 2.83 16
                moveTo(x = 2.83f, y = 16.0f)
                // a 10 10 0 0 0 2.43 3.4
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.43f,
                    dy1 = 3.4f,
                )
                // M 4.64 5.24
                moveTo(x = 4.64f, y = 5.24f)
                // a 10 10 0 0 1 0.89 -0.86
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.89f,
                    dy1 = -0.86f,
                )
                // m 3.11 17.04
                moveToRelative(dx = 3.11f, dy = 17.04f)
                // a 10 10 0 0 0 7.64 -0.38
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.64f,
                    dy1 = -0.38f,
                )
            }
        }.build().also { _circleFadingPlay = it }
    }


@Suppress("ObjectPropertyName")
private var _circleFadingPlay: ImageVector? = null
