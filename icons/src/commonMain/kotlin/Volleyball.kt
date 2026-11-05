package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Volleyball: ImageVector
    get() {
        val current = _volleyball
        if (current != null) return current

        return ImageVector.Builder(
            name = "Volleyball",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 7 a16 16 20 0 1 10.98 4.36 M12 12 a13 13 0 0 1 -8.66 5 m13.49 -3.37 a16 16 0 0 1 -9.27 7.33
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 7
                moveTo(x = 11.0f, y = 7.0f)
                // a 16 16 20 0 1 10.98 4.36
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 20.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 10.98f,
                    dy1 = 4.36f,
                )
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // a 13 13 0 0 1 -8.66 5
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -8.66f,
                    dy1 = 5.0f,
                )
                // m 13.49 -3.37
                moveToRelative(dx = 13.49f, dy = -3.37f)
                // a 16 16 0 0 1 -9.27 7.33
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -9.27f,
                    dy1 = 7.33f,
                )
            }
            // M20.66 17 A13 13 0 0 0 12 12 a13 13 0 0 1 0 -10 M8.17 15.37 a16 16 0 0 1 -1.71 -11.7
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 20.66 17
                moveTo(x = 20.66f, y = 17.0f)
                // A 13 13 0 0 0 12 12
                arcTo(
                    horizontalEllipseRadius = 13.0f,
                    verticalEllipseRadius = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 12.0f,
                )
                // a 13 13 0 0 1 0 -10
                arcToRelative(
                    a = 13.0f,
                    b = 13.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = -10.0f,
                )
                // M 8.17 15.37
                moveTo(x = 8.17f, y = 15.37f)
                // a 16 16 0 0 1 -1.71 -11.7
                arcToRelative(
                    a = 16.0f,
                    b = 16.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.71f,
                    dy1 = -11.7f,
                )
            }
            // <circle cx="12.0" cy="12.0" radius="10.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // m -10 0
                moveToRelative(dx = -10.0f, dy = 0.0f)
                // a 10 10 0 1 1 20 0
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 20.0f,
                    dy1 = 0.0f,
                )
                // a 10 10 0 1 1 -20 0z
                arcToRelative(
                    a = 10.0f,
                    b = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -20.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _volleyball = it }
    }


@Suppress("ObjectPropertyName")
private var _volleyball: ImageVector? = null
