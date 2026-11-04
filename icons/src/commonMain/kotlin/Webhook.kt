package com.shipsco.lucide_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val Webhook: ImageVector
    get() {
        val current = _webhook
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Webhook",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M18 16.98 h-5.99 c-1.1 0 -1.95 .94 -2.48 1.9 A4 4 0 0 1 2 17 a4 4 0 0 1 .57 -2
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18 16.98
                moveTo(x = 18.0f, y = 16.98f)
                // h -5.99
                horizontalLineToRelative(dx = -5.99f)
                // c -1.1 0 -1.95 0.94 -2.48 1.9
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 0.0f,
                    dx2 = -1.95f,
                    dy2 = 0.94f,
                    dx3 = -2.48f,
                    dy3 = 1.9f,
                )
                // A 4 4 0 0 1 2 17
                arcTo(
                    horizontalEllipseRadius = 4.0f,
                    verticalEllipseRadius = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 2.0f,
                    y1 = 17.0f,
                )
                // a 4 4 0 0 1 0.57 -2
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.57f,
                    dy1 = -2.0f,
                )
            }
            // m6 17 3.13 -5.78 c.53 -.97 .1 -2.18 -.5 -3.1 a4 4 0 1 1 6.89 -4.06
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 17
                moveTo(x = 6.0f, y = 17.0f)
                // l 3.13 -5.78
                lineToRelative(dx = 3.13f, dy = -5.78f)
                // c 0.53 -0.97 0.1 -2.18 -0.5 -3.1
                curveToRelative(
                    dx1 = 0.53f,
                    dy1 = -0.97f,
                    dx2 = 0.1f,
                    dy2 = -2.18f,
                    dx3 = -0.5f,
                    dy3 = -3.1f,
                )
                // a 4 4 0 1 1 6.89 -4.06
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.89f,
                    dy1 = -4.06f,
                )
            }
            // m12 6 3.13 5.73 C15.66 12.7 16.9 13 18 13 a4 4 0 0 1 0 8
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12 6
                moveTo(x = 12.0f, y = 6.0f)
                // l 3.13 5.73
                lineToRelative(dx = 3.13f, dy = 5.73f)
                // C 15.66 12.7 16.9 13 18 13
                curveTo(
                    x1 = 15.66f,
                    y1 = 12.7f,
                    x2 = 16.9f,
                    y2 = 13.0f,
                    x3 = 18.0f,
                    y3 = 13.0f,
                )
                // a 4 4 0 0 1 0 8
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
            }
        }.build().also { _webhook = it }
    }

@Preview
@Composable
private fun IconPreview() {
    com.shipsco.theme.AppTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                imageVector = Webhook,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _webhook: ImageVector? = null
