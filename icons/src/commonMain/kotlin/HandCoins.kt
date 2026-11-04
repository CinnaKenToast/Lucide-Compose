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

val HandCoins: ImageVector
    get() {
        val current = _handCoins
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.HandCoins",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 15 h2 a2 2 0 1 0 0 -4 h-3 c-.6 0 -1.1 .2 -1.4 .6 L3 17
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 15
                moveTo(x = 11.0f, y = 15.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 1 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // c -0.6 0 -1.1 0.2 -1.4 0.6
                curveToRelative(
                    dx1 = -0.6f,
                    dy1 = 0.0f,
                    dx2 = -1.1f,
                    dy2 = 0.2f,
                    dx3 = -1.4f,
                    dy3 = 0.6f,
                )
                // L 3 17
                lineTo(x = 3.0f, y = 17.0f)
            }
            // m7 21 1.6 -1.4 C8.9 19.2 9.4 19 10 19 h4 c1.1 0 2.1 -.4 2.8 -1.2 l4.6 -4.4 a2 2 0 0 0 -2.75 -2.91 l-4.2 3.9 M2 16 l6 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 21
                moveTo(x = 7.0f, y = 21.0f)
                // l 1.6 -1.4
                lineToRelative(dx = 1.6f, dy = -1.4f)
                // C 8.9 19.2 9.4 19 10 19
                curveTo(
                    x1 = 8.9f,
                    y1 = 19.2f,
                    x2 = 9.4f,
                    y2 = 19.0f,
                    x3 = 10.0f,
                    y3 = 19.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // c 1.1 0 2.1 -0.4 2.8 -1.2
                curveToRelative(
                    dx1 = 1.1f,
                    dy1 = 0.0f,
                    dx2 = 2.1f,
                    dy2 = -0.4f,
                    dx3 = 2.8f,
                    dy3 = -1.2f,
                )
                // l 4.6 -4.4
                lineToRelative(dx = 4.6f, dy = -4.4f)
                // a 2 2 0 0 0 -2.75 -2.91
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.75f,
                    dy1 = -2.91f,
                )
                // l -4.2 3.9
                lineToRelative(dx = -4.2f, dy = 3.9f)
                // M 2 16
                moveTo(x = 2.0f, y = 16.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
            }
            // <circle cx="16.0" cy="9.0" radius="2.9" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 16 9
                moveTo(x = 16.0f, y = 9.0f)
                // m -2.9 0
                moveToRelative(dx = -2.9f, dy = 0.0f)
                // a 2.9 2.9 0 1 1 5.8 0
                arcToRelative(
                    a = 2.9f,
                    b = 2.9f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.8f,
                    dy1 = 0.0f,
                )
                // a 2.9 2.9 0 1 1 -5.8 0z
                arcToRelative(
                    a = 2.9f,
                    b = 2.9f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -5.8f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="6.0" cy="5.0" radius="3.0" fill="#000" stroke="#FF000000" stroke-width="2" stroke-line-join="round" stroke-line-cap="round" />
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 6 5
                moveTo(x = 6.0f, y = 5.0f)
                // m -3 0
                moveToRelative(dx = -3.0f, dy = 0.0f)
                // a 3 3 0 1 1 6 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 6.0f,
                    dy1 = 0.0f,
                )
                // a 3 3 0 1 1 -6 0z
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -6.0f,
                    dy1 = 0.0f,
                )
                close()
            }
        }.build().also { _handCoins = it }
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
                imageVector = HandCoins,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _handCoins: ImageVector? = null
