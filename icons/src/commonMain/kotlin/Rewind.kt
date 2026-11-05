package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rewind: ImageVector
    get() {
        val current = _rewind
        if (current != null) return current

        return ImageVector.Builder(
            name = "Rewind",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6 a2 2 0 0 0 -3.41 -1.41 l-6 6 a2 2 0 0 0 0 2.82 l6 6 A2 2 0 0 0 12 18z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // a 2 2 0 0 0 -3.41 -1.41
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.41f,
                    dy1 = -1.41f,
                )
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // a 2 2 0 0 0 0 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.82f,
                )
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // A 2 2 0 0 0 12 18z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 12.0f,
                    y1 = 18.0f,
                )
                close()
            }
            // M22 6 a2 2 0 0 0 -3.41 -1.41 l-6 6 a2 2 0 0 0 0 2.82 l6 6 A2 2 0 0 0 22 18z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 22 6
                moveTo(x = 22.0f, y = 6.0f)
                // a 2 2 0 0 0 -3.41 -1.41
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.41f,
                    dy1 = -1.41f,
                )
                // l -6 6
                lineToRelative(dx = -6.0f, dy = 6.0f)
                // a 2 2 0 0 0 0 2.82
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 2.82f,
                )
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
                // A 2 2 0 0 0 22 18z
                arcTo(
                    horizontalEllipseRadius = 2.0f,
                    verticalEllipseRadius = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 18.0f,
                )
                close()
            }
        }.build().also { _rewind = it }
    }


@Suppress("ObjectPropertyName")
private var _rewind: ImageVector? = null
