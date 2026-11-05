package com.shipsco.lucide_compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WebhookOff: ImageVector
    get() {
        val current = _webhookOff
        if (current != null) return current

        return ImageVector.Builder(
            name = "WebhookOff",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M17 17 h-5 c-1.09 -.02 -1.94 .92 -2.5 1.9 A3 3 0 1 1 2.57 15 M9 3.4 a4 4 0 0 1 6.52 .66
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 17 17
                moveTo(x = 17.0f, y = 17.0f)
                // h -5
                horizontalLineToRelative(dx = -5.0f)
                // c -1.09 -0.02 -1.94 0.92 -2.5 1.9
                curveToRelative(
                    dx1 = -1.09f,
                    dy1 = -0.02f,
                    dx2 = -1.94f,
                    dy2 = 0.92f,
                    dx3 = -2.5f,
                    dy3 = 1.9f,
                )
                // A 3 3 0 1 1 2.57 15
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    x1 = 2.57f,
                    y1 = 15.0f,
                )
                // M 9 3.4
                moveTo(x = 9.0f, y = 3.4f)
                // a 4 4 0 0 1 6.52 0.66
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 6.52f,
                    dy1 = 0.66f,
                )
            }
            // m6 17 3.1 -5.8 a2.5 2.5 0 0 0 .06 -2.05 M20.3 20.3 A4 4 0 0 1 18 21 m.6 -8 a4 4 0 0 1 3.36 3.41 M12 6 l.6 1 M2 2 l20 20
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 17
                moveTo(x = 6.0f, y = 17.0f)
                // l 3.1 -5.8
                lineToRelative(dx = 3.1f, dy = -5.8f)
                // a 2.5 2.5 0 0 0 0.06 -2.05
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.06f,
                    dy1 = -2.05f,
                )
                // M 20.3 20.3
                moveTo(x = 20.3f, y = 20.3f)
                // A 4 4 0 0 1 18 21
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 18.0f,
                    y1 = 21.0f,
                )
                // m 0.6 -8
                moveToRelative(dx = 0.6f, dy = -8.0f)
                // a 4 4 0 0 1 3.36 3.41
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.36f,
                    dy1 = 3.41f,
                )
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // l 0.6 1
                lineToRelative(dx = 0.6f, dy = 1.0f)
                // M 2 2
                moveTo(x = 2.0f, y = 2.0f)
                // l 20 20
                lineToRelative(dx = 20.0f, dy = 20.0f)
            }
        }.build().also { _webhookOff = it }
    }


@Suppress("ObjectPropertyName")
private var _webhookOff: ImageVector? = null
