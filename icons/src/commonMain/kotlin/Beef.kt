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

val Beef: ImageVector
    get() {
        val current = _beef
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.Beef",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M16.4 13.7 A6.5 6.5 0 1 0 6.28 6.6 c-1.1 3.13 -.78 3.9 -3.18 6.08 A3 3 0 0 0 5 18 c4 0 8.4 -1.8 11.4 -4.3
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16.4 13.7
                moveTo(x = 16.4f, y = 13.7f)
                // A 6.5 6.5 0 1 0 6.28 6.6
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 6.28f,
                    y1 = 6.6f,
                )
                // c -1.1 3.13 -0.78 3.9 -3.18 6.08
                curveToRelative(
                    dx1 = -1.1f,
                    dy1 = 3.13f,
                    dx2 = -0.78f,
                    dy2 = 3.9f,
                    dx3 = -3.18f,
                    dy3 = 6.08f,
                )
                // A 3 3 0 0 0 5 18
                arcTo(
                    horizontalEllipseRadius = 3.0f,
                    verticalEllipseRadius = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 5.0f,
                    y1 = 18.0f,
                )
                // c 4 0 8.4 -1.8 11.4 -4.3
                curveToRelative(
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                    dx2 = 8.4f,
                    dy2 = -1.8f,
                    dx3 = 11.4f,
                    dy3 = -4.3f,
                )
            }
            // m18.5 6 1.75 3.5 a6.5 6.5 0 0 1 -1.85 8.2 C15.4 20.2 11 22 7 22 a3 3 0 0 1 -2.68 -1.66 L2.4 16.5
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 18.5 6
                moveTo(x = 18.5f, y = 6.0f)
                // l 1.75 3.5
                lineToRelative(dx = 1.75f, dy = 3.5f)
                // a 6.5 6.5 0 0 1 -1.85 8.2
                arcToRelative(
                    a = 6.5f,
                    b = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.85f,
                    dy1 = 8.2f,
                )
                // C 15.4 20.2 11 22 7 22
                curveTo(
                    x1 = 15.4f,
                    y1 = 20.2f,
                    x2 = 11.0f,
                    y2 = 22.0f,
                    x3 = 7.0f,
                    y3 = 22.0f,
                )
                // a 3 3 0 0 1 -2.68 -1.66
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.68f,
                    dy1 = -1.66f,
                )
                // L 2.4 16.5
                lineTo(x = 2.4f, y = 16.5f)
            }
            // <circle cx="12.5" cy="8.5" radius="2.5" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 12.5 8.5
                moveTo(x = 12.5f, y = 8.5f)
                // m -2.5 0
                moveToRelative(dx = -2.5f, dy = 0.0f)
                // a 2.5 2.5 0 1 1 5 0
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 0.0f,
                )
                // a 2.5 2.5 0 1 1 -5 0z
                arcToRelative(
                    a = 2.5f,
                    b = 2.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _beef = it }
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
                imageVector = Beef,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _beef: ImageVector? = null
