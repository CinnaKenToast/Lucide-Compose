package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClockArrowRight: ImageVector
    get() {
        val current = _clockArrowRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "ClockArrowRight",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 6 v6 l2 1
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // l 2 1
                lineToRelative(dx = 2.0f, dy = 1.0f)
            }
            // M13.5 21.89 A10 10 0 1 1 22 12 m-8 6 h8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 13.5 21.89
                moveTo(x = 13.5f, y = 21.89f)
                // A 10 10 0 1 1 22 12
                arcTo(
                    horizontalEllipseRadius = 10.0f,
                    verticalEllipseRadius = 10.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 22.0f,
                    y1 = 12.0f,
                )
                // m -8 6
                moveToRelative(dx = -8.0f, dy = 6.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
            }
            // m18 22 4 -4 -4 -4
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 22
                moveTo(x = 18.0f, y = 22.0f)
                // l 4 -4
                lineToRelative(dx = 4.0f, dy = -4.0f)
                // l -4 -4
                lineToRelative(dx = -4.0f, dy = -4.0f)
            }
        }.build().also { _clockArrowRight = it }
    }


@Suppress("ObjectPropertyName")
private var _clockArrowRight: ImageVector? = null
