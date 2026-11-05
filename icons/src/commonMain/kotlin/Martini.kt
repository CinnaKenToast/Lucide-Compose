package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Martini: ImageVector
    get() {
        val current = _martini
        if (current != null) return current

        return ImageVector.Builder(
            name = "Martini",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M12 12 4.2 4.2 A.7 .7 0 0 1 4.7 3 h14.6 a.7 .7 0 0 1 .5 1.2z m0 0 v10 m-5 0 h10
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 12
                moveTo(x = 12.0f, y = 12.0f)
                // L 4.2 4.2
                lineTo(x = 4.2f, y = 4.2f)
                // A 0.7 0.7 0 0 1 4.7 3
                arcTo(
                    horizontalEllipseRadius = 0.7f,
                    verticalEllipseRadius = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.7f,
                    y1 = 3.0f,
                )
                // h 14.6
                horizontalLineToRelative(dx = 14.6f)
                // a 0.7 0.7 0 0 1 0.5 1.2z
                arcToRelative(
                    a = 0.7f,
                    b = 0.7f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.5f,
                    dy1 = 1.2f,
                )
                close()
                // m 0 0
                moveToRelative(dx = 0.0f, dy = 0.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // m -5 0
                moveToRelative(dx = -5.0f, dy = 0.0f)
                // h 10
                horizontalLineToRelative(dx = 10.0f)
            }
        }.build().also { _martini = it }
    }


@Suppress("ObjectPropertyName")
private var _martini: ImageVector? = null
