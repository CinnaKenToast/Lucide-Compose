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

val HandHelping: ImageVector
    get() {
        val current = _handHelping
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.shipsco.theme.AppTheme.HandHelping",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            // M11 12 h2 a2 2 0 1 0 0 -4 h-3 C9.4 8 8.9 8.2 8.6 8.6 L3 14
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 11 12
                moveTo(x = 11.0f, y = 12.0f)
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
                // C 9.4 8 8.9 8.2 8.6 8.6
                curveTo(
                    x1 = 9.4f,
                    y1 = 8.0f,
                    x2 = 8.9f,
                    y2 = 8.2f,
                    x3 = 8.6f,
                    y3 = 8.6f,
                )
                // L 3 14
                lineTo(x = 3.0f, y = 14.0f)
            }
            // m7 18 1.6 -1.4 C8.9 16.2 9.4 16 10 16 h4 c1.1 0 2.1 -.4 2.8 -1.2 l4.6 -4.4 a2 2 0 0 0 -2.75 -2.91 l-4.2 3.9 M2 13 l6 6
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                // M 7 18
                moveTo(x = 7.0f, y = 18.0f)
                // l 1.6 -1.4
                lineToRelative(dx = 1.6f, dy = -1.4f)
                // C 8.9 16.2 9.4 16 10 16
                curveTo(
                    x1 = 8.9f,
                    y1 = 16.2f,
                    x2 = 9.4f,
                    y2 = 16.0f,
                    x3 = 10.0f,
                    y3 = 16.0f,
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
                // M 2 13
                moveTo(x = 2.0f, y = 13.0f)
                // l 6 6
                lineToRelative(dx = 6.0f, dy = 6.0f)
            }
        }.build().also { _handHelping = it }
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
                imageVector = HandHelping,
                contentDescription = null,
                modifier = Modifier
                    .width((24.0).dp)
                    .height((24.0).dp),
            )
        }
    }
}

@Suppress("ObjectPropertyName")
private var _handHelping: ImageVector? = null
